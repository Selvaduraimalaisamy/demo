package teleapps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array1 {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("sajee");
	l.add("tele");
    l.add("rajaram");
    l.add("sajee");
    l.add("tele");
    l.add("apps");
	System.out.println(l);
	System.out.println();
	Set<String> k=new HashSet<>(l);

//	for (String d : k) {
//	System.out.println(d);
}
}
