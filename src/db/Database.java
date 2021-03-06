package db;

import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <pre>
 * Created by whd on 2014/12/1.
 * 提供了getConnection这个方法
 * </pre>
 */
public class Database {

    /**
     * 返回与数据库连接的一个connection
     * @return 与默认数据库的一个connection
     * @throws UnknownHostException
     * @throws SQLException
     */
    public static Connection getConnection() throws UnknownHostException, SQLException {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        String classUri = Database.class.getResource("").getPath().substring(1);
        String uri = Database.class.getResource("../../../Database/AccessDB.mdb").getFile().substring(1);
        //java 路径名含空格会变成%20
        uri = uri.replaceAll("%20", " ");
//            System.out.println(uri);
//        String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + classUri + "../../../Database/AccessDB.mdb";

//        System.out.println(url);
        String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + uri;
        return DriverManager.getConnection(url, "", "");
    }

}
