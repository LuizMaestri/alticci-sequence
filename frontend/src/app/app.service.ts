import { Injectable, isDevMode } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) {}
  getAlticci(n: number): Observable<string> {
      return this.http.get<string>(`http://localhost:8080/api/alticci/${n}`)
  }
}
