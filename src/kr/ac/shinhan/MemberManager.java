package kr.ac.shinhan;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class MemberManager {
	public static TeamMember addMember(String name, String stdId, String phone,
			String email, String kakao, boolean teamMan, String gitId){
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		TeamMember m = new TeamMember(name, stdId, phone, email, kakao, teamMan, gitId);
		pm.makePersistent(m);
		return m;
	}
}
