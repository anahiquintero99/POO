from car import Car
from account import Account

if __name__ == "__main__":
    print('Hola Mundo')

    car = Car("AQG134", Account("Anahi Quintero", " PQR234"))
    print(vars(car))
    print(vars(car.driver))
