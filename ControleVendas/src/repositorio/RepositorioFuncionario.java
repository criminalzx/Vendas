/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Funcionario;
import java.util.ArrayList;
/**
 *
 * @author Wyllamberg
 */
public class RepositorioFuncionario {
    
    private static ArrayList<Funcionario> listaFuncionario = new ArrayList();
    
    public static void inicialFuncionario(){
        
    Funcionario f1 = new Funcionario("...", "...", "...", "...", "...", "...");
    Funcionario f2 = new Funcionario("...", "...", "...", "...", "...", "...");
    Funcionario f3 = new Funcionario("...", "...", "...", "...", "...", "...");
    
    listaFuncionario.add(f1);
    listaFuncionario.add(f2);
    listaFuncionario.add(f3);
    
        
    }
   public static void adcionarFuncionario(Funcionario f){
      
       listaFuncionario.add(f);

   } 
public static boolean temEspaco(){
  
 return listaFuncionario != null;
    
}

public static Funcionario pesquisarFuncionarioPeloCodigo(int codigo){

    Funcionario funcionario = null; 
    
    for (Funcionario funcionarioAtual : listaFuncionario){
        if (funcionarioAtual.getCodigo () == codigo){
            
            funcionario = funcionarioAtual;
            break;
            
        }
    }
    return funcionario;
    
} 

public static void editarFuncionario(Funcionario funcionario){
    
    for (Funcionario f : listaFuncionario){
        if (f.getCodigo() == funcionario.getCodigo()){
            f = funcionario;
            break;
        }
    }
    
}



}

