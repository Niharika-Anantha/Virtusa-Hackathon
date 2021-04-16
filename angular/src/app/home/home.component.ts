import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  profile:string="assets/Images/download.png";

  constructor() { }

  ngOnInit(): void {
  }

  
}
