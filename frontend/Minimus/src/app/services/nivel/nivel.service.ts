import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Subject} from 'rxjs';

@Injectable()
export class NivelService {

  constructor(public http: HttpClient) {
  }

  getNivels(): Subject<string> {
    const dataSub = new Subject<string>();
    /*this.http.get(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&units=${metric}&APPID=952d6b1a52fe15a7b901720074680562`)
      .subscribe((data) => {
        dataSub.next(data['weather']);
      }, (err) => {
        console.log(err);
      });*/
    return dataSub;
  }

  getNivelsByDificulty(dificult:number): Subject<string> {
    const dataSub = new Subject<string>();
   /* this.http.get(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&units=${metric}&APPID=952d6b1a52fe15a7b901720074680562`)
      .subscribe((data) => {
        dataSub.next(data['nivel']);
      }, (err) => {
        console.log(err);
      });*/
    return dataSub;
  }

  getNivelById(nivelId: number): Subject<any> {
    const nivelSubject = new Subject();

    return nivelSubject;
  }

  
}
