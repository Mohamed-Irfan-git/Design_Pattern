package creationl_pattern.abstract_factory.concrete_classes;

import creationl_pattern.abstract_factory.interfaces.Command;

public class MysqlExecution implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Mysql Database executed "+query);
    }
}
