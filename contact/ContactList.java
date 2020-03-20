package jav2;

import java.util.ArrayList;

public class ContactList {
    ArrayList<Contact> list = new ArrayList<>();

    public void addContact(Contact contact){
        list.add(contact);
    }
    public void update(Contact oldContact , Contact newContact){
        list.set(list.indexOf(oldContact),newContact);
    }
    public void removeContact(Contact contact){
        list.remove(contact);
        System.out.println("remove :"+list.indexOf(contact)+", "+contact);
    }
    public Contact searchContact(String contactName){
        int position = list.indexOf(contactName);
        if(position >0){
            return list.get(position);
        }
        return null;
    }
    public void PrintContact(){
        System.out.println( "Your Contact"+ list.size()+"(numberphone)");
        for(int j = 0; j<list.size();j++){
            System.out.println("Contact:"+list.get(j+1)+"");
        }
    }
}