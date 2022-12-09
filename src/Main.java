public class Main {
    public static void main(String[] args) {
        String[] array = {};
        Bird bird = new Bird();
        Dog dog = new Dog();
        Pigeon pigeon = new Pigeon();
        Blowfish blowfish = new Blowfish();
       array[0]= bird.toString("Golab", "5", "2", "Grey");
        array[1]= dog.toString("Sharik", "5", "15", "Retriever");
        array[2]= pigeon.toString("Frot", "5", "20", "North");
        array[3]= blowfish.toString("Ryba", "5", "20", "North");




}}