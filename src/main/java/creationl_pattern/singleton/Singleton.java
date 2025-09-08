package creationl_pattern.singleton;


/**

*we can do this using 4 ways
* this method is best
* call new singleton outside of private  method
* memory save method there,thread save using synchronized
* but this handle everything and best practice

 */


public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * Returns the single Singleton instance.
     *
     * @return Singleton instance (never null)
     */

    public static Singleton getInstance() {
            return  SingletonHolder.INSTANCE;
    }

    /**
     * Logs a message to console.
     *
     * @param message the message to log
     */

    public void log(String message){
        System.out.println("instance created");
    }

}
