/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicReservationSystem;

/**
 *
 * @author Omar Kamal
 */
public class MedicalReport {
    
	private Doctor doctor;
	private String MedicalCase;
	private Patient patient;
	private String treatment;
	public Patient m_Patient;
	public Doctor m_Doctor;

	public MedicalReport(){

	}

	/**
	 * 
	 * @param doctor
	 * @param MedicalCase
	 * @param patient
	 * @param treatment
	 */
	public MedicalReport(Doctor doctor, String MedicalCase, Patient patient, String treatment){

	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public void EditeReport(){

	}

	public String getMedicalCase(){
		return MedicalCase;
	}

	public String getTreatment(){
		return "";
	}

	public void PublishReport(){

	}

	/**
	 * 
	 * @param MedicalCase
	 */
	public void setMedicalCase(String MedicalCase){
		MedicalCase = this.MedicalCase;
	}

	/**
	 * 
	 * @param treatment
	 */
	public void setTreatment(String treatment){

	}

	@Override
	public String toString(){
		return "";
	}

	public void ViewReport(){

	}
}
