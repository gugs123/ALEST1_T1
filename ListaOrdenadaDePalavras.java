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

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
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

    // Método para adicionar primeira palavra na lista 
    public void adicionaPrimeiraPalavra(String palavra) {
        Palavra p = new Palavra(palavra);
        p.setNext(refHead);
        refHead = p;  
    }



}
