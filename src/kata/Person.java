package kata;
import java.util.Objects;
public class Person {

    private final int id;
    private final double weight;
    private final double height;

    public Person(int id, double weight, double height) {
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        return o != null && getClass() == o.getClass() && (this == o || equals((Person) o));
    }

    public boolean equals(Person person){
        return id == person.id && person.height == height && person.weight == weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, height, weight);
    }

    @Override
    public String toString() {
        return "Person{" +
          "id=" + id +
          ", weight=" + weight +
          ", height=" + height +
          "}";
    }
}


