
package appagendaamigos;

import classes.Amigo;
import classes.Endereco;
import gerenciador.GerenciadorAmigos;
import javax.swing.JOptionPane;


public class AppAgendaAmigos {

    
    public static void main(String[] args) {
        
        int opcao;
        //Laço para executar o o programa
        do{
        opcao = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Menu de opções: "+
                "\n1- Cadastar amigo na agenda"+
                "\n2- Buscar amigo pelo Nome"+
                "\n3- Aniversariante do mês"+
                "\n4- Listar todos os amigos"+
                "\n5- Sair da agenda"+
                "\nEscolha uma opção."));
        
        switch(opcao){
            case 1:
                //Adiciona um novo contato a agenda
                
                Amigo amigo = new Amigo(
                        JOptionPane.showInputDialog("Nome: "),
                        JOptionPane.showInputDialog("Email"),
                        JOptionPane.showInputDialog("Telefone"),
                        Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento")),
                        Integer.parseInt(JOptionPane.showInputDialog("Mês do nascimento")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento")),
                        
               new Endereco(
                       JOptionPane.showInputDialog("Rua: "),
                       Integer.parseInt(JOptionPane.showInputDialog("Número: ")),
                       JOptionPane.showInputDialog("Complemento: "),
                       JOptionPane.showInputDialog("Cep: "),
                       JOptionPane.showInputDialog("Cidade: "),
                       JOptionPane.showInputDialog("Estado: ")));
                
               GerenciadorAmigos.adicionar(amigo);                
                break;                
                
            case 2: 
                //Busca contato pelo nome                
                String procurarAmigo=GerenciadorAmigos.buscarAmigoPeloNome(
                JOptionPane.showInputDialog("Informe o nome: "));
                
                if(procurarAmigo!=null){
                    JOptionPane.showMessageDialog(null, procurarAmigo);                    
                }else{
                    JOptionPane.showMessageDialog(null, "Nenhum amigo encontrado");
                }               
                break;                
                
            case 3: 
                //Motra todos os aniversariantes do mês
                String mesEscolhido=GerenciadorAmigos.aniversariarNoMes(
                        Integer.parseInt(JOptionPane.showInputDialog("Escolha um mês.")));
                JOptionPane.showMessageDialog(null, mesEscolhido);
                
                break;
                                
            case 4: 
                //Listar todos os amigos
                JOptionPane.showMessageDialog(null, 
                GerenciadorAmigos.listarTodosAmigos());               
                break;
                
            case 5:
                System.exit(0);                
                break;
                
            //Opções de 1 a 5. Caso selecione outra opção, o programa fecha.
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!"+"Escolha uma opção válida do menu");
                        
        }
         
    
        }while(opcao >=1 && opcao <=5);
        
        
        
    }
    
}
