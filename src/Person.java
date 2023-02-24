public class Person {
    private String fName;
    private String lName;
    private boolean isInvited;

    public Person (String fName, String lName, boolean isInvited) {
        this.fName = fName;
        this.lName = lName;
        this.isInvited = isInvited;
    }

    public boolean isInvited() {
        return isInvited;
    }
    public String fullName() {
        return fName+""+lName;
    }
}
