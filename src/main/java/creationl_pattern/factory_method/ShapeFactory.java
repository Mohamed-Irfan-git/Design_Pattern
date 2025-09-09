package creationl_pattern.factory_method;

/**
 * Its main goal is to delegate object creation to a method, so the client doesn’t depend on concrete classes.
 * <p>
 * Key Idea: “I ask the factory for an object; I don’t care how it’s created.”
 * <p>
 * key-Components
 * 1.interface
 * 2.concrete class that need to implement that interface
 * 3.creator like this shape factory class
 * 4.client
 *   they create a Shape type object trow that they access this
 *   example:
 *     Shape shape = ShapeFactory.getShape("CIRCLE"); // ths will return that exact that shape
 *     no need to create new object rectangle to circle
 *
 *     name is <h1>Factory Method<h1/>
 *     Factory Method = Delegate creation, return an interface, hide concrete class.
 */
public class ShapeFactory {

    /**
     *
     * @param shapeType to create that actual object
     * @return Shape type that  can be Rectangle or Circle
     *
     */
    public Shape getShape(String shapeType) {

        if(shapeType==null){
            return null;
        }

        switch (shapeType) {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();

            default:
                return null;
        }
    }
}
