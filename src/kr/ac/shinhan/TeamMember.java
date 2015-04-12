package kr.ac.shinhan;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TeamMember {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String stdId;
	
	@Persistent		//�����ϴ� �ʵ�
	private String name;
	@Persistent		//�����ϴ� �ʵ�
	private String sellphone;
	@Persistent		//�����ϴ� �ʵ�
	private String email;
	@Persistent		//�����ϴ� �ʵ�
	private String kakao;
	@Persistent		//�����ϴ� �ʵ�
	private boolean teamMan ;
	@Persistent		//�����ϴ� �ʵ�
	private String gitId;
	
	public TeamMember(String name, String stdId, String sellphone,
			String email, String kakao, boolean teamMan, String gitId) {
		//key�� �����Ϸ����� �ڵ�����
		this.name = name;
		this.stdId = stdId;
		this.sellphone = sellphone;
		this.email = email;
		this.kakao = kakao;
		this.teamMan = teamMan;
		this.gitId = gitId;
	}

	
	public String getKakao() {
		return kakao;
	}


	public void setKakao(String kakao) {
		this.kakao = kakao;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStdId() {
		return stdId;
	}


	public String getsellphone() {
		return sellphone;
	}


	public void setsellphone(String sellphone) {
		this.sellphone = sellphone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isTeamMan() {
		return teamMan;
	}


	public void setTeamMan(boolean teamMan) {
		this.teamMan = teamMan;
	}


	public String getGitId() {
		return gitId;
	}


	public void setGitId(String gitId) {
		this.gitId = gitId;
	}

}
