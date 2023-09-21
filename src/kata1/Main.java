package kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pepe", LocalDate.of(2010, 04, 01), 5);
        person.presentation();
    }
}