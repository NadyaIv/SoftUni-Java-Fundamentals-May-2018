package Lab_problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, BankAccount> accounts = new LinkedHashMap<>();
        while (true) {
            String[] inputs = reader.readLine().split("\\s+");
            String command = inputs[0];
            if ("End".equals(command)) {
                break;
            }
            switch (command) {
                case "Create":
                    BankAccount ba = new BankAccount();
                    ba.setId();
                    accounts.putIfAbsent(ba.getId(), ba);
                    System.out.printf("Account %s created\n", ba);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(inputs[1]);
                    double amount = Double.parseDouble(inputs[2]);
                    BankAccount acc = accounts.get(id);
                    if (acc != null) {
                        accounts.get(id).deposit(amount);
                        DecimalFormat df = new DecimalFormat("#.##");
                        System.out.printf("Deposited %s to %s\n", df.format(amount), accounts.get(id));
                    } else {
                        System.out.printf("Account does not exist\n");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(inputs[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int idInterest = Integer.parseInt(inputs[1]);
                    int years = Integer.parseInt(inputs[2]);
                    BankAccount accInterest = accounts.get(idInterest);
                    if (accInterest != null) {
                        System.out.printf("%.2f\n", accInterest.getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
        }
    }
}
