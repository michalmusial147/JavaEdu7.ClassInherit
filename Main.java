import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;
public class Main {


    public static void main(String[] args) {
        TreeMap TreeMap = new TreeMap<TelephoneNumber,Record>();
        TreeMap.put(new TelephoneNumber("+48","123456789"),
                new Person("Adam","Pierwszy","Przedecz","+48","123456789"));
        TreeMap.put(new TelephoneNumber("+48","999999999"),
                new Person("Adam","Drugi","Pieklo","+48","999999999"));
        TreeMap.put(new TelephoneNumber("+48","969111960"),
                new Person("Ewa","Pierwsza","Ziemia","+48","789963258"));
        TreeMap.put(new TelephoneNumber("+48","969696960"),
                new Business("Gates of Eden","Center of the Milky Way","+11","2358_13_21"));
        Collection collection = TreeMap.values();
        Iterator itr = collection.iterator();
        while(itr.hasNext()) {
            ((Record)itr.next()).description();
            System.out.println("");
        }
    }
}
