package jav2;


import java.util.Scanner;

public class MainContact {
    public static void main(String[] args) {
        ContactList contacts = new ContactList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== MENU =====\n" +
                "0.Exit \n" +
                "1.add to the Contact\n" +
                "2.Update to the Contact \n" +
                "3.Remove to the Contact \n" +
                "4.Search to the Contact \n" +
                "5. Print to the Contact \n");

        int Selection;
        do {
            System.out.println("enter your selection:");
            Selection = scanner.nextInt();
            switch (Selection){
                case 1:
                    System.out.println("enter numberphone's amound: ");
                    int amound = scanner.nextInt();
                    for( int i = 0 ; i<amound;i++){
                        System.out.println("enter name, numberphone:");
                        Contact c1= new Contact(scanner.next(),scanner.next());
                        contacts.addContact(c1);
                    }
                    continue;
                case 2:
                    System.out.println("enter numberphone that you need r" + "epair:");
                    System.out.println("enter old Contact:");
                    Contact u1 = new Contact(scanner.next(),null);
                    System.out.println("enter new Contact:");
                    Contact u2 = new Contact(scanner.next(),scanner.next());
                    contacts.update(u1,u2);
                    continue;
                case 3:
                    System.out.println("enter numberphone that you need remove in the contac: ");
                    Contact r1 = new Contact(scanner.next(),scanner.next());
                    contacts.removeContact(r1);
                    continue;
                case 4:
                    System.out.println("enter name that you need search:");
                    String s1 = scanner.next();
                    contacts.searchContact(s1);
                    continue;
                case 5:
                    System.out.println("the contact");
                    contacts.PrintContact();
                    continue;
                default:
                    System.out.println("enter false value seclection" );
                    continue;
            }
        }while (Selection !=0);
    }
}
