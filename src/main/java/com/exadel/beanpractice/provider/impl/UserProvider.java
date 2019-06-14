package com.exadel.beanpractice.provider.impl;

import com.exadel.beanpractice.provider.Provider;
import com.exadel.beanpractice.user.generator.UserGenerator;
import com.exadel.beanpractice.user.model.UserModel;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

@SuppressWarnings("ALL")
@RequiredArgsConstructor
public class UserProvider implements Provider {

	private final UserGenerator userGenerator;

	private Map<Integer, UserModel> userModelMap;

	@Override
	public UserModel getById(Integer id) {
		return userModelMap.get(id);
	}

	private void onInit() {
		userModelMap = generateUserMap();
	}

	private Map<Integer, UserModel> generateUserMap() {
		Map<Integer, UserModel> map = new HashMap<>();
		IntStream.range(1, 11).forEach(i -> map.put(i, userGenerator.generate()));
		return map;
	}

	public Integer getMapSize() {
		return userModelMap.size();
	}
}
