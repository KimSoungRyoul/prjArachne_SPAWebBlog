package org.prj.arachne.domain;

public enum CommunityType {

	REPORT(1001),
	QnA(1002);

	private final int value;
    
	
	private CommunityType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


	
	
}
