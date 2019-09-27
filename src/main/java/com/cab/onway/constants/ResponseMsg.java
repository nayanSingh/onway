package com.cab.onway.constants;

import com.cab.onway.common.response.GenericResponse;

public class ResponseMsg {

	public enum ResponseMsgType {
		NOID, CREATED, UPDATED, DLEATED, EMPTYLIST, NODATA, INFONOTRECIEVED, INVALIDREQUEST, NOTLOGIN, ALREADYEXIST
	}

	public static void buildResponseMsg(GenericResponse response,
			ResponseMsgType rsponseMsgType) {
		String msg = null;
		switch (rsponseMsgType) {
		case CREATED:
			msg = "Successfully created";
			response.setStatus(ResponseCode.SUCCESS);
			break;
		case UPDATED:
			msg = "Successfully updated";
			response.setStatus(ResponseCode.SUCCESS);
			break;
		case DLEATED:
			msg = "Successfully deleted";
			response.setStatus(ResponseCode.SUCCESS);
			break;
		case EMPTYLIST:
			msg = "No records found";
			response.setStatus(ResponseCode.SUCCESS);
			break;
		case NOID:
			msg = "Id Not Found";
			response.setStatus(ResponseCode.FAILED);
			break;
		case NODATA:
			msg = "No data found with this id";
			response.setStatus(ResponseCode.FAILED);
			break;
		case INFONOTRECIEVED:
			msg = "Information not recived";
			response.setStatus(ResponseCode.FAILED);
			break;
		case INVALIDREQUEST:
			msg = "Invalide request";
			response.setStatus(ResponseCode.FAILED);
			break;
		case NOTLOGIN:
			msg = "User not loged in";
			response.setStatus(ResponseCode.FAILED);
			break;
		case ALREADYEXIST:
			msg = "This record already exist";
			response.setStatus(ResponseCode.FAILED);
			break;
		default:
			break;
		}
		response.setMsg(msg);

	}

}
