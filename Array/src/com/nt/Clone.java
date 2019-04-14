package com.nt;

public class Clone implements Cloneable {
	
int id;
String name;

Clone(int id, String name){
this.id	=id;
this.name=name;

	
}
@Override
public String toString() {
	return "Clone [id=" + id + ", name=" + name + "]";
}
public static void main(String[] args) throws CloneNotSupportedException {
	
	Clone obj=new Clone(2,"suneel");
	Clone obj2=(Clone)obj.clone();
	
	System.out.println(obj);
	System.out.println(obj2);
}

}
