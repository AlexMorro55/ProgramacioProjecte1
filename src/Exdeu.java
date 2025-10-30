/*Exercici 10
 *Donat un sencer que representa el valor numèric d'una nota, mostra la qualificació corresponent en paraules, per exemple Insuficient, Suficient, Notable i Excel·lent. Utilitza if.
 *Alex Morro
 */

void main () {
    int nota;
    String valor;
    valor=IO.readln ("Introduce un numero: ");
    nota=Integer.parseInt(valor);
    if (nota<=4) {
        IO.println("Insuficient");
    } else if (nota<=5) {
        IO.println("Suficient");
    } else if (nota<=6) {
        IO.println("Be");
    } else if (nota<=8) {
        IO.println("Notable");
    } else if (nota<=10) {
        IO.println("Excel·lent");
    } else {
        IO.println("Nota no valida");
    }
}