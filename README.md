# ShutdownMyOwnPC

- 一个非常简陋、由小白开发、基于SpringBoot的、控制自己电脑关机和重启的小玩意
- 这样就可以躺在床上把电脑关机了 ~~其实没什么用()~~

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]

## 目录

- [上手指南](#上手指南)
- [部署](#部署)
  - [部署前的要求](#部署前的要求)
  - [开始部署](#开始部署)
- [使用到的框架](#使用到的框架)
- [作者](#作者)

### 上手指南

- 成功运行项目后在你的手机上打开网址
```
http://你电脑的ip地址:8080/
```

- 你就会看到

![img_1.png](img_1.png)

### 部署
###### 部署前的要求

- ~~首先你需要有一台电脑。~~
- 你需要Java17的jre或jdk的环境
- idea

###### 开始部署

1. 首先下载项目并解压（git clone亦可）
```sh
git clone https://github.com/Senvinn/ShutdownMyOwnPC.git
```

2. 使用idea打开项目


3. 在idea中使用maven的构建工具
```sh
mvn clean package
```
（构建成功后的jar文件在 **项目目录/target/**）

4. 运行项目
```sh
"你安装java的路径\bin\java.exe" -jar "输出的jar路径"
```

### 使用到的框架

- [SpringBoot](https://spring.io/projects/spring-boot)

### 作者

Rensen(Senvinn)

<!-- links -->
[your-project-path]:Senvinn/ShutdownMyOwnPC
[contributors-shield]: https://img.shields.io/github/contributors/Senvinn/ShutdownMyOwnPC.svg?style=flat-square
[contributors-url]: https://github.com/Senvinn/ShutdownMyOwnPC/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Senvinn/ShutdownMyOwnPC.svg?style=flat-square
[forks-url]: https://github.com/Senvinn/ShutdownMyOwnPC/network/members
[stars-shield]: https://img.shields.io/github/stars/Senvinn/ShutdownMyOwnPC.svg?style=flat-square
[stars-url]: https://github.com/Senvinn/ShutdownMyOwnPC/stargazers
[issues-shield]: https://img.shields.io/github/issues/Senvinn/ShutdownMyOwnPC.svg?style=flat-square
[issues-url]: https://img.shields.io/github/issues/Senvinn/ShutdownMyOwnPC.svg
