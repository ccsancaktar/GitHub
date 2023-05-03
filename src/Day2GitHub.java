public class Day2GitHub {
    /*
    1-) git init -> Local repo olusturmak icin, yani .git ile klasörün
    icindeki dosyalari iliskilendirmek icin kullanilir.
    2-) git add . -> Working Space'den dosyalarimizi staging area'ya gönderir.
    3-) git commit -m "mesaj" -> Staging area'dan commit store'a
    dosyalarimizi gondermek icin kullanilir. (yeni sürüm olusturur)
    4-) git push -> Uzak repo'ya (GitHub)
    göndermek icin kullandigimiz kod. Yalniz git push komutunu direk kullanmak istersek 1 kez
                    git remote add origin adres
                    git push -u origin master
    Not: Yukaridaki iki komutu tek seferde kullandiktan soran ikinci commit'ler icin,
    sadece git push komutu kullanilir.
    Not: git log --oneline commitlerimdeki yani versiyonlardaki durumu gösterir.
    5-) git pull --> Remote dosyalarimizi guncellemek icin kullanilir.
     */
    public static void main(String[] args) {
        System.out.println("Branch Deneme 1");
    }
}
