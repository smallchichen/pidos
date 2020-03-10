# 2020.03.10
Learn how to use github <br>

## First step ： read github guide
* https://guides.github.com/activities/hello-world/<br>
i can create branch and merge branch <br>

## Second step ： how to write in wiki of page (語法介紹)
* https://github.com/g0v/dev/wiki/%E5%A6%82%E4%BD%95%E7%B7%A8%E8%BC%AF-Wiki<br>

<pre> # 大標題 </pre>
<pre> ## 中標題 </pre>
<pre> ### 小標題 </pre>
<pre> [Google 首頁](http://www.google.com) </pre>
<pre> ![g0v Logo圖片](http://i.imgur.com/3iwGfBW.png)</pre>
<pre> **粗體**</pre>
<pre>`程式碼`</pre>
<pre>* 第1項  
* 第2項</pre>
<pre>1. 第1項  
2. 第2項</pre>
<pre>> 引言</pre>
<pre>***       (效果是分隔線)</pre>
進階語法參考資訊 <br>
* https://markdown.tw/#precode 
* https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet

## Third step ： setup git on window10
* 官網 https://git-scm.com/
* 教學 https://obtuseitlearner.pixnet.net/blog/post/121911872 <br>
官網 → 按download → windows <br>
Select Components → 最下面有一個的我沒有勾, Additional icons 底下的我有勾<br>
choosing the default editor used by Git Select Components → Use Vim (the ubiquitos text editor) as Git's dafault editor <br>
Adjusting your PATH enviroment → Use Git from Git Bash only <br>
Git Bash的icon 點兩下後執行 <br>

## Fourth step ： use Git Bash on window10 (likely use linux)
* 教學 https://obtuseitlearner.pixnet.net/blog/post/121911872
<pre>$ pwd 
如果想查詢自己在哪個目錄的話</pre>
<pre>$ ls 
列出資料夾底下所有的檔案</pre>
<pre>$ clear 
清空文字可以下</pre>
<pre>$ cd Desktop 
進入資料夾就是 cd XXX(比方進入桌面)</pre>
<pre>覺得麻煩的話可以用 tab鍵 輔助 
比方說 鍵入$ cd Desk 後按tab鍵, 他就會自動幫你補完成 $ cd  Desktop</pre>
* 1.將資料夾初始化, 變成git Repo, 也就是git 的倉庫
<pre> $ git init  </pre>
* 2.將 Readme.txt 加入版本管理 (在你選的資料夾，建立一個Readme.txt的檔案)
<pre>$ git add Readme.txt
指令意義: 將Readme.txt "的改變" 加入版本管理</pre>
<pre>$ git add -f --all 
(指令意義: 將目前所在的資料夾裡 "所有的檔案" "的改變" 強制 加入版本管理)</pre>
* 3.建立使用者跟信箱
<pre>$ git config --global user.email "you@example.com"
$ git config --global user.name "Your Name"
</pre>
* 4.執行指令
<pre>上一步的git add 並不會直接寫入git 的記錄檔, 而是會被另外記錄起來.
等到使用者(也就是你)下 git commit 後才會一次執行寫入所有的指令
一般我們使用  $ git commit -m "<你想說的話>"
 $ git commit -m " add Readme.txt"    </pre>
* 5.更改Readme.txt內容 & 再次執行指令
<pre>$ git add Readme.txt 或  $ git add -f --all 
$ git commit -m "<你想說的話>" </pre>
* 6.顯示過去紀錄
<pre>$ git log
commit 4016e5a5c57b2af1e28b51cd38da16b001589532 (HEAD -> master)
Author: Your Name <you@example.com>
Date:   Tue Mar 10 22:46:47 2020 +0800
     add Readme.txt</pre>
<pre>$ git show 後面加上前四碼(以上, 怕流水號相同可以打多一點)
$ git show 2dc4
commit 4016e5a5c57b2af1e28b51cd38da16b001589532 (HEAD -> master)
Author: Your Name <you@example.com>
Date:   Tue Mar 10 22:46:47 2020 +0800

     add Readme.txt

diff --git a/Readme.txt b/Readme.txt
new file mode 100644
index 0000000..7f6bb5c
--- /dev/null
+++ b/Readme.txt
@@ -0,0 +1,2 @@
+87
+HelloWorld
\ No newline at end of file</pre>
* 7.回到過去某一版
<pre>$ git log
commit 007582b409f95c175e02237ca1acde3f2869095e (HEAD -> master)
Author: Your Name <you@example.com>
Date:   Tue Mar 10 22:58:19 2020 +0800

     add Readme.txt

commit 4016e5a5c57b2af1e28b51cd38da16b001589532
Author: Your Name <you@example.com>
Date:   Tue Mar 10 22:46:47 2020 +0800

     add Readme.txt</pre>
<pre>$ git reset --hard <版號>
$ git reset --hard 4016e5
HEAD is now at 4016e5a  add Readme.txt
</pre>
* 8.回到未來的版本
<pre>$ git reflog
4016e5a (HEAD -> master) HEAD@{0}: reset: moving to 4016e5
007582b HEAD@{1}: commit: add Readme.txt
4016e5a (HEAD -> master) HEAD@{2}: commit (initial): add Readme.txt</pre>
<pre>$ git reset --hard 007582b
HEAD is now at 007582b  add Readme.txt
</pre>
<pre>$ git log
commit 007582b409f95c175e02237ca1acde3f2869095e (HEAD -> master)
Author: Your Name <you@example.com>
Date:   Tue Mar 10 22:58:19 2020 +0800

     add Readme.txt

commit 4016e5a5c57b2af1e28b51cd38da16b001589532
Author: Your Name <you@example.com>
Date:   Tue Mar 10 22:46:47 2020 +0800

     add Readme.txt
</pre>

## Fiveth step ： download project from github && pull project to localhost
* https://progressbar.tw/posts/3<br>
* 1.移動至你想放repo的路徑
<pre>cd Desktop/Git_test</pre>
* 2.下載專案 & 輸入指令
<pre>點擊「clone or download」將裡面的網址</pre>
<pre>$ git clone https://github.com/smallchichen/pidos.git
Cloning into 'pidos'...
remote: Enumerating objects: 16, done.
remote: Counting objects: 100% (16/16), done.
remote: Compressing objects: 100% (9/9), done.
remote: Total 16 (delta 2), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (16/16), 3.70 KiB | 4.00 KiB/s, done.
</pre>
* 3.新增任何檔案(PushToGithub.txt ) & 查看新增那些檔案
<pre>$ git status
On branch master
Your branch is up to date with 'origin/master'.
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        PushToGithub.txt
nothing added to commit but untracked files present (use "git add" to track)
以查詢這個資料夾的變化(顯示查詢結果為紅色字體)</pre>
* 4.把新增檔案加入版本管理
<pre>$ git add PushToGithub.txt
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   PushToGithub.txt
</pre>
<pre>$ git commit -m "add PushToGithub.txt"
[master e0e17c9] add PushToGithub.txt
 1 file changed, 1 insertion(+)
 create mode 100644 PushToGithub.txt
</pre>
* 5.從本地端傳送(push)至遠端 輸入帳號密碼
<pre>$ git push</pre>
* 6.遠端修改README.md檔並同步至本地端 隨便修改任何檔案
<pre>隨便修改任何檔案
點進commit記錄
在遠端githut上面多了Update XXX檔案的記錄</pre>
<pre>$ git pull
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 692 bytes | 5.00 KiB/s, done.
From https://github.com/smallchichen/pidos
   e0e17c9..dcc0dd1  master     -> origin/master
Updating e0e17c9..dcc0dd1
Fast-forward
 PushToGithub.txt | 3 ++-
 1 file changed, 2 insertions(+), 1 deletion(-)
</pre>

## 補充小技巧
* 再用`*`後面url，再來下一段落文字前，必須加`<br>`

## 結語
下班後，花3小時學習，如果有錯誤的地方，可以的話，告知小弟本人
