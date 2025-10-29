/* Exercici 4
 * Intercanvia els valors de dues variables del mateix tipus. Mostra-les per pantalla abans i després de fer el canvi. Per exemple si a=2 i b=3, al final a=3 i b=2.
 * Alex Morro
 */

void main () { 
    int a;
    int b;
    int c;
    IO.println("Abans de canviar");
    a=5;
    b=10;
    IO.println(a);
    IO.println(b);
    IO.println("Despres de canviar");
    c=a;
    a=b;
    b=c;
    IO.println(a);
    IO.println(b);
}