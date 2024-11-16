public class TACNode {
    
    String operation;   // Operação: +, -, *, etc.
    String operand1;    // Primeiro operando
    String operand2;    // Segundo operando (pode ser null para unários)
    String result;      // Resultado armazenado (variável temporária ou destino)

    public TACNode(String operation, String operand1, String operand2, String result) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    @Override
    public String toString() {
        if (operand2 == null) {
            return result + " = " + operation + " " + operand1;
        } else {
            return result + " = " + operand1 + " " + operation + " " + operand2;
        }
    }
}