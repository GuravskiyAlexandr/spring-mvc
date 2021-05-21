package web.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Cars;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    Cars cars;

    public List<Car> getAllCars() {
        return cars.getCars();
    }

    public Object getListCars(Integer count) {
        return cars.getCars().stream().limit(count).collect(Collectors.toList());
    }
}
