/* Exercici 4
 * Intercanvia els valors de dues variables del mateix tipus. Mostra-les per pantalla abans i després de fer el canvi. Per exemple si a=2 i b=3, al final a=3 i b=2.
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
    IO.println("Abans de canviar");
    IO.println(a);
    IO.println(b);
    IO.println("Despres de canviar");
    c=a;
    a=b;
    b=c;
    IO.println(a);
    IO.println(b);
}