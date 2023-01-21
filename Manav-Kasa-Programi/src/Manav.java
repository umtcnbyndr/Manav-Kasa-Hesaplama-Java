import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        int kg;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç kilo?:");
        kg=input.nextInt();
        System.out.println(kg*armut);

        System.out.print("Elma Kaç kilo?:");
        kg=input.nextInt();
        System.out.println(kg*elma);

        System.out.print("Domates kaç kilo");
        kg=input.nextInt();
        System.out.println(kg*domates);

        System.out.print("Muz kaç kilo");
        kg=input.nextInt();
        System.out.println(kg*muz);

        System.out.print("Patlıcan kaç kilo");
        kg=input.nextInt();
        System.out.print(kg*patlican);

    }
}
