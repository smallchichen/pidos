# 20200322
* https://ithelp.ithome.com.tw/articles/10213097

### Spring 和Spring MVC。
然而說到Spring Boot，很多人會想到Spring 和Spring MVC。<br>
究竟它們有什麼差別?<br>
第一，Spring是一種框架，包含一系列的IoC容器的設計和依賴注入(DI)及整合AOP功能。<br>
第二，Spring Boot 和 Spring MVC 都是一種框架，同時它們的核心是Spring。<br>
第三，Spring Boot包含了Spring MVC，同時能簡化配置。<br>

## setup
Eclipse : Help > Eclipse Marketplace<br>
Spring Tool Suite 4，再選擇install<br>

## Spring Initializr
* https://start.spring.io/<br>
* https://m148632014.gitbooks.io/springboot-inaction-cn/content/122_initializing_a_spring_boot_project_with_spring_initializr.html<br>
Spring Initializr是一個網頁版的應用程序，<br>
只要連上互聯網就可以使用，它可以為快速生成一個Spring <br>Boot的項目結構。但不會生成任何應用程序代碼。目的是減少用在項目結構配置上的時間。<br>

## new Spring Boot Project
File > New >Others<br>
在Wizards 下面點一下Spring Boot，選Spring Starter Project，<br>
<pre>
Name: 按你個人喜好而定，但最好是有意思而且是方便記的名字。
Type: Maven
Packaging: War
Java Version: 8
Language: Java
Group: 按你個人喜好而定 (default是com.example)
Artifact: 和Name一樣的，會隨Name變而變
Version: 可不改(default是0.0.1-SNAPSHOT)
Description: 項目描述
Package: 按你個人喜好而定 (default是com.example.demo)    
</pre>
next後，在Web選Spring web (打勾勾)<br>
點選Spring專案(SpringProject2026Application)右鍵 > Run as > Spring Boot App<br>
* http://localhost:8081

### 問題1 : port 8080 被占用
<pre>
Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-03-22 19:55:13.939 ERROR 11268 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Web server failed to start. Port 8080 was already in use.

Action:

Identify and stop the process that's listening on port 8080 or configure this application to listen on another port.

2020-03-22 19:55:13.942  INFO 11268 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'    
</pre>
* https://stackoverflow.com/questions/49075894/java-spring-boot-fails-to-start-web-server-on-port-8080/49075946 <br>
解決方法：<br>
在您的application.properties中添加以下內容-<br>
server.port=8081<br>


### 問題2 : 如何查詢8080port被占用
* https://blog.xuite.net/yamalin/blog/15087550-%5B%E5%95%8F%E9%A1%8C%E6%8E%92%E9%99%A4%5D+80PORT%E8%A2%AB%E4%BD%94%E7%94%A8%3F+%E5%A6%82%E4%BD%95%E6%9F%A5%E5%87%BA%E4%BD%94%E7%94%A8PORT%E7%9A%84%E6%96%B9%E6%B3%95 <br>
netstat - ano   查詢PID <br>
"檢視"=> "選擇欄位" 將PID勾選便可以瀏覽 (windows10直接在欄位滑鼠右鍵就可以看到選項)<br>
原因：Oracle TNSLSNR Excecutable 8080
* https://www.itread01.com/content/1541226003.html
<pre>
oracle 10服務一啟動 TNSLSNR.exe 會佔用8080埠，這時，需要改一下埠：
登入SQL*PLUS：
-- 把HTTP/WEBDAV埠從8080改到8081
SQL> call dbms_xdb.cfg_update(updateXML(dbms_xdb.cfg_get(),
'/xdbconfig/sysconfig/protocolconfig/httpconfig/http-port/text()',8081))
/
-- 把FTP埠從2100改到2111
SQL> call dbms_xdb.cfg_update(updateXML(dbms_xdb.cfg_get(),
'/xdbconfig/sysconfig/protocolconfig/ftpconfig/ftp-port/text()',2111))
/
SQL> commit;
SQL> exec dbms_xdb.cfg_refresh;
-- 檢查修改是否已經成功
SQL> select dbms_xdb.cfg_get from dual;    
</pre>

## MVC
<pre>
@RestController注解就是表示當下的java是一個控制器(Controller)。
@RequestMapping 注解就是通過它來處理URL的請求，而這個動作相等於 Servlet中在web.xml的配置。    
</pre>
如果是URL是http://localhost:8080/XX<br>
就會出現Error page。<br>
因為控制器(Controller)沒有對"/XX"做任何處理，所以就會出現以上的Error Page<br>
<pre>
1, 所有Controller/ Model都會存放在Java Resources > src/main/java
2, 所有View的文件都會存放在Java Resources > src/main/resources    
</pre>

## 怎樣使用Thymeleaf模板?
<pre>
安裝Maven/Gradle
Eclipse Marketplace
Maven
Maven(Java EE) Integration for Eclipse WTP
Install    
</pre>
pom.xml輸入 <br>
`<!-- Template Engine -->`<br>
`        <dependency>`<br>
`            <groupId>org.springframework.boot</groupId>`<br>
`            <artifactId>spring-boot-starter-thymeleaf</artifactId>`<br>
`        </dependency>    `<br>


## 套版
https://colorlib.com/wp/template/login-form-v5/ <br>
(除了index.html)放到src\main\resources\static <br>
將index.html放到src\main\resources\templates <br>

## 修改controller (SpringBootHelloWorld.java)
<pre>
@GetMapping("/x")
    public String hello(){
        return "Hey, Spring Boot 的 Hello World !";
    }
    
    @GetMapping("/index")
    public String helloIndex(){
        return "index";
    }
</pre>
<pre>
要黠:
要用@GetMapping 取代 @RequestMapping
要用@Controller 取代 @RestController    
</pre>
啟動
<pre>
Run As >  Tomcatv9.0 Server at localhost   
</pre>
http://localhost:8080/spring-project-2026/ == http://localhost:8080/spring-project-2026/index/

## Tomcat vs Spring-Boot
<pre>
用Spring Boot App 開啟又有什麼差別?
答:差別在於URL的顯示資料
用Spring Boot App 開啟的應用程式只會顯示http://localhost:8080/
而不會顯示項目的名稱。

Tomcat > http://localhost:8081/spring-boot-2020/index
Spring Boot App > http://localhost:8081/index

因為x的html頁面是不存在的，所以就會出現這個情況。
如果在一般的瀏覽器看，會出現一個ErrorPage。
所以當使用mapping時要記得為對應的mapping準備一個html檔的頁面。
</pre>

## @GetMapping 和 @RequestMapping。但究竟它們有什麼分別呢?
<pre>
分別1:
@GetMapping是在Spring4.3時才有的，
在意思上@GetMapping 就是@RequestMapping (method = RequestMethod.GET)

分別2:
@GetMapping 可在method層面上用作處理 http 的請求。
@RequestMapping 可在class層面上配合@GetMapping 使用。    

分別3:
@GetMapping 與 @RequestMapping 不能互相交換。
@GetMapping的位置只能在class之內，而@RequestMapping在內外也可以
</pre>
<pre>
src\main\resources\static下創建一個folder叫qq，同時將所有在static底下的文件都轉移到qq底下。
繼續用上次創建的SpringBootHelloWorld,java
因為@RequestMapping或@GetMapping都與靜態資源的關係密切。
假設你設計的網頁有不同語言，可以透過@RequestMapping/@GetMapping來控制使用的靜態資源。
所以必須確定所輸入的路徑是有相對應的靜態資源。
</pre>



















