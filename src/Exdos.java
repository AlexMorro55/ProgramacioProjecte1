/*Exercici 2
 * Donada una velocitat v expressada en km/h passar-la a m/s (v*1000/3600). Fes el càlcul amb decimals.
 * Alex Morro
 */

void main() {
    float vkmh;
    String valor;
    valor=IO.readln ("Introduce un numero: ");
    vkmh=Integer.parseInt(valor);
    float vms;
    vms=vkmh*1000/3600;
    IO.println(vms);
}