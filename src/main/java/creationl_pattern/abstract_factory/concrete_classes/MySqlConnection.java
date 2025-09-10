package creationl_pattern.abstract_factory.concrete_classes;

import creationl_pattern.abstract_factory.interfaces.Connection;


/**
 * this is the Mysql connection concrete class
 * we implement that particular interface
 * after we override that method
 */
public class MySqlConnection implements Connection {
    @Override
    public void connection() {
        System.out.println("MySql Database connected to database.");
    }
}
