

import java.util.Scanner;

public class ClassificacaoNota
{
    public static void main(String[] args)
    {


Scanner teclado = new Scanner(System.in);
float primeiraNota, segundaNota,notaProjeto, mediaAluno[];
String nomeAluno[];
String disciplina[];
int raAluno[];
float somaMedia, mediaTurma;
int melhorAluno;
int piorAlunos;

nomeAluno = new String[10];
disciplina = new String[10];
raAluno = new int[10];
mediaAluno = new float[10];

somaMedia = 0;
for (int i=0; i<10; i++)
{

System.out.println("Digite o nome do "+ (i+1) +"º aluno: ");
nomeAluno[i] = teclado.nextLine();
System.out.println("Digite a disciplina do aluno: ");
disciplina[i] = teclado.nextLine();
System.out.println("Digite o ra do aluno: ");
raAluno[i] = teclado.nextInt();
System.out.println("Digite a primeira nota: ");
primeiraNota = teclado.nextFloat();
System.out.println("Digite a segunda nota: ");
segundaNota = teclado.nextFloat();
System.out.println("Digite a nota do projeto: ");
notaProjeto = teclado.nextFloat();
System.out.println("\n");
teclado.nextLine();
mediaAluno[i] = calcularMedia(primeiraNota, segundaNota, notaProjeto);
somaMedia += mediaAluno[i];
}
mediaTurma = somaMedia / 10;
System.out.println("\nA média da turma é: " + mediaTurma);

melhorAluno = 0;
for (int i=0; i<10; i++)
{
if (mediaAluno[i] > mediaAluno[melhorAluno])
melhorAluno = i;
}
System.out.printf("\nO melhor aluno da turma foi %s com media igual a %.1f\n\n", nomeAluno[melhorAluno], mediaAluno[melhorAluno]);

System.out.println("Alunos com media menor que 6: ");
piorAlunos = 0;
for (int i=0; i<10; i++)
{
if (mediaAluno[i] < 6){
piorAlunos = i;
System.out.printf("Nome: %s \n",nomeAluno[piorAlunos]);   
}
}

System.out.println("\nLista dos alunos ");
for (int i=0; i<10; i++)
System.out.printf("Aluno: %s - RA: %d - Disciplina: %s - Média: %.1f\n",nomeAluno[i],raAluno[i],disciplina[i], mediaAluno[i]);

teclado.close();
  }

static float calcularMedia(float a, float b, float c)
{
return (a+b+c)/3;
}

}
