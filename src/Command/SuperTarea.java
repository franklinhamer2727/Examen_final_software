import java.util.ArrayList;
import java.util.List;

public class SuperTarea  implements Tareas{
    private List<Tareas> lista = new ArrayList<Tareas>();
    public void addTarea(Tareas tareas){
        lista.add(tareas);
    }
    @Override
    public void ejecutar(Plato plato){
        lista.forEach((t)->t.ejecutar(plato));
    }
}
