package provaThread;

public class SecondoThread implements Runnable{
	
	public int numero;
	
	public SecondoThread(int n){
		if(n>0){
			numero=n;
		}
		else
			throw new IllegalArgumentException("numero<0");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
