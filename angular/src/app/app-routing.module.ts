import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CaseRecordComponent } from './case-record/case-record.component';
import { HomeComponent } from '../app/home/home.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { ReportComponent } from './report/report.component';
import { SignupComponent } from './signup/signup.component';
import { AdminComponent } from './admin/admin.component';
import { AppointmentComponent } from './appointment/appointment.component';
const routes: Routes = [
  {
    path:"",component:LoginComponent
  },
  {
    path:"home",component:HomeComponent
  },
  {
    path:"case-record/home",component:HomeComponent
  },
  {
    path:"case-record",component:CaseRecordComponent
  },
  {
    path:"home/case-record",component:CaseRecordComponent
  },
  {
    path:"home/report",component:ReportComponent
  },
  {
    path:"home/logout",component:LogoutComponent
  },
  {
    path:"report",component:ReportComponent
  },
  {
    path:"home/case-record/report",component:ReportComponent
  },
  {
    path:"home/case-record/report",component:ReportComponent
  },
  {
    path:"logout",component:LogoutComponent
  },
  {
    path:"report/logout",component:LogoutComponent
  },
  {
    path:"case-record/logout",component:LogoutComponent
  },
  {
    path:"home/case-record/report/logout",component:LogoutComponent
  },
  {
    path:"signup",component:SignupComponent
  },
  {
    path:"login",component:LoginComponent
  },
  {
    path:"admin",component:AdminComponent
  },
  {
    path:"home/appointment",component:AppointmentComponent
  },
  {
    path:"appointment",component:AppointmentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
