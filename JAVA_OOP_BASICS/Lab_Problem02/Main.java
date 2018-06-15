package Lab_Problem02;

import Lab_Poblem01.BankAccount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<BankAccount> ba = new ArrayList<BankAccount>();
        BankAccount bas = new BankAccount();
        bas.deposit(7);
        BankAccount bav=new BankAccount();
        bav.deposit(6);
        BankAccount bar=new BankAccount();
        bar.deposit(6);
        ba.add(bas);
        ba.add(bav);
        ba.add(bar);
        Person person=new Person("Pesho",25,ba);


        System.out.println(person.getBalanced());
    }
}
