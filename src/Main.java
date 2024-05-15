/*
Juan Alberto Cuevas Juarez
Operaciones aritmeticas, operadores relacionales, logicos, preincremento, postincremento, tipos de datos primitivos
28 Abril 2024
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int valor = 4;
        valor += 6;

        System.out.println(valor);

        //operaciones aritmeticas (+ - * / %)
        int a = 10 + 5;
        int b = 10 - 5;
        int c = 10 * 5;
        int d = 10 / 5;
        int e = 10 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //operadores relacionales(== != > >= < <=) para comparar valores
        int f = 10;
        int g = 5;
        int h = 30;

        boolean igual = (g == f);  //error false, no es igual
        //operador ==, solo verifica si las dos variables apuntan al mismo objeto en la memoria, no si es igual en contenido
        boolean diferente = (g != h); //true, ambos valores son diferentes
        boolean mayor = (g > f); //false, g no es mayor que f
        boolean menorIgual = (g <= h); //true, g es menor que h
        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(mayor);
        System.out.println(menorIgual);

        //operadores logicos (&& || !) para verificar, comparar condiciones o expresiones en una app
        // &&(Y AND) verificar si dos condiciones son verdaderas, si ambas son verdad, el resultado sera verdadero, si no false

        boolean i = true;
        boolean j = false;

        if (i && j) {
            System.out.println("Una de las variables es false, por lo tanto el resultado es: False");
        }

        // || (O OR) verificar si al menos una de las condiciones es verdadera, si al menos una es verdad, el resultado es: verdadero, si no resultado es false
        boolean k = true;
        boolean l = false;

        if (k || l){
            System.out.println("Al menos una de las variables es verdadera, por lo tanto el resultado es: Verdadero");
        }

        //! (NOT) para negar una condicion, si la condicion es verdad, el resultado sera false, asi viceversa
        boolean m = true;
        if(!m){
            System.out.println("variable m es verdad, entonces resultado es falso");
        }

        //Operadores de incremento para aumentar el valor de una variable en 1, preincremento(++variable), postincremento(variable++)
        //operador de preincremento(++variable) aumenta el valor de la variable en 1 antes de utilizarla en una expresion

        int n = 5;
        System.out.println(n);
        int result = ++n;
        System.out.println(n);
        System.out.println(result);

        //operador de postincremento(variable++) aumenta el valor de la variable en 1 despues de usarla en una expresion
        int o = 5;
        int respuest = o++;
        System.out.println(o);
        System.out.println(respuest);

        //Java tiene 8 tipos primitivos diferentes: boolean, byte, char, short, int, long,float,double

        //boolean representa valores logicos, tiene dos valores: true, false, se utiliza en expresiones condicionales, bucles y otros casos en los que se desea evaluar si una determinada condición es verdadera o falsa.

        //byte El tipo byte se utiliza para representar valores numéricos enteros de 8 bits. Tiene un rango de valores de -128 a 127.

        //char El tipo char se utiliza para representar caracteres individuales. Puede almacenar cualquier carácter Unicode y se representa con comillas simples ('')

        //short El tipo short se utiliza para representar valores numéricos enteros de 16 bits. Tiene un rango de valores de -32.768 a 32.767.

        //int El tipo int se utiliza para representar valores numéricos enteros de 32 bits. Es uno de los tipos de datos más utilizados para representar números enteros en Java y tiene un rango de valores de -2.147.483.648 a 2.147.483.647.

        //long El tipo long se utiliza para representar valores numéricos enteros de 64 bits. Se utiliza para representar valores enteros muy grandes y tiene un rango de valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

        //float El tipo float se utiliza para representar valores numéricos de punto flotante, es decir, valores con decimales. Ocupa 32 bits de memoria. Puede representar números decimales con hasta siete dígitos y tiene una precisión limitada, lo que significa que puede redondear los números si son demasiado grandes o demasiado pequeños.

        //double El tipo double es similar al float, pero ocupa 64 bits de memoria y puede representar números decimales con hasta quince dígitos.

    }
}