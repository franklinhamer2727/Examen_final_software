public class TareaListarPlato implements Tareas{
    @Override
    public void ejecutar(Plato plato){
        System.out.println(plato.getNombre());
    }
}
