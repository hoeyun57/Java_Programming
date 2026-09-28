package practice.n4;

class Average {
	int arr[];
	private int nextIndex;
	
	public Average() {
		this.arr = new int[10];
		this.nextIndex = 0;
	}
	
	public void put(int a) {
		arr[nextIndex++] = a;
	}
	
	public void showAll() {
		System.out.println("***** 저장된 데이터 모두 출력 *****");
		for(int i = 0; i < nextIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public double getAvg() {
		double sum = 0;
		for(int i = 0; i < nextIndex; i++) {
			sum += arr[i];
		}
		return sum / nextIndex;
	}
}

public class Main {
	public static void main(String[] args) {
		Average avg = new Average();
		avg.put(10);
		avg.put(15);
		avg.put(100);
		avg.showAll();
		System.out.println("평균은 " + avg.getAvg());
	}
}