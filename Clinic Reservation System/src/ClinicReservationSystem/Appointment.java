/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicReservationSystem;

import java.util.Date;

/**
 *
 * @author Omar Kamal
 */
public class Appointment {
    private String AppointmentKey;
	private Doctor doctor;
	private Date date;
	private Patient patient;
	private int time;

	public Appointment(){

	}

    public Appointment(String AppointmentKey, Doctor doctor, Date date, int time) {
        this.AppointmentKey = AppointmentKey;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

	/**
	 * 
	 * @param doctor
	 * @param from
	 * @param patient
	 * @param to
	 * @param AppointmentKey
	 * @param m_Patient
	 * @param m_Doctor
	 */
	public Appointment(Doctor doctor, Date from, Patient patient, Date to, String AppointmentKey, Patient m_Patient, Doctor m_Doctor){

	}

	/**
	 * 
	 * @param doctor
	 * @param from
	 * @param patient
	 * @param to
	 */
	public Appointment(Doctor doctor, Date from, Patient patient, Date to){

	}

    public void setAppointmentKey(String AppointmentKey) {
        this.AppointmentKey = AppointmentKey;
    }

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public void CancelAppointment(){

	}

	public void EditeAppointment(){

	}

	public String getAppointmentKey(){
		return AppointmentKey;
	}

	public Date getFrom(){
		return null;
	}

	public Date getTo(){
		return null;
	}

	public void ReserveAppointment(){

	}

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

 


	/**
	 * 
	 * @param AppointmentKey
	 */
	

	/**
	 * 
	 * @param from
	 */
	public void setFrom(Date from){

	}

	/**
	 * 
	 * @param to
	 */
	public void setTo(Date to){

	}
}
