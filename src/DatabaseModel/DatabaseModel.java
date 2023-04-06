package DatabaseModel;

import javax.swing.*;
import java.sql.*;
import DatabaseView.*;
import sun.security.util.Length;

public class DatabaseModel {
    public static void main(String[] args) {
        Connection conn = null;
        String user = "te20";

        DatabaseModel m;
        DatabaseView v;

        JPasswordField pf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String password = new String(pf.getPassword());

        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? " +
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //LOGGA IN MED ANVÄNDARE


        String SQLQuery;

        JTextField User = new JTextField();
        JPasswordField UserPassword = new JPasswordField();
        JOptionPane.showConfirmDialog(null, User, "Username?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null, UserPassword, "Password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String username = new String(User) = SQLQuery = "SELECT * FROM tb02users WHERE name = ?, [username]";
        String pwd = new String(UserPassword.getPassword());

             try {
                 conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? " +
                         "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", username, pwd);
                 for {
                     pwd, username
                     if {
                         pwd && username.matches(true)
                    catch(SQLException e){
                             e.printStackTrace();
                         }
                     }
                 }
             }

        try {
            Statement stmt = conn.createStatement();
            SQLQuery = "SELECT * FROM tb02forum";
            ResultSet result = stmt.executeQuery(SQLQuery);

            ResultSetMetaData metadata = result.getMetaData();

            int numCols = metadata.getColumnCount();
            for (int i = 1; i <= numCols; i++) {
                System.out.println(metadata.getColumnClassName(i));
            }

            while (result.next()) {
                String output = "";
                output += result.getInt("id") + ", " +
                        result.getString("createdAt") + ", " +
                        result.getString("title") + ", Content: " +
                        result.getString("content");
                System.out.println(output);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
