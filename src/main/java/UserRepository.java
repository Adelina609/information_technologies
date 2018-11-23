
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class UserRepository {

    private static final String ADD = "INSERT INTO user (email, password) VALUES (?, ?)";
    private static final String GET_USER_BY_ID = "SELECT* FROM user WHERE user.email =?";
    private static final String DELETE = "DELETE FROM user WHERE user.email = ?";
    private static final String GET_USERS = "SELECT* FROM user";
//    private static String path
//            = "C:\\Users\\Аделя\\IdeaProjects\\reg_form_1\\src\\main\\webapp\\resources\\BD.txt";
    private static Connection con;

    private static void initDB() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/contactdb";
        String login = "postgres";
        String password = "postgres";
        con = DriverManager.getConnection(url, login, password);
    }

    public static void add(User userDB){
        try {
            initDB();
            try {
                PreparedStatement ps = con.prepareStatement(ADD);
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

    public static User getUserByEmail(String thisemail) throws SQLException, ClassNotFoundException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
        while (rs.next()) {
            String str = rs.getString("contact_id") + ":" + rs.getString(2);
            System.out.println("Contact:" + str);
        }
        rs.close();
        stmt.close();
    }
}