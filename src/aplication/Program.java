package aplication;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Champion champion1;
		Champion champion2;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		
		champion1 = new Champion(name, life, attack, armor);
		champion2 = new Champion(name2, life2, attack2, armor2);
		
		System.out.println();
		System.out.println("Quantos turnos você deseja executar?");
		int n = sc.nextInt();
		
		int turno = 0;
		
		while(turno < n && champion1.getLife() != 0 && champion2.getLife() != 0) {
			turno++;
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.println();
			System.out.println("Resultado do turno " + turno + ":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
		}
		
		System.out.println();
		
		if (champion1.getLife() == 0 || champion2.getLife() == 0) {
            System.out.println("FIM DO COMBATE");
        }
		
		sc.close();

	}

}
