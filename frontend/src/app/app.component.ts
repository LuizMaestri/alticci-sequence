import { Component } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  value = '';
  result = '';
  constructor(private service: AppService){}
  getAlticci() {
    const n = parseInt(this.value);
    this.service.getAlticci(n)
      .subscribe(result => this.result = result);
  }
  clean(){
    this.value = '';
    this.result = '';
  }
}
