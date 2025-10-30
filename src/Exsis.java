/* Exercici 6
 * (Opcional) Donats dos sencers a i b, mostra quin és el major de dos sencers, per exemple
 * El major és a.
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
    if (a > b) {
        IO.println("El major es " + a);
    } else if (a < b) {
        IO.println("El major es " + b);
    } else {
        IO.println("Els dos numeros son iguals");
    }
}