def call()
{
  def readPomVersion = readMavenPom file: 'pom.xml'
                        nexusArtifactUploader artifacts: [[artifactId: 'springboot', classifier: '', file: 'target/Uber.jar', 		 type: 'jar']], 
                        credentialsId: 'nexusss', 
                        groupId: 'com.example', 
                        nexusUrl: '192.168.88.253:8081', 
                        nexusVersion: 'nexus3', 
                        protocol: 'http', 
                        repository: 'shared-library', 
                        version: "${readPomVersion.version}"
}
