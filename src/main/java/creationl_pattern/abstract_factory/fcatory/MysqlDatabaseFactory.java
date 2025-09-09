package creationl_pattern.abstract_factory.fcatory;

import creationl_pattern.abstract_factory.concrete_classes.MySqlConnection;
import creationl_pattern.abstract_factory.concrete_classes.MysqlExecution;
import creationl_pattern.abstract_factory.interfaces.Connection;
import creationl_pattern.abstract_factory.interfaces.Command;

public class MysqlDatabaseFactory implements DatabaseFactory {


    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Command createExecute() {
        return new MysqlExecution();
    }
}
