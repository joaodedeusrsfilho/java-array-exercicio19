package aula19_Arrays;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*Ler as duas notas bimestrais para um conjunto de 10 alunos.
		Armazenar as notas informadas em dois vetores "Nota1" e 
		"Nota2" do tipo real. Escreva um programa que calcule a média
		aritmética simples das notas informadas armazenando o 
		resultado em um vetor "Result" de mesmo tipo e tamanho.
		
		Ao mostrar os resultados exibir a situação de cada aluno. 
		Se a média calculada for superior ou igual a 7 o aluno
		estará "Aprovado", caso contrário, a situação do aluno 
		será "reprovado".*/
		
		Scanner ler = new Scanner(System.in);
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas1.length];
		
		for(int x=0;x<notas1.length;x++) {
			System.out.println("Digite a nota 1 do aluno numero "+(x+1));
			notas1[x] = ler.nextDouble();
			System.out.println("Digite a nota 2 do aluno numero "+(x+1));
			notas2[x] = ler.nextDouble();
			
			result[x] = (notas1[x]+notas2[x]) / 2;			
		}
		for(int x=0;x<result.length;x++) {
			if(result[x] >= 7) {
				System.out.println("Aluno numero "+(x+1)+" APROVADO");
			}else if(result[x] < 7){
				System.out.println("Aluno numero "+(x+1)+" REPROVADO");
			}
		}
	}

}
