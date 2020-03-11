# 2020.03.11

## 遇到問題
* 因為本地端沒有指定跟哪個github連結，導致無法git pull
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
