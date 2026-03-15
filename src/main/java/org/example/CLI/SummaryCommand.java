package org.example.CLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "summary", description = "See a summary of your expenses")
public class SummaryCommand extends AbstractCommand implements Runnable{

    @Option(names = {"--mounth", "-m"}, description = "The month you want to see the summary of expenses")
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
