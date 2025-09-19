import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. feladat
 *
 * @description Vizibicikli kölcsönző
*/
public class Main {
    private static List<Kolcsonzes> kolcsonzesek;

    private static void debugger() {
        int i = 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        kolcsonzesek = new ArrayList<>();

        // 4. feladat
        File fbe = new File("files/kolcsonzesek.txt");
        Scanner sbe = new Scanner(fbe);
        sbe.nextLine(); // fejléc kihagyása
        while (sbe.hasNextLine()) {
            String fileLine = sbe.nextLine();
            kolcsonzesek.add(new Kolcsonzes(fileLine));
        }

        System.out.println("5. feladat: Napi kölcsönzések száma: " + kolcsonzesek.size());
        Scanner nevbe = new Scanner(System.in);
        System.out.print("6. feladat: Kérek egy nevet: ");
        String nev = nevbe.nextLine();

        String idopont = "";
        for (int i = 0; i < kolcsonzesek.size(); i++){
            if(kolcsonzesek.get(i).getNev().equals(nev)){
                idopont += "    " + kolcsonzesek.get(i).getElvitelOra(i) + ":" + kolcsonzesek.get(i).getElvitelPerc(i) + "-" + kolcsonzesek.get(i).getVisszaOra(i) + ":" + kolcsonzesek.get(i).getVisszaPerc(i) + "\n";
            }
        }

        if (!idopont.isEmpty()){
            System.out.println("    " + nev + " kölcsönzései:" + "\n" + idopont);
        } else {
            System.out.println("Nem volt ilyen név");
        }


        debugger();
    }
}