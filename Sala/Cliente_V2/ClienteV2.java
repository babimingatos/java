
package aula24;
import java.util.Scanner;
        
public class Cliente {

    private String nome;
    private String endereco;
    private int cpf;
    
   //Métodos acessores:
    public Cliente(){ //Construtor, msm nome da classe
        nome="HA";
        endereco="ha";
        cpf=1234;
    }
    
    public void setNome(String nome) {
      if(nome!=null && !nome.isEmpty()){
          this.nome = nome;
        }
    }
   
    public void setEndereco(String endereco) {
      if(endereco!=null && !endereco.isEmpty()){
          this.endereco = endereco;
        }
    }
      
    public void setCpf(int cpf) {
      if(cpf>0) {
         this.cpf= cpf;
        }
    }
  
    public String getEndereco(){
      return endereco;
    }
  
    public int getCPf(){
      return cpf;
    }
     
    public String getNome(){
          return nome;
    }
    
    
}
