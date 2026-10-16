package problem.n8;

import java.util.*;

public class ToeicScoreManager {
	public static void main(String[] args) {
		HashMap< String, Vector<Integer>> map = new HashMap<String, Vector<Integer>>();
		Scanner scanner = new Scanner(System.in);

		map.put("한지운" , new Vector<Integer>());
		map.put("김하진" , new Vector<Integer>());
		map.put("하여린" , new Vector<Integer>());
		map.put("윤단비" , new Vector<Integer>());
		
		System.out.println("등록된학생: 한지운, 김하진, 하여린, 윤단비등4명입니다.");
		while(true) {
			System.out.print("이름과점수들>>");
			String line = scanner.nextLine();
			if(line.equals("그만"))
				break;
			String [] tokens = line.split(" ");
			String name = tokens[0];
			Vector<Integer> v = map.get(name);
			if(v == null) {
				System.out.println(name + "은없는학생입니다.");
				continue;
			}
			
			for(int i=0; i<tokens.length -1; i++)
				v.add(Integer.parseInt(tokens[i+1]));
		}
		
		while(true) {
			System.out.print("검색할이름>>");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			Vector<Integer> v = map.get(name);
			if(v == null) {
				System.out.println(name + "은없는학생입니다.");
				continue;
			}
			if(v.size() == 0) {
				System.out.println(name + "은토익점수가없습니다.");
				continue;
			}
			for(int score : v)
				System.out.print(score + " ");
			System.out.println();
		}
		scanner.close();
	}
}