
public class TACNode {

    String operation;   // Operação: +, -, *, etc.
    String arg1;    // Primeiro operando
    String arg2;    // Segundo operando (pode ser null para unários)
    String result;      // Resultado armazenado (variável temporária ou destino)

    public TACNode(String operation, String arg1, String arg2, String result) {
        this.operation = operation;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }

    @Override
    public String toString() {
        if (operation == null)
            return result + " := " + arg1;
        else if (arg2 == null) 
            return result + " := " + operation + " " + arg1;
        else 
            return result + " := " + arg1 + " " + operation + " " + arg2;
        
    }
}