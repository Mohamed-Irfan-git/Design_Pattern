package creational_pattern.singleton;


import creationl_pattern.singleton.Singleton;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    private static boolean AllTestPassed = true;

    @BeforeAll //  this will run firstly before creating object thats why this kept as a static
    static void initAll(){
        System.out.println("Testing started");
    }

    @BeforeEach // when start the new testing
    void init(){
        System.out.println("New Testing started");
    }

    @Test
    void testSingleInstance() {
        try{
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();

            assertSame(s1,s2,"Instances are not same");

        }catch (AssertionError e){
            AllTestPassed = false;
            throw e;
        }

    }

    @Test
    void testNotNull(){
        try{
            Singleton s1 = Singleton.getInstance();
            assertNotNull(s1,"Instances can not be null");
        }catch (AssertionError e){
            AllTestPassed = false;
            throw e;
        }

    }

    @Test
    void testMultiThreadedSingleton() throws InterruptedException{
       try{
           final Singleton [] instances = new Singleton[2];

           /*
            * Thread t1 = new Thread(new Runnable() {
            *     @Override
            *     public void run() {
            *         instances[0] = Singleton.getInstance();
            *     }
            * });
            *
            * this code converted to that simple lambda form
            */

           Thread t1 = new Thread(()->{instances[0]=Singleton.getInstance();});
           Thread t2 = new Thread(()->{instances[1]=Singleton.getInstance();});

           t1.start();
           t2.start();

           t1.join();
           t2.join();

           assertSame(instances[0],instances[1],"Instances are not same");
       }catch (AssertionError e){
           AllTestPassed = false;
           throw e;
       }

    }


    @AfterEach // after every test finished, this will run one by one
    void cleanUp(){
        System.out.println("Test cleanup......");
    }

    @AfterAll // after finished all test this will finally run
    static void cleanUpAll(){
       if(AllTestPassed){
           System.out.println("All test passed");
       }else{
           System.out.println("Some test are failed");
       }
    }

}
