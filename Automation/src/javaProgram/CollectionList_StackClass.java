package javaProgram;

import java.util.Stack;

public class CollectionList_StackClass {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.add("Apple");
		st.add("Banana");
		st.add("stwaberry");
		st.add("Blueberry");
		st.add("Cherry");
		System.out.println(st);
		
		st.pop();
		System.out.println(st);//removes last object
		st.peek();
		System.out.println(st);//look at the last object without removing it from the stack
		st.push("Dragonfruit");
		System.out.println(st);//it works exactly same as AddElement
		}

}


