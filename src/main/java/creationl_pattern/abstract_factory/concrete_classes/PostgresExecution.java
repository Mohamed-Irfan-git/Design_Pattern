package creationl_pattern.abstract_factory.concrete_classes;

import creationl_pattern.abstract_factory.interfaces.Command;

public class PostgresExecution implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Postgres Database executed "+query);
    }
}
