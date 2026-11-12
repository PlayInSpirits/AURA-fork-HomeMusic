package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yk implements ak2 {
    public final /* synthetic */ int n;
    public int o;
    public boolean p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;

    public yk() {
        this.n = 2;
        this.q = new Object();
        this.r = new oi(0);
    }

    public static void b(yk r5, MediaFormat r6, Surface r7, MediaCrypto r8, int r9) {
        cl r0 = (cl) r5.r;
        MediaCodec r1 = (MediaCodec) r5.q;
        HandlerThread r2 = r0.b;
        if (r0.c != null) goto L5;
        boolean r3 = true;
    L6:
        rr2.w(r3);
        r2.start();
        Handler r4 = new Handler(r2.getLooper());
        r1.setCallback(r0, r4);
        r0.c = r4;
        Trace.beginSection("configureCodec");
        r1.configure(r6, r7, r8, r9);
        Trace.endSection();
        ((ck2) r5.s).start();
        Trace.beginSection("startCodec");
        r1.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT < 35) goto L16;
        ns3 r10 = (ns3) r5.t;
        if (r10 == null) goto L16;
        LoudnessCodecController r11 = (LoudnessCodecController) r10.q;
        if (r11 != null) goto L13;
    L15:
        rr2.w(((HashSet) r10.o).add(r1));
        goto L16
    L13:
        if (vk.i(r11, r1) == true) goto L15;
    L16:
        r5.o = 1;
        return;
    L5:
        r3 = false;
        goto L6
    }

    public static String o(int r1, String r2) {
        StringBuilder r0 = new StringBuilder(r2);
        if (r1 != 1) goto L6;
        r0.append("Audio");
    L10:
        return r0.toString();
    L6:
        if (r1 != 2) goto L8;
        r0.append("Video");
        goto L10
    L8:
        r0.append("Unknown(");
        r0.append(r1);
        r0.append(")");
        goto L10
    }

    @Override // defpackage.ak2
    public void a() {
        switch(this.n) {
            case 0: goto L82;
            default: goto L4;
        };
    L4:
        Object r0 = this.q;
        monitor-enter(r0);
        this.p = true;     // Catch: Throwable -> L9
        ArrayList r1 = new ArrayList(((oi) this.r).values());     // Catch: Throwable -> L9
        ((oi) this.r).clear();     // Catch: Throwable -> L9
        if (((sl2) this.s) == null) goto L11;
        Handler r2 = (Handler) this.t;     // Catch: Throwable -> L9
        r2.getClass();     // Catch: Throwable -> L9
        r2.post((sl2) this.s);     // Catch: Throwable -> L9
        this.s = null;     // Catch: Throwable -> L9
        this.t = null;     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        int r7 = r1.size();
        int r3 = 0;
    L13:
        if (r3 >= r7) goto L15;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        ((ea4) r4).q();
        goto L13
    L15:
        return;
    L9:
        th = move-exception;
        throw th;
    L82:
    L29:
        th = move-exception;
        if (this.p == false) goto L80;
    L75:
        throw th;
    L80:
        int r5 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L61
        if (r5 < 30) goto L63;
        if (r5 >= 33) goto L63;
        ((MediaCodec) this.q).stop();     // Catch: Throwable -> L61
    L63:
        if (r5 < 35) goto L67;
        ns3 r6 = (ns3) this.t;
        if (r6 == null) goto L67;
        r6.e((MediaCodec) this.q);
    L67:
        ((MediaCodec) this.q).release();
        this.p = true;
    L61:
        th = move-exception;
        if (Build.VERSION.SDK_INT < 35) goto L73;
        ns3 r8 = (ns3) this.t;
        if (r8 == null) goto L73;
        r8.e((MediaCodec) this.q);
    L73:
        ((MediaCodec) this.q).release();
        this.p = true;
        throw th;
    L20:
        if (this.o != 1) goto L31;
        ((ck2) this.s).shutdown();     // Catch: Throwable -> L29
        cl r9 = (cl) this.r;     // Catch: Throwable -> L29
        Object r10 = r9.a;     // Catch: Throwable -> L29
        monitor-enter(r10);     // Catch: Throwable -> L29
        r9.m = true;     // Catch: Throwable -> L26
        r9.b.quit();     // Catch: Throwable -> L26
        r9.a();     // Catch: Throwable -> L26
        monitor-exit(r10);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L31:
        this.o = 2;     // Catch: Throwable -> L29
        if (this.p == false) goto L76;
        return;
    L76:
        int r11 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L39
        if (r11 < 30) goto L41;
        if (r11 >= 33) goto L41;
        ((MediaCodec) this.q).stop();     // Catch: Throwable -> L39
    L41:
        if (r11 < 35) goto L45;
        ns3 r12 = (ns3) this.t;
        if (r12 == null) goto L45;
        r12.e((MediaCodec) this.q);
    L45:
        ((MediaCodec) this.q).release();
        this.p = true;
        return;
    L39:
        th = move-exception;
        if (Build.VERSION.SDK_INT < 35) goto L51;
        ns3 r13 = (ns3) this.t;
        if (r13 == null) goto L51;
        r13.e((MediaCodec) this.q);
    L51:
        ((MediaCodec) this.q).release();
        this.p = true;
        throw th;
    }

    @Override // defpackage.ak2
    public void c(Bundle r1) {
        ((ck2) this.s).c(r1);
    }

    public boolean d(int r3, int r4) {
        bx2 r5 = (bx2) ((q03) this.r).f(this.o + r3);
        bx2 r2 = (bx2) ((q03) this.s).f(this.o + r4);
        if (h12.c(r5, r2) == false) goto L6;
        return true;
    L6:
        if (r5.getClass() != r2.getClass()) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // defpackage.ak2
    public void e(int r7, fg0 r8, long r9, int r11) {
        ((ck2) this.s).e(r7, r8, r9, r11);
    }

    @Override // defpackage.ak2
    public void f(int r7, int r8, int r9, long r10) {
        ((ck2) this.s).f(r7, r8, r9, r10);
    }

    @Override // defpackage.ak2
    public void flush() {
        ((ck2) this.s).flush();
        ((MediaCodec) this.q).flush();
        cl r0 = (cl) this.r;
        Object r1 = r0.a;
        monitor-enter(r1);
        r0.l++;     // Catch: Throwable -> L8
        Handler r2 = r0.c;     // Catch: Throwable -> L8
        String r3 = f35.a;     // Catch: Throwable -> L8
        r2.post(new a0(7, r0));     // Catch: Throwable -> L8
        monitor-exit(r1);     // Catch: Throwable -> L8
        ((MediaCodec) this.q).start();
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public void g(int r2) {
        ((MediaCodec) this.q).releaseOutputBuffer(r2, false);
    }

    @Override // defpackage.ak2
    public MediaFormat h() {
        cl r1 = (cl) this.r;
        Object r0 = r1.a;
        monitor-enter(r0);
        MediaFormat r2 = r1.h;     // Catch: Throwable -> L8
        if (r2 == null) goto L11;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return r2;
    L11:
        throw new IllegalStateException();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public void i() {
        vk.g((MediaCodec) this.q);
    }

    public ea4 j(Object r4) {
        Object r0 = this.q;
        monitor-enter(r0);
        int r1 = s();     // Catch: Throwable -> L7
        ea4 r2 = new ea4(r1, r4);     // Catch: Throwable -> L7
        if (this.p == false) goto L9;
        r2.q();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r2;
    L9:
        ((oi) this.r).put(Integer.valueOf(r1), r2);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public void k(ws1 r4) {
        cl r0 = (cl) this.r;
        k6 r1 = new k6(3, this, r4);
        Object r3 = r0.a;
        monitor-enter(r3);
        r0.b();     // Catch: Throwable -> L7
        r1.run();     // Catch: Throwable -> L7
        monitor-exit(r3);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public void l(int r1, long r2) {
        ((MediaCodec) this.q).releaseOutputBuffer(r1, r2);
    }

    @Override // defpackage.ak2
    public int m() {
        ((ck2) this.s).j();
        cl r6 = (cl) this.r;
        Object r0 = r6.a;
        monitor-enter(r0);
        r6.b();     // Catch: Throwable -> L15
        boolean r2 = false;
        if (r6.l <= 0) goto L7;
    L10:
        boolean r1 = true;
    L11:
        int r4 = -1;
        if (r1 == false) goto L17;
        monitor-exit(r0);     // Catch: Throwable -> L15
        return -1;
    L17:
        b30 r7 = r6.d;     // Catch: Throwable -> L15
        int r3 = r7.a;     // Catch: Throwable -> L15
        int r5 = r7.b;     // Catch: Throwable -> L15
        if (r3 != r5) goto L20;
        r2 = true;
    L20:
        if (r2 == true) goto L24;
        if (r3 == r5) goto L27;
        r4 = r7.c[r3];     // Catch: Throwable -> L15
        r7.a = (r3 + 1) & r7.d;     // Catch: Throwable -> L15
        goto L24
    L27:
        throw new ArrayIndexOutOfBoundsException();     // Catch: Throwable -> L15
    L24:
        monitor-exit(r0);     // Catch: Throwable -> L15
        return r4;
    L7:
        if (r6.m == true) goto L10;
        r1 = false;
    L15:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public int n(MediaCodec.BufferInfo r10) {
        ((ck2) this.s).j();
        cl r9 = (cl) this.r;
        Object r1 = r9.a;
        monitor-enter(r1);
        r9.b();     // Catch: Throwable -> L15
        boolean r2 = false;
        if (r9.l <= 0) goto L7;
    L10:
        boolean r0 = true;
    L12:
        if (r0 == false) goto L17;
        monitor-exit(r1);     // Catch: Throwable -> L15
        return -1;
    L17:
        b30 r3 = r9.e;     // Catch: Throwable -> L15
        int r5 = r3.a;     // Catch: Throwable -> L15
        int r6 = r3.b;     // Catch: Throwable -> L15
        if (r5 != r6) goto L20;
        r2 = true;
    L20:
        if (r2 == false) goto L23;
        monitor-exit(r1);     // Catch: Throwable -> L15
        return -1;
    L23:
        if (r5 == r6) goto L33;
        int r4 = r3.c[r5];     // Catch: Throwable -> L15
        r3.a = r3.d & (r5 + 1);     // Catch: Throwable -> L15
        if (r4 < 0) goto L28;
        r9.h.getClass();     // Catch: Throwable -> L15
        MediaCodec.BufferInfo r11 = (MediaCodec.BufferInfo) r9.f.remove();     // Catch: Throwable -> L15
        r10.set(r11.offset, r11.size, r11.presentationTimeUs, r11.flags);     // Catch: Throwable -> L15
    L30:
        monitor-exit(r1);     // Catch: Throwable -> L15
        return r4;
    L28:
        if (r4 != (-2)) goto L30;
        r9.h = (MediaFormat) r9.g.remove();     // Catch: Throwable -> L15
        goto L30
    L33:
        throw new ArrayIndexOutOfBoundsException();     // Catch: Throwable -> L15
    L7:
        if (r9.m == true) goto L10;
        r0 = false;
    L15:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public void p(int r1) {
        ((MediaCodec) this.q).setVideoScalingMode(r1);
    }

    @Override // defpackage.ak2
    public ByteBuffer q(int r1) {
        return ((MediaCodec) this.q).getInputBuffer(r1);
    }

    @Override // defpackage.ak2
    public void r(Surface r1) {
        ((MediaCodec) this.q).setOutputSurface(r1);
    }

    public int s() {
        Object r0 = this.q;
        monitor-enter(r0);
        int r1 = this.o;     // Catch: Throwable -> L7
        this.o = r1 + 1;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public ByteBuffer t(int r1) {
        return ((MediaCodec) this.q).getOutputBuffer(r1);
    }

    @Override // defpackage.ak2
    public void u(ArrayList r1) {
        db.D((MediaCodec) this.q, r1);
    }

    @Override // defpackage.ak2
    public void v(nk2 r4, Handler r5) {
        ((MediaCodec) this.q).setOnFrameRenderedListener(new wk(this, r4, 0), r5);
    }

    @Override // defpackage.ak2
    public boolean w(om1 r2) {
        cl r1 = (cl) this.r;
        Object r0 = r1.a;
        monitor-enter(r0);
        r1.o = r2;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return true;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ak2
    public void x(ArrayList r1) {
        db.u((MediaCodec) this.q, r1);
    }

    public void y(int r5, Object r6) {
        Object r1 = this.q;
        monitor-enter(r1);
        ea4 r7 = (ea4) ((oi) this.r).remove(Integer.valueOf(r5));     // Catch: Throwable -> L9
        if (r7 == null) goto L13;
        if (r7.v.getClass() != r6.getClass()) goto L11;
        r7.l(r6);     // Catch: Throwable -> L9
        goto L13
    L11:
        l93.q0("SequencedFutureManager", "Type mismatch, expected " + r7.v.getClass() + ", but was " + r6.getClass());     // Catch: Throwable -> L9
    L13:
        if (((sl2) this.s) != null) goto L15;
    L17:
        monitor-exit(r1);     // Catch: Throwable -> L9
        return;
    L15:
        if (((oi) this.r).isEmpty() == false) goto L17;
        a();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public yk(MediaCodec r2, HandlerThread r3, ck2 r4, ns3 r5) {
        this.n = 0;
        this.q = r2;
        this.r = new cl(r3);
        this.s = r4;
        this.t = r5;
        this.o = 0;
    }

    public yk(w12 r2, cx2 r3, int r4, q03 r5, q03 r6, boolean r7) {
        this.n = 1;
        this.t = r2;
        this.q = r3;
        this.o = r4;
        this.r = r5;
        this.s = r6;
        this.p = r7;
    }
}
