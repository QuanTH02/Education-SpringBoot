package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diem")
public class Diem {

	@Id
	@Column(name = "MSSV")
	private Long mssv;
	
	@Column(name = "Ma_hoc_phan")
	private String maHocPhan;
	
	@Column(name = "Ten_hoc_phan")
	private String tenHocPhan;
	
	@Column(name = "Diem_GK")
	private Float diemGK;
	
	@Column(name = "Diem_CK")
	private Float diemCK;
	
	@Column(name = "Diem_tong_ket_so")
	private Float diemTongKetSo;
	
	@Column(name = "Diem_tong_ket_thang_4")
	private String diemTongKetChu;
	
	public Diem() {
		
	}

	public Diem(Long mssv, String maHocPhan, String tenHocPhan, Float diemGK, Float diemCK, Float diemTongKetSo,
			String diemTongKetChu) {
		super();
		this.mssv = mssv;
		this.maHocPhan = maHocPhan;
		this.tenHocPhan = tenHocPhan;
		this.diemGK = diemGK;
		this.diemCK = diemCK;
		this.diemTongKetSo = diemTongKetSo;
		this.diemTongKetChu = diemTongKetChu;
	}

	public Long getMssv() {
		return mssv;
	}

	public void setMssv(Long mssv) {
		this.mssv = mssv;
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

	public Float getDiemTongKetSo() {
		return diemTongKetSo;
	}

	public void setDiemTongKetSo(Float diemTongKetSo) {
		this.diemTongKetSo = diemTongKetSo;
	}

	public String getDiemTongKetChu() {
		return diemTongKetChu;
	}

	public void setDiemTongKetChu(String diemTongKetChu) {
		this.diemTongKetChu = diemTongKetChu;
	}
	
}
