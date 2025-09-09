package creationl_pattern.abstract_factory.main;

import creationl_pattern.abstract_factory.fcatory.DatabaseFactory;
import creationl_pattern.abstract_factory.fcatory.MysqlDatabaseFactory;
import creationl_pattern.abstract_factory.fcatory.PostgresDatabaseFactory;
import creationl_pattern.abstract_factory.interfaces.Connection;
import creationl_pattern.abstract_factory.interfaces.Command;

public class Application {
    Command dbExecute;
    Connection dbConnection;

    /**
     *
     * @param factory this is database type it can be mysql or postgres
     * in test cases we wrote more efficient better than this
     *
     */
    public void applicationDemo(DatabaseFactory factory) {
        this.dbExecute = factory.createExecute();
        this.dbConnection = factory.createConnection();
    }

    /**
     *
     * @param sql for run method
     * it gives that particular Database
     */

    public void run(String sql) {
        this.dbConnection.connection();
        this.dbExecute.execute(sql);

    }

    public static void main(String[] args) {
        MysqlDatabaseFactory mysqlDatabaseFactory = new MysqlDatabaseFactory();
        PostgresDatabaseFactory postgresDatabaseFactory = new PostgresDatabaseFactory();

        Application application = new Application();
        String query = "select * from user";
        String dbType = "mysql";

        if(dbType.equals("mysql")) {
            application.applicationDemo(mysqlDatabaseFactory);
        }
        else {
            application.applicationDemo(postgresDatabaseFactory);
        }
        application.run(query);
    }

}
