import java.util.ArrayList;

public class Hotel {

    private int cantidadHabitacion;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public void cargarCantidadHabitacion(int cantidad)
    {
        this.cantidadHabitacion = cantidad;
    }

    public void cargarHabitacion(int mayores, int menores)
    {
        int total= mayores+menores;
        if(total<=8)
        {
            habitaciones.add(new Habitacion(mayores, menores));
        }
        else{
            System.out.print("Supera la capacidad");
        }
    }

    public int cantidadPersonasTotal()
    {
        int result=0;
        for(Habitacion e: habitaciones)
        {
            result = result + e.getCantidadTotal();
        }
        return result;
    }

    public int getCantidadHabitacionConXMayores(int cantidad)
    {
        int result = 0;
        for(Habitacion e: habitaciones)
        {
            if(cantidad==e.getCantAdultos())
            {
                result++;
            }
        }
        return result;
    }

    public int[] cantidadDeHabitacionConXPersonas()
    {
        int[] result = new int[9];
        for(int i = 0 ; i<result.length; i++)
        {
            result[i] = 0;
        }
        for(Habitacion e: habitaciones)
        {
            result[e.getCantidadTotal()] = result[e.getCantidadTotal()]+1;
        }
        return result;
    }
}
