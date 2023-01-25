def call()
{
     withSonarQubeEnv(credentialsId: 'sonar-auth'){
                    sh './gradlew sonarqube'
                }    
}