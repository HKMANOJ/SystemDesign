package SingletonPattren;

public class SingleObject {

    private static SingleObject instance;
    private SingleObject(){

    }

    public static SingleObject getInstance() {
        if(instance==null){
          instance= new SingleObject();
        }
        return instance;
    }
    public void show(){
        System.out.println("Singleton Pattren Design");
    }
}
