import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {NivelCardComponent} from './nivel-card.component';

describe('nivelCardComponent', () => {
  let component: NivelCardComponent;
  let fixture: ComponentFixture<NivelCardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [NivelCardComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NivelCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
