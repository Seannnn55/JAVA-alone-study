package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClikListner(new CallListener());
		btn.touch();
		
		btn.setOnClikListner(new MessageListener());
		btn.touch();
	}

}
