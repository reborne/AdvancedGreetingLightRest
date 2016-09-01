# AdvancedGreetingLightRest

Spring REST API with Spring Security Integration (customized configuration)

## Overall
This application shows how to implement Spring Security with custom configuration<br>
Initially, boilerplate has been taken from <u><b>GreetingLightRest</b></u> application,
which can be found <a href="https://github.com/reborne/GreetingLightRest"> here </a>
Business layer designed so every Account can have multiple roles

#Project contents:
<ol>
  <li>Spring Boot - Base of application that maintain application runtime</li>
  <li>Spring Data - Module that allows to persist (save objects) to database (HSQLDB in this scope)</li>
  <li>HSQLDB Database - Database that performs serialization/deserialization during in-memory execution</li>
  <li>Spring Security - Framework that allows to secure Java applications</li>
</ol>

#Project requirements: 
<ol>
  <li>Java 8 installed</li>
  <li>Maven 3.0 (3.9 recomended)</li>
  <li>Any IDE (optional)</li>
</ol>

#<a id="users">User credentials</a>
<ol> 
  <li> Username: <code>user</code> Password:<code>password</code>
  <li> Username: <code>operations</code> Password:<code>operations</code>
</ol>
#How to execute application
<ol>
<li>Clone project (green button "Clone or Download")</li>
<li>Extract to location by your will (e.g Desktop)</li>
<li>Open terminal and move to location where project located</li>
<li>run <code>mvn spring-boot:run</code></li>
<li>open browser and go <a href="http://localhost:8080/api/greetings">here</a> (http://localhost:8080/api/greetings) to see final result</li>
<li>In a popup window, enter user credentials(see <a href="#users">here</a>)
</ol>

<b>Note: </b>If everything done correctly, then the line with 2 id's will be return by service<br>

Example: <code>[{"id":1,"name":"Hello World!"},{"id":2,"name":"Hola Mundo!"}]</code>
