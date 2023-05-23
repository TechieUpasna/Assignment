import { Component } from '@angular/core';
import { Student } from '../student';
import { StudentService } from 'src/student.service';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit{
  student:Student=new Student();
  ngOnInit():void {
    throw new Error('Method not implemented.');
  }
  constructor(private StudentService:StudentService,
    privaterouter:Router) { }
    onSubmit(){
      console.log(this.student);
      // this.StudentService.createStudent(this.student).subscribe(data=>{console.log(data)});
    }
}


