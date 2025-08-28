public class LivroDeNotas{
    
    public void  setDisciplina(String d){
        Disciplina = d;
    }

    //Variavel de referencia
    private String Disciplina;

    public void ExibirMensagem(){
        System.out.println("Bem vindo ao livro de notas de "  + Disciplina);
    }

}