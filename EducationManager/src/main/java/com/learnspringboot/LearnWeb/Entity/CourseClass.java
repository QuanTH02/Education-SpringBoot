package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_class")
public class CourseClass {
	@Column(name = "Ma_hoc_phan")
	private String maHocPhan;
	
	@Column(name = "Ten_hoc_phan")
	private String tenHocPhan;
	
	@Id
	@Column(name = "Ma_lop")
	private String maLop;
	
	@Column(name = "Ho_giang_vien")
	private String hoGiangVien;
	
	@Column(name = "Ten_giang_vien")
	private String tenGiangVien;
	
	@Column(name = "Tiet_bat_dau")
	private Integer tietBatDau;
	
	@Column(name = "Tiet_ket_thuc")
	private Integer tietKetThuc;
	
	@Column(name = "Thu")
	private Integer thu;
	
	@Column(name = "So_luong_sinh_vien")
	private Long soLuongSinhVien;
	
	@Column(name = "Ma_giang_vien")
	private String maGiangVien;
	
	public CourseClass() {
		
	}

	public CourseClass(String maHocPhan, String tenHocPhan, String maLop, String hoGiangVien, String tenGiangVien,
			Integer tietBatDau, Integer tietKetThuc, Integer thu, Long soLuongSinhVien, String maGiangVien) {
		super();
		this.maHocPhan = maHocPhan;
		this.tenHocPhan = tenHocPhan;
		this.maLop = maLop;
		this.hoGiangVien = hoGiangVien;
		this.tenGiangVien = tenGiangVien;
		this.tietBatDau = tietBatDau;
		this.tietKetThuc = tietKetThuc;
		this.thu = thu;
		this.soLuongSinhVien = soLuongSinhVien;
		this.maGiangVien = maGiangVien;
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

	public Integer getTietBatDau() {
		return tietBatDau;
	}

	public void setTietBatDau(Integer tietBatDau) {
		this.tietBatDau = tietBatDau;
	}

	public Integer getTietKetThuc() {
		return tietKetThuc;
	}

	public void setTietKetThuc(Integer tietKetThuc) {
		this.tietKetThuc = tietKetThuc;
	}

	public Integer getThu() {
		return thu;
	}

	public void setThu(Integer thu) {
		this.thu = thu;
	}

	public Long getSoLuongSinhVien() {
		return soLuongSinhVien;
	}

	public void setSoLuongSinhVien(Long soLuongSinhVien) {
		this.soLuongSinhVien = soLuongSinhVien;
	}

	public String getMaGiangVien() {
		return maGiangVien;
	}

	public void setMaGiangVien(String maGiangVien) {
		this.maGiangVien = maGiangVien;
	}
	
	
}
