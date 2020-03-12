# 20200312

## 如何把整個java專案移到github
* https://www.itread01.com/content/1549057521.html
<pre>
先移動到位置 cd /c/Users/PiGod/Desktop/Git_test/pidos
</pre>
<pre>
$ git add .
warning: LF will be replaced by CRLF in Java/.metadata/.log.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/.gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/Servers/Tomcat v9.0 Server at localhost-config/catalina.policy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/Servers/Tomcat v9.0 Server at localhost-config/catalina.properties.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/Servers/Tomcat v9.0 Server at localhost-config/context.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/Servers/Tomcat v9.0 Server at localhost-config/server.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/Servers/Tomcat v9.0 Server at localhost-config/tomcat-users.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/Servers/Tomcat v9.0 Server at localhost-config/web.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in Java/firstWeb/.gitignore.
The file will have its original line endings in your working directory
</pre>
<pre>
$ git commit -m "java workspace 20200313"
[master 7a361af] java workspace 20200313
 30 files changed, 6751 insertions(+), 1 deletion(-)
 create mode 100644 Java/.gitignore
 rewrite Java/.metadata/.mylyn/repositories.xml.zip (100%)
 create mode 100644 Java/Servers/.project
 create mode 100644 Java/Servers/.settings/org.eclipse.wst.server.core.prefs
 create mode 100644 Java/Servers/Tomcat v9.0 Server at localhost-config/catalina.policy
 create mode 100644 Java/Servers/Tomcat v9.0 Server at localhost-config/catalina.properties
 create mode 100644 Java/Servers/Tomcat v9.0 Server at localhost-config/context.xml
 create mode 100644 Java/Servers/Tomcat v9.0 Server at localhost-config/server.xml
 create mode 100644 Java/Servers/Tomcat v9.0 Server at localhost-config/tomcat-users.xml
 create mode 100644 Java/Servers/Tomcat v9.0 Server at localhost-config/web.xml
 create mode 100644 Java/firstWeb/.classpath
 create mode 100644 Java/firstWeb/.gitignore
 create mode 100644 Java/firstWeb/.project
 create mode 100644 Java/firstWeb/.settings/.jsdtscope
 create mode 100644 Java/firstWeb/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 Java/firstWeb/.settings/org.eclipse.wst.common.component
 create mode 100644 Java/firstWeb/.settings/org.eclipse.wst.common.project.facet.core.xml
 create mode 100644 Java/firstWeb/.settings/org.eclipse.wst.jsdt.ui.superType.container
 create mode 100644 Java/firstWeb/.settings/org.eclipse.wst.jsdt.ui.superType.name
 create mode 100644 Java/firstWeb/WebContent/META-INF/MANIFEST.MF
 create mode 100644 Java/firstWeb/WebContent/WEB-INF/lib/servlet-api.jar
 create mode 100644 Java/firstWeb/WebContent/WEB-INF/web.xml
 create mode 100644 Java/firstWeb/src/com/helloweenvsfei/ch02/firstweb/HelloSerlet.java
</pre>
<pre>
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
</pre>
<pre>
$ git push
Enumerating objects: 75, done.
Counting objects: 100% (75/75), done.
Delta compression using up to 4 threads
Compressing objects: 100% (40/40), done.
Writing objects: 100% (56/56), 301.06 KiB | 6.69 MiB/s, done.
Total 56 (delta 4), reused 0 (delta 0)
remote: Resolving deltas: 100% (4/4), completed with 4 local objects.
To https://github.com/smallchichen/pidos.git
   512ef38..7a361af  master -> master
</pre>
