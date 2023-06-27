# Study-itv-es #

ES



## 关键点

- 核心组件
- 角色节点
- 集群结构
- lucence
- 倒排索引
- 常用组件概念
- 写入过程
- 查询过程
- FST 数据结构 
- ES 集群节点扩容
- 选举过程



## 角色节点

master node： 索引的创建与删除

data node：存储索引数据、对文档数据增删查改 

cordinate node：协调节点，接收用户请求、转发请求、汇总结果

ingest node：拦截请求，对文档进行转换和预处理



## 组件概念

```
1、索引 index ： 关系型数据库中的 table

2、文档 document ： row

3、字段 field text\keyword\byte ： 列

4、映射Mapping ： Schema。

5、查询方式 DSL ： SQL ES的新版本也支持SQL

6、分片 sharding 和 副本 replicas： index都是由sharding组成的。每个sharding都有一个或多个备份。 ES集群健康状态：
```

## 写入过程

（1）客户端发送写请求给cordinate node

（2）cordinate node 计算路由计算，转发到对应的主分片所在的节点上

（3）主分片节点处理请求，并将数据同步至副本分片节点

（4）当所有节点写完数据后，cordinate node 返回相应给客户端



## 参考链接

【2023-06-19】https://ac.nowcoder.com/discuss/1029975?type=0&order=0&page=1&channel=-1

【2023-06-19】https://blog.csdn.net/yanpenglei/article/details/121859896

【2023-06-19】https://cloud.tencent.com/developer/article/2141868



## Bilibili

https://www.bilibili.com/video/BV1TR4y1Q7kd?p=9&spm_id_from=pageDriver&vd_source=72424c3da68577f00ea40a9e4f9001a1
