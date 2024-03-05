package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_class")
public class StudentClass {
	
	@Column(name = "Ma_hoc_phan")
	private String maHocPhan;
	
	@Column(name = "Ten_hoc_phan")
	private String tenHocPhan;
	
	@Column(name = "Ma_lop")
	private String maLop;
	
	@Id
	@Column(name = "MSSV")
	private Float mssv;
	
	@Column(name = "Ho_sinh_vien")
	private String hoSinhVien;
	
	@Column(name = "Ten_sinh_vien")
	private String tenSinhVien;
	
	@Column(name = "Diem_GK")
	private Float diemGK;
	
	@Column(name = "Diem_CK")
	private Float diemCK;
	
	public StudentClass() {
		
	}

	public StudentClass(String maHocPhan, String tenHocPhan, String maLop, Float mssv, String hoSinhVien,
			String tenSinhVien, Float diemGK, Float diemCK) {
		super();
		this.maHocPhan = maHocPhan;
		this.tenHocPhan = tenHocPhan;
		this.maLop = maLop;
		this.mssv = mssv;
		this.hoSinhVien = hoSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.diemGK = diemGK;
		this.diemCK = diemCK;
	}

	public String getMaHocPhan() {
		return maHocPhan;
	}

	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}

	public String getTenHocPhan() {
		return tenHocPhan;
	}

	public void setTenHocPhan(String tenHocPhan) {
		this.tenHocPhan = tenHocPhan;
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public Float getMssv() {
		return mssv;
	}

	public void setMssv(Float mssv) {
		this.mssv = mssv;
	}

	public String getHoSinhVien() {
		return hoSinhVien;
	}

	public void setHoSinhVien(String hoSinhVien) {
		this.hoSinhVien = hoSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public Float getDiemGK() {
		return diemGK;
	}

	public void setDiemGK(Float diemGK) {
		this.diemGK = diemGK;
	}

	public Float getDiemCK() {
		return diemCK;
	}

	public void setDiemCK(Float diemCK) {
		this.diemCK = diemCK;
	}
	
	
}
