package Lab_Poblem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,BankAccount> accounts=new HashMap<>();
        while(true) {
            String[] inputs = reader.readLine().split("\\s+");
            if ("End".equals(inputs[0])) {
                break;
            }
            String command = inputs[0];
            int id = Integer.parseInt(inputs[1]);
            if ("Create".equals(command)) {
                if (!accounts.containsKey(id)) {
                    BankAccount acc = new BankAccount();
                    acc.setId(id);
                    accounts.put(id,acc);
                } else {
                    System.out.println("Account already exists");
                }
                System.out.println();
            } else if ("Deposit".equals(command)) {
                double amount = Double.parseDouble(inputs[2]);
                if (!accounts.containsKey(id)) {
                    System.out.println("Account does not exist");
                } else {
                     accounts.get(id).deposit(amount);
                }
            } else if ("Withdraw".equals(command)) {
                double amount = Double.parseDouble(inputs[2]);
                if (!accounts.containsKey(id)) {
                    System.out.println("Account does not exist");
                } else {
                    try {
                        accounts.get(id).withdraw(amount);
                    } catch (IllegalStateException ise) {
                        System.out.println(ise.getMessage());
                    }
                }
            } else if ("Print".equals(command)) {
                if (!accounts.containsKey(id)) {
                    System.out.println("Account does not exist");
                } else {
                    System.out.printf("Account %s, balance %.2f\n", accounts.get(id), accounts.get(id).getBalance());
                }
            }
        }

    }
}
