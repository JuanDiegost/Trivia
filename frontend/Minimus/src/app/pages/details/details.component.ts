import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {NivelService} from '../../services/nivel/nivel.service';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  idPartida:number;
  nombre: string;
  tiempo: string;
  darkMode: boolean;
  promedioTiempo:string;
  preguntas: Subject<string>;

  constructor(public activeRouter: ActivatedRoute, public nivel: NivelService) {
  }

  ngOnInit() {

  }

}

