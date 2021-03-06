package friendfinder;

import java.io.Serializable;

/**
 * 
 * @author Mark Szewczuk
 *
 */
public class User implements Serializable
{
	
	
	/**
	 * serial version auto-generated
	 */
	private static final long serialVersionUID = -2074018736916524424L;
	
	private String name;
	private String email;
	private String phonenum;
	private int grade;
	private String password;
	private int userid;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhonenum() {
		return phonenum;
	}
	
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
}
