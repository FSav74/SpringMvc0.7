call mvn clean

call mvn compile
call mvn package

del "C:\software\jboss-eap-6.3.0\jboss-eap-6.3\standalone\deployments\SpringMVC3.0-0.7WAR-1.0-SNAPSHOT*"

move "C:\software\progetti-KEPLERx86_64\SpringMVC3.0-0.7\SpringMVC3.0-0.7WAR\target\SpringMVC3.0-0.7WAR-1.0-SNAPSHOT.war" "C:\software\jboss-eap-6.3.0\jboss-eap-6.3\standalone\deployments\"
