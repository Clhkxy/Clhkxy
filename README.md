功能体系一：路径打开支持
xvehiclemain|xvehicletmps|xvehiclefeature|path|log|xvehicle|xdatares
例如：cd $(basket xvehicle)
其中：cd $(basket path)为打开安装目录
其中：cd $(basket log)为打开工具日志路径

功能体系二：升级
basket s xvehicle
basket s xdatares

功能体系三：指令
1)xvehiclemain
basket o xvehiclemain getversion 获取版本
basket o xvehiclemain instruct 帮助指令
basket o xvehiclemain back_infofile 备份重要文件

2)xdatares
basket o xdatares flowlog pass/idx/alarm 查水位置

3）hbase
basket o hbase gethbasestatus 查看hbase状态
basket o hbase list 查看表list
basket o hbase gettable_onedata XVEHICLE:BAYONET_VEHICLEPASS 查看按照rowKey排序最新数据

4）redis
basket o redis "keys" "d*" 查看keys
basket o redis "del" "d*" 删除d开头的keys
basket o redis "get" "d*" 获取key的值
basket o redis "info" 集群信息
basket o redis "nodes" 查看节点
basket o redis "delbatch" "d*" 删除d开头的keys

5）elasticsearch
basket o elasticsearch memory 查看各节点内存
basket o elasticsearch stats 查看节点状态
basket o elasticsearch process 查看版本以及刷新时间
basket o elasticsearch docs_num "xvehicle.bayonet_vehiclepass-*" 文档个数
basket o elasticsearch index_file 文档明细
basket o elasticsearch health es的运行状况
basket o elasticsearch refresh_interval 刷新时间
basket o elasticsearch index_startday "bayonet_vehiclepass-" 查询索引最早开始时间

6）hdfs
basket o hdfs memory_details "/vehicle/ude" 查看目录内存明细
basket o hdfs memory "/vehicle/ude" 查看目录总内存大小
basket o hdfs path_details "/vehicle/ude" 查看目录文件所有明细
basket o hdfs path "/vehicle/ude" 查看目录所有明细
basket o hdfs check 查看hdfs运行状况
basket o hdfs del "/vehicle/ude/test"
basket o hdfs puthdfs "log.sh" "/vehicle/ude/test"
basket o hdfs gethdfs "/vehicle/ude/test/log.sh" "/opt"
basket o hdfs mkdir /vehicle/ude/test 新建目录
basket o hdfs grep "/vehicle/ude/test/log.sh"|grep xvehicle 遍历目录
basket o hdfs use 使用百分比

7）kafka
basket o kafka groupdetail 常用组以及topic明细
basket o kafka mkdir_topic test1 新建topic默认partitions 10 replication-factor 3 
basket o kafka topic_list topic列表
basket o kafka consumption connector-chain-bayonet_vehiclepass BAYONET_VEHICLEPASS 消费情况
basket o kafka history connector-chain-bayonet_vehiclepass BAYONET_VEHICLEPASS 两秒历史数据
basket o kafka real connector-chain-bayonet_vehiclepass BAYONET_VEHICLEPASS 两秒实时数据
basket o kafka start kafka启动
basket o kafka num connector-chain-bayonet_vehiclepass BAYONET_VEHICLEPASS 消费堆积累加值
basket o kafka num_detail connector-chain-bayonet_vehiclepass BAYONET_VEHICLEPASS 消费堆积累加明细
basket o kafka group 组列表
basket o kafka topic BAYONET_VEHICLEPASS topic状态
basket o kafka topicall 所有topic状态
basket o kafka producer BAYONET_VEHICLEPASS
basket o kafka mod_partitions 5 BAYONET_VEHICLEPASS 修改分区partitions
basket o kafka offset connector-chain-bayonet_vehiclepass BAYONET_VEHICLEPASS 查看ConsumerOffsetChecker

8）ude
basket o ude tabledemo 常用sql参考
basket o ude run_ude_sql /opt/123.sql 
basket o ude ude_data "select count(rowKey) from XVEHICLE.BAYONET_VEHICLEPASS" 执行sql语句

9）cube
basket o cube showcube 查看cube是否存在
basket o cube delcube 删除cube
basket o cube subcube 提交cube

10）grab
basket o grab whoconnect "hdh49" "2181" 查看常用端口占用数
basket o grab pidport 2181 hdh49 查看端口占用明细
basket o grab connectnum 2181 hdh49查看端口占用总数
basket o grab pcapip 按照ip抓包
basket o grab pcapport 按照端口抓包
basket o grab pcapgrep hdh49 实时打印链接情况可以添加grep

11）postgres
basket o postgres run_pg_sqldata "select * from sys_dictionary limit 2" 执行sql语句
basket o postgres run_pg_sqldata /opt/123.sql执行sql文件
basket o postgres tabledemo 常用sql参考


功能体系四：导出
basket i importall 导出常用排查成果（未完成）
basket i collection 采集
basket i query  查询
basket i statistics 统计
basket i firstIntoCityStart  初次入城
basket i footHoldsByTrackStart   落脚点
basket i deckCompareFakePlateTaskStart   当日套牌
basket i fakePlateAnalysisWithVehicleAdminLibStart   车管库套牌
basket i vehicleProfileTaskStart 一车一档
basket i dayNightVehicleStart    昼伏夜出
basket i exchangePlateTaskStart  异常车牌
basket i airbornePlatePlateTaskStart 空降车
basket i abnormalPlateDistinctStart  异常车牌
basket i deckAnalysisFakePlateTaskStart  按月套牌处理
basket i deckShortestAssistTaskStart 最短路径
