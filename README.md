# Heroes Services
A JAX-RS with Couchbase demo

A JAX-RS sample using [Tomee](http://tomee.apache.org/) implementation.

To run:

* `mvn clean package tomee:exec -DskipTests`
* `java -jar target/heroes-1.0-SNAPSHOT-exec.jar`

### The available resources:


#### CRUD 

* **GET** http://localhost:8080/heroes/resource/heroes/ 
* **DELETE** http://localhost:8080/heroes/resource/heroes/{id}
* **POST** http://localhost:8080/heroes/resource/heroes/ 
* **PUT** http://localhost:8080/heroes/resource/heroes/{id}
* **GET** http://localhost:8080/heroes/resource/heroes/{id}

#### Queries to heroes

* **GET** http://localhost:8080/heroes/resource/heroes/seniors/{age}
* **GET** http://localhost:8080/heroes/resource/heroes/youngs/{age}
* **GET** http://localhost:8080/heroes/resource/heroes/{id}
              

### execute the script

`sh heroes.sh`


#### Enjoy the queries


* http://localhost:8080/heroes/resource/heroes/
* http://localhost:8080/heroes/resource/heroes/iron_man
* http://localhost:8080/heroes/resource/heroes/youngs/19
* http://localhost:8080/heroes/resource/heroes/seniors/19
