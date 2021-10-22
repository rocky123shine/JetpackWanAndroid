# JetpackWanAndroid
## 简单说明
1. 本项目是学习kotlin的项目用法
2. 本项目全部使用kotlin 包括gradle 也改换使用kts
##  切换 gradle 文件为kts文件
- 项目构建的入口是 settings 所以 先切换settings
- 操作方式：
    1. 复制一份settings.gradle  后缀添加.kts
    2. 设置项目全局仓库依赖
    3. 加载kts脚本支持  直接同步即可
    4. groovy 语法和kts很像  只是kts 换成了方法调用如include  kts 使用的是include(":app")
- 跟项目的build.gradle 改造
  切换技巧
    1. 重命名build.gradle 文件  后缀加上.kts
    2. 内容 单引号换成双引号 赋值换成等号，其他 化成方法调用 加上（）

- kts 和groovy 最大的区别是 tsak的声明了  kts 需要使用tasks.regist 来注册task
## 抽取gradle配置文件 以做版本控制和依赖版本管理

    
  