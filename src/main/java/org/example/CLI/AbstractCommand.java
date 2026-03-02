package org.example.CLI;

import org.example.ExpenseController;

public abstract class AbstractCommand {
    protected static ExpenseController expenseController = new ExpenseController();
}
