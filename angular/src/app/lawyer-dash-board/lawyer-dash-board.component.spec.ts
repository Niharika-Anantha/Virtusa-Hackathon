import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LawyerDashBoardComponent } from './lawyer-dash-board.component';

describe('LawyerDashBoardComponent', () => {
  let component: LawyerDashBoardComponent;
  let fixture: ComponentFixture<LawyerDashBoardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LawyerDashBoardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LawyerDashBoardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
