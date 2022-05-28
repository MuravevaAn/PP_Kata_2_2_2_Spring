package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private final List<Car>cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("KIA", "Red", 200));
        cars.add(new Car("Chevrolet", "Blue", 600));
        cars.add(new Car("Audi", "Black", 800));
        cars.add(new Car("SKODA", "White", 250));
        cars.add(new Car("Nissan", "Orange", 350));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
