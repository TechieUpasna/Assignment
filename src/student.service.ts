import{ Injectable } from'@angular/core';
import{ HttpClient } from'@angular/common/http';
import { Student } from './app/student';
import{ Observable } from'rxjs';
@Injectable({
  providedIn:'root'
})
export class StudentService {
  createStudent(student: Student) {
    throw new Error('Method not implemented.');
  }
  private baseURL="http://localhost:8080/api/v1/student";
  constructor(private httpClient:HttpClient) { }
  getStudentList():Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}`);
  }
}
