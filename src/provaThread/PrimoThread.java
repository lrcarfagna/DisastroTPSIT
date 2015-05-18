package provaThread;

public class PrimoThread implements Runnable{
	
	public int numero;
	
	public PrimoThread(int n){
		if(n>0){
			numero=n;
		}
		else
			throw new IllegalArgumentException("numero<0");
	}

	@Override
	public void run() {
		
		System.out.println(PrimoInferiore(this.numero));
		
	}
	
	public int PrimoInferiore(int n){
		
		Boolean primo=true;
		int returnValue=0;
		
		for(int i=n-1;i>1;i--){
			for(int j=2;primo==true && j<i;j++){
				if(i%j==0)
					primo=false;
			}
			if(primo){
				returnValue=i;
				break;
			}
			else
				primo=true;
			
		}
		
		return returnValue;
			
		
	}
	
	

}
