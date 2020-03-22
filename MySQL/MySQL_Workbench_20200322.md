# 20200322

## setup
* https://dev.mysql.com/downloads/workbench/ <br>
選擇紅方格位置的句子(No thanks, just start my download)按一下就可以馬上下載<br>
下載完畢後，直接安裝

### 問題 1 : mysql workbench.exe 啟動沒反應
<pre>
小弟我的作業系統是Windows10
上網查了後，認為有些可能無法根本性解決，
最後採用最佳可行方案：降版本    
</pre>
<pre>
https://dev.mysql.com/downloads/workbench/  
點選Archives
https://downloads.mysql.com/archives/workbench/
今天裝的是8.0.19版本
最後用的是8.0.18版本
下載+安裝=成功開啟mysql workbench
</pre>

## 建立資料庫
C:\Program Files\MySQL\MySQL Workbench 8.0 CE <br>
點選MySQL Connections旁邊的加號來創建連線(這是IDE，還要去安裝MySQL)<br>
<pre>
1, 連線名稱(Connection Name) – 填一個名稱，可隨意填寫pidos
2, 用戶名稱(Username) - 填一個用戶名稱root
3, 密碼(Password) -填一個密碼root
當填完以上3項資料後，可以按一下右下方的”測試連線”(Test Connection)    
</pre>
在MySQL, schema等於資料庫(database)。<br>
之後在SCHEMAS下方的空白位置按一下右鍵<br>
再選擇”Create Schema”<br>
完成後按一下”Apply”<br>
繼續按一下”Apply”<br>
按一下”Finish”<br>
<pre>
use hello20190913;
CREATE TABLE `memberaccount2019` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PASSWORD` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CELLPHONE` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
  )    
</pre>
當完成SQL代碼後，可按下圖紅框內的閃電圖案。<br>
那個閃電圖案是即時運用在Query1 tab下的所有SQL代碼。<br>





