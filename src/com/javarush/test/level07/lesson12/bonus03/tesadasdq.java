
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class tesadasdq {
        public static void main(String[] args){
            Set<String> set = new HashSet<String>();
            set.add("Stop");
            set.add("Look");
            set.add("Listen");

            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext())
            {
                String text = iterator.next();
                System.out.println(text);
            }
        }

}

