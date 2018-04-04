package com.obiggins

class Manager {
	String fullName
	String userName
	String password
	String employeeEmail
	String office
	String department

    static constraints = {
		fullName blank:false, nullable:false, maxSize:25
		userName blank:false, nullable:false, minSize:4, maxSize:25
		password blank:false, nullable:false, minSize:6, maxSize:20
		employeeEmail blank:false, nullable:false, email:true
		office blank:false, nullable:false, maxSize:30
		department blank:false, nullable:false, maxSize:25
    }
}
