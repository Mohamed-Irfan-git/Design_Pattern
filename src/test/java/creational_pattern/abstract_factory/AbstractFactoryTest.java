package creational_pattern.abstract_factory;

import creationl_pattern.abstract_factory.concrete_classes.MySqlConnection;
import creationl_pattern.abstract_factory.concrete_classes.MysqlExecution;
import creationl_pattern.abstract_factory.concrete_classes.PostgresConnection;
import creationl_pattern.abstract_factory.concrete_classes.PostgresExecution;
import creationl_pattern.abstract_factory.fcatory.DatabaseFactory;
import creationl_pattern.abstract_factory.fcatory.MysqlDatabaseFactory;
import creationl_pattern.abstract_factory.fcatory.PostgresDatabaseFactory;
import creationl_pattern.abstract_factory.interfaces.Command;
import creationl_pattern.abstract_factory.interfaces.Connection;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Testing started.....");
    }

    @Test
    void testMysqlObjectCreation() {
       try {
           MysqlDatabaseFactory factory = new MysqlDatabaseFactory();

           Connection connection = factory.createConnection();
           Command command = factory.createExecute();
           connection.connection();

           assertInstanceOf(MySqlConnection.class, connection, "connection should be MySqlConnection");
           assertInstanceOf(MysqlExecution.class, command, "command should be MysqlExecution");


       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }


    @Test
    void testPostgresObjectCreation() {
        try {
            PostgresDatabaseFactory factory = new PostgresDatabaseFactory();
            Connection connection = factory.createConnection();
            Command command = factory.createExecute();
            connection.connection();
            assertInstanceOf(PostgresConnection.class, connection, "connection should be PostgresConnection");
            assertInstanceOf(PostgresExecution.class, command, "command should be PostgresExecution");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    void tetsCommandExecution(){
        DatabaseFactory factory = new MysqlDatabaseFactory();
        Command command = factory.createExecute();

        DatabaseFactory factory2 = new PostgresDatabaseFactory();
        Command command2 = factory2.createExecute();

        /**
         * in here i wrote the java lambda expression
         * if we have one method under the interface then we can write like this
         *
         *  assertDoesNotThrow(new Executable() {
         *             @Override
         *             public void execute() throws Throwable {
         *                 command.execute("SELECT * FROM users");
         *             }
         *         }); this is a little bit tricky
         *
         *
         *  Here, instead of checking console output,
         *  we assume execute() changes state or returns something.
         *  For demo, we just ensure no exception is thrown.
         */

        assertDoesNotThrow(()->command.execute("SELECT * FROM users"));
        assertDoesNotThrow(()->command2.execute("SELECT * FROM users"));
    }

    @Test
    void testSwitchingFactory(){
        DatabaseFactory factory = new MysqlDatabaseFactory();

        assertInstanceOf(MySqlConnection.class, factory.createConnection(), "factory should be" +
                " MysqlDatabaseFactory connection");


        // Switching happening here
        factory = new PostgresDatabaseFactory();

        assertInstanceOf(PostgresConnection.class, factory.createConnection(), "factory should be" +
                " PostgresConnection");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("Testing finished...");
    }
}
