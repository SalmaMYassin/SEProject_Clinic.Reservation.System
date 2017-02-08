/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicReservationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Omar Kamal
 */
public  abstract class Person  {
    
	private int Age;
	private String Name;
	private String Password;
	private String PhoneNumber;
	private String UserName;
        private String Type;

    public Person(int Age, String Name, String Password, String PhoneNumber, String UserName) {
        this.Age = Age;
        this.Name = Name;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.UserName = UserName;
    }

	/**
	 * 
	 * @param Address
	 * @param Age
	 * @param ID
	 * @param Name
	 * @param Password
	 * @param PhoneNumber
	 * @param UserName
	 */
        
    /**
     *
     * @param Address
     * @param Pasword
     * @param Age
     * @param ID
     * @param Name
     * @param Password
     * @param PhoneNumber
     * @param UserName
     */
    
       
    
	
   

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	/**
	 * 
	 * @param Password
	 */
	public boolean CheckPassword(String Password){
		return false;
	}


	public int getAge(){
		return Age;
	}

	

	public String getName(){
		return Name;
	}

	public String getPassword(){
		return Password;
	}

	public String getPhoneNumber(){
		return PhoneNumber;
	}

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    
    public void setAge(int Age) {
        this.Age = Age;
    }

  

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

	

	@Override
	public String toString(){
		return "";
	}
}
