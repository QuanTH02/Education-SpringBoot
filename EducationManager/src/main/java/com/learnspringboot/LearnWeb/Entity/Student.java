package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student{

	@Column(name = "MSSV")
	private Long mssv;
	
	@Column(name = "Ho_sinh_vien")
	private String hoSinhVien;
	
	@Column(name = "Ten_sinh_vien")
	private String tenSinhVien;
	
	@Column(name = "GPA")
	private Float gpa;
	
	@Column(name = "Ngay_sinh")
	private Long ngaySinh;
	
	@Column(name = "Gioi_tinh")
	private String gioiTinh;
	
	@Column(name = "So_dien_thoai")
	private String soDienThoai;
	
	@Column(name = "Gmail")
	private String gmail;
	
	@Column(name = "So_tien_hien_tai")
	private Long soTienHienTai;
	
	@Id
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "Hoc_phi_can_dong")
	private Long hocPhiCanDong;
	
	public Student() {
		
	}

	public Student(Long mssv, String hoSinhVien, String tenSinhVien, Float gpa, Long ngaySinh, String gioiTinh,
			String soDienThoai, String gmail, Long soTienHienTai, String username, Long hocPhiCanDong) {
		super();
		this.mssv = mssv;
		this.hoSinhVien = hoSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.gpa = gpa;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.gmail = gmail;
		this.soTienHienTai = soTienHienTai;
		this.username = username;
		this.hocPhiCanDong = hocPhiCanDong;
	}

	public Long getMssv() {
		return mssv;
	}

	public void setMssv(Long mssv) {
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

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}

	public Long getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Long ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Long getSoTienHienTai() {
		return soTienHienTai;
	}

	public void setSoTienHienTai(Long soTienHienTai) {
		this.soTienHienTai = soTienHienTai;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getHocPhiCanDong() {
		return hocPhiCanDong;
	}

	public void setHocPhiCanDong(Long hocPhiCanDong) {
		this.hocPhiCanDong = hocPhiCanDong;
	}
	
	
}
