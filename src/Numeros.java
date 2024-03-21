public class Numeros {

    public boolean isPrimo(int a)
    {
        boolean result = true;
        int indice =2;
        while(a%indice==0 && indice<a)
        {
            result = false;
            indice++;
        }
        return result;
    }

    public int sumaMultiplos(int limite)
    {
        int result= 0;
        boolean condicion= true;
        int incrementoN =1;

        for(int num=1;num<limite; num++ )
        {
            if((3*num)<limite)
            {
                result= result+(3*num);

            }
            if((5*num)<limite)
            {
                result = result + (5*num);
            }
        }
        return result;

    }
}
