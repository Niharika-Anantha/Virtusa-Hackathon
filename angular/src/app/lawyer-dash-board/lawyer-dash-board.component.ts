import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lawyer-dash-board',
  templateUrl: './lawyer-dash-board.component.html',
  styleUrls: ['./lawyer-dash-board.component.css']
})
export class LawyerDashBoardComponent implements OnInit {

  profile:string="assets/Images/download.png";
  constructor() { }

  ngOnInit(): void {
  }

}
