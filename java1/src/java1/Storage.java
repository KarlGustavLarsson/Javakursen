package java1;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
	
public List <T> mylist = new ArrayList<T> ();


 
public void  addToList(T someTypeofObject ) {
	mylist.add(someTypeofObject);
	
}
 
public void  removefromList(T someTypeofObject ) {
	mylist.remove(someTypeofObject);
}
 

}
