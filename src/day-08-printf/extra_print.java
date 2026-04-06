public class extra_print {
    public static void main(String[] args){
        String name = "John";
        char firstLetter = 'J';
        int age = 12;
        double height = 15.5;
        boolean isEmployed =true;

        //Specifier-character
        System.out.printf("hello %s \n", name);
        System.out.printf("Your first letter is %c \n", firstLetter);
        System.out.printf("I am %d years old \n", age);
        System.out.printf("I am %.0f meters \n", height);
        System.out.printf("I am employed? %b \n",isEmployed);
        System.out.printf("%s is %d years old \n", name, age);

        //.precision
        double price1 = 9.99, price2 = 100.15, price3 = -54.01;
        System.out.println(" ");
        System.out.printf("%.1f\n",price1); //0.1
        System.out.printf("%.2f\n",price2); //.2
        System.out.printf("%.3f\n",price3); //.3

        //flags
        System.out.println(" ");
        double price4 = 1000000.12;
        System.out.printf("%+.1f\n",price1); //+
        System.out.printf("% .1f\n",price1); //+ leave a space for + and a minus for -
        System.out.printf("% .1f\n",price3); //+ leave a space for + and a minus for -
        System.out.printf("%,.2f\n",price4); //, for 100,000
        System.out.printf("%(.2f\n",price3); // change to positive

        //width
        int num1 = 1, num2=11, num3=111, num4=1111;
        System.out.println(" ");
        System.out.printf("%04d\n",num1);
        System.out.printf("%04d\n",num2);
        System.out.printf("%04d\n",num3);
        System.out.printf("%04d\n",num4);

        System.out.println(" ");
        System.out.printf("%4d\n",num1);
        System.out.printf("%4d\n",num2);
        System.out.printf("%4d\n",num3);
        System.out.printf("%4d\n",num4);

        System.out.println(" ");
        System.out.printf("%-4d\n",num1);
        System.out.printf("%-4d\n",num2);
        System.out.printf("%-4d\n",num3);
        System.out.printf("%-4d\n",num4);
    }
}
