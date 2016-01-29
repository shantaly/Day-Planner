import java.util.Scanner;

/** DayPlannerDemo class
 *
 * @author Ahmed El Shantaly
 *
 */

public class DayPlannerDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DayPlanner planner = new DayPlanner();
		String command = "";
		do {
			System.out.print("Enter add, search, or quit> ");
			command = input.nextLine();
			if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("a"))
				planner.addActivity(input);
			else if (command.equalsIgnoreCase("search") || command.equalsIgnoreCase("s"))
				planner.searchActivities(input);			
		} while (!command.equalsIgnoreCase("quit") && !command.equalsIgnoreCase("q"));
	}
}
