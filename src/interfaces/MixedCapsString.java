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
			char c = s.charAt(i);
			if(i%2 == 0) {
				mixedCaps += c = Character.toLowerCase(c);
			}
			if(i%2 != 0) {
				mixedCaps += c = Character.toUpperCase(c);
			}
		}
		System.out.println(mixedCaps);
		return mixedCaps;
	}

}
