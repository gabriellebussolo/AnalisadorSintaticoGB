
public class TabelaSimbolosNode {

    String tipo;   // tipo do atributo declarado
    String nome;   // nome do atributo declarado

    public TabelaSimbolosNode(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return tipo + " " + nome;   
    }
}