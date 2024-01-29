import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
        product pr= new product();
        String Name= pr.Name();
        int Price = pr.Price();
        int Skidka = pr.Skidka();
        double PriceWithSkidka=pr.PriceWithSkidka(Price,Skidka);
        System.out.println("Название продукта: "+Name);
        System.out.println("Цена: "+Price);
        System.out.println("Скидка: "+Skidka+"%");
        System.out.println("Конечная цена: "+PriceWithSkidka);
    }
}
class product
{Scanner in = new Scanner(System.in);
    String Name()
    {
        System.out.print("Название продукта: ");
        String Name = in.nextLine();
        return Name;
    }
    int Price()
    {
        System.out.print("Цена: ");
        int Price = in.nextInt();//Ввод цены
        return Price;
    }
    int Skidka()
    {
        System.out.print("Скидка: ");
        int Skidka = in.nextInt();//Ввод Скидки
        return Skidka;
    }

    double PriceWithSkidka(double a,double b)
    {
        if(b==100) return 0;
        else
        {
            return a*(1-b*0.01);
        }

    }

}
