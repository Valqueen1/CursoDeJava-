public class Math {
    public static void main(String[] args){
        //Datos constantes
        double E = 2.7182818284590452354;
        double PI = 3.14159265358979323846;

        System.out.println("Pi es " + Math.PI);
        System.out.println("e es " + Math.E);

        //Funciones Trigonometricas
        double ang = 45.0 * Math.PI / 180.0;
        System.out.println("El angulo 45 pasa a ser radiante y su valor es: " + ang);
        //Una vez que el angulo se expresa en radiantes, hallamos el seno, coseno y la tangente
        System.out.println("cos: " + Math.cos(ang));
        System.out.println("sin: " + Math.sin(ang));
        System.out.println("tan: " + Math.tan(ang));
        System.out.println("atan: " + Math.atan(ang));

          /*Funcion Exponencial y logaritmica
          La funcion exp devuelve el numero e elevado a una potencia
           */
        System.out.println("exp: " + Math.exp(1.0));
        System.out.println("exp: " + Math.exp(10.0));
        System.out.println("exp: " + Math.exp(0.0));
        /*La funcion log calcula el logaritmo natural (e) de un numero
         */
        System.out.println("log es " + Math.log(1.0));
        System.out.println("log es " + Math.log(10.0));
        System.out.println("log(Math.E) es " + Math.log(Math.E));



    }
}