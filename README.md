# ClickProcessor
![image](https://jitpack.io/v/yoyoyaobin/ClickProcessor.svg)

只要一句代码就能统一处理所有点击事件，包括防止快速重复点击，以及统一处理比如无网络，需要登录等状况。

## 目的
1.解决用户手抖不小心重复双击按钮导致双开了界面

2.解决开发时不停的ifelse判断是否网络有问题、登录状态有问题，或者其他条件判断等繁琐代码

## 使用方式
### 1.在project的build.gradle里配置
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### 2.在app的build.gradle里配置
 ```
 //在文件的头部加上以下这句配置
 apply plugin: 'android-aspectjx'
 
 //在dependencies内部引入库
 dependencies {
	        implementation 'com.github.yoyoyaobin:ClickProcessor:1.0.1'
	}
 ```
 
 ### 3.在你的application注册
 ```
 //kotlin写法
Aspect.init().setClickDelayTime(500).setOnAspectListener(object : OnAspectListener {
            override fun aspect(view: View): Boolean {
                //可以在这里写一些项目里需要统一处理的逻辑，比如判断网络，是否已登录等
                //返回true则事件继续传递，false则不会传递事件
                return true
            }
        })
 //java写法
 Aspect.init().setClickDelayTime(500).setOnAspectListener(new OnAspectListener() {
            @Override
            public boolean aspect(View view) {
                return true;
            }
        });
 ```
 
 ## 说明
 1.setClickDelayTime设置的是重复点击判断的时间差 默认500毫秒

2.OnAspectListener回调将会在按钮点击的时候优先于系统onClick事件触发之前回调，也就是说先会触发aspect()方法，return true之后触发系统的onclick方法
 （return false则不会调用onclick方法）
 
3.如果需要关闭该监听，可以调用Aspect.getInstance().isOpen(false) 默认为true打开

## LICENSE
详见[LICENSE](https://github.com/yoyoyaobin/ClickProcessor/blob/master/LICENSE)
