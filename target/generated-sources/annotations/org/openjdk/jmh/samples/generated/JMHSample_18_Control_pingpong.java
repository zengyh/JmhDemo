package org.openjdk.jmh.samples.generated;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.runner.InfraControl;
import org.openjdk.jmh.infra.ThreadParams;
import org.openjdk.jmh.results.BenchmarkTaskResult;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.ThroughputResult;
import org.openjdk.jmh.results.AverageTimeResult;
import org.openjdk.jmh.results.SampleTimeResult;
import org.openjdk.jmh.results.SingleShotResult;
import org.openjdk.jmh.util.SampleBuffer;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.results.RawResults;
import org.openjdk.jmh.results.ResultRole;
import java.lang.reflect.Field;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.IterationParams;

import org.openjdk.jmh.infra.generated.Blackhole_jmh;
import org.openjdk.jmh.infra.generated.Control_jmh;
import org.openjdk.jmh.samples.generated.JMHSample_18_Control_jmh;
@Generated("org.openjdk.jmh.generators.core.BenchmarkGenerator")
public final class JMHSample_18_Control_pingpong {

    boolean p000, p001, p002, p003, p004, p005, p006, p007, p008, p009, p010, p011, p012, p013, p014, p015;
    boolean p016, p017, p018, p019, p020, p021, p022, p023, p024, p025, p026, p027, p028, p029, p030, p031;
    boolean p032, p033, p034, p035, p036, p037, p038, p039, p040, p041, p042, p043, p044, p045, p046, p047;
    boolean p048, p049, p050, p051, p052, p053, p054, p055, p056, p057, p058, p059, p060, p061, p062, p063;
    boolean p064, p065, p066, p067, p068, p069, p070, p071, p072, p073, p074, p075, p076, p077, p078, p079;
    boolean p080, p081, p082, p083, p084, p085, p086, p087, p088, p089, p090, p091, p092, p093, p094, p095;
    boolean p096, p097, p098, p099, p100, p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111;
    boolean p112, p113, p114, p115, p116, p117, p118, p119, p120, p121, p122, p123, p124, p125, p126, p127;
    boolean p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140, p141, p142, p143;
    boolean p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159;
    boolean p160, p161, p162, p163, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175;
    boolean p176, p177, p178, p179, p180, p181, p182, p183, p184, p185, p186, p187, p188, p189, p190, p191;
    boolean p192, p193, p194, p195, p196, p197, p198, p199, p200, p201, p202, p203, p204, p205, p206, p207;
    boolean p208, p209, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219, p220, p221, p222, p223;
    boolean p224, p225, p226, p227, p228, p229, p230, p231, p232, p233, p234, p235, p236, p237, p238, p239;
    boolean p240, p241, p242, p243, p244, p245, p246, p247, p248, p249, p250, p251, p252, p253, p254, p255;
    int startRndMask;

    public BenchmarkTaskResult pingpong_Throughput(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_jmhsample_18_control0_G.ping(l_control2_G);
                res.allOps++;
            }

