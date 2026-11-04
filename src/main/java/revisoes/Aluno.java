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

1.3 – Criando objetos

Na classe principal, crie três objetos da classe Aluno usando new.

Utilize estes dados:
- João, 20 anos, Computação.
- Maria, 19 anos, Matemática.
- Pedro, 22 anos, Física.

 */

package revisoes;

public class Aluno {
    String nome;
    int idade;
    String curso;

    public Aluno(String nome, int idade, String curso){
        this.nome= nome;
        this.idade=idade;

    }
}
