import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from 'src/student.service';
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  student!:Student[];
  ngOnInit():void {
    this.getStudents();
  }
  constructor(private StudentService:StudentService){}
  private getStudents(){
    this.StudentService.getStudentList().subscribe((data=>{this.student=data;}));
  }


}
