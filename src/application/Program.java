package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Name: ");
        String name1 = sc.next();
        System.out.print("Vida inicial: ");
        int initialLife1 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor1 = sc.nextInt();
        System.out.println();

        Champion champion1 = new Champion(name1, initialLife1, attack1, armor1);

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Name: ");
        String name2 = sc.next();
        System.out.print("Vida inicial: ");
        int initialLife2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();
        System.out.println();

        Champion champion2 = new Champion(name2, initialLife2, attack2, armor2);

        System.out.print("Quantos turnos você deseja executar ? " );
        int shifts = sc.nextInt();
        System.out.println();

        for (int i = 0; i < shifts; i++) {
            System.out.println("Resultado do turno "+ (i+1) +": ");

            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.println(champion1.status());
            System.out.println(champion2.status());

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                System.out.println();
                System.out.println("FIM DO COMBATE");
                i = shifts - 1;
            }

            System.out.println();
        }

        sc.close();
    }

}
