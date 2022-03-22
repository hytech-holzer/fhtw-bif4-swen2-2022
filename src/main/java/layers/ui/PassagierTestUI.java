package layers.ui;

import layers.business.PassagierService;
import layers.business.PassagierServiceImpl;
import layers.model.Passagier;

import java.util.Scanner;

public class PassagierTestUI {

    private PassagierService passagierService;



    private void demoNewPassagier() {
        Passagier passagier = readPassagierFromConsole();
        passagierService.savePassagier(passagier);

    }

    private Passagier readPassagierFromConsole() {
        Passagier passagier = new Passagier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("neuer Passagier");
        System.out.println("Vorname:");
        passagier.setVorname(scanner.nextLine());
        System.out.println("Nachname:");
        passagier.setNachname(scanner.nextLine());
        return passagier;
    }

    public static void main(String[] args) {
        new PassagierTestUI().demoNewPassagier();

    }

    {
        passagierService = new PassagierServiceImpl();
    }
}
