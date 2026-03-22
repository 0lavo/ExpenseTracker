# Expense Tracker (Java CLI)

A simple command-line expense tracker built with Java 17 and [picocli](https://picocli.info/).

You can add expenses, list them, delete by ID, view summaries, and save/load data from a local CSV file.

## Features

- Add expenses with amount and description
- List all expenses
- Delete expenses by ID
- Summary of all expenses
- Summary filtered by month
- Save to `save.csv`
- Load from `save.csv`

## Tech Stack

- Java 17
- Maven
- picocli

## Project Structure

```text
src/main/java/org/example
├── Main.java
├── Expense.java
├── ExpenseController.java
├── SaveLoadCSV.java
└── CLI/
    ├── ExpenseTrackerCommand.java
    ├── AddCommand.java
    ├── DeleteCommand.java
    ├── ListCommand.java
    ├── SummaryCommand.java
    ├── SaveCommand.java
    └── LoadCommand.java
```

## Requirements

- JDK 17+
- Maven 3.8+

Check versions:

```bash
java -version
mvn -version
```

## Build

```bash
mvn clean package
```

## Run

You can run from your IDE (execute `Main.java`) or via Maven:

```bash
mvn -q exec:java -Dexec.mainClass="org.example.Main"
```

When running, you’ll get an interactive prompt:

```text
Expense Tracker Started. Type 'exit' to quit.
>
```

Type commands directly at the prompt (without `expense-tracker` prefix).

## Command Reference

### Add expense

```text
add --amount 25.90 --description lunch
add -a 12.50 -d coffee
```

### List expenses

```text
list
```

### Delete expense by ID

```text
delete --id 2
```

### Summary (all expenses)

```text
summary
```

### Summary by month

```text
summary --mounth 3
summary -m 3
```

> Note: The option name is currently `--mounth` (as implemented in code).

### Save expenses

```text
save
```

### Load expenses

```text
load
```

## Data File

- File used for persistence: `save.csv` (project root)
- Format:

```text
id,amount,description,date
```

Example:

```text
1,10.0,mercado,2026-03-15
2,6.0,spotify,2026-03-15
```

## Notes

- Data is kept in memory while the app runs.
- Use `save` before exiting if you want to persist data.
- Use `load` after starting the app to restore saved expenses.
