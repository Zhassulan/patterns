package study.patterns.command;

import study.patterns.command.interfaces.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed()  {
        slot.execute();
    }

}
