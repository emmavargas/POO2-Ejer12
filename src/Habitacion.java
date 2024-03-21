public class Habitacion {

    int cantNiños;
    int cantAdultos;

    public Habitacion(int a, int b)
    {
        this.cantAdultos = a;
        this.cantNiños = b;
    }


    public int getCantNiños()
    {
        return this.cantNiños;
    }

    public int getCantAdultos()
    {
        return this.cantAdultos;
    }

    public int getCantidadTotal()
    {
        int total = cantAdultos+cantNiños;
        return total;
    }


}
