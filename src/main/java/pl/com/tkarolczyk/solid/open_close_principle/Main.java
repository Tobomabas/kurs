package pl.com.tkarolczyk.solid.open_close_principle;


public class Main {
    public static void main(String[] args) {

        Secret secret = new Secret("secret", "c:\\tomek\\test3.txt");

        secret.save();

        //2implementacje savera
        // - pierwsza zapis w pliku
        // - druga zapis w bazie
        // -  uzycie z jednym sekretem


       Saver<BetterSecret> fileSaver = new FileSaver();
       Saver<BetterSecret> dbSaver = new DbSaver();
       Saver<BetterSecret> cloudsaver = new CloudSaver();

       BetterSecret mySecret = new BetterSecret("Karolczyk Tomasz", fileSaver);
       mySecret.save();
       BetterSecret mySecret2 = new BetterSecret("Tomsz Karolczyk", dbSaver);
       mySecret2.save();
       BetterSecret mysecrret3 = new BetterSecret("sekrecik 2", cloudsaver);
       mysecrret3.save();






    }



}
