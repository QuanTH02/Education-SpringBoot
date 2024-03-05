package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "Ma_hoc_phan")
	private String maHocPhan;
	
	@Column(name = "Ten_hoc_phan")
	private String tenHocPhan;
	
	@Column(name = "Trong_so")
	private Float trongSo;
	
	@Column(name = "So_tin_hoc_phan")
	private Integer soTinHocPhan;
	
	@Column(name = "So_tin_hoc_phi")
	private Integer soTinHocPhi;
	
	@Column(name = "So_luong_dang_ky")
	private Long soLuongDangKy;
	
	public Course() {
		
	}

	public Course(String maHocPhan, String tenHocPhan, Float trongSo, Integer soTinHocPhan, Integer soTinHocPhi,
			Long soLuongDangKy) {
		super();
		this.maHocPhan = maHocPhan;
		this.tenHocPhan = tenHocPhan;
		this.trongSo = trongSo;
		this.soTinHocPhan = soTinHocPhan;
		this.soTinHocPhi = soTinHocPhi;
		this.soLuongDangKy = soLuongDangKy;
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

	public Float getTrongSo() {
		return trongSo;
	}

	public void setTrongSo(Float trongSo) {
		this.trongSo = trongSo;
	}

	public Integer getSoTinHocPhan() {
		return soTinHocPhan;
	}

	public void setSoTinHocPhan(Integer soTinHocPhan) {
		this.soTinHocPhan = soTinHocPhan;
	}

	public Integer getSoTinHocPhi() {
		return soTinHocPhi;
	}

	public void setSoTinHocPhi(Integer soTinHocPhi) {
		this.soTinHocPhi = soTinHocPhi;
	}

	public Long getSoLuongDangKy() {
		return soLuongDangKy;
	}

	public void setSoLuongDangKy(Long soLuongDangKy) {
		this.soLuongDangKy = soLuongDangKy;
	}
	
	
}
