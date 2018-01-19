package org.prj.arachne.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter(value=AccessLevel.PRIVATE)
@Setter(value=AccessLevel.PRIVATE)
public class User {

	private String id;
	private String password;
	
	
	//ㅁㄴㅇㄻㄴㅇㄻㄴㄴㅇㄴㅁㅇㄹ
	
}
