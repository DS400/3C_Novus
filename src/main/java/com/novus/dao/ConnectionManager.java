/*------------------------------------------------------------------------------
 * 演習番号：[総合演習]
 * クラス名：[ConnectionManager]
 * 作成日  ：[2021/08/30]
 * 作成者  ：[K.Nakashima/SYS]
 *------------------------------------------------------------------------------
 * 修正履歴 (発注No. ： 修正日 ： 担当者 ： 修正内容)
 *------------------------------------------------------------------------------
 */

package com.novus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConnectionManagerクラス。
 * <p>
 * DB接続を行う。
 * </p>
 * @author K.nakashima/SYS
 */
public class ConnectionManager {
	/** DB接続情報（ドライバ名） */
	public static final String JDBC_DRIVER_NAME = "com.mysql.jdbc.Driver";

	/** DB接続情報（URL） */
	private static final String URL = "jdbc:mysql://localhost:3306/final_exercise_db?allowPublicKeyRetrieval=true&useSSL=false";

	/** DB接続情報（ユーザー名） */
	private static final String USER = "user_name";

	/** DB接続情報（パスワード） */
	private static final String PASSWORD = "mysql";

	/**
	  * コネクションメソッド。
	  * <p>
	  * 接続情報からDB接続を行う。
	  * </p>
	  * @return con コネクション接続
	  * @throws SQLException SQL例外
	  */
	public static synchronized Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
