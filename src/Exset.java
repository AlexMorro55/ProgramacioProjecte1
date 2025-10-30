/* Exercici 7
 * Repeteix l'exercici anterior amb tres sencers.
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
    if(a>=b & a>=c) {
        IO.println("El numero mes gran es: " + a);
    } else if (a<=b & b>=c) {
        IO.println("El numero mes gran es: " + b);
    } else if (a<=c & b<=c) {
        IO.println("El numero mes gran es: " + c);
    }
}