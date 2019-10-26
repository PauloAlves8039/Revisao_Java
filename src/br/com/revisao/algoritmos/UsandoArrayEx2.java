/*
 * Arquivo: Classe - UsandoArrayEx2
 * Autor: Paulo Alves
 * Descrição: usando um vetor para listar notas de alunos e através da média definir a situação do mesmo
 * Data: 25/10/2019
*/
package br.com.revisao.algoritmos;

import java.util.Scanner;

public class UsandoArrayEx2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("***** MÉDIA DE ALUNO *****");
		double[] notasAluno = new double[4];
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Informe a " + (i + 1) + "° nota: ");
			notasAluno[i] = input.nextDouble();
		}

		System.out.println("***** LISTA DAS NOTAS *****");
		for (double notas : notasAluno) {
			System.out.println(notas);
		}

		double media = (notasAluno[0] + notasAluno[1] + notasAluno[2] + notasAluno[3]) / 4;

		System.out.println("***** RESULTADO *****");
		if (media <= 2.9) {
			System.out.println(String.format("A média é: %.2f - REPROVADO!", media));
		} else if (media >= 3.0 && media <= 6.0) {
			System.out.println(String.format("A média é: %.2f - RECUPERAÇÃO", media));
		} else if (media >= 7.0 && media <= 10.0) {
			System.out.println(String.format("A média é: %.2f - APROVADO!", media));
		}

		input.close();

	}
}
