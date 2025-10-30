/*Exercici 13
 * Donats tres números, a, b i c ordena-los de forma que al final a<=b<=c.
 * Alex Morro
 */

void main () {
    int a;
    int b;
    int c;
    int d;
    String valor;
    valor=IO.readln ("Introduce un numero: ");
    a=Integer.parseInt(valor);
    String valor2;
    valor2=IO.readln ("Introduce un numero: ");
    b=Integer.parseInt(valor2);
    String valor3;
    valor3=IO.readln ("Introduce un numero: ");
    c=Integer.parseInt(valor3);
    if (c<=b & a<=c) {
        d=b;
        b=c;
        c=d;
    } else if (a<=b & a>=c) {
        d=b;
        b=a;
        a=c;
        c=d;
    } else if (a>=c & c>=b) {
        d=c;
        c=a;
        a=b;
        b=d;
    } else if (a>=b & b>=c) {
        d=c;
        c=a;
        a=d;
    } else if (c>=a & a>=b) {
        d=a;
        a=b;
        b=d;
    }
    IO.println( a + "<-" + b + "<-"+ c);
}