public class Main {
    public static void main(String[] args) {

        // Initializes the values for the maintenance cost of all 4 seasons
        double summerCost = 1000.90;
        double autumnCost = 890.10;
        double winterCost = 970.20;
        double springCost = 700.50;

        // Computes the total yearly maintenance cost
        double totalCost = summerCost + autumnCost + winterCost + springCost;

        // Outputs total cost and echoes each seasonal value
        System.out.println(" ");
        System.out.println("With a summer cost of $" + summerCost + ", an autum cost of $" + autumnCost +
                           ", a winter cost of $" + winterCost + "\n" + "and a spring cost of $" + springCost +
                           ", your total yearly home maintenance cost is $" + totalCost +"!");



    }
}