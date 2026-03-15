package org.example.CLI;

import org.example.SaveLoadCSV;
import picocli.CommandLine.Command;

@Command(name = "save", description = "Saves the list of expanses in a local file")
public class SaveCommand extends AbstractCommand implements Runnable{


    private SaveLoadCSV saveLoadCSV = new SaveLoadCSV();

    @Override
    public void run() {
        saveLoadCSV.save(expenseController.getExpenseList());
    }
}
