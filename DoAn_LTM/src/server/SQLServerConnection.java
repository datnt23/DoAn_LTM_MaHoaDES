/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.sql.*;
import javax.swing.JOptionPane;
import server.Des;

/**
 *
 * @author Admin
 */
public class SQLServerConnection {
	private Connection con;
//	public Connection getConnection(){
//		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			String url = "jdbc:sqlserver://localhost:1433;Database=quanlysinhvien;user=datnt;password=1234";
//			con = DriverManager.getConnection(url);
//			return con;
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
//			return null;
//		}
//	}
	public SQLServerConnection(String nameDB, int cong, String user, String pass){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:"+cong+";Database="+nameDB+";user="+user+";password="+pass;
			con = DriverManager.getConnection(url);
			System.out.println("Kết nối database thành công!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public Student ListStudent(Student s){
		//Lưu Sinh viên vào csdl:
		Des des = new Des();
		String sqlAdd = "insert into SinhVien(HoTen,MSSV,DiemToan,DiemVan,DiemTA) VALUES (?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sqlAdd);
			ps.setString(1, des.Encrypt(s.getHoTen()));
			ps.setString(2, des.Encrypt(s.getMssv()));
			ps.setFloat(3, (s.getDiemToan()));
			ps.setFloat(4, (s.getDiemVan()));
			ps.setFloat(5, (s.getDiemTA()));
			ps.executeUpdate();	//thực hiện cập nhật vào database
			System.out.println("Thêm sinh viên vào database thành công!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Lấy từ Sinh viên từ csdl gửi lại cho client
		try {
			String sqlMove = "select HoTen,MSSV,DiemToan,DiemVan,DiemTA from SinhVien where MSSV='" + des.Encrypt(s.getMssv()) + "'";

			PreparedStatement ps = con.prepareStatement(sqlMove);
			ResultSet rs = ps.executeQuery();	//Truy vấn từng record
			rs.next();
			Student st = new Student();
			st.setHoTen(des.Decrypt(rs.getString("HoTen")));
			st.setMssv(des.Decrypt(rs.getString("MSSV")));
			st.setDiemToan(rs.getFloat("DiemToan"));
			st.setDiemVan(rs.getFloat("DiemVan"));
			st.setDiemTA(rs.getFloat("DiemTA"));
			System.out.println("Lấy sinh viên từ database thành công!");
			//gửi sinh viên về rồi hiện lên
			return st;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
