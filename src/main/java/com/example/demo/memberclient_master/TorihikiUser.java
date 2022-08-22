package com.example.demo.memberclient_master;


import lombok.Data;

@Data
public class TorihikiUser {
	private int kaiinId; //会員ID
	private int ppNo; //パチンコ店ID
	private String ppNm; //パチンコ店名
	private String telNo ;//電話番号
	private String addNo; //郵便番号
	private String add1; //住所（都道府県）
	private String add2; //住所（区市町村）
	private String add3; //住所（番地）
	public int getKaiinId() {
		return kaiinId;
	}
	public void setKaiinId(int kaiinId) {
		this.kaiinId = kaiinId;
	}
	public int getPpNo() {
		return ppNo;
	}
	public void setPpNo(int ppNo) {
		this.ppNo = ppNo;
	}
	public String getPpNm() {
		return ppNm;
	}
	public void setPpNm(String ppNm) {
		this.ppNm = ppNm;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getAddNo() {
		return addNo;
	}
	public void setAddNo(String addNo) {
		this.addNo = addNo;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	

}