package Donguler;

import java.util.Scanner;

public class ATM_Switch {
    public static void main(String[] args) {

        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = scanner.nextLine();
            System.out.print("Parolanız: ");
            password = scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    select = scanner.nextInt();
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            price = scanner.nextInt();
                            balance += price;
                            System.out.println("İşlem Gerçekleştirildi");
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("İşlem Gerçekleştirildi");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                            System.out.println("Tekrar görüşmek üzere.");
                        break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }


        }
    }
}
