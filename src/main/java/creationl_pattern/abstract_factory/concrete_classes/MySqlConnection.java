package creationl_pattern.abstract_factory.concrete_classes;

import creationl_pattern.abstract_factory.interfaces.Connection;

public class MySqlConnection implements Connection {
    @Override
    public void connection() {
        System.out.println("MySql Database connected to database.");
    }
}
