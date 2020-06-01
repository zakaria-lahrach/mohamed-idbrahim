package org.sid.controller;

import java.io.Serializable;

import org.sid.dto.UserDto;
import org.sid.request.UserRequest;
import org.sid.response.UserReponse;
import org.sid.ws.service.UserService;
import org.sid.ws.service.impl.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String GetUser()
	{
		return null;
	}
	
	@PostMapping
	public UserReponse AddUser(@RequestBody UserRequest userRequest)
	{
		UserDto userDto=new UserDto();
	    BeanUtils.copyProperties(userRequest,userDto);
	    UserDto createuser=userService.CreateUser(userDto);
		UserReponse userReponse=new UserReponse();
		
		BeanUtils.copyProperties(createuser,userReponse);
		
		
		
		
		return userReponse;
	}
	
	@PutMapping
	public String EditUser()
	{
		return null;
	}
	
	@DeleteMapping
	public String DeleteUser()
	{
		return null;
	}

}
