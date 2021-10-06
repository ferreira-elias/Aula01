import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// As duas linhas abaixo exibem mensagens na tela
System.out.println("PROGRAMA EDUCADO");
System.out.println("Por favor, digite o seu nome: ");
// para ler dados, a linha abaixo CRIA um scanner
Scanner Leitor = new Scanner(System.in);
//Para guardar dados de texto, a linha abaixo cria uma variavel
String nome;
//Para ler dados e guardar na variável, usamos o scanner criado
nome = Leitor.next();
//A linha abaixo exibe a mensagem
System.out.println ("Boa Noite, " + nome);
Leitor.close();
	}

}
