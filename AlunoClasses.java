class Aluno {

    String nome;
    String curso;
    String turma;
    int idade;

    Aluno(String nome, int idade, String curso, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.turma = turma;
    }

    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
        System.out.println("Idade: " + idade);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Alexandre", 16, "DS", "2 Ano");

        Aluno aluno2 = new Aluno("Hudson", 17, "ADM", "3 Ano");

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
    }
}