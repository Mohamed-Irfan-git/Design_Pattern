package creationl_pattern.abstract_factory.fcatory;

import creationl_pattern.abstract_factory.interfaces.Connection;
import creationl_pattern.abstract_factory.interfaces.Command;

/**
 * in here we're done the abstract factory method
 * this database example is the one of the classical example anyone can easily understand
 * this method is factories of factories
 * Parent factory under lot of child factory can be
 *
 *
 * this is our main database interface this we called a a factory
 */
public interface DatabaseFactory {
    Connection createConnection();
    Command createExecute();
}
