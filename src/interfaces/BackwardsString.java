package interfaces;


public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		System.out.println(s);
		int size = s.length();
		String backwards = "";
		for(int i = size; i > 0; i--) {
		backwards += s.substring( i-1, i);
		
		}
		System.out.println(backwards);
		return backwards;
	}

}
