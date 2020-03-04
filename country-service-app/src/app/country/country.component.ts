import { Component, OnInit } from '@angular/core';
import { Country } from '../modal/country';
import { CountryService } from '../service/country.service';
import {HttpParams} from '@angular/common/http';


@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css']
})
export class CountryComponent implements OnInit {
  country: Country;
  countries: Country[];
  code: string;
  name: string;
  city: string;

  constructor(private countryService: CountryService) {
   }

  ngOnInit(): void {
  }

  loadData() {
    this.countryService.loadData().subscribe(data => this.countries = data, error1 => console.log(error1));
  }
  search() {
    console.log('country detial: ' + this.code + ',' + this.name + ', ' + this.city);
    this.countryService.searchCountry(this.code, this.name, this.city)
    .subscribe(data => this.country = data, error => console.log(error));
  }
}
