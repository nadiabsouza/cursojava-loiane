package aula16;

public class LoopFor {
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			System.out.println("i tem valor: "+i);
			
		}
		
		System.out.println("======================");
		
		for (int i=5; i>0; i--) {
			System.out.println("i tem valor: "+i);
		}
		
		System.out.println("=======================");
		for (int i=0, j=10; i < j ; i++, j--) {
			System.out.println("i = "+ i + "; j = " +j);
			
			System.out.println("==============");
		int count = 0;
		for( ; count < 10 ; ) {
			System.out.println("valor de count: "+ count);
			count +=2;
			
		}
		System.out.println("===================");
		for(int cont= 0; cont <10; cont +=2) {
			System.out.println("valor de cont: "+cont);
		}
		int soma=0;
		for (int i1=1; i1<5; soma += i1++);
		System.out.println(" o valor da soma �: "+ soma);
		}
	}
	
	

}
