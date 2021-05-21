package web.util;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cars {
    private final List<Car> cars;

    public Cars() {
        final List<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("avendodor" + i, "mazda" + i, 4 + i));
        }
        this.cars = cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
