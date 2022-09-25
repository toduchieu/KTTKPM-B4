package com.spring_data_jpa.spring_data_jpa.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	@Column(name = "MaNV")
	private String maNv;
	@Column(name = "Ten")
	private String ten;
	@Column(name = "Luong")
	private int luong;

	
	public String getMaNv() {
		return maNv;
	}

	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	@Override
	public String toString() {
		return "NhanVien [maNv=" + maNv + ", ten=" + ten + ", luong=" + luong + "]";
	}

}


