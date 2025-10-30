/*Exercici 12
 * A l'exercici 5 afegeix el codi necessari per calcular l'IRPF. Suposa que si el salari no arriba a 300€ l'IRPF=10%, si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. Mostra al final el salari brut, l'import de l'IRPF i el salari net.
 * Alex Morro
 */

void main () {
    int horestreballades;
    int horesextra;
    float preuperhora;
    float salaribrut;
    float salarinet;
    String valor;
    valor=IO.readln ("Introduce tus horas trabajadas: ");
    horestreballades=Integer.parseInt(valor);
    preuperhora=10;
    if (horestreballades > 40) {
        horesextra=horestreballades-40;
        salaribrut=(40*preuperhora)+(horesextra*(preuperhora*2));
    } else {
        salaribrut= horestreballades*preuperhora ;

    }
    IO.println(salaribrut);
    if (salaribrut<300) {
        salarinet = (salaribrut*10)/100;
        salarinet = salaribrut+salarinet;
        IO.println(salarinet);
    } else if (salaribrut>=300 & salaribrut<500) {
        salarinet = (salaribrut*20)/100;
        IO.println(salarinet);
        salarinet = salaribrut+salarinet;
        IO.println(salarinet);
    } else if (salaribrut>=500) {
        salarinet = (salaribrut * 30)/100;
        salarinet = salaribrut+salarinet;
        IO.println(salarinet);
    }
}