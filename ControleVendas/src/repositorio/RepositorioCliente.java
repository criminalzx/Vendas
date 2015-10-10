/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Cliente;
import java.util.ArrayList;

/**
 *
 * @author windows
 */
public class RepositorioCliente {
    private static ArrayList<Cliente> listaCliente = new ArrayList();
    
    public static void inicialCliente() {
        Cliente Cliente = null;
        Cliente c1 = Cliente ("...","...","...","...","...");
        Cliente  c2 = Cliente("...","...","...","...","...");
        Cliente c3 = Cliente ("...","...","...","...","...");
   
  
    
    listaCliente.add(c1);
    listaCliente.add(c2);
    listaCliente.add(c3);
    
        
    }
   public static void adcionarFuncionario(Cliente c){
      
       listaCliente.add(c);

   } 
public static boolean temEspaco(){
  
 return listaCliente != null;
    
}

    public static Cliente pesquisarClientePeloCodigo(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void excluirCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Cliente Cliente(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
