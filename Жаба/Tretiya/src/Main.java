import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int mas[]={5,7,3,1,8};//Создание одномерного массива с присваиванием значений в ячейки
        Arrays.sort(mas);//Сортировка массива по возрастанию
        int x=0;
        while(x!=mas.length){System.out.print(mas[x]+" "); x++;}//Вывод массива
        System.out.println("\n");
        int mas2[][][]=new int[3][3][5];//Создание трехмерного массива
        for(x=0;x<3;x++)//Кол - во
        {
            for(int y=0;y<3;y++)//Высота
            {
                for(int z=0;z<5;z++)//Ширина
                {
                    mas2[x][y][z]=x*100+y*10+z*1;//Присваивание к позиции в массиве значения
                    System.out.print(mas2[x][y][z]+" ");//Вывод значение ячейки массива
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}