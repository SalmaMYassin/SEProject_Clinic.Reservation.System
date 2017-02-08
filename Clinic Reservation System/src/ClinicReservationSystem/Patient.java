/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicReservationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Kamal
 */
public class Patient extends Person {
    private Appointment appointment;
	public Clinic m_Clinic;
	private MedicalReport medicalReport;

	 public Patient( int Age, String Name, String Password, String PhoneNumber, String UserName) {
                 super(Age, Name, Password, PhoneNumber, UserName);
                 
         
    }

	
        
       public static void CreateAccount(String Age,String Pasword,String PhoneNum,String Name,String UserName)
        {
            int age =Integer.parseInt(Age);
            Patient d1=new Patient( age, Name, Pasword, PhoneNum, UserName);
            Clinic.getClinicPatients().put(UserName, d1);
            ///////////////////////////////////////////////////////////////////////////////
             String connectionURL= "jdbc:derby://localhost:1527/ClinicReservationSystem";

                    try 
                    {

                        Connection conn = DriverManager.getConnection(connectionURL, "Group31", "Group31");
                        Statement st = conn.createStatement();
                        String sql = "INSERT INTO PERSON (USERNAME, PASSWORD,TYPE,PHONENUMBER,AGE,NAME) VALUES ('"+UserName+"', '"+Pasword+"','Patient',"+PhoneNum+","+age+",'"+Name+"')";

                        st.executeUpdate(sql);
                        st.close();
                        conn.close(); 

                    } 
                    catch (SQLException ex) 
                    {
                        System.out.println("Connect failed, CreateAccount Doctor ! ");
                    }
            ///////////////////////////////////////////////////////////////////////////////////////
        }
        
        public static boolean login(String UserName,String Password)
        {
            String connectionURL= "jdbc:derby://localhost:1527/ClinicReservationSystem";

            try 
            {
                Connection conn = DriverManager.getConnection(connectionURL, "Group31", "Group31");
                String sql = "SELECT * FROM PERSON";
                Statement st = conn.createStatement();
                ResultSet rs=null;
                rs=st.executeQuery(sql);
                while(rs.next())
                {
                    if(rs.getString("Type").equals("Patient"))
                    {
                        if(rs.getString("UserName").equals(UserName))
                        {
                            if(rs.getString("Password").equals(Password))
                            {
                                JOptionPane.showMessageDialog(null, "Successful Login");
                                return true;
                            }
                            else
                                JOptionPane.showMessageDialog(null, "Invalied Password");
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Invalied UserName");
                    }
                }
                System.out.println("Unsuccessful Login");

                rs.close();
                st.close();
                conn.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Connection failed  login patient! ");
            }
            return false;
        }
        
	/**
	 * 
	 * @param medicalReport
	 * @param appointment    appointment
	 */


	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public Appointment getAppointment(){
		return null;
	}

	public MedicalReport getMedicalReport(){
		return null;
	}

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
        appointment.setPatient(this);
        String connectionURL= "jdbc:derby://localhost:1527/buee";
        
        try 
        {
            Connection conn = DriverManager.getConnection(connectionURL, "Group31", "Group31");
            String sql = "UPDATE APPOINTMENT SET PATIENT='"+this.getUserName()+"' WHERE KEY1="+Integer.parseInt(appointment.getAppointmentKey())+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

            st.close();
            conn.close();
        } 
        catch (SQLException ex) 
        {
            System.out.println("Connect failed Patient set appointment! ");
        }
    }

	/**
	 * 
	 * @param appointment    appointment
	 */
	

	/**
	 * 
	 * @param medicalReport
	 */
	public void setMedicalReport(MedicalReport medicalReport){

	}

}
