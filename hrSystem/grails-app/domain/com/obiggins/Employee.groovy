package com.obiggins

class Employee {
	String employeeID
	String fullName
	Date dateOfBirth
	String residence
	Float hourlyRate
	Date dateEmployed
	String taxCode
	String contract
	
    static constraints = {
		employeeID blank:false, nullable:false, unique:true
		fullName blank:false, nullable:false, maxSize:25
		dateOfBirth blank:false, nullable:false
		residence blank:false, nullable:false, maxSize:20
		hourlyRate blank:false, nullable:false, scale:2
		dateEmployed blank:false, nullable:false
		taxCode blank:false, nullable:false
		contract blank:false, nullable:false, maxSize:20

    }
}
