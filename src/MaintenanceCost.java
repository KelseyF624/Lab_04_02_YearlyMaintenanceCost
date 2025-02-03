//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaintenanceCost{
    public static void main(String[] args) {
        double summerCost = 1000.21;
        double winterCost = 1250.21;
        double springCost = 1253.92;
        double fallCost = 1254.92;
        System.out.println("The summer cost is: " + summerCost);
        System.out.println("The winter cost is: " + winterCost);
        System.out.println("The spring cost is: " + springCost);
        System.out.println("The fall cost is: " + fallCost);
        double sum = summerCost + winterCost + springCost + fallCost;
        System.out.println("The total yearly maintenance cost is: " + sum);
        }
    }