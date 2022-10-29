package Zadaca5;

public class Zadaca5 {
    public static void main(String[] args){
        String article1 = "чоколадо";
        String price1 = "50";
        String quantity = "5";
        String article2 = "сок";
        String price2 = "35";
        String unit = "денар";
        int vkupno1, vkupno2, vkupno3;
        int cena1=Integer.parseInt(price1);
        int kolicina1=Integer.parseInt(quantity);
        int cena2=Integer.parseInt(price2);
        vkupno1=cena1*kolicina1;
        vkupno2=cena2*kolicina1;
        vkupno3=vkupno1+vkupno2;
        System.out.println("Сметка:");
        System.out.println("Едно"+" "+article1+" - "+price1+" "+unit+"и"+".");
        System.out.println(price1+" * "+quantity+" = "+vkupno1);
        System.out.println("Еден"+" "+article2+" - "+price2+" "+unit+"и"+".");
        System.out.println(price2+" * "+quantity+" = "+vkupno2);
        System.out.println("Вкупна цена:"+" "+vkupno3);
    }
}
