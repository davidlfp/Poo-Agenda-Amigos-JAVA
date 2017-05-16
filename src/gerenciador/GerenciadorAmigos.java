package gerenciador;

import classes.Amigo;
import java.util.ArrayList;

public class GerenciadorAmigos {

    //ArrayList
    private static ArrayList<Amigo> agenda = new ArrayList();

//Metodo que adiciona um novo contato a agenda
    public static void adicionar(Amigo contato) {
        agenda.add(contato);

    }

    public static String buscarAmigoPeloNome(String nome) {
        //Percorre todo o ArrayList
        String saida = "";
        for (Amigo amigo : agenda) {
            if (amigo.getNome().equalsIgnoreCase(nome)) {
                return nome + "\n" + amigo.calcularDiasParaAniversariar(nome);
            } else {
                saida = "Nenhum amigo encontrado";
            }
        }
        return null;
    }

    //Metodo que recebe um mês e retorna todos os amigos aniversariantes
    public static String aniversariarNoMes(int mes) {
        String saida = "";

        //Percorre o ArrayList a procura do mes informado
        for (Amigo amigo : agenda) {
            if (mes == amigo.getMesNascimento()) {
                saida = amigo.getNome() + "\n";
                return saida;  //retorna os nomes encontrados
            }

        }
        return null;
    }

//Metodo que imprimi a agenda por completo
    public static String listarTodosAmigos() {
        String saida = "";
        if (agenda.isEmpty()) {
            saida = "Nenhum contato cadastrado.";
        } else {
            //Percorre todo o ArrayList
            for (Amigo amigo : agenda) {
                saida = saida + amigo.imprimir() + "\n";
            }
        }
        return saida;
    }
}
