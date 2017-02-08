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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Kamal
 */
public class Doctor extends Person{
    private static Map<String, Appointment> DoctorAppointments = new HashMap<String, Appointment>();
    private  Map<String, Appointment> AvailableAppointment = new HashMap<String, Appointment>();
	public static Map<String, MedicalReport> DoctorReports = new HashMap<String, MedicalReport>();
	

    public Doctor( int Age, String Name, String Password, String PhoneNumber, String UserName) {
        super(Age, Name, Password, PhoneNumber, UserName);
        Clinic.getClinicDoctors().put(UserName, this);
    }

    public static Map<String, Appointment> getDoctorAppointments() {
        return DoctorAppointments;
    }

    public static void setDoctorAppointments(Map<String, Appointment> DoctorAppointments) {
        Doctor.DoctorAppointments = DoctorAppointments;
    }

    public Map<String, Appointment> getAvailableAppointment() {
        return AvailableAppointment;
    }

    public void setAvailableAppointment(Map<String, Appointment> AvailableAppointment) {
        this.AvailableAppointment = AvailableAppointment;
    }

    public static Map<String, MedicalReport> getDoctorReports() {
        return DoctorReports;
    }

    public static void setDoctorReports(Map<String, MedicalReport> DoctorReports) {
        Doctor.DoctorReports = DoctorReports;
    }

   
   
   
        
       public static void CreateAccount(String Age,String Pasword,String PhoneNum,String Name,String UserName)
        {
            int age =Integer.parseInt(Age);
            Doctor d1=new Doctor( age, Name, Pasword, PhoneNum, UserName);
            Clinic.getClinicDoctors().put(UserName, d1);
            ///////////////////////////////////////////////////////////////////////////////
             String connectionURL= "jdbc:derby://localhost:1527/ClinicReservationSystem";

                    try 
                    {

                        Connection conn = DriverManager.getConnection(connectionURL, "Group31", "Group31");
                        Statement st = conn.createStatement();
                        String sql = "INSERT INTO PERSON (USERNAME, PASSWORD,TYPE,PHONENUMBER,AGE,NAME) VALUES ('"+UserName+"', '"+Pasword+"','Doctor',"+PhoneNum+","+age+",'"+Name+"')";

                        st.executeUpdate(sql);
                        st.close();
                        conn.close(); 

                    } 
                    catch (SQLException ex) 
                    {
                        System.out.println("Connect failed, CreateAccount Doctor ! ");
                    }
            ///////////////////////////////////////////////////////////////////////////////////////
 ///////////////////// //Create available appointments 10 days a long//////////////////////////
            Date today=new Date();
            today.setMonth(today.getMonth()+1);
            today.setYear(today.getYear()+1900);
            for(int i=0;i<10;i++)
            {
                Date D=today;
                int newDay=(D.getDate()+i);
                if(newDay>30)
                {
                    int month=D.getMonth()+1;
                    D.setDate(newDay-30);
                    if(month>12)
                    {
                        D.setMonth(1);
                        D.setYear(D.getYear()+1);
                    }
                    else
                    {
                        D.setMonth(month);
                    }
                    
                }
                else
                {
                    D.setDate(newDay);
                }
                for(int j=0;j<8;j++)
                {
                    int time=10+j;
                    Random rand = new Random();
                    int  n=0;
                    do{
                        System.out.println("1LOL"); 
                    n = rand.nextInt(1000) + 1;
                    }
                    while(Clinic.getClinicAppointments().containsKey(""+n));
                        
                    Appointment app=new Appointment(""+n,d1,D,time);//String AppointmentKey, Doctor doctor, Date date, int time
                    d1.getAvailableAppointment().put(""+n, app);
                    /////////////Adding Appointment to DataBase//////////////////
                    
                       System.out.println("LOL"); 
                    try 
                    {

                        Connection conn = DriverManager.getConnection(connectionURL, "Group31", "Group31");
                        Statement st = conn.createStatement();
                        String sql = "INSERT INTO APPOINTMENT (KEY1, DOCTOR,DAY,MONTH,YEAR1,TIME) VALUES ("+n+", '"+d1.getUserName()+"',"+D.getDate()+","+D.getMonth()+","+D.getYear()+","+time+")";

                        st.executeUpdate(sql);
                        st.close();
                        conn.close(); 

                    } 
                    catch (SQLException ex) 
                    {
                        System.out.println("Connect failed, CreateAppointment Doctor ! ");
                    }
                    
                }
                
            }
            
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
                    if(rs.getString("Type").equals("Doctor"))
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
                    else
                        JOptionPane.showMessageDialog(null, "Unsuccessful Login");
                    
                    System.out.println(rs.getInt("id")+"\t"+rs.getString("name"));
                }

                rs.close();
                st.close();
                conn.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Connection failed  login Doctor! ");
            }
            return false;
        }
	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public void ViewReservedAppointment(){

	}
}
