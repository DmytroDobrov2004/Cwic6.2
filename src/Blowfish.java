public class Blowfish  extends  Fish {
    String Typ;

    public void SetTyp(String name, String age, String weight, String Typ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.Typ = Typ;
    }

    public String toString(String name, String age, String weight, String rasa) {
        String a = name + ", wiek " + age + ",waga " + weight + ", typ: " + Typ;
        return a;
    }
}