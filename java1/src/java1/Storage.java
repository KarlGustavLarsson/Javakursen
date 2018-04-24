package java1;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
	
 private List <T> mylist = new ArrayList<T> ();


 
public void  addToList(T someTypeofObject ) {
	mylist.add(someTypeofObject);
	
}
 
public void  removefromList(T someTypeofObject ) {
	mylist.add(someTypeofObject);
}
 

}
