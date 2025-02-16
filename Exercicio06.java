package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller06;

public class Exercicio06 {
	
	public static void main (String[] args) {
		
		Controller06 SomaRecursiva = new Controller06();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural: "));

		int soma = SomaRecursiva.SomaRecursiva(x, y);
		
		System.out.println("O resultado da soma é: " + soma);
	}

}
