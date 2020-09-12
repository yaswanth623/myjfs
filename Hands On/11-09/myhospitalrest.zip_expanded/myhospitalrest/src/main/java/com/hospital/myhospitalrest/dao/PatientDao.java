package com.hospital.myhospitalrest.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.myhospitalrest.model.Patient;

@Transactional
@Component
public class PatientDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public String savePatient(Patient patient){
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(patient);
			return "patient Saved";
			}
		catch (Exception e) {
			e.printStackTrace();
			}
		return "cannot create Patient";
		}


	public String deletePatient(int patientId){
		try{
			Session session=sessionFactory.getCurrentSession();
			String hql="delete from Patient p where p.patientId=:patientId";
			Query query= session.createQuery(hql);
			query.setParameter("patientId", patientId);
			int res=query.executeUpdate();
			if(res>0)
				return "patient delete";
			else
				return "cannot find patient";
			}catch (Exception e) {
				e.printStackTrace();
				}
		return "cannot delete Patient";
		}

	public Patient getPatient(int patientId){
		try{
			Session session=sessionFactory.getCurrentSession();
			Patient patient= session.get(Patient.class, patientId);
			return patient;
		}catch (Exception e) {
			e.printStackTrace();
			}
	return null;
	}

	public ArrayList<Patient> getAllPatients(){
		try{
			Session session=sessionFactory.getCurrentSession();
			ArrayList<Patient> patients= (ArrayList<Patient>)session.createQuery("from Patient").list();
			return patients;
		}catch (Exception e) {
			e.printStackTrace();
			}
		return null;
	}


	public String updatePatient(Patient patient){
		try{
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(patient);
			return "Patient Updated";
			}catch (Exception e) {
				e.printStackTrace();
				}
		return "Cannot Update Patient";
	}
}
