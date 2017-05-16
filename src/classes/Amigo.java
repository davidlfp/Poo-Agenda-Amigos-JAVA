
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Amigo {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    
    public Amigo(){
        
    }
       
    public Amigo(String nome, String email, String telefone, int diaNascimento,
            int mesNascimento, int anoNascimento, Endereco endereco){
        
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento; 
    }
    
    //GETTERS E SETTERS DAS INFORMAÇÕES BÁSICAS
    public String getNome(){
        return nome;
    }
         
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }        
   
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email  = email;
    }
  
    //GETTERS E SETTER PARA DATAS 
    public int getDiaNascimento(){
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento){
        this.diaNascimento = diaNascimento;
    }
    
    public int getMesNascimento(){
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento){
        this.mesNascimento = mesNascimento;
    }
    
    public int getAnoNascimento(){
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    
    
        //METHOD CALCULATING HOW MANY DAYS MISS FOR THE BIRTHDAY
        public String calcularDiasParaAniversariar(String nome){
        String mesNascimento2 = String.format("%02d",mesNascimento);
        String diaNascimento2 = String.format("%02d", diaNascimento);
        String nasceu  = diaNascimento2+ "/"+mesNascimento2+"/"+anoNascimento;
        
        
        //Pega a data atual
        LocalDate atual = LocalDate.now();
       //Formatação de dados
       DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate aniversario = LocalDate.parse(nasceu,formatada);
       
       //Pega o dia atual e o dia do aniversario em relação ao inicio do ano
       int diasNascimento=aniversario.getDayOfYear();
       int diasAtual = atual.getDayOfYear();
       
       //calcula o periodo entre os dia do aniversario com os dias atual
       int dias = diasNascimento-diasAtual;
       if(dias>0){
           return "Faltam "+dias+ "dias para seu aniversário";       
                }else{
                      return  "Passaram " +dias*-1+ "dias do seu aniversário";
               } 
             }
        
        //Metodo que imprime todas as informações do amigo
        public String imprimir(){
            //Formata os meses para que fiquem sempre com dois digitos
            String mesNascimento2=String.format("%02d", mesNascimento);
            String diaNascimento2=String.format("&02d", diaNascimento);
            
            String saida = 
                    "Nome: "+nome+
                    "\nE-mail: "+email+
                    "\nTelefone: "+telefone+
                    "\nAniversario: "+diaNascimento2+"/"+mesNascimento2+"/"+anoNascimento+
                    "\n"+endereco.imprimir()+"\n";
            return saida;
                    
            
        }
        
}
