package org.prj.arachne.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter(value=AccessLevel.PRIVATE)
@Setter(value=AccessLevel.PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode
public class User {

	private String id;
	private String password;
	
	private String name;
	
	
	
}
