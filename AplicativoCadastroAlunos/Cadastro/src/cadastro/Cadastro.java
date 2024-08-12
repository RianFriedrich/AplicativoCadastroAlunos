package cadastro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Cadastro {
    public String nome;
    public String dataNasc;
    public String sexo;
    public String matricula;
    public String curso;
    public String CPF;
    public String rua;
    public String numero;
    public String bairro;
    public String cidade;
    public String CEP;
    public String estado;
    public String telefone;
    public String endereco;
    
    public Cadastro(String nome, String dataNasc, String sexo, String matricula, String curso, String CPF, String rua, String numero, String bairro, String cidade, String CEP, String estado, String telefone){
        this.CEP = CEP;
        this.CPF = CPF;
        this.bairro = bairro;
        this.cidade = cidade;
        this.curso = curso;
        this.dataNasc = dataNasc;
        this.estado = estado;
        this.matricula = matricula;
        this.nome = nome;
        this.numero = numero;
        this.rua = rua;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    
    public Object[] obterDados(){
        return new Object[] {nome, dataNasc,  sexo,  matricula, curso,  CPF,  rua,  numero,  bairro,  cidade,  CEP, estado,  telefone};
    }
}
