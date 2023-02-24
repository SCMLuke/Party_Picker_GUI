public class Friend extends Person {
    private String food;

    public Friend (String fName, boolean isInvited, String food) {
        super(fName,"",isInvited);
        this.food = food;
    }

    public String toString() {
        String invitedOutput = isInvited()?"They are invited.":"They are NOT invited.";
        return fullName()+" wants to bring "+food+". "+invitedOutput;
    }
}
