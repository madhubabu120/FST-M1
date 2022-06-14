package activities;

import java.util.HashSet;

public class Activity10 {
        public static void main(String[] args) {
            HashSet<String> hs = new HashSet<String>();

            hs.add("Madhu");
            hs.add("Babu");
            hs.add("Catch");
            hs.add("And");
            hs.add("Mad");
            hs.add("Xoxo");


            System.out.println("Original HashSet: " + hs);

            System.out.println("Size of HashSet: " + hs.size());


            System.out.println("Removing A from HashSet: " + hs.remove("And"));

            if(hs.remove("Zozo")) {
                System.out.println("Zozo removed from the Set");
            } else {
                System.out.println("Zozo is not present in the Set");
            }


            System.out.println("Checking if Madhu is present: " + hs.contains("Madhu"));

            System.out.println("Updated HashSet: " + hs);
        }
}
