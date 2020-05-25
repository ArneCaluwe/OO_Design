package command;

public class FlushRingCommmand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Woops, you flushed your favorite ring");
    }

    @Override
    public void rollback() {
        System.out.println("It took me days of scowering the sewers. But here it is");
    }
}
