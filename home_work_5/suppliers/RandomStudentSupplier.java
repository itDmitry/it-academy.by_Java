package home_work_5.suppliers;

import Zanatia.core.Random.api.iRandom;
import home_work_5.dto.Student;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {
    private final iRandom random;
    private final AtomicInteger counter;

    public RandomStudentSupplier(iRandom random, AtomicInteger counter) {
        this.random = random;
        this.counter = counter;
    }

    @Override
    public Student get() {
        return new Student(
            counter.getAndIncrement(),
            random.randomString(3,10),
            random.randomInt(7,17),
            random.randomDouble(0.0,10.0),
            random.randomBoolean()
        );
    }
}