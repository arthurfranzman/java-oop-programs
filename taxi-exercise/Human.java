public class Human {
    
    private String forename;
    private String name;
    
    public Human (String forename, String name) {
        this.forename = forename;
        this.name = name;
    }   
    public String getName() {
        return this.name;
    }
    public String getForename() {
        return this.forename;
    }
    public String getFullName() {
        return String.format("%s %s", this.forename, this.name);
    }
    @Override
    public String toString() {
        return getFullName();
    }
}