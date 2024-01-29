import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calc calc = new Calc();//Объявление класса

        int x=1;
        while(x!=0){//Цикл для работы
            System.out.print("Введите 1-ое число: ");
            double a = in.nextDouble();//Ввод числа
            System.out.print("Введите знак(1 +, 2 -, 3 *, 4 /):");
            int znak = in.nextInt();//Ввод числа для выбора знака
            System.out.print("Введите 2-ое число: ");
            double b = in.nextDouble();//Ввод числа
            double res;
            switch (znak) {
                //Сложение
                case (1): {

                    res = Calc.sum(a, b);
                    System.out.println("Сумма: " + res);
                    break;
                }
                //Вычитание
                case (2): {
                    res = Calc.vich(a, b);
                    System.out.println("Разность:" + res);
                    break;
                }
                //Умножение
                case (3): {
                    res = Calc.ymn(a, b);
                    System.out.println("Произведение:" + res);
                    break;
                }
                //Деление
                case (4):
                {
                    //Проверка знаменателя на 0
                    if(b==0)
                    {
                        System.out.println("На ноль делить нельзя");
                        break;
                    }
                    else
                    {
                        res = Calc.razn(a, b);
                        System.out.println("Частное:" + res);
                    }
                    break;
                }
                default:
                    System.out.println("Такого значения нет");

            }
            //Ввод значения на завершение программы
            System.out.println("Хотите выйти?(0-Да):");
            x= in.nextInt();
        }

        in.close();
    }
}

class Calc
{
    static double sum(double a, double b)
    {
        return a+b;//Возвращает сумму значений
    }
    static double vich(double a,double b)
    {
        return a-b;//Возвращает разность значений
    }
    static double ymn(double a,double b)
    {
        return a*b;//Возвращает произведение значений
    }
    static double razn(double a,double b)
    {

        return a/b;//Возвращает частное значений
    }
}



