package ru.ifmo.mpp.jmh;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Group)
public class IntResult2 {
    int r1;
    int r2;
}