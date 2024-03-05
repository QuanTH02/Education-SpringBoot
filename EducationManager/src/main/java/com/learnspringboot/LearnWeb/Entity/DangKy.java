package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dang_ky")
public class DangKy {
	
	@Column(name = "Ma_hoc_phan")
	private String maHocPhan;
	
	@Id
	@Column(name = "MSSV")
	private Long mssv;
	
	@Column(name = "Ma_lop")
	private String maLop;
	
	public DangKy() {
		
	}

	public DangKy(String maHocPhan, Long mssv, String maLop) {
		super();
		this.maHocPhan = maHocPhan;
		this.mssv = mssv;
		this.maLop = maLop;
	}

	public String getMaHocPhan() {
		return maHocPhan;
	}

	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}

	public Long getMssv() {
		return mssv;
	}

	public void setMssv(Long mssv) {
		this.mssv = mssv;
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	
	
}
