grails.project.work.dir = 'target'
grails.project.source.level = 1.6
grails.project.dependency.resolver = "maven" // switched to Maven instead of Ivy

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenCentral()
	}

	dependencies {}

	plugins {
		build(':release:3.0.1', ':hibernate4:4.3.6.1', ':rest-client-builder:2.0.3') { // updated plugin versions
			export = false
		}
	}
}
