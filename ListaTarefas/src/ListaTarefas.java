import java.util.ArrayList;

public abstract class ListaTarefas {
    
    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static ArrayList<Tarefa> getListaTarefas() {

        return listaTarefas;
    }

    public static Tarefa buscarTarefa(String titulo) throws Exception {

        for (Tarefa tempTarefa : listaTarefas) {

            if(tempTarefa.getTitulo().equals(titulo)) {

                return tempTarefa;
            }   
        }

        throw new Exception("Tarefa não localizada"); 
    }

    public static void CadastrarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }
}
