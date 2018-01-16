
/**
 * Write a description of class bucles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucles
{
    // instance variables - replace the example below with your own
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void multiplesOfFive()
    {
        int resultado = 5;
        int multiplo = 2; 
        while(resultado < 95){
            resultado = 5 * multiplo; 
            System.out.println(resultado);
            multiplo++; 
        }
    }

    public void sumaUnoAlDiez(){
        int inicio= 2;
        int resultado = 1;
        while(inicio<=10){
            resultado = resultado + inicio;
            inicio++;
        }
        System.out.println(resultado);
    }

    public void sum(int a , int b){
        int inicio= a+1;
        int resultado = a;
        while(inicio<=b){
            resultado = resultado + inicio;
            inicio++;
        }
        System.out.println(resultado);
    }

    public boolean isPrime(int n){
        int inicio = 2;
        boolean esPrimo=true;
        while ((esPrimo) && (inicio!=n)){
            if (n % inicio == 0){
                esPrimo = false;
            }
            inicio++;
        }
        return esPrimo;
    }
}
