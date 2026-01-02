import java.util.*;

class CollectionDemo { 
	String name;
	int age;

	public CollectionDemo(String name, int age) {
		this.name = name;
		this.age= age;
	}
	
	@Override
	public String toString() {
        return " object => {" +
                "name='" + name + '\'' +
                ", age='" + age + '\''+
                '}'
                ;
   	 }




	public static void main() {
		CollectionDemo cd = new CollectionDemo("Lalit",1);
		CollectionDemo cd1 = new CollectionDemo("Lalit",4);
		CollectionDemo cd2 = new CollectionDemo("Lalit",5);
		CollectionDemo cd3 = new CollectionDemo("Lalit",7);
		System.out.println(cd);
		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);

		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);

		System.out.println(list);

}
}
