public class ClasseTeste {
    public static void main(String[] args) {
        String texto1 = "gago";
        String texto2 = "xinxila";
        String texto3 = "abacate";
        String texto4 = "babaca";
        String texto5 = "babacu";
        String texto6 = "tenso";
        String texto7 = "babaca";

        ListaOrdenadaDePalavras l = new ListaOrdenadaDePalavras();

        l.OrganizaAlfabetica(texto1);
        l.OrganizaAlfabetica(texto2);
        l.OrganizaAlfabetica(texto3);
        l.OrganizaAlfabetica(texto4);
        l.OrganizaAlfabetica(texto5);
        l.OrganizaAlfabetica(texto6);
        //l.OrganizaAlfabetica(texto7);

        l.mostraLista();


    }
}
