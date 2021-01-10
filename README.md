# Minecraft Forge Mod Template
这是一个 Minecraft 1.7.10 Forge Mod 的模板项目。  
你可以通过这个模板来快速创建一个 1.7.10 Forge Mod。  

这个模板使用的是 [anatawa12/ForgeGradle-1.2](https://github.com/anatawa12/ForgeGradle-1.2)， 支持 Gradle 4.4.1 以上版本。

### 资源下载加速  

在此基础上，我还加入了 Minecraft 资源下载 URL 修改功能，以此来加速国内用户的开发环境部署速度  
在 `build.gradle` 中，你可以看到如下片段：
```groovy
repos {
    mcJsonUrl = "https://bmclapi2.bangbang93.com/versions/{MC_VERSION}/{MC_VERSION}.json"
    mcJarUrl = "https://bmclapi2.bangbang93.com/versions/{MC_VERSION}/{MC_VERSION}.jar";
    mcServerUrl = "https://bmclapi2.bangbang93.com/versions/{MC_VERSION}/minecraft_server.{MC_VERSION}.jar";;
    assetsIndexUrl = "https://bmclapi2.bangbang93.com/indexes/{ASSET_INDEX}.json";
    assetsUrl = "https://bmclapi2.bangbang93.com/assets"
}
```
你可以把这里面的 URL 修改为其他镜像站提供的地址。

### 开发依赖加速  
  
其他开发依赖文件使用的是来自 [Lss233's.Mirror();](https://www.mcbbs.net/thread-800729-1-1.html) 提供的镜像服务。
如果你有意见的话，可以自行修改相关代码文件。

### 切换 Gradle 版本

修改 `gradle/wrapper/gradle-wrapper.properties` 中的
```
distributionUrl=https\://lss233.littleservice.cn/repositories/gradle-dist/gradle-6.8-bin.zip
```
为你想要使用的 Gradle 版本即可。  

## 使用方法
点击 GitHub 仓库页面的 `Use this template` 按钮来创建自己的项目。  
或者点击 [这里](https://github.com/lss233/forge-mod-1.7.10/archive/main.zip) 下载，解压到你自己的电脑上。  

## 鸣谢
这个项目使用了：
* [anatawa12/ForgeGradle-1.2](https://github.com/anatawa12/ForgeGradle-1.2)
* [BMCLAPI](https://bmclapidoc.bangbang93.com/)
* [Lss233's.Mirror();](https://www.mcbbs.net/thread-800729-1-1.html)