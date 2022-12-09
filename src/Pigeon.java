public class Pigeon extends Bird {
    String species;

    public void Setspecies(String name, String age, String weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public String toString(String name, String age, String weight, String species ) {
       String a=  name + ", wiek " + age + ",waga " + weight + " species:" + species;
       return a;
}

}

