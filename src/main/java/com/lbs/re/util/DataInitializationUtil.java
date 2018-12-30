package com.lbs.re.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.lbs.re.data.service.REUserService;
import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.ReUser;

@Component
public class DataInitializationUtil {

	@Autowired
	private REUserService userService;

	public void loadInitialData() throws LocalizedException {
		if (userService.getAll().isEmpty()) {
			loadUserData();
		}
	}

	private void loadUserData() throws LocalizedException {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		ReUser user = new ReUser();
		user.setUsername("admin");
		user.setPassword(passwordEncoder.encode("2018Logo"));
		userService.save(user);
	}

}
