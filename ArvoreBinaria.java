package main;

// Implementação da classe árvore binária, com construtor e o método insere()
public class ArvoreBinaria
{
    private No raiz;

    public ArvoreBinaria() // construtor da classe Arvore Binaria
    {
        this.raiz = null; // inicia a árvore vazia
    }
    public void insere(long id, Object elemento) // método para inserção de elemento
    {
        No novoNo = new No(id,elemento,null,null);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            No pai;
            while (true) {
                pai = atual;
                if (id < atual.getId()) { // vai inserir à esquerda
                    atual = atual.getEsq();
                    if (atual == null) { // pode inserir à esquerda
                        pai.setEsq(novoNo);
                        return;
                    } // se não é nulo, vai tentar o próximo filho
                } else { // vai inserir à direita
                    atual = atual.getDir();
                    if (atual == null) { // pode inserir à direita
                        pai.setDir(novoNo);
                        return;
                    }
                }
            }
        }
    } // final método insere

    private void imprime(No atual, String espaco) // caminhamento pré-fixado da árvore binária
    {
        if (atual != null) {
            System.out.println(espaco + atual.getElemento());
            imprime(atual.getEsq(), espaco + "  ");
            imprime(atual.getDir(), espaco + "  ");
        } else {
            System.out.println(espaco + "-");
        }
    } // final método imprime

    public void imprimeElementosArvore() // impressão dos elementos da árvore
    {
        imprime(raiz, "");
    } // final do método para impressão

    private long checaEsquerda(No atual) // calcula a altura da árvore
    {
        if (atual != null) {
            long e,d;
            if (atual.getEsq() != null ) {
                e = checaEsquerda(atual.getEsq())+1;
            } else {
                e = 0;
            }
            d = checaEsquerda(atual.getDir());
            return e+d;
        }
        return 0;
    } // final método checaEsquerda

    public long esquerdaFestiva()
    {
        return checaEsquerda(raiz);
    } // final do método alturaArvore
} // Final da classe ArvoreBinaria
