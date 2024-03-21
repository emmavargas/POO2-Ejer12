public class Main {

    public static void main(String[] args) {

        Palabra palabra = new Palabra();

        palabra.cargarPalabra("hola como estas");
        palabra.cantidadPorTipoLetra();

        Hotel hotel = new Hotel();
        hotel.cargarCantidadHabitacion(8);

        hotel.cargarHabitacion(2,5);
        hotel.cargarHabitacion(1,1);
        hotel.cargarHabitacion(3,5);
        hotel.cargarHabitacion(4,2);
        hotel.cargarHabitacion(6,1);
        hotel.cargarHabitacion(2,2);
        hotel.cargarHabitacion(3,3);
        hotel.cargarHabitacion(8,0);
        //hotel.cargarHabitacion(1,1);

        System.out.println(hotel.cantidadPersonasTotal());
        System.out.println(hotel.getCantidadHabitacionConXMayores(2));

        System.out.println();

        for(int i=0; i<hotel.cantidadDeHabitacionConXPersonas().length;i++)
        {
            System.out.print(hotel.cantidadDeHabitacionConXPersonas()[i] + " ");
        }

    }
}