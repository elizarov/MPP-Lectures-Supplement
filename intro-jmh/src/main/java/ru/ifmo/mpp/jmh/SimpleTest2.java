package ru.ifmo.mpp.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Group)
public class SimpleTest2 {
    volatile int x;
    volatile int y;

    @Benchmark
    @Group
    public void threadP(IntResult2 r) {
        x = 1;
        r.r1 = y;
    }

    @Benchmark
    @Group
    public void threadQ(IntResult2 r) {
        x = 1;
        r.r1 = y;
    }
}
