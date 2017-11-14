package database;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.*;

public class Database {

	private static DataSource dataSource = null;
	private static Context context = null;

	public static DataSource databaseConnection() {

		if (dataSource != null) {
			return dataSource;
		}

		try {
			if (context == null) {
				context = new InitialContext();
			}

			dataSource = (DataSource) context.lookup("matches");

		} catch (NamingException e) {
			e.printStackTrace();
		}

		return dataSource;
	}

}
