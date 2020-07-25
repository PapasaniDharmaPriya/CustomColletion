import java.util.ArrayList;
import java.util.Scanner;
class CustomCollectionList{
    public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>(10);
		list.add("Priya");
		list.add("Dharma");
		list.add("Hari");
		list.add("vaishu");
		list.add("Anu");
		list.add("Deepu");
		list.add("Swabhavika");
		list.add("viharika");
		list.add("Mouni");
		list.add("Induja");
		System.out.println("Student names who got placed in campus placements");
		//printing values in list
		for(String names:list){
			System.out.println(names);
		}
		System.out.println("Size of the students list : "+list.size());
		//using index in add() method
		list.add(3,"Navya");
		list.add("Sahi");
		System.out.println("After adding new students into list the names are:");
		for(String names:list){
			System.out.println(names);
		}
		System.out.println("Size of the students list after adding some students : "+list.size());
		//using get() method
		System.out.println("Student at the index 2 is : "+list.get(2));
		//printing last occurance of specified element
		System.out.print("Position of Anu in list is : ");
		System.out.println(list.lastIndexOf("Anu"));
		//checking whether the student is present or not
		if(list.contains("Vaishu")){
			System.out.println("Specified student Vaishu is there in the list");
		}
		else{
			System.out.println("Specified student Vaishu is there in the list");
		}
		//finding index of particular index in list
		System.out.println("The index of Anu occurance in list : "+list.indexOf("Anu"));
		//removing Anusha from list
		list.remove("Anu");
		System.out.println("Student list after removing some students from list : ");
		for(String names:list){
			System.out.println(names);
		}
		System.out.println("Size of reduced list after removing some students : "+list.size());
		//replace specified element in the list
		list.set(list.indexOf("Hari"),"Jyo");
		System.out.println("Students list after replacing Haritha with Jyothi : ");
		for(String names:list){
			System.out.println(names);
		}
		//displaying sublist of students list from specified positions
		System.out.println("Sublist of students list from 3rd position to 6th position is : ");
		System.out.println(list.subList(3,7));
		//reducing the size of the list to current size of the list
		list.trimToSize();
		System.out.println("Final size of the students list : "+list.size());
	}
}