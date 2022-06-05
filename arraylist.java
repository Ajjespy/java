import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        //Building new lists
        ArrayList<String> alist=new ArrayList<String>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        //Use list_name.add(index, item) To add elements to list, index defaults to the end
        alist.add("Jeff");
        alist.add("Austin");
        alist.add("John");
        alist.add("Bill");
        alist.add("Jeffery");
        alist.add(2, "Dad");

        //Output
        System.out.println(alist);

        list.add(5);
        list.add(9);
        list.add(12);
        list.add(45);
        list.add(68);
        list.add(2, 70);

        System.out.println(list);

        //Use .set(index, element) to change that index
        alist.set(2, "Father");
        System.out.println(alist);

        //Use .remove(index OR element) to remove item
        alist.remove("Bill");
        alist.remove(0);
        System.out.println(alist);

        //Use a for loop to output items in list
        for(String str:alist)
            System.out.println(str);
        
        //.size gives length
        System.out.println("Number of elements in alist: " + alist.size());

        //.sort
        Collections.sort(alist);
        System.out.println(alist);

        //.indexOf(element)
        System.out.println(alist.indexOf("Austin"));

        //.get(index)
        System.out.println(alist.get(1));

        //.contains(element)
        System.out.println(alist.contains("Father"));
        System.out.println(alist.contains("Bill"));

        //.clear
        alist.clear();
        System.out.println(alist);
    }
}
