from car import Car

if __name__ == "__main__":
    print('Hola Mundo')

    car = Car()

    car.license = 'Ams210'
    car.driver = 'Juan Medina'
    print(vars(car))

    car2 = Car()
    car2.license = 'Qij210'
    car2.driver = 'Ivan Garcia'
    print(vars(car2))
