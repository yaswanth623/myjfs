import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from 'src/patient.model';

@Injectable({
  providedIn: 'root'
})
export class PatientDaoService {

  constructor(private http:HttpClient) { }

  getPatients(){
    return this.http.get<Patient[]>('http://localhost:2211/patients');
  }

  savePatient(patient:Patient){
    return this.http.post<any>('http://localhost:2211/patient',patient); 
  }

  getPatient(patientId:number){
    return this.http.get<Patient>(`http://localhost:2211/patient/${patientId}`);
  }

  deletePatient(patientId:number){
    return this.http.delete<Patient>(`http://localhost:2211/patient/${patientId}`);
  }

  updatePatient(patient:Patient){
    return this.http.put<any>('http://localhost:2211/patient',patient); 
  }

}
