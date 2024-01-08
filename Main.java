import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Main
{   
    public static void main(String args[])
    {
        List<Integer> l=Arrays.asList(20,19,10,5,4);
        Collections.sort(l);
        Iterator<Integer> itr= l.iterator();
        // these are ashu changes
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}
