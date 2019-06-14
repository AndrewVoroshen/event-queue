package com.exadel.beanpractice.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {

	private String firstName;

	private String lastName;
}
