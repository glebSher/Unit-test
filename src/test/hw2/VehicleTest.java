package hw2;

import main.hw2.Car;
import main.hw2.Motorcycle;
import main.hw2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    Car car = new Car("Nissan", "Tiida", 2011);
    Motorcycle moto = new Motorcycle("Harley-Davidson", "Softail Standard", 2022);

    // Проверка - экземпляр объекта Car также является экземпляром транспортного средства (instanceof)
    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    // Проверка - объект Car создается с 4мя колесами
    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // Проверка - объект Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    // Проверка - объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // Проверка - объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }


    // Проверка - в режиме парковки (сначала testDrive, потом park, т.е эмуляция
    // движения транспорта) машина останавливается (speed = 0)
    @Test
    void parkCar() {
        car.testDrive();
        //System.out.println(car.getSpeed());
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // Проверка - в режиме парковки (сначала testDrive, потом park, т.е эмуляция
    // движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        //System.out.println(moto.getSpeed());
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}
