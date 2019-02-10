import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { DATA_HOST, LOGIN_PHAT } from '../../environments/environments';
import { UserTO } from '../../models/user';

/*
  Generated class for the LoginServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class LoginServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello LoginServiceProvider Provider');
  }
  
  getUsersType(){
    return this.http.get(`${DATA_HOST.HOST}${LOGIN_PHAT.USERT_TYPE}`);
  }
  
  getUserByEmail(email:string){
   let params= new HttpParams();
   params.set('email',email);
   return this.http.get(`${DATA_HOST.HOST}${LOGIN_PHAT.USER_BY_EMAIL}`,{params});
  }

  saveUser(user:UserTO){
   return this.http.post(`${DATA_HOST.HOST}${LOGIN_PHAT.SAVE_USER}`,user);
  }
}
