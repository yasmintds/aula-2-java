//Definir a classe Pessoa
class Pessoa{
  //Atributos da classe
 String none;
  int idade;


//Constructor para inicializar os atributos
public Pessoa(String nome, int idade){
  this.nome = nome;
  this.idade = idade;
}

//Método para exibir informações da pessoa
public void exibirInformacoes(){
  System.out.println("Nome: " + nome);
  System.out.println("Idade: " + idade);
  
 }
}

public class Main
  public static void main(String[] args){
    Pessoa pessoa1 = new Pessoa("João", 25);
    Pessoa pessoa2 = new Pessoa("Maria", 30);
    Pessoa pessoa3 = new Pessoa("Pedro", 35);

    pessoa1.exibirInformacoes();
    pessoa2.exibirInformacoes();
    pessoa3.exibirInformacoes();
  }