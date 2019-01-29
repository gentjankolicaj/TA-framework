package com.ta.framework.user;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class User {

	protected String id;
	protected String firstName;
	protected String lastName;
    protected String username;
    protected String password;
    protected String email;
    protected String telephone;
    protected String adress;
      
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String id, String firstName, String lastName, String username, String password, String email,
			String telephone, String adress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
		this.adress = adress;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
    

   
}
