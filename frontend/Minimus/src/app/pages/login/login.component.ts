import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router) {
  }

  ngOnInit() {
  }

  login(event) {
    event.preventDefault()
    const target = event.target
    const username = target.querySelector('#email').value
    const password = target.querySelector('#password').value
    //Autenticar user con api
    localStorage.setItem('email', username);
    if (username == "admin@u.com") {
      localStorage.setItem('admin', "true");
      this.router.navigate(['/admin/preguntas'])
    } else {
      localStorage.setItem('admin', "false");
      this.router.navigate(['/'])      
    }
  }

}
