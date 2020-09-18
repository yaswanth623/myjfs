import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { CateringComponent } from './services/catering/catering.component';
import { LaundryComponent } from './services/laundry/laundry.component';
import { ServicesComponent } from './services/services.component';

const routes: Routes = [
  {path:'contactus',component:ContactusComponent},
  {path:'aboutus',component:AboutusComponent},
  {path:'services',component:ServicesComponent,children:[
    {path:'laundry',component:LaundryComponent},
    {path:'catering',component:CateringComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
