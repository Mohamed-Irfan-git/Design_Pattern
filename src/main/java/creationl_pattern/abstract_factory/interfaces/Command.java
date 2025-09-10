package creationl_pattern.abstract_factory.interfaces;


/**
 * we know database should have command
 * so we creating here a interface called command
 */
public interface Command {
    void execute(String query);
}
