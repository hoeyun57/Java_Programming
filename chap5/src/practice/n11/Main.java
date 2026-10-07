package practice.n11;

import java.util.Scanner;
interface IStack {
	int capacity();
	int length();
	boolean push(String val);
	String pop();
}

class StringStack implements IStack{
	private int top=0;
	private String[] data = null;
		
	public StringStack(int capacity) {
		data = new String[capacity];
	}
		
	@Override
	public int capacity() {
		return data.length;
	}
		
	@Override
	public int length() {
		return top;
	}
		
	@Override
	public boolean push(String val) {
		if(top==data.length) return false;
		data[top]=val;
		top++;
		return true;
	}
		
	@Override
	public String pop() {
		if(top==0) return null;
		top--;
		return data[top];
	}			
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("스택 용량>>");
		int size = scanner.nextInt();
		StringStack sStack = new StringStack(size);
		
		while(true) {
			System.out.print("문자열 입력>>");
			String str = scanner.next();
			
			if(str.equals("그만")) {
				break;
			}
			if(sStack.push(str) == false) {
				System.out.println("스택이 꽉 차서 " + str + " 저장 불가");
			}	
		}
		
		System.out.print("스택에 저장된 문자열 팝 : ");
		
		while(true) {
			String str = sStack.pop();
			if(str == null) { break; }
			System.out.print(str + " ");
		}
		
		System.out.println();
		scanner.close();	
	}
}
