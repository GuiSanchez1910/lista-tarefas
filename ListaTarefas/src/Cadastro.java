import java.util.ArrayList;

public class Cadastro {
    
    private static ArrayList<Tarefa> listaTarefas = ListaTarefas.listarTarefas(); 

    public static void CadastrarTarefa(Tarefa tarefa) {

        listaTarefas.add(tarefa);
    }
}
