# DropDownMenu
******
多条件筛选菜单，比58，赶集软件中的要好的多

##效果展示
******

![效果](http://ww4.sinaimg.cn/large/801b780agw1f7dwxiy2nxg208w0fte81.gif)

##用法
     <example.fussen.dropdownmenu.DropDownMenu xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/dropDownMenu"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:dividerColor="@color/blue_app"
        app:maskColor="@color/mask_color"
        app:menuBackgroundColor="@color/base_title_color"
        app:menuSelectedIcon="@drawable/ic_img_up"
        app:menuTextSize="16sp"
        app:menuUnselectedIcon="@drawable/ic_img_down"
        app:textSelectedColor="@color/blue_app"
        app:textUnselectedColor="@color/drop_down_unselected"
        app:underlineColor="@color/blue_app" />

自定义属性

    <declare-styleable name="DropDownMenu">
        <!--下划线颜色-->
        <attr name="underlineColor" format="color" />
        <!--分割线颜色(菜单栏)-->
        <attr name="dividerColor" format="color" />
        <!--tab选中颜色-->
        <attr name="textSelectedColor" format="color" />
        <!--tab未选中颜色-->
        <attr name="textUnselectedColor" format="color" />
        <!--tab 背景颜色-->
        <attr name="menuBackgroundColor" format="color" />
        <!--遮罩颜色，一般是半透明-->
        <attr name="maskColor" format="color" />
        <!--字体大小-->
        <attr name="menuTextSize" format="dimension" />
        <!--tab选中状态图标-->
        <attr name="menuSelectedIcon" format="reference" />
        <!--tab未选中状态图标-->
        <attr name="menuUnselectedIcon" format="reference" />
    </declare-styleable>

##apk下载apk
[apk](http://dl.download.csdn.net/down11/20160901/489a6b85108bb342ac427dedf1200608.apk?response-content-disposition=attachment%3Bfilename%3D%22app-debug.apk%22&OSSAccessKeyId=9q6nvzoJGowBj4q1&Expires=1472719539&Signature=%2FpqAv2XUbA07K5lZMHjmunGBRoE%3D)

[我的博客](http://blog.csdn.net/fussenyu)




