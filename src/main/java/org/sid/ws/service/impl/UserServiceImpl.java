package org.sid.ws.service.impl;

import org.sid.dto.UserDto;
import org.sid.entities.UserEntity;
import org.sid.repository.UserRepository;
import org.sid.ws.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto CreateUser(UserDto user) {
	
		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptePassword("password crypt");
		userEntity.setUserid("id de user");
		UserEntity newUser=userRepository.save(userEntity);
		UserDto userDto=new UserDto();
		BeanUtils.copyProperties(newUser, userDto);
		return userDto;
	}

}
