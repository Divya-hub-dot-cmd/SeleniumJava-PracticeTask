package week1.day1;

public class LearnStringVerification {
	public static void main(String[] args) {

		String name = "google";

		if (name.equals("google")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not Verified");
		}

		if (name.equalsIgnoreCase("GOOGLE")) {
			System.out.println("Case Verified");
		} else {
			System.out.println("Case is not Verified");
		}

		String acc = "Account Created Successfully TL885855855848";

		if (acc.contains("Created")) {
			System.out.println("Contains and verifies the information");
		} else {
			System.out.println("Not Contains and Verified");
		}
	}
}
