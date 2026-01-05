package week1.day1;

public class LearningStringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="testleaf";
		int Len=name.length(); // used to count the characters return type
		System.out.println("The length of the string is:" +Len);
		char[] charArray=name.toCharArray();//Convert string into character Array
		System.out.println(charArray[0]);
		String[] splitMethod = name.split("l");
		for (int i=0; i<splitMethod.length; i++) {
			System.out.println(splitMethod[i]);
		}
		String uppercase = name.toUpperCase();
		System.out.println("BeforeConverting:"+name+"\n"+"After Converting:"+uppercase);
		String lowercase = name.toLowerCase();
		System.out.println("Before Converting:"+name+"\n"+"After Converting:"+lowercase);
		String str1= "qeagle";
		String gfg = str1.replace('e','o');
		System.out.println(gfg);
		String str2="vifhjvvb757123458590!#%^&*@%&*";
		String hjk=str2.replaceAll("[^0-5]","" );
		System.out.println(hjk);
		String specialChar=str2.replaceAll("[A-Z,a-z,0-9]","");
		System.out.println(specialChar);
		
	}
}

