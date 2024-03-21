import java.util.HashMap;

public class Palabra {
    private String palabra;

    public void cargarPalabra(String palabra)
    {
        this.palabra = palabra;
    }

    public void cantidadPorTipoLetra()
    {
        HashMap<Character,Integer> result = new HashMap<>();
        String palabraSoloLetras = palabra.replaceAll("[^\\dA-Za-z]", "");

        char[] letras = palabraSoloLetras.toCharArray();
        for(int i=0; i<palabraSoloLetras.length();i++)
        {

            if (result.containsKey(letras[i]))
            {
                result.put(letras[i],result.get(letras[i])+1);
            }
            else{
                result.put(letras[i],1);
            }
        }
        System.out.println(result);
    }
}
