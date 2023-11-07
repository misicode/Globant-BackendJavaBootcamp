package com.misicode._01POO.Exercises.P105;

import com.misicode._01POO.Exercises.P105.entities.Account;
import com.misicode._01POO.Exercises.P105.services.AccountService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Account account = accountService.createAccount();
        Scanner scanner = new Scanner(System.in);
        int opt;

        do {
            System.out.println("===================================");
            System.out.println("OPERACIONES DE CUENTA");
            System.out.println("1. Depositar monto");
            System.out.println("2. Retirar monto");
            System.out.println("3. Retirar monto rápido");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("0. Salir");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("DEPÓSITO");
                    System.out.print("Monto: ");
                    accountService.depositBalance(account, scanner.nextDouble());
                }
                case 2 -> {
                    System.out.println("RETIRO");
                    System.out.print("Monto: ");
                    accountService.removeBalance(account, scanner.nextDouble());
                }
                case 3 -> {
                    System.out.println("RETIRO RÁPIDO");
                    System.out.print("Monto: ");
                    accountService.removeBalanceFast(account, scanner.nextDouble());
                }
                case 4 -> {
                    System.out.println("SALDO");
                    accountService.consultBalance(account);
                }
                case 5 -> accountService.consultData(account);
            }
        } while(opt != 0);
    }
}
