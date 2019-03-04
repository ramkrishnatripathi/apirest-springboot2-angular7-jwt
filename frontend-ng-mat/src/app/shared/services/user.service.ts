import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user.model';
import { environment } from 'src/environments/environment.prod';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) {}

  getAll() {
    return this.http.get<User[]>(`${environment.api_server}/users`);
  }

  getById(id: number) {
    return this.http.get(`${environment.api_server}/users/${id}`);
  }

  update(user: User) {
    return this.http.put(`${environment.api_server}/user/${user.id}`, user);
  }

  delete(id: number) {
    return this.http.delete(`${environment.api_server}/user/${id}`);
  }
}
