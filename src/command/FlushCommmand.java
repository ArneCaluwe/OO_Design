package command;

public class FlushCommmand  implements ICommand {
    @Override
    public void execute() {
        System.out.println("Flush flush slush flush");
    }

    @Override
    public void rollback() {
        System.out.println("You crazy man, why would you do that");
    }
}