            l_control2_G.startMeasurement = true;
            ping_thrpt_jmhStub(control, res, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            l_control2_G.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_jmhsample_18_control0_G.ping(l_control2_G);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = control.iterationParams.getBatchSize();
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "ping", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            results.add(new ThroughputResult(ResultRole.SECONDARY, "ping", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_jmhsample_18_control0_G.pong(l_control2_G);
                res.allOps++;
            }

            l_control2_G.startMeasurement = true;
            pong_thrpt_jmhStub(control, res, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            l_control2_G.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_jmhsample_18_control0_G.pong(l_control2_G);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = control.iterationParams.getBatchSize();
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "pong", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            results.add(new ThroughputResult(ResultRole.SECONDARY, "pong", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void ping_thrpt_jmhStub(InfraControl control, RawResults result, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_jmhsample_18_control0_G.ping(l_control2_G);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public void pong_thrpt_jmhStub(InfraControl control, RawResults result, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_jmhsample_18_control0_G.pong(l_control2_G);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult pingpong_AverageTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_jmhsample_18_control0_G.ping(l_control2_G);
                res.allOps++;
            }

            l_control2_G.startMeasurement = true;
            ping_avgt_jmhStub(control, res, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            l_control2_G.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_jmhsample_18_control0_G.ping(l_control2_G);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = control.iterationParams.getBatchSize();
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "ping", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            results.add(new AverageTimeResult(ResultRole.SECONDARY, "ping", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_jmhsample_18_control0_G.pong(l_control2_G);
                res.allOps++;
            }

            l_control2_G.startMeasurement = true;
            pong_avgt_jmhStub(control, res, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            l_control2_G.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_jmhsample_18_control0_G.pong(l_control2_G);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = control.iterationParams.getBatchSize();
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "pong", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            results.add(new AverageTimeResult(ResultRole.SECONDARY, "pong", res.measuredOps, res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void ping_avgt_jmhStub(InfraControl control, RawResults result, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_jmhsample_18_control0_G.ping(l_control2_G);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public void pong_avgt_jmhStub(InfraControl control, RawResults result, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_jmhsample_18_control0_G.pong(l_control2_G);
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult pingpong_SampleTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_jmhsample_18_control0_G.ping(l_control2_G);
                res.allOps++;
            }

            l_control2_G.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = control.iterationParams.getBatchSize();
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            ping_sample_jmhStub(control, res, buffer, targetSamples, opsPerInv, batchSize, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            l_control2_G.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_jmhsample_18_control0_G.ping(l_control2_G);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "ping", buffer, control.benchmarkParams.getTimeUnit()));
            results.add(new SampleTimeResult(ResultRole.SECONDARY, "ping", buffer, control.benchmarkParams.getTimeUnit()));
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_jmhsample_18_control0_G.pong(l_control2_G);
                res.allOps++;
            }

            l_control2_G.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = control.iterationParams.getBatchSize();
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            pong_sample_jmhStub(control, res, buffer, targetSamples, opsPerInv, batchSize, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            l_control2_G.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_jmhsample_18_control0_G.pong(l_control2_G);
                    res.allOps++;
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(res.allOps, res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "pong", buffer, control.benchmarkParams.getTimeUnit()));
            results.add(new SampleTimeResult(ResultRole.SECONDARY, "pong", buffer, control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void ping_sample_jmhStub(InfraControl control, RawResults result, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_jmhsample_18_control0_G.ping(l_control2_G);
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public void pong_sample_jmhStub(InfraControl control, RawResults result, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_jmhsample_18_control0_G.pong(l_control2_G);
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult pingpong_SingleShotTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            RawResults res = new RawResults();
            int batchSize = control.iterationParams.getBatchSize();
            ping_ss_jmhStub(control, batchSize, res, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            control.preTearDown();
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "ping", res.getTime(), control.benchmarkParams.getTimeUnit()));
            results.add(new SingleShotResult(ResultRole.SECONDARY, "ping", res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            Control_jmh l_control2_G = _jmh_tryInit_f_control2_G(control, threadParams);
            Blackhole_jmh l_blackhole1_0 = _jmh_tryInit_f_blackhole1_0(control, threadParams);
            JMHSample_18_Control_jmh l_jmhsample_18_control0_G = _jmh_tryInit_f_jmhsample_18_control0_G(control, threadParams);

            control.preSetup();
            l_blackhole1_0.clearSinks();
            if (Control_jmh.setupIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (!l_control2_G.readyIteration) {
                        l_control2_G.setup();
                        l_control2_G.readyIteration = true;
                    }
                } finally {
                    Control_jmh.setupIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.setupIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            RawResults res = new RawResults();
            int batchSize = control.iterationParams.getBatchSize();
            pong_ss_jmhStub(control, batchSize, res, l_control2_G, l_jmhsample_18_control0_G, l_blackhole1_0);
            control.preTearDown();
            if (Control_jmh.tearIterationMutexUpdater.compareAndSet(l_control2_G, 0, 1)) {
                try {
                    if (l_control2_G.readyIteration) {
                        l_control2_G.readyIteration = false;
                    }
                } finally {
                    Control_jmh.tearIterationMutexUpdater.set(l_control2_G, 0);
                }
            } else {
                while (Control_jmh.tearIterationMutexUpdater.get(l_control2_G) == 1) {
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }

            if (control.isLastIteration()) {
                synchronized(this.getClass()) {
                    f_control2_G = null;
                }
                f_blackhole1_0 = null;
                synchronized(this.getClass()) {
                    f_jmhsample_18_control0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "pong", res.getTime(), control.benchmarkParams.getTimeUnit()));
            results.add(new SingleShotResult(ResultRole.SECONDARY, "pong", res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void ping_ss_jmhStub(InfraControl control, int batchSize, RawResults result, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_jmhsample_18_control0_G.ping(l_control2_G);
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    public void pong_ss_jmhStub(InfraControl control, int batchSize, RawResults result, Control_jmh l_control2_G, JMHSample_18_Control_jmh l_jmhsample_18_control0_G, Blackhole_jmh l_blackhole1_0) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_jmhsample_18_control0_G.pong(l_control2_G);
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    
    static volatile Control_jmh f_control2_G;
    
    Control_jmh _jmh_tryInit_f_control2_G(InfraControl control, ThreadParams threadParams) throws Throwable {
        Control_jmh val = f_control2_G;
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            val = f_control2_G;
            if (val != null) {
                return val;
            }
            val = new Control_jmh();
            val.readyTrial = true;
            f_control2_G = val;
        }
        return val;
    }
    
    Blackhole_jmh f_blackhole1_0;
    
    Blackhole_jmh _jmh_tryInit_f_blackhole1_0(InfraControl control, ThreadParams threadParams) throws Throwable {
        Blackhole_jmh val = f_blackhole1_0;
        if (val == null) {
            val = new Blackhole_jmh();
            f_blackhole1_0 = val;
        }
        return val;
    }
    
    static java.util.Map<Integer, JMHSample_18_Control_jmh> f_jmhsample_18_control0_G_map = java.util.Collections.synchronizedMap(new java.util.HashMap<Integer, JMHSample_18_Control_jmh>());
    
    JMHSample_18_Control_jmh _jmh_tryInit_f_jmhsample_18_control0_G(InfraControl control, ThreadParams threadParams) throws Throwable {
        JMHSample_18_Control_jmh val = f_jmhsample_18_control0_G_map.get(threadParams.getGroupIndex());
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            val = f_jmhsample_18_control0_G_map.get(threadParams.getGroupIndex());
            if (val != null) {
                return val;
            }
            val = new JMHSample_18_Control_jmh();
            val.readyTrial = true;
            f_jmhsample_18_control0_G_map.put(threadParams.getGroupIndex(), val);
        }
        return val;
    }


}

