package Hashing;

public class TestHashing {

	public static void main(String[] args) {
		Hashtable hs=new Hashtable(5);
		
		hs.insertdata(5);
		hs.insertdata(7);
		hs.insertdata(6);
		hs.insertdata(10);
		hs.insertdata(8);
		
		hs.displaydata();
		hs.searchdata(6);
	}

}
