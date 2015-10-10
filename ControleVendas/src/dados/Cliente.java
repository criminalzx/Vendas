/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Wyllamberg
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private String email;

    private static int codigoAutoIncremental = 1;
    
    public Cliente() {
        System.out.println("Construtor default de Cliente");
        int contadorCodigo = 1;
        
        // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
    }
    
    public Cliente(String nome, String cpf, String telefone, String email) {
        this.codigo = codigoAutoIncremental;

       codigoAutoIncremental++;
        
        this.nome = nome;
        this.endereco = endereco ;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public void imprimirDados() {
        
        System.out.println( toString() );
    }
    
    @Override
    public String toString() {
        String relatorio = "";
        relatorio +="codigo: "+codigo;
        relatorio +="\nnome: "+nome;
        relatorio +="\nendereço: "+endereco;
        relatorio +="\ncpf: "+cpf;
        relatorio +="\ntelefone: "+telefone;
        relatorio +="\nemail: "+email;
        
      return relatorio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco =endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
