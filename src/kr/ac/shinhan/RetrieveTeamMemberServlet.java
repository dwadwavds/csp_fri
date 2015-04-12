package kr.ac.shinhan;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RetrieveTeamMemberServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PersistenceManager pm = MypersistentManager.getManager();
		Query qry = pm.newQuery(TeamMember.class);
		List<TeamMember> memberList = (List<TeamMember>) qry.execute();
		
		resp.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/plain");
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table>");
		
		for(TeamMember tm: memberList){
			resp.getWriter().println("<tr>");
			
			resp.getWriter().println("<td>" + tm.getName() + "</td>");
			resp.getWriter().println("<td>" + tm.getStdId() + "</td>");
			resp.getWriter().println("<td>" + tm.getsellphone() + "</td>");
			resp.getWriter().println("<td>" + tm.getEmail() + "</td>");
			resp.getWriter().println("<td>" + tm.getKakao() + "</td>");
			resp.getWriter().println("<td>" );
				if(tm.isTeamMan() == true)
					resp.getWriter().println("∆¿¿Â"+ "</td>");
				else
					resp.getWriter().println("∆¿¿Âæ∆¥‘"+ "</td>");
			resp.getWriter().println("<td>" + tm.getGitId() + "</td>");
			resp.getWriter().println("</tr>");
		}
		
		resp.getWriter().println("</table>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
