node{
    checkout scm
	stage('Compile and Package') {
    	
		bat 'mvn clean package'
	}
	stage('Unit_Test'){
		bat 'mvn surefire:test'
		step([$class: 'Publisher'])
	}
	stage('code_analysis'){
		withSonarQubeEnv {
    			bat 'mvn sonar:sonar'
		}
	}
}