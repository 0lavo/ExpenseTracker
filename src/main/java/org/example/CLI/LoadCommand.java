package org.example.CLI;

import org.example.SaveLoadCSV;
import picocli.CommandLine.Command;

@Command(name = "load", description = "Load the save.csv file your expanses")
public class LoadCommand extends AbstractCommand implements Runnable {


    private SaveLoadCSV saveLoadCSV = new SaveLoadCSV();

    @Override
    public void run() {
        saveLoadCSV.load(expenseController.getExpenseList());
    }
}
