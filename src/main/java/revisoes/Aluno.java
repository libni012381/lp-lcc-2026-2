/*
1. Classes, objetos e construtores
1.1 – Criando uma classe

Crie uma classe chamada Aluno com os seguintes atributos:
- nome (String)
- idade (int)
- curso (String)
[FEITO]

1.2 – Criando um construtor

Crie um construtor para a classe Aluno que receba os três atributos como parâmetros e inicialize todos eles.
[FEITO]
1.3 – Criando objetos

Na classe principal, crie três objetos da classe Aluno usando new.

Utilize estes dados:
- João, 20 anos, Computação.
- Maria, 19 anos, Matemática.
- Pedro, 22 anos, Física.


1 parte concluida




2. Métodos, parâmetros e retornos

2.1 – Método void

Na classe Aluno, crie um método chamado apresentar() que imprima:
Olá, meu nome é João e tenho 20 anos.


Utilize os atributos do objeto, sem escrever os valores diretamente no método.

2.2 – Método com parâmetros

Crie um método chamado alterarIdade (int novaIdade) que receba uma nova idade e atualize o
atributo idade.

2.3 – Método com retorno

Crie um método chamado getIdade() que retorne a idade do aluno.

O método deve retornar um valor do tipo int.
 */

package revisoes;

public class Aluno {
    String nome;
    int idade;
    String curso;

    public Aluno(String nome, int idade, String curso){
        this.nome= nome;
        this.idade=idade;
        this.curso=curso;
    }
public static void main(String [] args){
        Aluno aluno1 = new Aluno("João",20,"Computação");
        Aluno aluno2 = new Aluno("Maria",19,"Matemática");
        Aluno aluno3 = new Aluno("Pedro",22,"Física");

}



}
