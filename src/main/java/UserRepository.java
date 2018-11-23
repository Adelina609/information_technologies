
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class UserRepository {
    private static String path
            = "C:\\Users\\Аделя\\IdeaProjects\\reg_form_1\\src\\main\\webapp\\resources\\BD.txt";

    public static void add(User userDB){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/contactdb";
            String login = "postgres";
            String password = "postgres";
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                String sql = "INSERT INTO user (email, password) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, userDB.getEmail());
                ps.setString(2, userDB.getPassword());
                ps.executeQuery();
                ResultSet resultSet = ps.executeQuery();
                resultSet.close();
                ps.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try(FileWriter writer = new FileWriter(path, true)){
//            writer.write("email=" + user.getEmail() + "; " +
//                    "password=" + user.getPassword() + "; " +
////                    "country=" + user.getCountry() + "; " +
////                    "sex=" + user.isSex() + "; " +
////                    "dateOfBirth=" + user.getBirthDate() + "; " +
////                    "subscription=" + user.isSubsription());
//            writer.append("\n"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}