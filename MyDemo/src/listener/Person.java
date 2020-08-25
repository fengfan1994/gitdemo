package listener;

public class Person {
    private PersonListener personListener;
    public void eat(){
        personListener.doEat(new Event(this));
    }

    public void sleep(){
        personListener.doSleep(new Event(this));
    }

    public void registerListener(PersonListener personListener){
        this.personListener=personListener;
    }
}
