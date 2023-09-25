# java switch benchmark

- https://github.com/xuwei-k/java-switch-benchmark/actions/runs/6298574412

```
[info] # JMH version: 1.37
[info] # VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35
[info] # VM invoker: /opt/hostedtoolcache/Java_Zulu_jdk/21.0.0-35/x64/bin/java
[info] # VM options: <none>
[info] # Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
[info] # Warmup: 10 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: p1.Bench.javaIfElse
[info] # Run progress: 0.00% complete, ETA 00:10:00
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 23211.470 ops/s
[info] # Warmup Iteration   2: 23873.932 ops/s
[info] # Warmup Iteration   3: 24238.029 ops/s
[info] # Warmup Iteration   4: 24296.675 ops/s
[info] # Warmup Iteration   5: 24368.175 ops/s
[info] # Warmup Iteration   6: 23901.543 ops/s
[info] # Warmup Iteration   7: 24367.421 ops/s
[info] # Warmup Iteration   8: 24436.423 ops/s
[info] # Warmup Iteration   9: 24684.275 ops/s
[info] # Warmup Iteration  10: 24483.677 ops/s
[info] Iteration   1: 24048.284 ops/s
[info] Iteration   2: 24157.573 ops/s
[info] Iteration   3: 24396.457 ops/s
[info] Iteration   4: 24459.412 ops/s
[info] Iteration   5: 24365.127 ops/s
[info] Iteration   6: 24357.384 ops/s
[info] Iteration   7: 24456.033 ops/s
[info] Iteration   8: 23957.002 ops/s
[info] Iteration   9: 24187.778 ops/s
[info] Iteration  10: 24045.160 ops/s
[info] Result "p1.Bench.javaIfElse":
[info]   24243.021 ±(99.9%) 281.926 ops/s [Average]
[info]   (min, avg, max) = (23957.002, 24243.021, 24459.412), stdev = 186.477
[info]   CI (99.9%): [23961.095, 24524.947] (assumes normal distribution)
[info] # JMH version: 1.37
[info] # VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35
[info] # VM invoker: /opt/hostedtoolcache/Java_Zulu_jdk/21.0.0-35/x64/bin/java
[info] # VM options: <none>
[info] # Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
[info] # Warmup: 10 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: p1.Bench.javaSwitch
[info] # Run progress: 33.33% complete, ETA 00:06:40
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 1319.897 ops/s
[info] # Warmup Iteration   2: 1349.698 ops/s
[info] # Warmup Iteration   3: 1392.068 ops/s
[info] # Warmup Iteration   4: 1361.963 ops/s
[info] # Warmup Iteration   5: 1382.107 ops/s
[info] # Warmup Iteration   6: 1354.611 ops/s
[info] # Warmup Iteration   7: 1389.759 ops/s
[info] # Warmup Iteration   8: 1372.521 ops/s
[info] # Warmup Iteration   9: 1371.969 ops/s
[info] # Warmup Iteration  10: 1385.186 ops/s
[info] Iteration   1: 1374.269 ops/s
[info] Iteration   2: 1376.322 ops/s
[info] Iteration   3: 1390.189 ops/s
[info] Iteration   4: 1399.232 ops/s
[info] Iteration   5: 1402.146 ops/s
[info] Iteration   6: 1385.882 ops/s
[info] Iteration   7: 1366.009 ops/s
[info] Iteration   8: 1366.704 ops/s
[info] Iteration   9: 1381.117 ops/s
[info] Iteration  10: 1367.495 ops/s
[info] Result "p1.Bench.javaSwitch":
[info]   1380.937 ±(99.9%) 19.946 ops/s [Average]
[info]   (min, avg, max) = (1366.009, 1380.937, 1402.146), stdev = 13.193
[info]   CI (99.9%): [1360.991, 1400.882] (assumes normal distribution)
[info] # JMH version: 1.37
[info] # VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35
[info] # VM invoker: /opt/hostedtoolcache/Java_Zulu_jdk/21.0.0-35/x64/bin/java
[info] # VM options: <none>
[info] # Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
[info] # Warmup: 10 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: p1.Bench.scalaMatch
[info] # Run progress: 66.67% complete, ETA 00:03:20
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 18249.042 ops/s
[info] # Warmup Iteration   2: 18933.815 ops/s
[info] # Warmup Iteration   3: 18840.870 ops/s
[info] # Warmup Iteration   4: 19253.735 ops/s
[info] # Warmup Iteration   5: 18862.716 ops/s
[info] # Warmup Iteration   6: 19902.011 ops/s
[info] # Warmup Iteration   7: 19253.776 ops/s
[info] # Warmup Iteration   8: 19218.099 ops/s
[info] # Warmup Iteration   9: 19443.786 ops/s
[info] # Warmup Iteration  10: 19551.489 ops/s
[info] Iteration   1: 18890.810 ops/s
[info] Iteration   2: 19778.951 ops/s
[info] Iteration   3: 19063.024 ops/s
[info] Iteration   4: 19339.081 ops/s
[info] Iteration   5: 19630.391 ops/s
[info] Iteration   6: 19731.254 ops/s
[info] Iteration   7: 19288.642 ops/s
[info] Iteration   8: 19285.192 ops/s
[info] Iteration   9: 19372.939 ops/s
[info] Iteration  10: 19362.630 ops/s
[info] Result "p1.Bench.scalaMatch":
[info]   19374.291 ±(99.9%) 422.856 ops/s [Average]
[info]   (min, avg, max) = (18890.810, 19374.291, 19778.951), stdev = 279.693
[info]   CI (99.9%): [18951.436, 19797.147] (assumes normal distribution)
[info] # Run complete. Total time: 00:10:01
[info] REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
[info] why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
[info] experiments, perform baseline and negative tests that provide experimental control, make sure
[info] the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
[info] Do not assume the numbers tell you what you want them to tell.
[info] NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
[info] extra caution when trusting the results, look into the generated code to check the benchmark still
[info] works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
[info] different JVMs are already problematic, the performance difference caused by different Blackhole
[info] modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.
[info] Benchmark          Mode  Cnt      Score     Error  Units
[info] Bench.javaIfElse  thrpt   10  24243.021 ± 281.926  ops/s
[info] Bench.javaSwitch  thrpt   10   1380.937 ±  19.946  ops/s
[info] Bench.scalaMatch  thrpt   10  19374.291 ± 422.856  ops/s
```
