package org.foo

def timedGradleBuild(tasks) {
	timestamps {
		sh "${tool 'gradle3.2'}/bin/gradle ${tasks}"
	}
}


class buildUtils implements Serializable {
	def steps
	buildUtils(steps) { this.steps = steps }

}
