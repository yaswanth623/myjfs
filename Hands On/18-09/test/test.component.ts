import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  sum;
  value;
  rev='';
  revs;
  time;
  timerId=5;
  abc ;
  constructor() { 

    let add=(n1:number,n2:number):number => {return n1+n2;}
    this.sum=add(5,10);


    let highest=(n1:number,n2:number,n3:number):number =>{
      if(n1-n2 >= 1 && n1-n3 >= 1){return n1;}
      else if(n2-n3 >= 1 && n2-n3 >= 1){return n2;}
      else {return n3;}
    }
    this.value=highest(10,20,9);


    let reverse=(data:string):string =>{for (let index = data.length-1; index >= 0; index--) {
      this.rev += data[index];}
      return this.rev;}

    this.revs=reverse('hello world')

    setInterval(()=> {this.time=new Date().toLocaleTimeString()})
    this.abc=setInterval(()=> {this.timerId=this.timerId-1; 
      if(this.timerId == 0 ){
        clearInterval(this.abc);
        alert('Session Timeout')
      }
    },1000)

    
    //setInterval(()=> {for (let index = 10; index >= 0; index--){this.timerId = index}return this.timerId},2000)

    //clearInterval(this.timerId);
  }

  ngOnInit(): void {
  }
  // tick(){
  //   for (let i = 10; i >= 0; i--) {
  //     this.timerId = i;
  //   }
  // }
  

}
