
public class HelloWorld {
	
	    private String Tabel;
		private String Date;
		private int blackCofee;
		private	int milkCofee;
		private int juice;
	    Component textPayment;
		public  HelloWorld (String a,String b,int c,int d,int f ) {
			this.Tabel=a;
			this.Date=b;
			this.blackCofee=c;
			this.milkCofee=d;
			this.juice=f;
		}
		public String getTabel() {
			return Tabel;
		}
		
		public String getDate() {
			return Date;
		}
		public void setDate(String date) {
			Date = date;
		}
		public void setTabel(String tabel) {
			Tabel = tabel;
		}
		public int getBlackCofee() {
			return blackCofee;
		}
		public void setBlackCofee(int blackCofee) {
			this.blackCofee = blackCofee;
		}
		public int getMilkCofee() {
			return milkCofee;
		}
		public void setMilkCofee(int milkCofee) {
			this.milkCofee = milkCofee;
		}
		public int getJuice() {
			return juice;
		}
		public void setJuice(int juice) {
			this.juice = juice;
		}
		public int  getPayment() {
			return 2*blackCofee+3*milkCofee+4*juice;
		}
		public String toString(){
	            return "Ban "+Tabel+"\t"+Date+"\t"+blackCofee+"\t"+milkCofee+"\t"+juice+"\t"+getPayment();
	        }

	

}
