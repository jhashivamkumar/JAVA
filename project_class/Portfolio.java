import java.util.ArrayList;

public class Portfolio {
    // Creates a new ArrayList of Project objects
    ArrayList<Project> projects = new ArrayList<>();
    // Adds a Project object to the projects ArrayList
    public void addProject(Project project) {
        this.projects.add(project);
    }
    // Sums and returns the initialCost of all the Project objects in the Portfolio ArrayList of Project objects.
    public double getPortfolioCost() {
        double cost = 0;
        for(Project project: this.projects){
            cost += project.getInitialCost();
        }
        return cost;
    }
    // Prints the elevatorPitch for all Project objects in the Portfolio ArrayList then prints the cost of the entire Portfolio.
    public void showPortfolio() {
        System.out.println("PORTFOLIO PROJECTS:");
        for(Project project: this.projects){
            project.elevatorPitch();
        }
        System.out.println("PORTFOLIO COST: $"+getPortfolioCost());
    }
}
