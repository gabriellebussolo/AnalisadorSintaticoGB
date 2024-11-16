import java.io.*;
import TACNode.java;

public class Main {
    public static void main(String[] args) throws Exception {
        // Verifica se o arquivo de entrada foi passado como argumento
        if (args.length == 0) {
            System.out.println("Erro: envie o arquivo novamente.");
            return;
        }

        // Abre o arquivo de entrada
        FileReader fileReader = new FileReader(args[0]);

        // Cria uma instância do lexer
        fooliLexer lexer = new fooliLexer(fileReader);

        // Cria uma instância do parser e passa o lexer
        parser p = new parser(lexer);

        // Recupera a lista de TACs gerada
        List<TACNode> tacList = p.tacList;

        // Imprime o código intermediário (TACs)
        System.out.println("Código Intermediário (TAC):");
        for (TACNode tac : tacList) {
            System.out.println(tac);
        }

        try {
            // Inicie a análise
            p.parse();
            System.out.println("Parse concluído com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro durante a análise: " + e.getMessage());
            e.printStackTrace();
        }
  }
}
