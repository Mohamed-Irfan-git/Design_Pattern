package creational_pattern.factory_method;

import creationl_pattern.factory_method.Circle;
import creationl_pattern.factory_method.Rectangle;
import creationl_pattern.factory_method.Shape;
import creationl_pattern.factory_method.ShapeFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTest {

    private static final ShapeFactory shapeFactory = new ShapeFactory();

    @BeforeAll
    static void beforeAll() {
        System.out.println("Testing started....");
    }

    @BeforeEach
    void init(){
        System.out.println("New test started....");
    }

    @Test
    void testGetCircleShape() {
        Shape shape = shapeFactory.getShape("CIRCLE");

        assertNotNull(shape,"Should not return null");
        assertTrue(shape instanceof Circle,"Shape is not a Circle");

    }

    @Test
    void testGetRectangleShape() {
        Shape shape = shapeFactory.getShape("RECTANGLE");

        assertNotNull(shape,"Should not return null");
        assertTrue(shape instanceof Rectangle,"Shape is not a Rectangle");
    }

    @Test
    void testUnknowShape(){
        Shape shape = shapeFactory.getShape("TRIANGLE");
        assertNull(shape,"should return null");


    }

    @Test
    void testNullShape(){
        Shape shape = shapeFactory.getShape(null);
        assertNull(shape,"should return null for null input");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Testing finished");
    }
}
