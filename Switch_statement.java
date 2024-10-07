package java1;

public class Switch_statement {
	public static void main(String[]args) {
		
		String day="friday";
		
		switch(day) {
		case "sunday" :System.out.println("its sunday today...");
		break;
		case "monday" :System.out.println("its monday today...");
		break;
		case "tuesday" :System.out.println("its tuesday today...");
		break;
		case "wednesday" :System.out.println("its wednesday today...");
		break;
		case "thursday" :System.out.println("its thursday today...");
		break;
		case "friday" :System.out.println("its friday today...");
		break;
		case "saturday" :System.out.println("its saturday today...");
		break;
		default:System.out.println("its not a day fool");
		}
	}
}
