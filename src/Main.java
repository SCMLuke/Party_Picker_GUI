import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int power = 1;
        ArrayList<Friend> guestlist = new ArrayList<>();

        while (power ==1) {
            String name = JOptionPane.showInputDialog("Enter the name of the guest: ");
            String food = JOptionPane.showInputDialog("Enter the name of the food the guest will bring: ");
            int invited = JOptionPane.showConfirmDialog(null, "Are they invited?");
            boolean isInvited = invited == JOptionPane.YES_OPTION;

            Friend friend = new Friend(name, isInvited, food);
            guestlist.add(friend);
            int another = JOptionPane.showConfirmDialog(null, "Add another guest?", "Add Guest", JOptionPane.YES_NO_OPTION);
            if (another == JOptionPane.NO_OPTION) {
                power = 0;
            }
        }
        StringBuilder report = new StringBuilder();
        for (Friend friend : guestlist) {
            report.append(friend.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, report.toString(), "Party Guest List", JOptionPane.INFORMATION_MESSAGE);

    }
}