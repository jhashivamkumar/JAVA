public class Project {
    // Sets project's fields
    private String name;
    private String description;
    private double initialCost;
    // Overload the constructor method depending on the information given during instantiation of the Project object.
    public Project() {
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, double initialCost, String description){
        this.name = name;
        this.initialCost = initialCost;
        this.description = description;
    }
    // prints the information of the Project object
    public void elevatorPitch(){
        System.out.println(name+" ("+initialCost+"): "+description);
    }
    // Sets the Project's name
    public void setName(String name){
        this.name = name;
    }
    // Sets the Project's description
    public void setDescription(String description){
        this.description = description;
    }
    // Sets the Project's initialCost
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
    // Returns the name of the Project
    public String getName() {
        return name;
    }
    // Returns the description of the Project
    public String getDescription() {
        return description;
    }
    // Returns the initialCost of the Project
    public double getInitialCost(){
        return initialCost;
    }
}
