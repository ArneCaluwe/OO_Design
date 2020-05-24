package command;

public class FlushFishCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("The fish was flushed");
    }

    @Override
    public void rollback() {
        System.out.println("Oh hell, i swam after it, but here it is!");
    }
}
