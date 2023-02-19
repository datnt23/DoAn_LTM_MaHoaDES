/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
	private String hoTen, mssv;
	private float  diemToan, diemVan, diemTA;

	public Student(String hoTen, String mssv, float diemToan, float diemVan, float diemTA) {
		this.hoTen = hoTen;
		this.mssv = mssv;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemTA = diemTA;
	}
	
	public Student(){
		
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemTA() {
		return diemTA;
	}

	public void setDiemTA(float diemTA) {
		this.diemTA = diemTA;
	}
	
}
