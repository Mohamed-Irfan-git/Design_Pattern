package creationl_pattern.singleton;


/*
*we can do this using 4 ways
* this method is best
* call new singleton out side of private  method
* memory save method there,thread save using synchronized
* but this handle everything and best practice
 */


public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
            return  SingletonHolder.INSTANCE;
    }

}
