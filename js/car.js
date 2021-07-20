class Car {
  constructor(lisence, driver) {
    this.id;
    this.license = lisence;
    this.driver = driver;
    this.passenger;
  }

  printDataCar() {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }
}
