
###### 

###### tips:git initial operation

**…or create a new repository on the command line**

```shell
echo "# NativeJava" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:jokerhunter/NativeJava.git
git push -u origin main
```

**…or push an existing repository from the command line**

```shell
git remote add origin git@github.com:jokerhunter/NativeJava.git
git branch -M main
git push -u origin main
```