# spring-boot-dubbo-demo
spring-boot与dubbo、mybatis、druid集成示例

---

集成了spring-boot 与 druid 、mybatis、dubbo，同时演示了多数据源，以及读写分离。

运行程序需要在本机启动zookeeper、mysql，数据库建表的脚本见根目录下的*.sql

要测试多数据源，读写分离，先在mysql创建4个库：study,study_slave,product,product_slave；然后导入对应的sql文件

------------------------------------------------------------------------------

by [菩提树下的杨过](http://yjmyzz.cnblogs.com/)