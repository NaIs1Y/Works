public class Main {
    public static void main(String[] args) {
        System.out.println("Я КРУТОЙ ПРОГРАММИСТ");
        double a=5,b=0;
        double num1 = a + b;
        double num2 = a - b;
        double num3 = a * b;
        System.out.println(a+"+"+b+"="+num1);
        System.out.println(a+"-"+b+"="+num2);
        System.out.println(a+"*"+b+"="+num3);

        if (b == 0) {
            System.out.println("На 0 делить нельзя");

        }
        else
        {
            double num4 = a / b;
            System.out.println(a+"/"+b+"="+num4);
        }


    }
}