package chess.dao;

import chess.domain.game.User;

import java.sql.*;

public class UserDao {
    public Connection getConnection() {
        Connection connection = null;
        String server = "localhost:3306"; // MySQL 서버 주소
        String database = "chess"; // MySQL DATABASE 이름
        String option = "?useSSL=false&serverTimezone=UTC";
        String userName = "user"; //  MySQL 서버 아이디
        String password = "password"; // MySQL 서버 비밀번호

        // 드라이버 로딩
        loadDriver();

        // 드라이버 연결
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + option, userName, password);
            System.out.println("정상적으로 연결되었습니다.");
        } catch (SQLException e) {
            System.err.println("연결 오류:" + e.getMessage());
            e.printStackTrace();
        }

        return connection;
    }

    private void loadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! JDBC Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 드라이버 연결해제
    public void closeConnection(Connection con) {
        try {
            if (con != null)
                con.close();
        } catch (SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
        }
    }

    public void addUser(User user) throws SQLException {
        String query = "INSERT INTO user VALUES (?, ?)";
        PreparedStatement pstmt = getConnection().prepareStatement(query);
        pstmt.setString(1, user.getUserId());
        pstmt.setString(2, user.getName());
        pstmt.executeUpdate();
    }

    public User findByUserId(String userId) throws SQLException {
        String query = "SELECT * FROM user WHERE user_id = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(query);
        pstmt.setString(1, userId);
        ResultSet rs = pstmt.executeQuery();

        if (!rs.next()) return null;

        return new User(
                rs.getString("user_id"),
                rs.getString("name"));
    }
}