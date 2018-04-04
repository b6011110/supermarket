package com.obiggins

class Team {
	String teamName
	Int numberOfEmployees
	String description
	String sectionName

    static constraints = {
		teamName blank:false, nullable:false, maxSize:20
		numberOfEmployees blank:false, nullable:false
		description blank:false, nullable:false, widget'textarea', maxSize:30
		sectionName blank:false, nullable:false
    }
}
