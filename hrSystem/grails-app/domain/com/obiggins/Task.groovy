package com.obiggins

class Task {
	String taskName
	Int numberOfPeople
	String sectionName
	String timeRequired
	String description
	String department
	Boolean taskCompleted

    static constraints = {
		taskName blank:false, nullable:false, maxSize:20
		numberOfPeople blank:false, nullable:false, minSize:1
		sectionName blank:false, nullable:false, maxSize:40
		timeRequired blank:false, nullable:false
		description blank:false, nullable:false, widget:'textarea', maxSize:150
		department blank:false, nullable:false, maxSize:30
		taskCompleted blank:false, nullable:false
    }
}
