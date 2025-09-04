public class LivroDeNotas{
    
    public void  setDisciplina(String d){
        Disciplina = d;
    }
    
    public String getDisciplina(){
        return Disciplina;
    }
    //Variavel de referencia
    private String Disciplina;

    public void ExibirMensagem(){
        System.out.println("Bem vindo ao livro de notas de "  + Disciplina);
    }

    public LivroDeNotas(){
        System.out.println("Criando um objeto");
    }

}