package interfaces;


public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String mixedCaps = "";
		int numLetters = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.substring(i-1, i).equals(" ")) {
				continue;
			}
			if(i%2 == 0) {
				mixedCaps += s.substring(i-1, i).toUpperCase();
			}
			if(i%2 != 0) {
				mixedCaps += s.substring(i-1, i).toLowerCase();
			}
		}
		System.out.println(mixedCaps);
		return mixedCaps;
	}

}
