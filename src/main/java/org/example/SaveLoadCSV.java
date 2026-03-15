package org.example;

import java.io.*;
import java.util.ArrayList;

public class SaveLoadCSV {
    private final String filePath = "save.csv";


    public void save(ArrayList<Expense> expensesArrayList) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Expense e : expensesArrayList) {
                writer.write(e.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- Expenses saved! ---");
    }

    public void load(ArrayList<Expense> expenseArrayList) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                Expense expense = new Expense(values);
                expenseArrayList.add(expense);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- Expenses loaded! ---");
    }

}
