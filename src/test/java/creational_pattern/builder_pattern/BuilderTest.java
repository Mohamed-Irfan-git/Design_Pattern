package creational_pattern.builder_pattern;

import creationl_pattern.builder_pattern.Burger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuilderTest {
    private static boolean flag = true;
     @BeforeAll
    static void beforeAll() {
         System.out.println("Testing started......");
     }

     @Test
    public void objectCreationTest() {
        try{
            Burger burger = new Burger.Builder()
                    .addCheese(true)
                    .addLettuce(true)
                    .build();

            assertNotNull(burger,"should have been created");
        }catch(Exception e){
            flag = false;
            throw  new RuntimeException(e);
        }
     }
     @AfterAll
    static void afterAll() {
         if(flag){
             System.out.println("Test Cases are pass...");

         }
         else {
             System.out.println("Test Cases are not pass...");
         }

         System.out.println("Testing ended......");
     }

}
