import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class cercaLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<String>();

        System.out.println("Inserisci gli elementi della lista (inserisci \"fine\" per terminare l'inserimento)");
        String element = input.nextLine();

        while (!element.equals("fine")) {
            list.add(element);
            element = input.nextLine();
        }

        System.out.println("Inserisci l'elemento da cercare: ");
        String searchedElement = input.nextLine();

        int index = list.indexOf(searchedElement);

        if (index != -1) {
            System.out.println("L'elemento si trova all'indice " + index + " della lista.");

        } else {
            System.out.println("L'elemento non è presente nella lista");
        }

        input.close();
    }
}