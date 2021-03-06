import { Component, OnInit } from "@angular/core";
import { Housing } from "../home-page/housing/housing";
import { HousingService } from "../service/home-page/housing-service.service";
import { MessageService } from "../service/message.service";

@Component({
  selector: "app-housing",
  templateUrl: "./housing.component.html",
  styleUrls: ["./housing.component.css"],
})
export class HousingsComponent implements OnInit {
  selectedHousing: Housing | undefined;

  // housing: Housing[];
  housing = [
    { id: 1, contactID: 1, address: "3 Dummy Street", numberOfPerson: 10 },
    { id: 2, contactID: 1, address: "3 Dummy Street", numberOfPerson: 11 },
  ];

  constructor(
    private housingService: HousingService,
    private messageService: MessageService
  ) {}

  ngOnInit() {
    this.getHousing();
  }

  onSelect(housing: Housing): void {
    this.selectedHousing = housing;
    this.messageService.add(
      `HousingComponent: Selected housing id=${housing.id}`
    );
  }

  getHousing(): void {
    this.housingService
      .getHousing()
      .subscribe((housing) => (this.housing = housing));
  }
}
