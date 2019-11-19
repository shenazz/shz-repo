import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FlopsComponent } from './flops/flops.component';
import { FlopComponent } from './flop/flop.component';

@NgModule({
  declarations: [
    AppComponent,
    FlopsComponent,
    FlopComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
