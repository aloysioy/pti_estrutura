package main;

public class ExemploArvoreBinaria // Exemplo de criação de uma árvore binária
{
	public static void main(String[] args)
	{
		ArvoreBinaria a = new ArvoreBinaria(); // cria a árvore binária
		a.insere(555,"555");
		a.insere(333,"333");
		a.insere(888,"888");
		a.insere(111,"111");
		a.insere(444,"444");
		a.insere(777,"777");
		a.insere(999,"999");

		a.imprimeElementosArvore();
		System.out.println("Esquerda Festiva: "+a.esquerdaFestiva());
	}
} // final do exemplo de criação de uma árvore binária