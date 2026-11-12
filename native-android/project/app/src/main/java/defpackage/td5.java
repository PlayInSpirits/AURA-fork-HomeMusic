package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class td5 {
    public final dd5 a;
    public final Context b;
    public final String c;
    public final bq4 d;
    public final r90 e;
    public final xi4 f;
    public final pq3 g;
    public final WorkDatabase h;
    public final fd5 i;
    public final wo0 j;
    public final ArrayList k;
    public final String l;
    public final t22 m;

    public td5(lv4 r8) {
        dd5 r0 = (dd5) r8.s;
        this.a = r0;
        this.b = (Context) r8.n;
        String r1 = r0.a;
        this.c = r1;
        this.d = (bq4) r8.p;
        r90 r2 = (r90) r8.o;
        this.e = r2;
        this.f = r2.d;
        this.g = (pq3) r8.q;
        WorkDatabase r3 = (WorkDatabase) r8.r;
        this.h = r3;
        this.i = r3.A();
        this.j = r3.v();
        ArrayList r4 = (ArrayList) r8.t;
        this.k = r4;
        this.l = b11.q(xa3.j("Work [ id=", r1, ", tags={ "), q40.B0(r4, ",", null, null, null, 62), " } ]");
        this.m = gb.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [vd0] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static final Object a(td5 r20, wd0 r21) {
        final td5 r1 = r20;
        String r2 = r1.c;
        bq4 r3 = r1.d;
        WorkDatabase r4 = r1.h;
        r90 r5 = r1.e;
        i80 r6 = r5.m;
        dd5 r7 = r1.a;
        if ((r21 instanceof rd5) == false) goto L7;
        rd5 r8 = (rd5) r21;
        int r9 = r8.q;
        if ((r9 & Integer.MIN_VALUE) == 0) goto L7;
        r8.q = r9 - Integer.MIN_VALUE;
    L8:
        Object r0 = r8.o;
        int r10 = r8.q;
        if (r10 == 0) goto L20;
        if (r10 != 1) goto L18;
        r1 = r8.n;
        kb4.X(r0);     // Catch: Throwable -> L14 CancellationException -> L16
    L92:
        nc2 r11 = (nc2) r0;     // Catch: Throwable -> L14 CancellationException -> L16
        r11.getClass();     // Catch: Throwable -> L14 CancellationException -> L16
        Object r12 = new nd5(r11);     // Catch: Throwable -> L14 CancellationException -> L16
    L126:
        return r12;
    L18:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L20:
        kb4.X(r0);
        fz0 r13 = r5.e;
        r6.getClass();
        boolean r14 = xl.y();
        String r15 = r7.x;
        String r16 = r7.c;
        String r17 = r7.d;
        oh0 r18 = r7.e;
        if (r14 == false) goto L48;
        if (r15 == null) goto L48;
        int r19 = r7.hashCode();
        if (Build.VERSION.SDK_INT < 29) goto L26;
        nv4.a(r19, xl.N(r15));
        goto L48
    L26:
        String r110 = xl.N(r15);
        if (xl.j == null) goto L30;
        dd5 r111 = r7;
        rd5 r112 = r8;
        oh0 r113 = r18;
    L45:
        xl.j.invoke(null, new Object[]{Long.valueOf(xl.h), r110, Integer.valueOf(r19)});     // Catch: Exception -> L36
    L49:
        final int r22 = 0;
        Boolean r23 = (Boolean) r4.r(new ld5(r1, r22));
        r23.getClass();
        if (r23.booleanValue() == false) goto L53;
        return new od5();
    L53:
        if (r111.d() == false) goto L55;
        oh0 r114 = r113;
        OverwritingInputMerger r24 = null;
    L79:
        UUID r25 = UUID.fromString(r2);
        ArrayList r26 = r1.k;
        ExecutorService r115 = r5.a;
        rm0 r27 = r5.b;
        qc5 r116 = new qc5(r4, r1.g, r3);
        WorkerParameters r28 = new WorkerParameters();
        r28.a = r25;
        r28.b = r114;
        new HashSet(r26);
        r28.c = r115;
        r28.d = r27;
        r28.e = r3;
        r28.f = r13;
        oc2 r29 = r13.g(r1.b, r16, r28);     // Catch: Throwable -> L99
        final int r117 = 1;
        r29.d = true;
        le0 r30 = r112.getContext().K(fz0.h0);
        r30.getClass();
        s22 r31 = (s22) r30;
        r31.M(new sd5(r29, r14, r15, r1));
        Object r32 = r4.r(new ld5(r1, r117));
        r32.getClass();
        if (((Boolean) r32).booleanValue() == true) goto L85;
        return new od5();
    L85:
        if (r31.isCancelled() == true) goto L125;
        vc5 r33 = (vc5) r3.q;
        r33.getClass();
        pe0 r34 = kb4.w(r33);
        r r35 = new r(r1, r29, r116, r24, 15);     // Catch: Throwable -> L14 CancellationException -> L16
        rd5 r36 = r112;
        r36.n = r1;     // Catch: Throwable -> L14 CancellationException -> L16
        r36.q = 1;     // Catch: Throwable -> L14 CancellationException -> L16
        r0 = fu.P(r34, r35, r36);     // Catch: Throwable -> L14 CancellationException -> L16
        r12 = xe0.n;
        if (r0 != r12) goto L92;
    L125:
        return new od5();
    L99:
        String r37 = ud5.a;
        cx.f().d(r37, "Could not create Worker " + r16);
        return new md5();
    L55:
        r5.f.getClass();
        r17.getClass();
        String r38 = oz1.a;
        r24 = null;
        Object r39 = Class.forName(r17).getDeclaredConstructor(null).newInstance(null);     // Catch: Exception -> L60
        r39.getClass();     // Catch: Exception -> L60
        OverwritingInputMerger r40 = (OverwritingInputMerger) r39;     // Catch: Exception -> L60
    L65:
        if (r40 != null) goto L67;
        cx.f().d(ud5.a, "Could not create Input Merger ".concat(r17));
        return new md5();
    L67:
        List r41 = gb.O(r113);
        fd5 r118 = r1.i;
        r118.getClass();
        w24 r119 = w24.b(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        r119.h(1, r2);
        WorkDatabase_Impl r120 = r118.a;
        r120.b();
        Cursor r121 = xl.H(r120, r119);
        ArrayList r122 = new ArrayList(r121.getCount());     // Catch: Throwable -> L73
    L70:
        if (r121.moveToNext() == false) goto L75;
        r122.add(oh0.a(r121.getBlob(0)));     // Catch: Throwable -> L73
        goto L70
    L75:
        r121.close();
        r119.j();
        ArrayList r42 = q40.G0(r41, r122);
        nh0 r123 = new nh0(0);
        LinkedHashMap r124 = new LinkedHashMap();
        int r125 = r42.size();
    L76:
        if (r22 >= r125) goto L78;
        Object r126 = r42.get(r22);
        r22 = r22 + 1;
        Map r127 = Collections.unmodifiableMap(((oh0) r126).a);
        r127.getClass();
        r124.putAll(r127);
        goto L76
    L78:
        r123.a(r124);
        r114 = new oh0(r123.a);
        bu.E(r114);
    L73:
        th = move-exception;
        r121.close();
        r119.j();
        throw th;
    L60:
        e = e;
    L64:
        cx.f().e(oz1.a, "Trouble instantiating ".concat(r17), e);
        r40 = r24;
    L62:
        e = e;
        r24 = null;
    L36:
        e = e;
    L47:
        xl.w("asyncTraceBegin", e);
        goto L49
    L30:
        r111 = r7;
        r113 = r18;
        r112 = r8;
        xl.j = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L36
    L40:
        e = e;
    L41:
        r112 = r8;
        r113 = r18;
    L42:
        e = e;
        r111 = r7;
    L48:
        r111 = r7;
        r112 = r8;
        r113 = r18;
    L16:
        e = move-exception;
        String r43 = ud5.a;
        cx r44 = cx.f();
        String r45 = b11.q(new StringBuilder(), r1.l, " was cancelled");
        if (r44.a > 4) goto L98;
        Log.i(r43, r45, e);
    L98:
        throw e;
    L14:
        th = move-exception;
        cx.f().e(ud5.a, b11.q(new StringBuilder(), r1.l, " failed because it threw an exception/error"), th);
        return new md5();
    L7:
        r8 = new rd5(r1, r21);
        goto L8
    }

    public final void b(int r6) {
        fd5 r0 = this.i;
        String r2 = this.c;
        r0.n(1, r2);
        this.f.getClass();
        r0.l(r2, System.currentTimeMillis());
        r0.k(this.a.v, r2);
        r0.j(r2, -1);
        r0.o(r6, r2);
    }

    public final void c() {
        this.f.getClass();
        long r0 = System.currentTimeMillis();
        fd5 r2 = this.i;
        String r3 = this.c;
        r2.l(r3, r0);
        r2.n(1, r3);
        WorkDatabase_Impl r1 = r2.a;
        r1.b();
        aq4 r4 = r2.j;
        df1 r5 = r4.a();
        r5.h(1, r3);
        r1.c();     // Catch: Throwable -> L19
        r5.b();     // Catch: Throwable -> L21
        r1.t();     // Catch: Throwable -> L21
        r1.o();     // Catch: Throwable -> L19
        r4.h(r5);
        r2.k(this.a.v, r3);
        r1.b();
        aq4 r6 = r2.f;
        df1 r7 = r6.a();
        r7.h(1, r3);
        r1.c();     // Catch: Throwable -> L12
        r7.b();     // Catch: Throwable -> L14
        r1.t();     // Catch: Throwable -> L14
        r1.o();     // Catch: Throwable -> L12
        r6.h(r7);
        r2.j(r3, -1);
        return;
    L14:
        th = move-exception;
        r1.o();     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r6.h(r7);
        throw th;
    L21:
        th = move-exception;
        r1.o();     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r4.h(r5);
        throw th;
    }

    public final void d(nc2 r7) {
        r7.getClass();
        String r0 = this.c;
        ArrayList r1 = gb.Q(new String[]{r0});
    L3:
        boolean r2 = r1.isEmpty();
        fd5 r3 = this.i;
        if (r2 == true) goto L9;
        String r4 = (String) v40.q0(r1);
        if (r3.g(r4) == 6) goto L8;
        r3.n(4, r4);
    L8:
        r1.addAll(this.j.w(r4));
        goto L3
    L9:
        oh0 r8 = ((kc2) r7).a;
        r8.getClass();
        r3.k(this.a.v, r0);
        r3.m(r0, r8);
    }
}
