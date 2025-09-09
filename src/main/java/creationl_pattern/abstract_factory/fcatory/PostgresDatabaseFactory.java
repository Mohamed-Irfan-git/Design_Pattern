package creationl_pattern.abstract_factory.fcatory;

import creationl_pattern.abstract_factory.concrete_classes.PostgresConnection;
import creationl_pattern.abstract_factory.concrete_classes.PostgresExecution;
import creationl_pattern.abstract_factory.interfaces.Connection;
import creationl_pattern.abstract_factory.interfaces.Command;

public class PostgresDatabaseFactory implements DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public Command createExecute() {
        return new PostgresExecution();
    }
}