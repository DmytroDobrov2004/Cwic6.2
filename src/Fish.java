public class Fish extends Animal {
    String typ;

    public void Settyp(String name, String age, String weight, String typ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.typ = typ;
    }

    public String toString(String name, String age, String weight, String typ) {
        String a = name + ", wiek " + age + ",waga " + weight + " species:" + typ;
        return a;
    }
}