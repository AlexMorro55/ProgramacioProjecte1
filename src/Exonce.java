/*Exercici 10
 * Repeteix l'exercici anterior amb un switch.
 * Alex Morro
 */

 void main() {
    int nota;
    String valor;
    valor=IO.readln ("Introduce un numero: ");
    nota=Integer.parseInt(valor);
    switch (nota) {
        case 0, 1, 2, 3, 4:
            IO.println("Insuficient");
            break;
        case 5:
            IO.println("Suficient");
            break;
        case 6:
            IO.println("Be");
            break;
        case 7, 8:
            IO.println("Notable");
            break;
        case 9, 10:
            IO.println("Excel·lent");
            break;
    }
 }