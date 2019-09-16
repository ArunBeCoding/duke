package command;

import utilities.Storage;
import utilities.TaskList;
import utilities.Ui;

public class ByeCommand extends Command {
    public ByeCommand(String command) {
        super(command);
    }

    public String executeAsString(TaskList tasks, Ui ui, Storage storage) {
        return ui.showConclusionFX();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
