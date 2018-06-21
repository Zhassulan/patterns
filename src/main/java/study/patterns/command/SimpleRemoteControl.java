package study.patterns.command;

import study.patterns.command.interfaces.ICommand;

public class SimpleRemoteControl {

    ICommand slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(ICommand command) {
        slot = command;
    }

    public void buttonWasPressed()  {
        slot.execute();
    }

}
