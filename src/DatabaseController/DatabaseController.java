package DatabaseController;

import javax.swing.*;
import DatabaseView.*;
import DatabaseModel.*;

public class DatabaseController {
    private DatabaseModel m;
    private DatabaseView v;

    public DatabaseController(DatabaseModel m, DatabaseView v) {
        this.m = m;
        this.v = v;

        JFrame frame = new JFrame();
        frame.setTitle("Forum");
        frame.setContentPane(v.getFrame());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        DatabaseModel m = new DatabaseModel();
        DatabaseView v = new DatabaseView();
        DatabaseController c = new DatabaseController(m,v);
    }
}
