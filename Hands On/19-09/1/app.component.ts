import { Component } from '@angular/core';
import { Patient } from 'src/patient.model';
import { PatientDaoService } from './patient-dao.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SpringInteg';

  constructor(private daoser:PatientDaoService){}

  patients:Patient[]=[]

  getPatients(){
    this.daoser.getPatients().subscribe(
      data=>this.patients=data,
      error => console.log(error)
    );
  }

  patient:Patient={"patientId":0,"patientName":"","status":"" ,"age":0,"symptoms":""};

  savePatient(){
    this.daoser.savePatient(this.patient).subscribe(
      data=>console.log(data),
      error=>console.log(error)
    )
  }

  getPatient(){
    this.daoser.getPatient(this.patient.patientId).subscribe(
    data=>this.patient=data,
    error=>console.log(error)
    );
  }

  deletePatient(){
    this.daoser.deletePatient(this.patient.patientId).subscribe(
    data=>this.patient=data,
    error=>console.log(error)
    );
  }

  updatePatient(){
    this.daoser.updatePatient(this.patient).subscribe(
    data=>console.log(data),
    error=>console.log(error)
    );
  }
}
