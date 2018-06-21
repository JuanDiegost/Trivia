import {inject, TestBed} from '@angular/core/testing';

import {NivelService} from './nivel.service';

describe('WeatherService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NivelService]
    });
  });

  it('should be created', inject([NivelService], (service: NivelService) => {
    expect(service).toBeTruthy();
  }));
});
