package Striver_SDE_Sheet;

import java.util.ArrayList;
// Seclore
public class FAKE {
    static class contactData{
        private String name;
        private int latestUpdate;
        private ArrayList<String> phoneNumbers;
    }
    public static ArrayList<contactData> merge(ArrayList<contactData> contactList){
        ArrayList<contactData> mergeList = new ArrayList<>();
        contactData contact = new contactData();
        mergeList.add(contact);
        contactData c1 = contactList.get(0);
        contact.name = c1.name;
        contact.latestUpdate = c1.latestUpdate;
        contact.phoneNumbers = c1.phoneNumbers;
        return mergeList;
    }
    public static void main(String[] args) {
        contactData contact = new contactData();
        ArrayList<contactData> contactList = new ArrayList<>();
        contactList.add(contact);
        contact.name = "khizar";
        contact.latestUpdate = 20;
        ArrayList<String> num = new ArrayList<>();
        num.add("9398265243");
        num.add("9398265983");
        contact.phoneNumbers = num;
        ArrayList<contactData> contactList1 = merge(contactList);
        contactData c1 = contactList1.get(0);
        System.out.println(c1.name);
        System.out.println(c1.latestUpdate);
        System.out.println(c1.phoneNumbers);
    }
}
