
public class TACNode {

    String code;  
    String place; 
    String nome;   

    public TACNode(String place, String code, String nome) {
        this.code = code;
        this.place = place;
        this.nome = nome;
    }

    @Override
    public String toString() {
        if (code == null)
            return "(" + nome + ") " + place;
        else 
            return "(" + nome + ") " + code;
        
    }
}