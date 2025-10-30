/*Exercici 1
 * Calcula la longitud d'una circumferència a partir del radi.
 * Alex Morro
 */

 void main() {
  float PI = 3.14159f;
  int radi;
  String valor;
  valor=IO.readln ("Introduce un numero: ");
  radi=Integer.parseInt(valor);
  float longitud;
  longitud=2*PI*radi;
  IO.println(longitud);
}