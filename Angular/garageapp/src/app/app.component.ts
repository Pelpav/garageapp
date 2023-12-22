import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { GarageService } from './garage.service';
import { OnInit } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
  providers: [GarageService],
})
export class AppComponent implements OnInit {
  title = 'garageapp';

  cars!: any;

  constructor(private garageService: GarageService) {}
  ngOnInit(): void {
    console.log('Init');
    this.garageService.getCars().subscribe((datas) => {
      this.cars = datas;
    });
  }
}
