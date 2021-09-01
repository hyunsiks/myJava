package myobj.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Check extends Card{

	int[] diceSave = new int[5];
	int[] countCheck;
	int countPair1;
	int pair, triple, fourcard, fivecard;
	int score = 0;
	int same = 0;
	String contrast;
	ArrayList<Integer> arrInt;
	int royal = 0;
	
	
	public Check() {
		// TODO Auto-generated constructor stub
		pair = 0;
		triple = 0;
		fourcard = 0;
		fivecard = 0;		
	}
	
	void myMade() {
		boolean[] check = new boolean[5];
		countCheck = new int[5];
		int complete = 0;
		int flushSpade = 0; int flushDiamond = 0; int flushHeart = 0; int flushClover = 0; 
		int fourCard = 0; int triple = 0; int pair = 0; int one = 0;
		int streight = 0; int fullHouse = 0; 
		int maxNum = 0;
		int secondNum = 0;
		
		
		String patternSpadeNum = ""; String patternHeartNum = ""; String patternDiamondNum = ""; String patternCloverNum = "";
		int countPatternSpade = 0; int countPatternHeart = 0; int countPatternDiamond = 0; int countPatternClover = 0;
		int patternNum = 0;
		for(int i = 0; i < cardSet.size(); i++) {
			
			for(int j = 1; j < cardSet.size(); j++) {
				
				if(cardSet.get(i).charAt(0) == cardSet.get(j).charAt(0)) {
					String c = Character.toString(cardSet.get(i).charAt(0));
					if(c.equals("♠")) {
						countPatternSpade++;
						patternSpadeNum += cardSet.get(i).charAt(cardSet.get(i).length()-1);
					}else if(c.equals("◆")) {
						countPatternDiamond++;
						patternDiamondNum += cardSet.get(i).charAt(cardSet.get(i).length()-1);
					}else if(c.equals("♣")) {
						countPatternClover++;
						patternCloverNum += cardSet.get(i).charAt(cardSet.get(i).length()-1);
					}else if(c.equals("♥")) {
						countPatternHeart++;
						patternHeartNum += cardSet.get(i).charAt(cardSet.get(i).length()-1);
					}
				}
			}
		}
		
		if(countPatternSpade >= 20) {
			streight(sameDelete(patternSpadeNum));				
			if(royal == 0) {				
				flushSpade++;
			}
			complete++;
		}else if(countPatternDiamond >= 20){	
			streight(sameDelete(patternDiamondNum));				
			if(royal == 0) {	
				flushDiamond++;
			}
			complete++;
		}else if(countPatternClover >= 20){
			streight(sameDelete(patternCloverNum));				
			if(royal == 0) {	
				flushClover++;
			}
			complete++;
		}else if(countPatternHeart >= 20){
			streight(sameDelete(patternHeartNum));				
			if(royal > 0) {	
				flushHeart++;
			}
			complete++;
		}
		
		//=================================================전부 int 형으로 바꿔버린다
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.addAll(cardSet);
		arrInt = new ArrayList<>();
		ArrayList<Integer> arrInt2 = new ArrayList<>();
		
			
		Collections.sort(arr2);

		for(int i = 0; i < arr2.size(); i++) {
			if(arr2.get(i).length() > 2) {
				arr2.remove(i);
				arr2.add(i, "a0");
			}
			if(arr2.get(i).charAt(1) == 'A') {
				arr2.remove(i);
				arr2.add(i, "a1");
			}
			if(arr2.get(i).charAt(1) == '0') {
				arrInt.add(10);
			}else if(arr2.get(i).charAt(1) == 'J') {
				arrInt.add(11);
			}else if(arr2.get(i).charAt(1) == 'Q') {
				arrInt.add(12);
			}else if(arr2.get(i).charAt(1) == 'K') {
				arrInt.add(13);
			}else {				
				arrInt.add(Integer.parseInt(Character.toString(arr2.get(i).charAt(1))));
			}
		}
		
		System.out.println("arrInt앞 : " + arrInt); //디버깅!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		TreeSet<Integer> treeInt = new TreeSet<>();
		treeInt.addAll(arrInt);

		arrInt2.addAll(treeInt);	//중복제거를 위한 새로운 인트형 카드셋
		
		int streigt2 = 0;
		if(arrInt2.size() >= 5) {	//연속으로 5개카드의 차이가 4이면 스트레이트
			for(int i = 0; i <= arrInt2.size() - 5; i++) {
				
				if(arrInt2.get(i+4) - arrInt2.get(i) == 4) {
					streigt2++;
				}
			}
		}
		if(streigt2 >= 1 ||	//13에서 1로 넘어가는 스타일의 스트레이트
				(arrInt2.get(0) == 1 && arrInt2.get(arrInt2.size()-4) == 10 && arrInt2.get(arrInt2.size()-3) == 11 && arrInt2.get(arrInt2.size()-2) == 12 && arrInt2.get(arrInt2.size()-1) == 13) ||
				(arrInt2.get(0) == 1 && arrInt2.get(1) == 2 && arrInt2.get(arrInt2.size()-3) == 11 && arrInt2.get(arrInt2.size()-2) == 12 && arrInt2.get(arrInt2.size()-1) == 13) ||
				(arrInt2.get(0) == 1 && arrInt2.get(1) == 2 && arrInt2.get(2) == 3 && arrInt2.get(arrInt2.size()-2) == 12 && arrInt2.get(arrInt2.size()-1) == 13) ||
				(arrInt2.get(0) == 1 && arrInt2.get(1) == 2 && arrInt2.get(2) == 3 && arrInt2.get(3) == 4 && arrInt2.get(arrInt2.size()-1) == 13)){

			streight++;
			complete++;
		}
		//1 10 11 12 13, 1 2 11 12 13, 1 2 3 12 13, 1 2 3 4 13
	
		int[] countPair = new int[arrInt.size()];
		
		int four = 0; int tri = 0; int twin = 0;
		String pairNum = ""; int tripleNum = 0; int fourCardNum = 0; String fullhouseNum = "";
		int cc = 0;
													//트리플과 페어비교
		for(int i = 0; i < arrInt.size(); i++) {
			
			for(int j = 0; j < arrInt.size(); j++) {
				if(arrInt.get(i) == arrInt.get(j)) {
					cc++;
				}
			}
			countPair[i] = cc;
			cc = 0;
		}

		for(int i = 0; i < countPair.length; i++) {
			if(countPair[i] >= 4) {
				four++;
				fourCardNum = i;
			}else if(countPair[i] == 3) {
				tri++;
				tripleNum = i;
			}else if(countPair[i] == 2) {
				twin++;
				pairNum += Integer.toString(i);
			}
		}
	
		for(int i = 0; i < pairNum.length(); i++) {
			if(maxNum < arrInt.get(Integer.parseInt(Character.toString(pairNum.charAt(i))))) {
				System.out.println("졸긴것 : " + arrInt.get(Integer.parseInt(Character.toString(pairNum.charAt(i)))));
				secondNum = maxNum;
				maxNum = arrInt.get(Integer.parseInt(Character.toString(pairNum.charAt(i))));
			}else if((secondNum < arrInt.get(Integer.parseInt(Character.toString(pairNum.charAt(i))))) && (arrInt.get(Integer.parseInt(Character.toString(pairNum.charAt(i)))) != maxNum)){
				secondNum = arrInt.get(Integer.parseInt(Character.toString(pairNum.charAt(i))));
			}
		}
		if(four > 0) {
			fourCard++;
		}else if(tri > 0 && twin > 0) {
			fullHouse++;
		}else if(tri > 0) {
			triple++;
		}else if(twin >= 4) {
			pair++;
		}else if(twin >= 2) {
			one++;
		}

		ArrayList<String> result = new ArrayList<>(); 
		for(int i = 0; i < arrInt.size(); i++) {
			result.add(Integer.toString(arrInt.get(i)));
		}
		
		String maxNumString = Integer.toString(maxNum);
		String secondNumString = Integer.toString(secondNum);
		
		System.out.println("arrInt : " + arrInt); //디버깅!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
		System.out.println("fourCardNum : " + fourCardNum);
		System.out.println("tripleNum : " + tripleNum);
		System.out.println("maxNum : " + maxNum);
		System.out.println("secondNum : " + secondNum);
		
		if(arrInt.get(fourCardNum) == 1) {
			result.remove(fourCardNum);
			result.add(fourCardNum, "A");
		}
		if(arrInt.get(tripleNum) == 1) {
			result.remove(tripleNum);
			result.add(tripleNum, "A");
		}
		if(maxNum == 1) {
			maxNumString = "A";
		}
		if(secondNum == 1) {
			secondNumString = "A";
		}
		if(arrInt.get(fourCardNum) == 11) {
			result.remove(fourCardNum);
			result.add(fourCardNum, "J");
		}
		if(arrInt.get(tripleNum) == 11) {
			result.remove(tripleNum);
			result.add(tripleNum, "J");
		}
		if(maxNum == 11) {
			maxNumString = "J";
		}
		if(secondNum == 11) {
			secondNumString = "J";
		}
		if(arrInt.get(fourCardNum) == 12) {
			result.remove(fourCardNum);
			result.add(fourCardNum, "Q");
		}
		if(arrInt.get(tripleNum) == 12) {
			result.remove(tripleNum);
			result.add(tripleNum, "Q");
		}
		if(maxNum == 12) {
			maxNumString = "Q";
		}
		if(secondNum == 12) {
			secondNumString = "Q";
		}
		if(arrInt.get(fourCardNum) == 13) {
			result.remove(fourCardNum);
			result.add(fourCardNum, "K");
		}
		if(arrInt.get(tripleNum) == 13) {
			result.remove(tripleNum);
			result.add(tripleNum, "K");
		}
		if(maxNum == 13) {
			maxNumString = "K";
		}
		if(secondNum == 13) {
			secondNumString = "K";
		}
		
		System.out.println("최종결과---------------------------");
		if(this.royal > 0) {
			System.out.println("=====로얄 스트레이트 플러쉬=====");
		}else if(fourcard > 0) {
			System.out.println("=====" + result.get(fourCardNum) + " 포카드 =====" );
		}else if(fullHouse > 0) {
			System.out.printf("===" + result.get(tripleNum) + ", " + maxNumString + "풀하우스===");
		}else if(flushSpade > 0) {
			System.out.println("=== 스페이드 플러쉬 ===");
		}else if(flushDiamond > 0) {
			System.out.println("=== 다이아몬드 플러쉬 ===");
		}else if(flushHeart > 0) {
			System.out.println("=== 하트 플러쉬 ===");
		}else if(flushClover > 0) {
			System.out.println("=== 클로버 플러쉬 ===");
		}else if(streight > 0) {
			System.out.println("= 스트레이트 =");
		}else if(triple > 0) {
			System.out.println(result.get(tripleNum) + " 트리플");
		}else if(pair > 0) {
			System.out.printf("%s , %s 투페어\n", maxNumString, secondNumString);
		}else if(one > 0) {
			System.out.printf("%s 원페어", maxNumString);
		}
		else {
			System.out.println("아무 것도 메이드되지 않았습니다");
		}
	}
	
	public void streight(ArrayList<String> a) {
		
		arrInt = new ArrayList<>();

		for(int i = 0; i < a.size(); i++) {
	
			if(a.get(i).charAt(a.get(i).length()-1) == 'A') {
				arrInt.add(1);
			}else if(a.get(i).charAt(a.get(i).length()-1) == '0') {
				arrInt.add(10);
				System.out.println("0체크됨");
			}else if(a.get(i).charAt(a.get(i).length()-1) == 'J') {
				arrInt.add(11);
			}else if(a.get(i).charAt(a.get(i).length()-1) == 'Q') {
				arrInt.add(12);
			}else if(a.get(i).charAt(a.get(i).length()-1) == 'K') {
				arrInt.add(13);
			}else {				
//				arrInt.add(Integer.parseInt(Character.toString(a.get(i).charAt(a.get(i).length()-1))));
				arrInt.add((a.get(i).charAt(a.get(i).length()-1)) - 0);
			}
		}

//		TreeSet<Integer> treeInt = new TreeSet<>();
//		treeInt.addAll(arrInt);
//		ArrayList<Integer> arrInt2 = new ArrayList<>();
//		arrInt2.addAll(treeInt);	//중복제거를 위한 새로운 인트형 카드셋
		
		int streigt = 0;
		if(arrInt.size() >= 5) {	//연속으로 5개카드의 차이가 4이면 스트레이트
			for(int i = 0; i <= arrInt.size() - 5; i++) {
				
				if(arrInt.get(i+4) - arrInt.get(i) == 4) {
					streigt++;
				}
			}
		}
		if(streigt >= 1 ||	//13에서 1로 넘어가는 스타일의 스트레이트
				(arrInt.get(0) == 1 && arrInt.get(arrInt.size()-4) == 10 && arrInt.get(arrInt.size()-3) == 11 && arrInt.get(arrInt.size()-2) == 12 && arrInt.get(arrInt.size()-1) == 13) ||
				(arrInt.get(0) == 1 && arrInt.get(1) == 2 && arrInt.get(arrInt.size()-3) == 11 && arrInt.get(arrInt.size()-2) == 12 && arrInt.get(arrInt.size()-1) == 13) ||
				(arrInt.get(0) == 1 && arrInt.get(1) == 2 && arrInt.get(2) == 3 && arrInt.get(arrInt.size()-2) == 12 && arrInt.get(arrInt.size()-1) == 13) ||
				(arrInt.get(0) == 1 && arrInt.get(1) == 2 && arrInt.get(2) == 3 && arrInt.get(3) == 4 && arrInt.get(arrInt.size()-1) == 13)){

			this.royal++;
		}
	}
	
	public ArrayList<String> sameDelete(String a) { //중복제거메서드
		
		TreeSet<String> treeInt = new TreeSet<>();
		
		for(int i = 0; i < a.length(); i++) {
//			treeInt.add(Integer.parseInt(Character.toString(a.charAt(i))));
			treeInt.add(Character.toString(a.charAt(i)));
		}
				
		ArrayList<String> arrInt2 = new ArrayList<>();
		arrInt2.addAll(treeInt);
		
		return arrInt2;
	}
}


