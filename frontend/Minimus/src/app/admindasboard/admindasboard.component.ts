import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admindasboard',
  templateUrl: './admindasboard.component.html',
  styleUrls: ['./admindasboard.component.css']
})
export class AdmindasboardComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }

  logout(e){
    e.preventDefault();
    localStorage.removeItem('email');
    localStorage.removeItem('admin');
    this.router.navigate(['/login']);
  }
}
