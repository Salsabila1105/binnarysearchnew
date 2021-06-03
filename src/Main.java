import models.Word;


public class Main {


    static void printWord(Word word, String keyWord) {
        System.out.println("Kata '" + keyWord + "' Di temukan");
        System.out.println("English : " + word.english);
        System.out.println("Indonesia : " + word.indonesia);
    }

    public static void main(String[] args) {

        BinnarySearch search = new BinnarySearch();


        search.addSeed(new Word("ambil", "take"));
        search.addSeed(new Word("lihat", "see"));
        search.addSeed(new Word("pergi", "go"));
        search.addSeed(new Word("bawa", "bring"));
        search.addSeed(new Word("bangun", "wakeup"));




        System.out.println("\n====== Cari berdasarkan kata inggris ======");

        String keyWord1 = "wakeup";
        Word customSearch1 = search.searchFromEnglish(0, search.words.size(), keyWord1);

        if(customSearch1 != null) {
            printWord(customSearch1, keyWord1);
        } else {
            System.out.println("Kata '"+ keyWord1 +"' Tidak Di temukan");
        }


        System.out.println("\n====== Cari berdasarkan kata indonesia ======");

        String keyWord2 = "bangun";
        Word customSearch2 = search.searchFromIndonesia(0, search.words.size(), keyWord2);
        if(customSearch2 != null) {
            printWord(customSearch2, keyWord2);
        } else {
            System.out.println("Kata '"+ keyWord2 +"' Tidak Di temukan");
        }
        System.out.println("\n====== Cari berdasarkan kata indonesia [not found] ======");

        String keyWord3 = "baca_buku";
        Word customSearch3 = search.searchFromIndonesia(0, search.words.size(), keyWord3);

        if(customSearch3 != null) {
            printWord(customSearch3, keyWord3);
        } else {
            System.out.println("Kata '"+ keyWord3 +"' Tidak Di temukan");
        }




    }
}