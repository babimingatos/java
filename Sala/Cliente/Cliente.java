
package aula24;
import java.util.Scanner;
        
public class Cliente {

    private String nome;
    private String endereco;
    private int cpf;
    
    public Cliente(){ //Construtor, msm nome da classe
        nome="HA";
        endereco="ha";
        cpf=1234;
    }
    public void insereNome(String pNome) {
      if(pNome!=null && !pNome.isEmpty()){
          nome = pNome;
        }
    }
    
    public String retornaNome(){
          return nome;
    }
      
    public void insereEndereco(String pEndereco) {
      if(pEndereco!=null && !pEndereco.isEmpty()){
          endereco = pEndereco;
        }
    }
      
    public void insereCpf(int pCpf) {
      if(pCpf>0) {
         cpf= pCpf;
        }
    }
  
    public String retornaEndereco(){
      return endereco;
    }
  
    public int retornCPf(){
      return cpf;
    }
    
    
    
}
