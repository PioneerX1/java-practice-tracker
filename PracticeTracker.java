import java.io.Console;

public class PracticeTracker {
  public static void main(String[] args) {
    Integer hours = 0;
    System.out.println("This application will read in the number of hours you programmed for the last 3 days, total those, and evaluate your effort.");
    hours += askForHours("today");
    hours += askForHours("yesterday");
    hours += askForHours("the day before");

    String evaluation = evaluateEffort(hours);

    System.out.print("You have coded " + hours + " over the last 3 days. " + evaluation);
  }
  public static Integer askForHours(String whatDay); {
    Console myConsole = System.console();
    System.out.println("How many hours did you code " + whatDay +
    "?");
    return (Integer.parseInt(myConsole.readLine()));
  }
  public static String evaluateEffort(int hours) {
    if (hours <= 3) {
      return "You need to put A LOT more effort into this!";
    } else if (hours > 3 && hours < 7) {
      return "Keep it up, try to find more time to code if you can";
    } else {
      return "Great job! Take the day off and see a movie!";
    }
  }
}
