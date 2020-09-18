import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './mypage.html',
  //styleUrls: ['./app.component.css']
})
export class AppComponent {
  isDark:boolean=false;

   changeMode():void{
     if (this.isDark) 
       this.isDark=false;
     else
      this.isDark=true;
  }


  isVisible:boolean=false;
changeStatus():void{
 if( this.isVisible)
 this.isVisible=false;
 else
 this.isVisible=true;
}

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
