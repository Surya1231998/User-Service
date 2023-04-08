package com.lcdw.user.services.UserServices.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {
	@Id
	@Column(name = "userId")
	private String userId;

	@Column(name = "name", length = 65555)
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "about")
	private String about;
}
