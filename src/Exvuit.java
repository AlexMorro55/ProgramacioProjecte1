/*Exercici 8
 * Donats dos sencers mostra la relació que hi ha entre ells, per exemple mostra a<b o a=b.
 * Alex Morro
 */

void main () {
    int a;
    int b;
    String valor;
    valor=IO.readln ("Introduce un numero: ");
    a=Integer.parseInt(valor);
    String valor2;
    valor2=IO.readln ("Introduce un numero: ");
    b=Integer.parseInt(valor2);
    if (a>b){
        IO.println("a>b");
    } else if (a<b) {
        IO.println("a<b");
    } else {
        IO.println("a=b");
    }
}