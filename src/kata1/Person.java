package kata1;

import java.time.LocalDate;

public class Person {

    private final  String name;
    private final LocalDate birth;
    private int petNumber;

    public Person(String name, LocalDate birth, int petNumber) {
        this.name = name;
        this.birth = birth;
        this.petNumber = petNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getPetNumber() {
        return petNumber;
    }

    public void setPetNumber(int petNumber) {
        this.petNumber = petNumber;
    }

    public int age(){
        return (int) (LocalDate.now().toEpochDay() - birth.toEpochDay());
    }

    public void presentation(){
        System.out.println("Hi, my name is "+getName()+" and I have got "+getPetNumber()+" pets");
    }
}
