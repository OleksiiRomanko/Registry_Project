<img src="http://old.minjust.gov.ua/file/24975" align="center" />
# Unified State Register of persons who committed corruption offenses 

This is simple client-server web-application created for keeping track of corrupt officials and it's available for all users.
You just have to write down Name and Sirname needed person and find out everything about him and his legality violations.
## Code Example
This is shortcut example of using Spring Security in the project which provide authorization for Administrator(he has accept to Register Data Base except simple watching and searching corrupt officials and can add personals, edit their information and delete from data base if it's neccessaty. Also he can add laws and criminal acts).

<img src="https://www.dropbox.com/s/0u0btc1nw5zqz22/Screen%20Shot%202016-04-16%20at%2008.52.44.png?dl=0" align="center">

[security.xml](https://github.com/CorruptRegistryProject/Registry_Project/blob/master/src/main/resources/spring/security.xml
)

        <http auto-config="true" >
                <intercept-url pattern="/" access="permitAll" />
                <intercept-url pattern="/admin**" access="hasRole('ADMIN')" />
                <intercept-url pattern="/admin/**" access="hasRole('ADMIN')" />

                <form-login
                        login-page="/login"
                        default-target-url="/admin"
                        authentication-failure-url="/login?retry"
                        username-parameter="j_username"
                        password-parameter="j_password" />

                <logout logout-url="/logout" logout-success-url="/" />
                <csrf disabled="true"/>

        </http>

        <authentication-manager >
                <authentication-provider>
                        <user-service>
                                <user name="yourLogin" password="yourPassword" authorities="ROLE_ADMIN" />
                        </user-service>
                </authentication-provider>
        </authentication-manager>
    
[AdminController.java]()

        @Controller
        @RequestMapping("/admin")
        public class AdminController {
                @RequestMapping("")
                public String adminpage(ModelAndView mav){
                   return "adminpage";
                }

        }

[loginpage.jsp]()

        <html>
        <head></head>
        <body>
                <% String error = (String) request.getAttribute("error"); %>
                <div class="col-lg-12 col-lg-offset-4">
                        <div class="modal-body" style="width: 33%;">
                                <spring:url value="/login" var="loginUrl"/>
                                <form:form role="form" action="${loginUrl}" method="post">
                                <h3 style="text-align: center">
                                        Будь ласка, введіть коректні дані для доступу до бази даних:
                                </h3>
                        <div class="form-group">
                        <div class="input-group">
                                <input type="text" class="form-control" id="j_username" name="j_username" placeholder="Login">
                      <label for="j_username" class="input-group-addon glyphicon glyphicon-user"></label>
                         </div>
                        </div>
              <!-- /.form-group -->

              <div class="form-group">
                  <div class="input-group">
                      <input type="password" class="form-control" id="j_password" name="j_password"
                             placeholder="Password">
                      <label for="j_password" class="input-group-addon glyphicon glyphicon-lock"></label>
                  </div> <!-- /.input-group -->
              </div>
              <!-- /.form-group -->

              <div class="checkbox">
                  <label>
                      <input type="checkbox" name="_spring_security_remember_me"> Запам'ятати
                  </label>
              </div>
              <!-- /.checkbox -->

              <div class="modal-footer">
                  <button class="form-control btn btn-primary" type="submit">Увійти</button>
              </div>
              <!-- /.modal-footer -->

          </form:form>

        </div> <!-- /.modal-body -->
        </div>
        <div>
         <%
        if (error != null) {
        %>
        <div class="col-lg-12 col-lg-offset-4" style="width: 33%;">
            <h4 style="background: #f2dede">
                <%=error%>
            </h4>
        </div>
        <%
                }
         %>
        </div>
        </body>
        </html>


## Motivation

It was created for hope that it could helps in the future our government create appropriate web-site for all Ukrainians for monitoring government, policemen, militaries and others and finding out neccessary informantion about everybody.

## Installation

For setting up the project you have to download data base file from [here](https://github.com/CorruptRegistryProject/CorruptRegisterDataBase){:target="_blank"} and include Tomcat to your project and select path to tomcat folder if it will be neccessary.

## Contributors

Let people know how they can dive into the project, include important links to things like issue trackers, irc, twitter accounts if applicable.

## License
There is no license...

##Techologies which were used for creating project
- [Spring Framework](https://projects.spring.io/spring-framework/){:target="_blank"}
- [MySQL Data Base](https://www.mysql.com/){:target="_blank"}
- [Bootstrap](http://getbootstrap.com/){:target="_blank"}
- [Hybernate](http://hibernate.org/){:target="_blank"}
- [Tomcat Apache Server](http://tomcat.apache.org/){:target="_blank"}

## Creators
- [Oleksandr Chepurnyu](http://vk.com/granium){:target="_blank"}
- [Maksym Ratoshniuk](http://vk.com/maxym6969){:target="_blank"}
- [Dmytro Lysogor](http://vk.com/uponthisdawn){:target="_blank"}



