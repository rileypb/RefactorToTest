
public class StringReverser {

	public static void main(String[] args) {
		String original = args[0];
		StringBuilder builder = new StringBuilder();
		for (int i = original.length() - 1; i >= 0; i--) {
			builder.append(original.charAt(i));
		}
		System.out.println(builder);
	}

}
