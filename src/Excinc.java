/*Exercici 5
 * A partir d'un sencer que representa les hores treballades per un/a treballador/a i un real que representa el preu en € de cada hora, calcula que ha de cobrar aquesta persona en acabar la setmana. Suposa que totes les hores extra, les que passen de 40, doblen el preu.
 * Alex Morro
 */

void main () {
    int horestreballades;
    int horesextra;
    float preuperhora;
    float cobro;
    horestreballades=50;
    preuperhora=10;
    if (horestreballades > 40) {
        horesextra=horestreballades-40;
        cobro=(40*preuperhora)+(horesextra*(preuperhora*2));
    } else {
        cobro= horestreballades*preuperhora ;

    }
    IO.println(cobro);
}