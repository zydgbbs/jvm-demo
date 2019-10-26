
参数设置VM Args:

-Xms20m:堆的最小值设置为20m
-Xmx20m:堆的最大值设置为20m
-XX:+HeapDumpOnOutOfMemoryError:内存堆转储快照

如果出现内存溢出，则使用【java内存溢出性能分析工具讲解-- Eclipse Memory Analyzer tool(MAT)】去分析生成的hprof内存快照查找原因
