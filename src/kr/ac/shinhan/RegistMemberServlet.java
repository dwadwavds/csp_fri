package kr.ac.shinhan;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegistMemberServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String stdId = req.getParameter("stdId");
		String sellphone = req.getParameter("sellphone");
		String email = req.getParameter("email");
		String kakao = req.getParameter("kakao");
		boolean teamMan = false;
		String gitId = req.getParameter("gitId");
		
		TeamMember tm = new TeamMember(name, stdId, sellphone, email, kakao, teamMan, gitId);
		PersistenceManager pm = MypersistentManager.getManager();
		pm.makePersistent(tm);
		
		resp.getWriter().println("<html>"); 
 		resp.getWriter().println("<body>"); 
 		resp.getWriter().println("<html><body>");
		resp.getWriter().println("�̸� : " + req.getParameter("name") + "</br>");
		resp.getWriter().println("�й� : " + req.getParameter("stdId") + "</br>");
		resp.getWriter().println("��ȭ��ȣ : " + req.getParameter("sellphone") + "</br>");
		resp.getWriter().println("�����ּ� : " + req.getParameter("email") + "</br>");
		resp.getWriter().println("īī���� ���̵� : " + req.getParameter("kakao") + "</br>");
		if(equals(req.getParameter("teamMan")) == true)
			resp.getWriter().println("����" + "</br>");
		else
			resp.getWriter().println("����ƴ�" + "</br>");
		resp.getWriter().println("GitHub ID : " + req.getParameter("git") + "</br></br>");
		resp.getWriter().println("�� ��� �Ǿ����ϴ�." + "</br>");
		resp.getWriter().println("</body></html>");
 		resp.getWriter().println("</body>"); 
 		resp.getWriter().println("</html>"); 
	}
}
