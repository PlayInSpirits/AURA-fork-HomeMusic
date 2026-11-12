package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sc5 {
    public static sc5 k;
    public static sc5 l;
    public static final Object m = null;
    public final Context a;
    public final r90 b;
    public final WorkDatabase c;
    public final bq4 d;
    public final List e;
    public final pq3 f;
    public final rv1 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final z40 j;

    static {
        cx.i("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public sc5(Context r13, final r90 r14, bq4 r15, final WorkDatabase r16, final List r17, pq3 r18, z40 r19) {
        int r6 = 0;
        this.h = false;
        Context r7 = r13.getApplicationContext();
        if (r7.isDeviceProtectedStorage() == true) goto L18;
        cx r8 = new cx(r14.h);
        Object r9 = cx.c;
        monitor-enter(r9);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (cx.d != null) goto L11;
        cx.d = r8;     // Catch: Throwable -> L9
    L11:
        monitor-exit(r9);     // Catch: Throwable -> L9
        this.a = r7;
        this.d = r15;
        this.c = r16;
        this.f = r18;
        this.j = r19;
        this.b = r14;
        this.e = r17;
        pe0 r10 = (pe0) r15.o;
        r10.getClass();
        td0 r11 = te5.a(r10);
        int r12 = 1;
        this.g = new rv1(r16, 1);
        final ia4 r20 = (ia4) r15.n;
        String r110 = c64.a;
        r18.a(new b64(r20, r17, r14, r16));
        r15.h(new lb1(r7, this));
        String r0 = i15.a;
        if (nq3.a(r7, r14) == false) goto L22;
        fd5 r1 = r16.A();
        r1.getClass();
        w24 r2 = w24.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl r3 = r1.a;
        ed5 r4 = new ed5(r1, r2);
        x r5 = new x(9, r4);
        s12 r21 = r3.i();
        String[] r22 = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
        jy4 r23 = r21.b;
        kd3 r24 = r23.g(r22);
        ?? r25 = (String[]) r24.n;
        int[] r26 = (int[]) r24.o;
        r25.getClass();
        r26.getClass();
        vd0 r111 = null;
        int r27 = 2;
        fu.G(r11, null, null, new ac0(new x81(ya4.m(ya4.e(new x81(new j91(ya4.e(new gc0(r12, new x70(r23, r26, r25, r111, 7)), -1), r3, r5), new g15(4, null), r6), -1)), new h15(r7, null), r27), r111, r27), 3);
        return;
    L22:
        return;
    L18:
        kf2.o("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static sc5 b(Context r2) {
        Object r0 = m;
        monitor-enter(r0);
        monitor-enter(r0);     // Catch: Throwable -> L16
        sc5 r1 = k;     // Catch: Throwable -> L9
        if (r1 == null) goto L11;
        monitor-exit(r0);     // Catch: Throwable -> L9
    L13:
        if (r1 == null) goto L18;
        monitor-exit(r0);     // Catch: Throwable -> L16
        return r1;
    L18:
        r2.getApplicationContext();     // Catch: Throwable -> L16
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");     // Catch: Throwable -> L16
    L11:
        r1 = l;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    public final rv2 a(String r7, kf3 r8) {
        return new mc5(this, r7, 2, Collections.singletonList(r8), 0).a();
    }

    public final void c() {
        Object r0 = m;
        monitor-enter(r0);
        this.h = true;     // Catch: Throwable -> L8
        BroadcastReceiver.PendingResult r1 = this.i;     // Catch: Throwable -> L8
        if (r1 == null) goto L10;
        r1.finish();     // Catch: Throwable -> L8
        this.i = null;     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void d() {
        i80 r0 = this.b.m;
        e25 r2 = new e25(4, this);
        r0.getClass();
        boolean r4 = xl.y();
        if (r4 == true) goto L13;
    L5:
        r2.invoke();     // Catch: Throwable -> L9
        if (r4 == false) goto L15;
        Trace.endSection();
        return;
    L15:
        return;
    L9:
        th = move-exception;
        if (r4 == false) goto L12;
        Trace.endSection();
    L12:
        throw th;
    L13:
        Trace.beginSection(xl.N("ReschedulingWork"));     // Catch: Throwable -> L9
        goto L5
    }
}
