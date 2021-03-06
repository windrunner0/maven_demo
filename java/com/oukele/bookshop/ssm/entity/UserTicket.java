package com.oukele.bookshop.ssm.entity;

/**
 * 用户参与票务信息实体类
 * 
 * @author zhengpeng
 * 
 */
public class UserTicket {

	private String userid;
	private String username;
	private String did;
	private String ticketdid;
	private String haddress;
	private String taddress;
	private String caddress;
	private String publickey;
	private String privatekey;
	/*持票状态 1：持有中     2：转让中    3：已转让    */
	private String remark;

	public UserTicket() {

	}

	public UserTicket(String userid, String username, String did,
			String ticketdid, String haddress, String taddress,
			String caddress, String publickey, String privatekey, String remark) {
		this.userid = userid;
		this.username = username;
		this.did = did;
		this.ticketdid = ticketdid;
		this.taddress = taddress;
		this.caddress = caddress;
		this.publickey = publickey;
		this.privatekey = privatekey;
		this.remark = remark;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getTicketdid() {
		return ticketdid;
	}

	public void setTicketdid(String ticketdid) {
		this.ticketdid = ticketdid;
	}

	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public String getTaddress() {
		return taddress;
	}

	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getPublickey() {
		return publickey;
	}

	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}

	public String getPrivatekey() {
		return privatekey;
	}

	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}