/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UDPServer {
	
	static final int Port = 1234; 
	private DatagramSocket server = null;
	
	public UDPServer(){
		try {
			server = new DatagramSocket(Port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public DatagramPacket receive() throws IOException{
		byte[] buffer = new byte[65507];
		DatagramPacket receiveData = new DatagramPacket(buffer, buffer.length);
		server.receive(receiveData);
		return receiveData;
	}
	public void send(String chuoi, InetAddress host, int port) throws IOException{
		byte[] buffer = chuoi.getBytes();
		DatagramPacket sendData = new DatagramPacket(buffer, buffer.length, host, port);
		server.send(sendData);
	}
	public void action(){
		InetAddress host = null;
		int port;
		SQLServerConnection con = null;
		String chuoi = "";
		try {
			System.out.println("Server is listening...");
			while (true) {				
				DatagramPacket receiveData = receive();
				host = receiveData.getAddress();
				port = receiveData.getPort();
				String inputStream = new String(receiveData.getData()).trim();
				System.out.println(inputStream);
				if(!inputStream.equals(" ")){
					Scanner sc = new Scanner(inputStream);
					sc.useDelimiter("#");
					String lenh = sc.next();
					switch (lenh) {
						case "ConnectToServer":
							System.out.println("Client connect: ip:"+host+" on port:"+port);
							send("Kết nối server thành công!!!", host, port);
							break;
						case "ConneectToDatabase":
							String nameDB = sc.next();
							int cong = sc.nextInt();
							String user = sc.next();
							String pass = sc.next();
							try {
								con = new SQLServerConnection(nameDB, cong, user, pass);
							} catch (Exception e) {
								e.printStackTrace();
							}
							send("Kết nối với CSDL SQL Server thành công!", host, port);
							break;
						case "SendFromSinhVien":
							String hoTen, mssv;
							float diemToan, diemVan, diemTA;
							hoTen = sc.next();
							mssv = sc.next();
							diemToan = Float.parseFloat(sc.next());
							diemVan = Float.parseFloat(sc.next());
							diemTA = Float.parseFloat(sc.next());
							Student st = new Student(hoTen, mssv, diemToan, diemVan, diemTA);
							Float dtb = (st.getDiemToan()+st.getDiemVan()+st.getDiemTA())/3;
							String s = String.valueOf(dtb);
							st = con.ListStudent(st);	//Lưu vào CSDL và lấy ra
							String sendData = hoTen+"#"+mssv+"#"+diemToan+"#"+diemVan+"#"+diemTA+"#"+s;
							send(sendData, host, port);
							break;
						default:
							break;
					}
				}
			}
		} catch (Exception e) {
		}finally{
			server.close();
		}
	}
	public static void main(String[] args) {
		new UDPServer().action();
	}
}