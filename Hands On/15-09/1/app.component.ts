import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './mypage.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  isVisible=false;

  univ=["MCU","DCEU"];
  heroes=[["Iron Man","Captain America","Thor"],["Superman","Batman","Wonder Woman"]];

  selectedUniv;
  fillHeroes:any[];

  disp(){
    let i=this.univ.indexOf(this.selectedUniv);
    //alert(this.selectedUniv + " "+i);
    this.fillHeroes=this.heroes[i];
  }
}
