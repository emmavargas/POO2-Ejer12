import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglos {

    private int [] listaNumeros;

    private int[] listaNumerosA;

    private int[] listaNumerosB;


    public void cargaLista(int[] lista)
    {
        this.listaNumeros = lista;
    }

    public boolean isOrdenado()
    {
        boolean result=true;
        int posicion=0;
        int condicion= listaNumeros[posicion];
        while(result && posicion<listaNumeros.length)
        {
            if(condicion<= listaNumeros[posicion])
            {
                condicion = listaNumeros[posicion];
                result= true;
            }
            else
            {
                result=false;
            }
            posicion++;
        }
        return result;
    }

    public int sumaParesLista()
    {
        int result=0;
        for(int posicion=0; posicion< listaNumeros.length;posicion=posicion+2)
        {
            result = result + listaNumeros[posicion];
        }
        return result;
    }

    public void cargarListasComparar(int[] listaA, int[] listaB)
    {
        this.listaNumerosA = listaA;
        this.listaNumerosB = listaB;
    }

    public int[] convertirListaGrande()
    {
        int tamaño = listaNumerosA.length+ listaNumerosB.length;
        int [] result= new int[tamaño];
        int indice =0;
        for(int posicionA = indice; posicionA<listaNumerosA.length;posicionA++)
        {
            result[posicionA] = listaNumerosA[posicionA];
            indice = posicionA;
        }
        for(int posicionB = indice; posicionB<listaNumerosA.length;posicionB++)
        {
            result[posicionB] = listaNumerosA[posicionB];
            indice = posicionB;
        }

        Arrays.sort(result);
        return result;
    }
}
