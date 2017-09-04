public class ProjectTest {
    public static void main(String[] args){
        // Create four Projects in the four different ways
        Project project = new Project();
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", "This is the project's description.");
        Project project4 = new Project("Fourth Project", 25000, "This project is going to be EXPENSIVE.");

        // Create a new portfolio
        Portfolio portfolio = new Portfolio();

        // Set the name, description, and initialCost of the first project created
        project.setName("My first project ever!");
        project.setDescription("This is an awesome description.");
        project.setInitialCost(400);

        // Print the name and descript of project3
        // System.out.println(project3.getName());
        // System.out.println(project3.getDescription());

        // Print the information of all the projects
        // project.elevatorPitch();
        // project2.elevatorPitch();
        // project3.elevatorPitch();
        // project4.elevatorPitch();

        // Add all four projects to the portfolio
        portfolio.addProject(project);
        portfolio.addProject(project2);
        portfolio.addProject(project3);
        portfolio.addProject(project4);

        // Prints the total cost of the Projects in the Portfolio
        // System.out.println(portfolio.getPortfolioCost());
        
        // Shows the information of all projects in the portfolio and the portfolio's total cost
        portfolio.showPortfolio();
    }
}
