import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
// import { environment1 } from 'src/environments/environment.ts';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor() { }
  getJobApi(){
    return environment.apiJobs;
    // return environment.apiJobs + ':' + environment.port;
  }
}
