import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './pages/home/home.component';
import {DetailsComponent} from './pages/details/details.component';
import {AddComponent} from './pages/add/add.component';
import {LoginComponent} from './pages/login/login.component';
import {SignupComponent} from './pages/signup/signup.component';
import {LoginGuard} from './login.guard'; 
import {NoLoginGuard} from './no-login.guard'; 
import { AdmindasboardComponent } from './admindasboard/admindasboard.component';
import { RankingComponent } from './ranking/ranking.component';
import { UserlistComponent } from './userlist/userlist.component';

const routes: Routes = [
  {path: '', component: HomeComponent, canActivate: [LoginGuard]},
  {path: 'details/:user', component: DetailsComponent, canActivate: [LoginGuard]},
  {path: 'add', component: AddComponent, canActivate: [LoginGuard]},
  {path: 'login', component: LoginComponent,canActivate: [NoLoginGuard]},
  {path: 'signup', component: SignupComponent,canActivate: [NoLoginGuard]},
  {path: 'admin/preguntas', component: AdmindasboardComponent,canActivate: [LoginGuard]},
  {path: 'ranking', component: RankingComponent,canActivate: [LoginGuard]},
  {path: 'userlist', component: UserlistComponent,canActivate: [LoginGuard]},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
