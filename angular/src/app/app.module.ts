import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CaseRecordComponent } from './case-record/case-record.component';
import { ReportComponent } from './report/report.component';
import { LogoutComponent } from './logout/logout.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AdminComponent } from './admin/admin.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { LawyerDashBoardComponent } from './lawyer-dash-board/lawyer-dash-board.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CaseRecordComponent,
    ReportComponent,
    LogoutComponent,
    LoginComponent,
    SignupComponent,
    AdminComponent,
    AppointmentComponent,
    LawyerDashBoardComponent
  ],
  imports: [
    BrowserModule,FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
