package com.obiggins

class TeamLeader {
	String fullName
	String description
	String sectionName
	String officePhone
	String employeeEmail
	String employeeID
	String password

    static constraints = {
		fullName blank:false, nullable:false, maxSize:25
		description blank:false, nullable:false, widget:'textarea', maxSize:30
		sectionName blank:false, nullable:false, maxSize:40
		officePhone blank:false, nullable:false, maxSize:13
		employeeEmail blank:false, nullable:false, email:true
		employeeID blank:false, nullable:false, unique:true
		password blank:false, nullable:false, minSize:6, maxSize:20
    }
}
