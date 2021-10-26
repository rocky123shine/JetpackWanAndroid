## buildSrc 的几点说明

1. buildSrc是一个特殊的module 不需要在其他module中引入 可以直接使用
2. 他的创建：
    - 新加一个buildSrc文件夹
    - 新建一个build.gradle.kts 文件
    - 在 build.gradle.kts 引入dsl 和 仓库的
    - 最后 build一下即可
3. 创建资源目录 这里创建的是src/main/kotlin/    然后在新建自己文件的包名 我这里是com.rocky    这一步如果被省略的话 你会发现一个神器的效果哦 ~~~~
4. 新加文件目录 config 是我预留给项目配置文件 plugin 文件夹是预留给以后自定义gradle插件的
   