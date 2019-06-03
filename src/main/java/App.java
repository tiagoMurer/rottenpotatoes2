import DataBase.DataBase;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class App {
    public static void main(String[] args) throws Exception {
        DataBase db = new DataBase();
        db.connectDb();
    }
}
