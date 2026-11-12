package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bl implements ck2 {
    public static final ArrayDeque t = null;
    public static final Object u = null;
    public final MediaCodec n;
    public final HandlerThread o;
    public zk p;
    public final AtomicReference q;
    public final q90 r;
    public boolean s;

    static {
        t = new ArrayDeque();
        u = new Object();
    }

    public bl(MediaCodec r2, HandlerThread r3) {
        q90 r0 = new q90();
        this.n = r2;
        this.o = r3;
        this.r = r0;
        this.q = new AtomicReference();
    }

    public static al a() {
        ArrayDeque r0 = t;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r0.isEmpty() == false) goto L11;
        al r1 = new al();     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r1;
    L11:
        al r2 = (al) r0.removeFirst();     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r2;
    }

    @Override // defpackage.ck2
    public final void c(Bundle r2) {
        j();
        zk r1 = this.p;
        String r0 = f35.a;
        r1.obtainMessage(4, r2).sendToTarget();
    }

    @Override // defpackage.ck2
    public final void e(int r4, fg0 r5, long r6, int r8) {
        j();
        al r0 = a();
        r0.a = r4;
        r0.b = 0;
        r0.d = r6;
        r0.e = r8;
        MediaCodec.CryptoInfo r7 = r0.c;
        r7.numSubSamples = r5.f;
        int[] r9 = r5.d;
        int[] r10 = r7.numBytesOfClearData;
        if (r9 == null) goto L11;
        if (r10 != null) goto L7;
    L10:
        r10 = Arrays.copyOf(r9, r9.length);
        goto L11
    L7:
        if (r10.length < r9.length) goto L10;
        System.arraycopy(r9, 0, r10, 0, r9.length);
    L11:
        r7.numBytesOfClearData = r10;
        int[] r11 = r5.e;
        int[] r12 = r7.numBytesOfEncryptedData;
        if (r11 == null) goto L20;
        if (r12 != null) goto L16;
    L19:
        r12 = Arrays.copyOf(r11, r11.length);
        goto L20
    L16:
        if (r12.length < r11.length) goto L19;
        System.arraycopy(r11, 0, r12, 0, r11.length);
    L20:
        r7.numBytesOfEncryptedData = r12;
        byte[] r13 = r5.b;
        byte[] r14 = r7.key;
        if (r13 == null) goto L29;
        if (r14 != null) goto L25;
    L28:
        r14 = Arrays.copyOf(r13, r13.length);
        goto L29
    L25:
        if (r14.length < r13.length) goto L28;
        System.arraycopy(r13, 0, r14, 0, r13.length);
    L29:
        r14.getClass();
        r7.key = r14;
        byte[] r15 = r5.a;
        byte[] r16 = r7.iv;
        if (r15 == null) goto L38;
        if (r16 != null) goto L34;
    L37:
        r16 = Arrays.copyOf(r15, r15.length);
        goto L38
    L34:
        if (r16.length < r15.length) goto L37;
        System.arraycopy(r15, 0, r16, 0, r15.length);
    L38:
        r16.getClass();
        r7.iv = r16;
        r7.mode = r5.c;
        r7.setPattern(new MediaCodec.CryptoInfo.Pattern(r5.g, r5.h));
        zk r3 = this.p;
        String r17 = f35.a;
        r3.obtainMessage(2, r0).sendToTarget();
    }

    @Override // defpackage.ck2
    public final void f(int r2, int r3, int r4, long r5) {
        j();
        al r0 = a();
        r0.a = r2;
        r0.b = r3;
        r0.d = r5;
        r0.e = r4;
        zk r1 = this.p;
        String r6 = f35.a;
        r1.obtainMessage(1, r0).sendToTarget();
    }

    @Override // defpackage.ck2
    public final void flush() {
        if (this.s == true) goto L20;
        return;
    L20:
        zk r0 = this.p;     // Catch: InterruptedException -> L14
        r0.getClass();     // Catch: InterruptedException -> L14
        r0.removeCallbacksAndMessages(null);     // Catch: InterruptedException -> L14
        q90 r1 = this.r;     // Catch: InterruptedException -> L14
        monitor-enter(r1);     // Catch: InterruptedException -> L14
        r1.b = false;     // Catch: Throwable -> L11
        monitor-exit(r1);     // Catch: InterruptedException -> L14
        zk r2 = this.p;     // Catch: InterruptedException -> L14
        r2.getClass();     // Catch: InterruptedException -> L14
        r2.obtainMessage(3).sendToTarget();     // Catch: InterruptedException -> L14
        r1.a();     // Catch: InterruptedException -> L14
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: InterruptedException -> L14
    L14:
        e = move-exception;
        Thread.currentThread().interrupt();
        throw new IllegalStateException(e);
    }

    @Override // defpackage.ck2
    public final void j() {
        RuntimeException r1 = (RuntimeException) this.q.getAndSet(null);
        if (r1 != null) goto L5;
        return;
    L5:
        throw r1;
    }

    @Override // defpackage.ck2
    public final void shutdown() {
        if (this.s == false) goto L5;
        flush();
        this.o.quit();
    L5:
        this.s = false;
    }

    @Override // defpackage.ck2
    public final void start() {
        if (this.s == true) goto L6;
        HandlerThread r0 = this.o;
        r0.start();
        this.p = new zk(this, r0.getLooper(), 0);
        this.s = true;
        return;
    }
}
