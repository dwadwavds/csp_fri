package kr.ac.shinhan;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class MypersistentManager {
	 static PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
	
	public static PersistenceManager getManager(){
		return pm;
	}
}
