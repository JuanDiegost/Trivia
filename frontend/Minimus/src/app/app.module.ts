import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';

import {HomeComponent} from './pages/home/home.component';
import {DetailsComponent} from './pages/details/details.component';
import {NivelService} from './services/nivel/nivel.service';
import {HttpClientModule} from '@angular/common/http';
import {NivelCardComponent} from './ui/nivel-card/nivel-card.component';
import {AddCardComponent} from './ui/add-card/add-card.component';
import {AddComponent} from './pages/add/add.component';
import {LoginComponent} from './pages/login/login.component';
import {SignupComponent} from './pages/signup/signup.component';
import {UiService} from './services/ui/ui.service';
import { LoginGuard } from './login.guard';
import { NoLoginGuard } from './no-login.guard';
import { AdmindasboardComponent } from './admindasboard/admindasboard.component';
import { RankingComponent } from './ranking/ranking.component';
import { UserlistComponent } from './userlist/userlist.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    DetailsComponent,
    NivelCardComponent,
    AddCardComponent,
    AddComponent,
    LoginComponent,
    SignupComponent,
    AddCardComponent,
    AdmindasboardComponent,
    RankingComponent,
    UserlistComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [
    NivelService,
    UiService,LoginGuard,NoLoginGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
