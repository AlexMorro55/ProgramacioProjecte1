/*Exercici 9
 * Donats tres sencers mostra el valor màxim i el mínim.
 * Alex Morro
 */

void main () {
    int a;
    int b;
    int c;
    String valor;
    valor=IO.readln ("Introduce un numero: ");
    a=Integer.parseInt(valor);
    String valor2;
    valor2=IO.readln ("Introduce un numero: ");
    b=Integer.parseInt(valor2);
    String valor3;
    valor3=IO.readln ("Introduce un numero: ");
    c=Integer.parseInt(valor3);
    if (a>=b & b>=c) {
        IO.println("El màxim es: " + a + " El mínim es: " + c);
    } else if (a>=c & c>=b) {
        IO.println("El màxim es: " + a + " El mínim es: " + b);
    } else if (b>=a & a>=c) {
        IO.println("El màxim es: " + b + " El mínim es: " + c);
    } else if (b>=c & c>=a) {
        IO.println("El màxim es: " + b + " El mínim es: " + a);
    } else if (c>=a & a>=b) {
        IO.println("El màxim es: " + c + " El mínim es: " + b);
    } else if (c>=b & b>=a) {
        IO.println("El màxim es: " + c + " El mínim es: " + a);
    }
}