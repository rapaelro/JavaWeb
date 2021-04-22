package lotto;
//로또 6개 숫자 배열 생성(같은 숫자 제외)
public class Lotto {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int count = 0;
		System.out.println("960회 LOTTO 추천번호");
		for(int k=1; k<6; k++) {
			count++;
			point: for(int i=0; i<lotto.length; i++) {
						
					lotto[i] = (int)(Math.random()*45)+1 ;
						
					for(int j=0; j<i; j++) {
						if(lotto[j] == lotto[i]) {
							i--;
							continue point;
						}
					}
			}
			int temp = 0;
			for(int i=0; i<5; i++) {
				for(int j=i+1; j<6; j++) {
					if(lotto[i]>lotto[j]) {
						temp = lotto[i]; lotto[i] = lotto[j]; lotto[j] = temp;
					}
				}
			}
			System.out.print(count+"번째 번호: ");
			for(int i=0; i<6; i++) System.out.print(lotto[i]+" ");
			System.out.println();
		}
	}
}
