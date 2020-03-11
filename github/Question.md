# 2020.03.11

## 遇到問題
* 因為本地端沒有指定跟哪個github連結，導致無法git pull
<pre>
主要原因：git clone https://github.com/smallchichen/pidos.git
之後必須移動至那個專案的資料夾位置 cd pidos
然後才能 git pull
</pre>

## push
<pre>
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   HelloWorld.class
</pre>
<pre>
$ git commit -m "add HelloWorld.class"
[master e390648] add HelloWorld.class
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Java/HelloWorld.class
</pre>
<pre>
$ git push
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 4 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 721 bytes | 240.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To https://github.com/smallchichen/pidos.git
   30a0b5d..e390648  master -> master
</pre>

## 錯誤解答
<pre>
git remote add pidos https://github.com/smallchichen/pidos.git
pidos   https://github.com/smallchichen/pidos.git (fetch)
pidos   https://github.com/smallchichen/pidos.git (push)
</pre>
<pre>
git pull pidos master
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 2), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), 731 bytes | 5.00 KiB/s, done.
From https://github.com/smallchichen/pidos
 * branch            master     -> FETCH_HEAD
 * [new branch]      master     -> pidos/master
Updating 644bb79..25d8050
Fast-forward
 github/PushToGithub.txt | 1 +
 1 file changed, 1 insertion(+)
</pre>
