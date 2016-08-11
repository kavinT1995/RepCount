# RepCount
public class Occurence{
    
	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sr=new Scanner(System.in);
		int num=sr.nextInt();
		String s=""+num;
		//System.out.println(s);
		System.out.println("Enter occurance");
		int occurance=sr.nextInt();
		String s1=""+occurance;
		//System.out.println(s1);
		int co=s.replaceAll("[^"+s1+"]","").length();
		System.out.println(co);
}
}
