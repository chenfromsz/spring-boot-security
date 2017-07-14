1. create Mysql DB: test
2. config application.yml set db url,username,password
3. run Junit: MysqlTest to create default user
4. run Spring Boot: WebApplicaton
5. http://localhost
6. login with username: user, password: user
--------------------------------------------
grant all privileges on *.* to 'root'@'localhost'  identified by '12345678' with grant option;