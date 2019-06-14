package com.exadel.beanpractice.provider;

import com.exadel.beanpractice.user.model.UserModel;

public interface Provider {

	UserModel getById(Integer id);
}
