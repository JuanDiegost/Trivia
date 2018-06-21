import {Component, OnDestroy, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {NivelService} from '../../services/nivel/nivel.service';
import {UiService} from '../../services/ui/ui.service';

@Component({
  selector: 'app-nivel-card',
  templateUrl: './nivel-card.component.html',
  styleUrls: ['./nivel-card.component.css']
})
export class NivelCardComponent implements OnInit, OnDestroy {

  idPartida:number;
  nombre: string;
  tiempo: string;
  darkMode: boolean;


  constructor(public weather: NivelService,
              public router: Router,
              public ui: UiService) {
  }

  ngOnInit() {
    this.ui.darkModeState.subscribe((isDark) => {
      this.darkMode = isDark;
    });
    
    this.nombre="Nivel 1";
        this.tiempo="2:30";
    
    this.weather.getNivelById(this.idPartida)
      .subscribe((data: string) => {
        //asignar data
        
      });

  }

  ngOnDestroy() {

  }

  openDetails() {
    this.router.navigateByUrl('/details/'+this.idPartida);
  }

}
