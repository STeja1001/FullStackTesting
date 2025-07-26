package polymorphism;

public class MainMethod {
	
	public static void main(String[] args) {
		
	MethodOverloadingEg1 objMo=new MethodOverloadingEg1();
	
	objMo.setClock(12);
	objMo.getClock();
	
	objMo.setClock(12, 30);
	objMo.getClock();
	
	objMo.setClock(12, 30, 60);
	objMo.getClock();
	

}
}
