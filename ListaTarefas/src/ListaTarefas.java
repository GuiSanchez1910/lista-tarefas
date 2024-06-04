import java.util.ArrayList;

public abstract class ListaTarefas {
    
    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static ArrayList<Tarefa> getListaTarefas() {

        return listaTarefas;
    }

    public static Tarefa buscarTarefa(String titulo) {

        for (Tarefa tempTarefa : listaTarefas) {

            if(tempTarefa.getTitulo().equals(titulo)) {

                return tempTarefa;
            }   
        }

        return null;
    }

    public static void CadastrarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }
}
