package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Column(name = "Ho_giang_vien")
	private String hoGiangVien;
	
	@Column(name = "Ten_giang_vien")
	private String tenGiangVien;
	
	@Id
	@Column(name = "Ma_giang_vien")
	private String maGiangVien;
	
	@Column(name = "Nam_sinh")
	private Long namSinh;
	
	@Column(name = "So_dien_thoai")
	private String soDienThoai;
	
	@Column(name = "Gmail")
	private String gmail;
	
	@Column(name = "Hoc_phan_giang_day")
	private String hocPhanGiangDay;
	
	@Column(name = "user_name")
	private String username;
	
	public Teacher() {
		
	}

	public Teacher(String hoGiangVien, String tenGiangVien, String maGiangVien, Long namSinh, String soDienThoai,
			String gmail, String hocPhanGiangDay, String username) {
		super();
		this.hoGiangVien = hoGiangVien;
		this.tenGiangVien = tenGiangVien;
		this.maGiangVien = maGiangVien;
		this.namSinh = namSinh;
		this.soDienThoai = soDienThoai;
		this.gmail = gmail;
		this.hocPhanGiangDay = hocPhanGiangDay;
		this.username = username;
	}

	public String getHoGiangVien() {
		return hoGiangVien;
	}

	public void setHoGiangVien(String hoGiangVien) {
		this.hoGiangVien = hoGiangVien;
	}

	public String getTenGiangVien() {
		return tenGiangVien;
	}

	public void setTenGiangVien(String tenGiangVien) {
		this.tenGiangVien = tenGiangVien;
	}

	public String getMaGiangVien() {
		return maGiangVien;
	}

	public void setMaGiangVien(String maGiangVien) {
		this.maGiangVien = maGiangVien;
	}

	public Long getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(Long namSinh) {
		this.namSinh = namSinh;
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

	public String getHocPhanGiangDay() {
		return hocPhanGiangDay;
	}

	public void setHocPhanGiangDay(String hocPhanGiangDay) {
		this.hocPhanGiangDay = hocPhanGiangDay;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
