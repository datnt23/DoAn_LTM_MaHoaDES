/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Admin
 */
public class Des {
	public String Encrypt(String plainTextString) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
		String SecretKey = "12345678";	//Tạo mã khoá
		SecretKeySpec sks = new SecretKeySpec(SecretKey.getBytes(), "DES");	//Tạo khoá mã hoá
		System.out.println(sks);
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");	//Tạo đối tượng Cipher để mã hoá.
		cipher.init(Cipher.ENCRYPT_MODE, sks);	//Chọn phương thức mã hoá Encrypt.
		byte[] chuoiEncrypt = cipher.doFinal(plainTextString.getBytes());	//Đưa chuỗi vào thực hiện mã hoá và lưu dạng chuỗi trên byte
		String encrypted = Base64.getEncoder().encodeToString(chuoiEncrypt);	//Chuyển mã chuỗi byte thành mã dạng base64 để hiển thị
		return encrypted;
	}
	public String Decrypt(String cipherTextString) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException{
		String SecretKey = "12345678";
		SecretKeySpec sks = new SecretKeySpec(SecretKey.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, sks);	//Chọn phương thức giải mã Decrypt
		byte[] chuoiDecrypt = cipher.doFinal(Base64.getDecoder().decode(cipherTextString));	//Đọc mã từ chuỗi đưa vào và giải mã lưu sang dạng chuỗi byte
		String decrypted = new String(chuoiDecrypt, "UTF-8");
		return decrypted;
	}
}
