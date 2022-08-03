public class Principal {

    public static void main(String[] args) {


        SuperTarea st= new SuperTarea();
        st.addTarea(new TareaRegistrarPlato());
        st.addTarea(new TareaListarPlato());


        GestorTareas gt= new GestorTareas();
        Plato p= new Plato(1,"Hamburguesa");

        gt.ejecutar(st, p);

    }

}