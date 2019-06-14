package com.exadel.beanpractice.user.generator;

import com.exadel.beanpractice.common.interfaces.Generator;
import com.exadel.beanpractice.user.model.UserModel;

public class UserGenerator implements Generator<UserModel> {

	@Override
	public UserModel generate() {
		return UserModel.builder()
				.firstName("firstName")
				.lastName("lastName")
				.build();
	}
}
