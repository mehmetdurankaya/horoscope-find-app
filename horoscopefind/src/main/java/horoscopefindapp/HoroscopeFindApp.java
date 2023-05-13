package horoscopefindapp;
/*
@Author Mehmet Duran Kaya
*/

import java.util.Scanner;

public class HoroscopeFindApp {
    public static void main(String[] args) {
        int month, day;
        String burc="";
        boolean isError=false;
        //variables declaration
        Scanner scan =new Scanner(System.in);
        System.out.println("Bu uygulama burcunuzu bulmak için " +
                           "Mehmet Duran Kaya tarafından üretilmiştir.\n " +
                           "Lütfen sizden istenen Ay ve Gün bilgilerini rakam olarak giriniz");
        System.out.print("Doğduğunuz Ay: ");
        month= scan.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day=scan.nextInt();

        if(month<=12) {//ay değeri 12 den büyük girilmemelidir.

            if (month == 1) {//ocak ayının
                if (day >= 1 && day <= 31) {//1 ve 31 dahil olmak üzere
                    if (day < 22) {//22 sine kadar oğlak değilse kova
                        burc = " Oğlak";//Oğlak Burcu : 22 Aralık - 21 Ocak
                    } else {
                        burc = " Kova";//Kova Burcu : 22 Ocak - 19 Şubat
                    }
                } else {//eğer belirtilen şartlar sağlanmazsa hata fırlat.
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 2) {
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {//eğer belirtilen şartlar sağlanmazsa hata fırlat.
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 3) {//mart
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 4) {//nisan
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 5) {//mayıs
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 6) {//Haziran
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 7) {//Temmuz
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 8) {//ağustos
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 9) {//Eylül
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 10) {//Ekim
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 11) {//Kasım
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 12) {//Aralık
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------

        }else{
            isError=true;//Ay değişkeni 12 den büyük olamaz aksi halde hata fırlat.
            System.out.println("Ay değeri 12 den büyük olamaz. ");
        }

        if (isError == true) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz. ");
        } else {
            System.out.println("Merhaba, burcunuz :" + burc);
        }

    }
}
