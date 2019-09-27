package com.cab.onway.common.response;

import java.util.Date;

import com.cab.onway.constants.ResponseCode;



public class GenericResponse {

	public String id;

	public Date createDate;

	public Date lastUpdate;

	public String ed;

	public String msg;

	public ResponseCode status;

	public ResponseCode getStatus() {
		return status;
	}

	public void setStatus(ResponseCode status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getEd() {
		return ed;
	}

	public void setEd(String ed) {
		this.ed = ed;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
