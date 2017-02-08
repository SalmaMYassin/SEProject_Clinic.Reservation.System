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
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Kamal
 */
public class Clinic {
    
	private static Map<String, Appointment> ClinicAppointments = new HashMap<String, Appointment>();
	private static Map<String, Doctor> ClinicDoctors = new HashMap<String, Doctor>();
	private static Map<String, Patient> ClinicPatients = new HashMap<String, Patient>();
        private static Map<String, MedicalReport> MedicalReports = new HashMap<String, MedicalReport>();
	private Appointment m_Appointment;
        
        //////////////////Loading DataBase//////////////////////////////////////
        public static void LoadingDataBase()
        {
            //////////////Loading Person//////////////////////////////////////
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
                        Doctor d=new Doctor(rs.getInt("AGE"), rs.getString("NAME"), rs.getString("PASSWORD"), ""+rs.getInt("PHONENUMBER"), rs.getString("USERNAME"));
                    }
                    else if(rs.getString("Type").equals("Patient"))
                    {
                        Patient p=new Patient(rs.getInt("AGE"), rs.getString("NAME"), rs.getString("PASSWORD"), ""+rs.getInt("PHONENUMBER"), rs.getString("USERNAME"));
                    }
                }

                rs.close();
                st.close();
                conn.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Connection failed  Clinic Loading Person! ");
            }
            ///////////////////////////////////////////////////////////////////
           
        ///////////////////////////////////////////////////////////////////////
        }

    public static Map<String, Appointment> getClinicAppointments() {
        return ClinicAppointments;
    }

    public static void setClinicAppointments(Map<String, Appointment> ClinicAppointments) {
        Clinic.ClinicAppointments = ClinicAppointments;
    }

    public static Map<String, Doctor> getClinicDoctors() {
        return ClinicDoctors;
    }

    public static void setClinicDoctors(Map<String, Doctor> ClinicDoctors) {
        Clinic.ClinicDoctors = ClinicDoctors;
    }

    public static Map<String, Patient> getClinicPatients() {
        return ClinicPatients;
    }

    public static void setClinicPatients(Map<String, Patient> ClinicPatients) {
        Clinic.ClinicPatients = ClinicPatients;
    }

    public Appointment getM_Appointment() {
        return m_Appointment;
    }

    public void setM_Appointment(Appointment m_Appointment) {
        this.m_Appointment = m_Appointment;
    }

	public Clinic(){

	}

    public static Map<String, MedicalReport> getMedicalReports() {
        return MedicalReports;
    }

    public static void setMedicalReports(Map<String, MedicalReport> MedicalReports) {
        Clinic.MedicalReports = MedicalReports;
    }

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public static boolean Login(){
		return false;
	}

	public static int[] ViewAvialableAppointments(String Doctor,Date d){
            String connectionURL= "jdbc:derby://localhost:1527/ClinicReservationSystem";
          
            int[] appointments=new int[8];
            try 
            {
                Connection conn = DriverManager.getConnection(connectionURL, "Group31", "Group31");
                String sql = "SELECT * FROM AVAILBILITY";
                Statement st = conn.createStatement();
                ResultSet rs=null;
                
             
                rs=st.executeQuery(sql);
                int i=0;
                
                
                while(rs.next())
                {
                     
                    
                    if((rs.getString("DOCTOR").equals(Doctor))&&(rs.getInt("DAY")==d.getDate())&&(rs.getInt("MONTH")==(d.getMonth()+1))&&(rs.getInt("YEAR1")==(d.getYear()+1900)))
                    {
                       System.out.println("Omar failed  ViewAvialableAppointments Clinic! ");
                        appointments[i]=rs.getInt("HOUR1");
                           System.out.println("Omar failed  ViewAvialableAppointments Clinic! ");
                        i+=1;
                    }
                }
                rs.close();
                st.close();
                conn.close();
                
            } 
            catch (SQLException ex) 
            {
                System.out.println("Connection failed  ViewAvialableAppointments Clinic! ");
            }
            
            return appointments;

	}

}
