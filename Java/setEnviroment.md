# 2020.03.11 setEnviroment

## Fisrt step ： setup eclipse
* https://www.eclipse.org/downloads/<br>

## Second step ： setup Java SE
* https://www.oracle.com/technetwork/java/javase/overview/index.html <br>
本次下載 Java 13
* JDK https://www.oracle.com/java/technologies/javase-jdk13-downloads.html
* 文件 https://www.oracle.com/java/technologies/javase-jdk13-doc-downloads.html<br>
文件最好放在JDK同位置資料夾(安裝路徑)

## Third step ： set Enviroment args
1.配置JAVA_HOME
<pre>Windows键+R键
sysdm.cpl
進階 → 環境變數 → 系統變數 → 新增
變數名稱：JAVA_HOME
變數值：C:\Program Files\Java\jdk-13.0.2
</pre>
2.配置Path
<pre>
系統變數 → 選變數「Path」 → 編輯
新增 → %JAVA_HOME%\bin → 確認
</pre>

## Fourth step ： 檢察系統是否成功安裝java環境
<pre>
windows键+R键 → cmd → java -version
java version "13.0.2" 2020-01-14
Java(TM) SE Runtime Environment (build 13.0.2+8)
Java HotSpot(TM) 64-Bit Server VM (build 13.0.2+8, mixed mode, sharing)
</pre>

## Five step ： cmd
<pre>
cd C:\Users\PiGod\Desktop\Git_test\pidos\Java 到HelloWorld.java的位置
dir
磁碟區 C 中的磁碟沒有標籤。
磁碟區序號:  889E-8B16
C:\Users\PiGod\Desktop\Git_test\pidos\Java 的目錄

2020/03/12  上午 12:02    <DIR>          .
2020/03/12  上午 12:02    <DIR>          ..
2020/03/12  上午 12:02               129 HelloWorld.java
2020/03/11  下午 11:52             1,131 setEnviroment.md
               2 個檔案           1,260 位元組
               2 個目錄  353,541,619,712 位元組可用
javac HelloWorld.java
java HelloWorld.java
Hello! World!
</pre>

### 參考
* https://www.cjavapy.com/article/435/
