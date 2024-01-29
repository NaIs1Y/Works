public class Main {
    public static void main(String[] args) {
       double a=5,b=5;
       int x=0;
       //Если a и b не равны, то они присваивают сумму. Иначе они присваивают значение 0
        if(a!=b)
        {
            double sum=a+b;
            a=sum;
            b=sum;

        }
        else
        {
            a=0;
            b=0;
        }
        System.out.println(a+", "+b);
        //Цикл от 1 до 100 с выводом четных чисел
        while(x<=100)
        {
            if(x%2!=0)
            {
                System.out.print(x+ " ");
            }
            x++;
        }
    }
}