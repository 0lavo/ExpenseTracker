package org.example.CLI;

import org.example.ExpenseController;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "summary", description = "See a summary of your expenses")
public class SummaryCommand extends AbstractCommand implements Runnable{

    @Parameters(index = "0", arity = "0..1", description = "The month you want to see the summary of expenses")
    private Integer month;

    @Override
    public void run() {
        if (month == null) {
            expenseController.summary();
            return;
        }

        expenseController.summary(month);
    }
}
