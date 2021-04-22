package random;

public class Random {
	public static void main(String[] args) {
		int count = 0;
		long sum1 = 0;
		long sum2 = 0;
		for(int k=1; k<=100; k++) {	//100반복
			count++;
			// (int)(Math.random()*10)+1 의 수행시간
			long start1 = System.currentTimeMillis(); //시작시간
			
			for (int i=0; i<10000000; i++) {
				int random1 = (int)(Math.random()*10)+1;
			}
			long end1 = System.currentTimeMillis(); //종료시간
			
			// (int)(Math.random()*10+1) 의 수행시간
			long start2 = System.currentTimeMillis(); //시작시간
			
			for (int i=0; i<10000000; i++) {
				int random2 = (int)(Math.random()*10+1);
			}
			long end2 = System.currentTimeMillis(); //종료시간
			
			long term1 = end1-start1;
			long term2 = end2-start2;
			
			sum1 += term1;
			sum2 += term2;
		}
		long avg1 = sum1/count;				//평균시간
		long avg2 = sum2/count;
		
		System.out.println(count+" 번째 수행시");
		System.out.println("(int)(Math.random()*10)+1 의 평균 수행시간: "+avg1);
		System.out.println("(int)(Math.random()*10+1) 의 평균 수행시간: "+avg2);
	}
}
