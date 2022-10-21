package org.tnsindia.list;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		//Queue is an interface, we cant create object for it
		Queue<Character>list=new PriorityQueue<>();
		list.add('z');
		list.add('Z');// capital letter get first priority
		list.offer('a');
		list.add('s');
		list.add('p');
		//enhanced for loop 
		for(Character c: list)
		{
			System.out.println(c);
		}
		System.out.println(list);
		//will delete head element that is starting
		System.out.println(list);
		list.remove();
		list.remove();
		//list.poll();
		//list.poll();
		//list.poll();
		//peek will give us head element
		System.out.println(list);
		list.remove();
		System.out.println(list);
		


	}

}
