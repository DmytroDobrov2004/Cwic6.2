public class Bird extends Animal {
    String FeatherColor;

    public void SetFeather(String name, String age, String weight, String FeatherColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.FeatherColor = FeatherColor;

    }

    public String toString(String name, String age, String weight, String FeatherColor) {
        String a = name + ", wiek " + age + ",waga " + weight + " species:" + FeatherColor;
        return a;
    }


}