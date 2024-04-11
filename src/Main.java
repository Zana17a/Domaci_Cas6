import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Domaci Cas6:");

//        ArrayList <String> listaPolozili = new ArrayList<>();
//        ArrayList <String> listaPali = new ArrayList<>();
            List listaPolozili = new ArrayList();
            List listaPali = new ArrayList();

        while (true) {
            Student student = new Student();
                 System.out.println("Unos ime: ");
                 student.ime = scanner.next();
            if (student.ime.equalsIgnoreCase("quit")) {
                break;}
                 System.out.println("Unos prezime: ");
                 student.prezime = scanner.next();
            if (student.prezime.equalsIgnoreCase("quit")) {
                break;
            }
                System.out.println("Unos ocenu: ");
                student.ocena = scanner.nextInt();
            if (student.ocena > 5) listaPolozili.add(student.ime +" "+ student.prezime);
            else listaPali.add(student.ime +" "+ student.prezime);
        }
        System.out.println("Polozili: " + listaPolozili);
        System.out.println("Pali: " + listaPali);




    }
}