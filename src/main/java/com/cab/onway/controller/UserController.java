package com.cab.onway.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cab.onway.common.response.ObjectResponse;
import com.cab.onway.constants.ResponseCode;
import com.cab.onway.constants.ResponseMsg;
import com.cab.onway.constants.ResponseMsg.ResponseMsgType;
import com.cab.onway.dao.UserDao;
import com.cab.onway.model.Location;
import com.google.gson.Gson;

@RestController
public class UserController {
	Gson gson = new Gson();

	@RequestMapping(value = "/user/location", method = RequestMethod.POST)
	public ObjectResponse setLocation(@RequestBody String data, HttpServletRequest request) {
		ObjectResponse response = new ObjectResponse();
		if (data != null) {
			try {

				Location location = gson.fromJson(data, Location.class);
				if (location != null) {
					UserDao.saveLocation(location);
					response.setStatus(ResponseCode.SUCCESS);
					response.setMsg("Location Successsfully updated");
				} else {
					response.setStatus(ResponseCode.FAILED);
					response.setEd("Not a valid post data");
				}

			} catch (Exception e) {
				System.out.println(e);
				response.setStatus(ResponseCode.FAILED);
				response.setEd(e.getMessage());
			}
		} else {
			ResponseMsg.buildResponseMsg(response, ResponseMsgType.INFONOTRECIEVED);
		}
		return response;

	}

	@RequestMapping("/user/get")
	public String index() {
		return "Hello Nayan";
	}

}
