/*Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например,
 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.*/

public class task3 {
    public static void main(String[] args) {
        int unit1;
        int unit2;
        int e = 69;
        for(unit1 = 1; unit1<10; unit1++){
            for(unit2 = 1; unit2<10; unit2++){
                int g = 2 * 10 + unit1;
                int q = unit2*10 + 5;
                if(g + q == e){
                    System.out.printf("%d + %d = %d", g, q, e);
                }
            }
        }
    }
}
