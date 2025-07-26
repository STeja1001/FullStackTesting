package polymorphism;

public class MethodOverloadingEg1 {
		
	int hr,mn,ss;
		
		public void setClock(int hr) {
			this.hr=hr;		
		}
		
		public void setClock(int hr, int mn) {
			this.hr=hr;
			this.mn=mn;
		}
		
		public void setClock(int hr, int mn, int ss) {
			this.hr=hr;
			this.mn=mn;
			this.ss=ss;
		}
		
		public void getClock() {
			System.out.printf("%02d:%02d:%02d",hr,mn,ss);
			System.out.println();
		}

}
