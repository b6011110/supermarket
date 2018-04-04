package com.obiggins

class Shift {
	String timeOfDay
	String dayOfWeek
	Float numberOfHours
	String startingTime

    static constraints = {
		timeOfDay blank:false, nullable:false, minSize:7, maxSize:9
		dayOfWeek blank:false, nullable:false, inList.Config.app.dayOfWeek
		numberOfHours blank:false, nullable:false, min:0, max:24, scale:2
		startingTime blank:false, nullable:false, maxSize:7
    }
}

//Config for the day of the week
app.dayOfWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
