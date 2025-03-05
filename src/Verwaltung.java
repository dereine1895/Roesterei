import java.util.Scanner;
import utils.List;


public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        Warteschlange<Kunde> warteschlange = new Warteschlange<>();
        Stack<Rechnung> rechnungStack = new Stack<>();
        List<Getraenk> getraenkList = new List<>();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Warteschlange verwalten");
            System.out.println("[2] Stack verwalten");
            System.out.println("[3] Liste verwalten");
            System.out.println("[4] Beenden");
            int HauptOption = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (HauptOption) {
                case 1:
                    verwalteWarteschlange(warteschlange);
                    break;
                case 2:
                    verwalteStack(rechnungStack);
                    break;
                case 3:
                    verwalteListe(getraenkList);
                    break;
                case 4:
                    System.out.println("Programm beendet.");
                    return; // Programm beenden
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    private void verwalteWarteschlange(Warteschlange<Kunde> warteschlange) {
        while (true) {
            System.out.println("== WARTESCHLANGEN MENÜ ==");
            System.out.println("[1] Hinzufügen zur Warteschlange");
            System.out.println("[2] Manuell Hinzufügen zur Warteschlange");
            System.out.println("[3] Entfernen aus der Warteschlange");
            System.out.println("[4] Zeige Inhalt der Warteschlange");
            System.out.println("[5] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Wie viele Kunden willst du zur Warteschlange hinzufügen?");
                    int numCustomers = scanner.nextInt();
                    for (int i = 0; i < numCustomers; i++) {
                        Kunde kunde = new Kunde("Kunde" + i);
                        warteschlange.einfuegen(kunde);
                    }
                    break;
                case 2:
                    System.out.println("Namen des Kunden angeben, der zur Warteschlange hinzugefügt werden soll:");
                    String name = scanner.nextLine();
                    Kunde kundeM = new Kunde(name);
                    warteschlange.einfuegen(kundeM);
                    break;
                case 3:
                    warteschlange.entfernen();
                    break;
                case 4:
                    Kunde hilfeWarteschlange = warteschlange.gibErsten();
                    if (hilfeWarteschlange != null) {
                        System.out.println("Erster Kunde in der Warteschlange: " + hilfeWarteschlange.getName());
                    } else {
                        System.out.println("Die Warteschlange ist leer.");
                    }
                    break;
                case 5:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    private void verwalteStack(Stack<Rechnung> rechnungStack) {
        while (true) {
            System.out.println("== STACK MENÜ ==");
            System.out.println("[1] Hinzufügen zum Stack");
            System.out.println("[2] Entfernen aus dem Stack");
            System.out.println("[3] Zeige Inhalt des Stacks");
            System.out.println("[4] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Beschreibung der Rechnung angeben, die zum Stack hinzugefügt werden soll:");
                    String beschreibung = scanner.nextLine();
                    Rechnung rechnung = new Rechnung(beschreibung);
                    rechnungStack.push(rechnung);
                    break;
                case 2:
                    rechnungStack.pop();
                    break;
                case 3:
                    Rechnung hilfeStack = rechnungStack.getContent();
                    if (hilfeStack != null) {
                        System.out.println("Oberste Rechnung im Stack: " + hilfeStack.getBeschreibung());
                    } else {
                        System.out.println("Der Stack ist leer.");
                    }
                    break;
                case 4:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    private void verwalteListe(List<Getraenk> getraenkList) {
        while (true) {
            System.out.println("== LISTE MENÜ ==");
            System.out.println("[1] Hinzufügen zur Liste");
            System.out.println("[2] Einfügen an der aktuellen Position");
            System.out.println("[3] Entfernen aus der Liste");
            System.out.println("[4] Zeige Inhalt der Liste");
            System.out.println("[5] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Namen des Getränks angeben, das zur Liste hinzugefügt werden soll:");
                    String getraenkName = scanner.nextLine();
                    Getraenk getraenk = new Getraenk(getraenkName);
                    getraenkList.append(getraenk);
                    break;
                case 2:
                    System.out.println("Namen des Getränks angeben, das an der aktuellen Position eingefügt werden soll:");
                    String insertName = scanner.nextLine();
                    Getraenk insertGetraenk = new Getraenk(insertName);
                    getraenkList.insert(insertGetraenk);
                    break;
                case 3:
                    getraenkList.remove();
                    break;
                case 4:
                    if (getraenkList.isEmpty()) {
                        System.out.println("Die Liste ist leer.");
                    } else {
                        getraenkList.toFirst();
                        while (getraenkList.Aktueller != null) {
                            System.out.println("Getränk: " + getraenkList.Aktueller.getContent().getName());
                            getraenkList.next();
                        }
                    }
                    break;
                case 5:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }
}
