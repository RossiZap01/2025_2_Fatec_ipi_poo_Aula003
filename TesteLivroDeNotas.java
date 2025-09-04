public class TesteLivroDeNotas{
    static public void main(String [] args){

        String Disciplina1 = "POO";
        String Disciplina2 = "PEM";
        
        LivroDeNotas Livro1 = new LivroDeNotas();
        Livro1.setDisciplina(Disciplina1);
        System.out.println(Livro1.getDisciplina());
        Livro1.ExibirMensagem();

        LivroDeNotas Livro2 = new LivroDeNotas();
        Livro2.setDisciplina(Disciplina2);
        System.out.println(Livro2.getDisciplina());
        Livro2.ExibirMensagem();

        //teste de alocação de variavel para entender o garbage colector
        //livro1 = livro2;

    }
}