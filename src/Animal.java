abstract class Animal {
String name;
String age;
String weight;
boolean informacja;
public void eat(){}
    public void getVoice(){}
public interface AnimalBehavior{
    void  sleep(boolean informacja){
        if(informacja==1){
            return 1;
        }
    }

}
public interface AnimalMove{
    void move();

}
}


