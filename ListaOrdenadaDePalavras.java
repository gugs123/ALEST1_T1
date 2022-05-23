/**
 * Esta classe guarda as palavra do indice remissivo em ordem alfabetica.
 * 
 * @author Isabel H. Manssour
 */

public class ListaOrdenadaDePalavras {
    private Palavra refHead = null;

    // Classe interna
    private class Palavra {

        public String str;
        public ListaDeOcorrencias listaOcorrencias;
        public Palavra next;

        public Palavra(String str) {
            this.str = str;
            next = null;
            listaOcorrencias = new ListaDeOcorrencias();
        }

        public String getPalavra() {
            return str;
        }

        public void setPalavra(String str) {
            this.str = str;
        }

        public ListaDeOcorrencias getListaOcorrencias() {
            return listaOcorrencias;
        }

        public void setListaOcorrencias(ListaDeOcorrencias listaOcorrencias) {
            this.listaOcorrencias = listaOcorrencias;
        }

        public Palavra getNext() {
            return next;
        }

        public void setNext(Palavra next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Palavra [str=" + str + "]";
        }

        // metodo add para adicionar uma palavra na lista

        // demais metodos necessarios
    }

    private int qtd = 0;

    public void mostraLista() {
        Palavra p = refHead;
        for (int i = 0; i <= qtd - 1; i++) {
            System.out.println(p.getPalavra());
            p = p.getNext();
        }
    }

    // Método para adicionar primeira palavra na lista
    public void adicionaPrimeiraPalavra(String palavra) {
        Palavra p = new Palavra(palavra);
        p.setNext(refHead);
        refHead = p;
        qtd++;
    }

    public void setNovaPalavra(int index, String str) {
        Palavra aux = refHead;

        for (int i = 0; aux != null && i < index; i++)
            aux = aux.getNext();

        if (aux != null)
            aux.setPalavra(str);
        else
            throw new IllegalArgumentException();
    }

    public void OrganizaAlfabetica(String palavraVerificar) {
        if (qtd == 0) {
            adicionaPrimeiraPalavra(palavraVerificar);
        } else {
            int posPalavra = 0;
            Palavra novaPalavra = new Palavra(palavraVerificar);
            Palavra aux = refHead;

            do {
                do {
                    // verifica se letra da nova palavra vem antes da letra da palavra an lista
                    // se nao, entra no loop
                    verificaOrdem(aux, novaPalavra, posPalavra, palavraVerificar);
                } while (aux.getNext() == null);

            } while (aux.getNext() == null);
        }
    }

    public void verificaOrdem(Palavra aux, Palavra novaPalavra, int posPalavra, String palavraVerificar) {
        char caracVerificar = palavraVerificar.charAt(posPalavra);
        char caracPalNaLista = aux.getPalavra().charAt(posPalavra);
        int cont = 0;
        Palavra auxAnterior = null;

        cont++;
        if (caracVerificar > caracPalNaLista) {
            while (aux.getNext() != null) {
                Palavra p = aux.getNext();
                String strPalavra = p.getPalavra();
                char caracProxPalavra = strPalavra.charAt(0);

                if (caracVerificar >= caracProxPalavra) {
                    aux = aux.getNext();
                } else {
                    break;
                }
            }
            while (caracPalNaLista == caracVerificar) {
                caracVerificar = palavraVerificar.charAt(posPalavra++);
                caracPalNaLista = aux.getPalavra().charAt(posPalavra++);
            }
            if (cont == 1) {
                novaPalavra.setNext(aux.getNext());
                aux.setNext(novaPalavra);
                qtd++;
                Palavra aux2 = new Palavra("");
                aux = aux2;
            } else {
                auxAnterior = aux.getNext();
                novaPalavra.setNext(auxAnterior);
                aux = aux.getNext();

                verificaOrdem(aux, novaPalavra, posPalavra, palavraVerificar);
            }

        } else {
            if (cont == 1) {
                novaPalavra.setNext(aux);
                refHead = novaPalavra;
                qtd++;
                Palavra aux2 = null;
                aux = aux2;
            } else {
                novaPalavra.setNext(aux);
                qtd++;
                Palavra aux2 = null;
                aux = aux2;
            }
        }
    }

}
