import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import { Country } from '../modal/country';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CountryService {
  private baseUrl = 'http://localhost:8081/country-service';

  constructor(private http: HttpClient) {
   }

  loadData(): Observable<any> {
    return this.http.get(this.baseUrl + '/loadData');
    }
  searchCountry(code: string, name: string, city: string): Observable<Country> {
    let params = new HttpParams();
    params = params.append('code', code);
    params = params.append('name', name);
    params = params.append('city', city);
    return this.http.get<Country>(this.baseUrl + '/getCountryInfo', {params});
  }
}

