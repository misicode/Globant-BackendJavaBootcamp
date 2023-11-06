package org.amincia._01POO.Exercises.P105.services;

import org.amincia._01POO.Exercises.P105.entities.Account;

import java.util.Scanner;

public class AccountService {
    Scanner scanner = new Scanner(System.in);

    public Account createAccount() {
        Account account = new Account();

        System.out.print("Ingrese su número de cuenta: ");
        account.setAccountNumber(scanner.nextInt());
        System.out.print("Ingrese su DNI: ");
        account.setDniCustomer(scanner.nextLong());
        System.out.print("Ingrese su saldo: ");
        account.setCurrentBalance(scanner.nextDouble());

        return account;
    }

    public void depositBalance(Account account, double amount) {
        account.setCurrentBalance(account.getCurrentBalance() + amount);
        System.out.println("Se depositó el monto de S/" + amount);
    }

    public void removeBalance(Account account, double amount) {
        double currentBalance = account.getCurrentBalance();

        if(currentBalance == 0) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        if(currentBalance < amount) {
            account.setCurrentBalance(0);
            System.out.println("Saldo insuficiente!");
            System.out.println("Se retiró el monto de S/" + currentBalance);
            return;
        }
        account.setCurrentBalance(currentBalance - amount);
        System.out.println("Se retiró el monto de S/" + amount);
    }

    public void removeBalanceFast(Account account, double amount) {
        double currentBalance = account.getCurrentBalance();

        if(currentBalance == 0) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        if((0.2 * currentBalance) < amount) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Solo puede retirar hasta un 20% de su saldo actual en este modo");
            return;
        }
        account.setCurrentBalance(currentBalance - amount);
        System.out.println("Se retiró el monto de S/" + amount);
    }

    public void consultBalance(Account account) {
        System.out.println("Su saldo actual es de S/" + account.getCurrentBalance());
    }

    public void consultData(Account account) {
        System.out.println(account);
    }
}
