/*Exercici 3
 * Donat un temps expressat en segons, descomposa'l en hores, minuts i segons. 1 Hora = 3600 segons i 1 minut= 60 segons. Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.
 * Alex Morro
 */

void main () {
    int hores;
      String valor;
    valor=IO.readln ("Introduce un numero: ");
    hores=Integer.parseInt(valor);
    int h;
    int m;
    int s;
    h=hores/3600;
    m=(hores/60)%60;
    s=(hores%60);
    IO.println(h);
    IO.println(m);
    IO.println(s);
}