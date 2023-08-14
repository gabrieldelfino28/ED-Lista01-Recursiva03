package view;

import controller.Fatorial;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        Scanner s = new Scanner(System.in);

        System.out.println("Fatorial\nInforme um valor: ");
        int Num = s.nextInt();

        int Res = f.Func_Fatorial(Num);
        System.out.println(Res);
    }
}
