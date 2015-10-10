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
public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String cidade;
    private String email;

    private static int contadorCodigo = 1;
   
    public Funcionario() {
        System.out.println("Construtor default de Produto");
        
        // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
    }
    
    public Funcionario(String nome, String cpf, String telefone, String endereco, String cidade, String email) {
        this.codigo = contadorCodigo; 
       
        contadorCodigo++;
        
        System.out.println("Construtor com argumentos");  
        
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
    }

    public void ImprimirFuncionario(){
        
        System.out.println( toString() );
        
    }
    
    
    @Override
    public String toString() {
       String relatorio = "";
       relatorio +="codigo: "+codigo;
       relatorio +="\nnome: "+nome;
       relatorio +="\ncpf: "+cpf;
       relatorio +="\ntelefone: "+telefone;
       relatorio +="\nendereco: "+endereco;
       relatorio +="\ncidade: "+cidade;
       relatorio +="\nemail: "+email;
       
        
        return relatorio;
    }
    public int getCodigo(){
        return codigo;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}
