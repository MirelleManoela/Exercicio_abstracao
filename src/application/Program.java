package application;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i =1; i<= n ; i++){
            System.out.println("Tax payer #" + i+ " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.next();
            System.out.print("Anual income: ");
            double anuallcome = sc.nextDouble();

            if (ch == 'i'){
            System.out.print("Health expenditures: ");
            Double healthExpenditures = sc.nextDouble();
            list.add(new Individual(name, anuallcome, healthExpenditures));
        }
            else{
                System.out.print("Number of employees:  ");
                int numberofemployees = sc.nextInt();
                list.add(new Company(name, anuallcome, numberofemployees));


        }


    }
        System.out.println();
        System.out.println("TAXES PAID:");

        double soma = 0;

        for (TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + " $ " + taxPayer.tax());
            soma = soma +  taxPayer.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + soma);
}
}
