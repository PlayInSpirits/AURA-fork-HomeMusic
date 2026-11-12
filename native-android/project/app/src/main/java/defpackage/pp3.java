package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pp3 {
    public boolean a;
    public long b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public pp3(ja r3) {
        this.c = r3;
        this.d = new AtomicReference(null);
        this.e = new z(13, this);
        this.f = new kl3(11, this);
        this.g = new f13(new sh4[16]);
        this.h = new Object();
        this.b = -1;
    }

    public static String b(Context r1) {
        return r1.getPackageName() + "_preferences";
    }

    public boolean a() {
        Object r0 = this.h;
        monitor-enter(r0);
        boolean r1 = this.a;     // Catch: Throwable -> L53
        monitor-exit(r0);
        if (r1 == false) goto L9;
        return false;
    L9:
        boolean r2 = false;
    L10:
        AtomicReference r3 = (AtomicReference) this.d;
    L11:
        Object r4 = r3.get();
        Set r5 = null;
        Object r6 = null;
        Object r7 = null;
        if (r4 == null) goto L29;
        if ((r4 instanceof Set) == false) goto L18;
        Set r8 = (Set) r4;
    L27:
        if (r3.compareAndSet(r4, r6) == true) goto L28;
        if (r3.get() == r4) goto L27;
    L28:
        r5 = r8;
        goto L29
    L18:
        if ((r4 instanceof List) == false) goto L51;
        List r9 = (List) r4;
        Set r10 = (Set) r9.get(0);
        if (r9.size() != 2) goto L23;
        r7 = r9.get(1);
    L25:
        r8 = r10;
        r6 = r7;
        goto L27
    L23:
        if (r9.size() <= 2) goto L25;
        r7 = r9.subList(1, r9.size());
        goto L25
    L51:
        l80.b("Unexpected notification");
        er1.a();
        return false;
    L29:
        if (r5 == null) goto L30;
        Object r11 = this.h;
        monitor-enter(r11);
        f13 r12 = (f13) this.g;     // Catch: Throwable -> L42
        Object[] r13 = r12.n;     // Catch: Throwable -> L42
        int r14 = r12.p;     // Catch: Throwable -> L42
        int r15 = 0;
    L34:
        if (r15 >= r14) goto L44;
        if (((sh4) r13[r15]).a(r5) == true) goto L40;
        if (r2 == true) goto L40;
        r2 = false;
    L41:
        r15 = r15 + 1;
    L40:
        r2 = true;
        goto L41
    L44:
        monitor-exit(r11);
    L42:
        th = move-exception;
        throw th;
    L30:
        return r2;
    L53:
        th = move-exception;
        throw th;
    }

    public SharedPreferences.Editor c() {
        if (this.a == false) goto L10;
        if (((SharedPreferences.Editor) this.e) != null) goto L8;
        this.e = d().edit();
    L8:
        return (SharedPreferences.Editor) this.e;
    L10:
        return d().edit();
    }

    public SharedPreferences d() {
        if (((SharedPreferences) this.d) != null) goto L6;
        this.d = ((Context) this.c).getSharedPreferences((String) this.f, 0);
    L6:
        return (SharedPreferences) this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(Object r27, if1 r28, gf1 r29) {
        long r3 = te5.m();
        Object r5 = this.h;
        monitor-enter(r5);
        f13 r6 = (f13) this.g;     // Catch: Throwable -> L136
        Object[] r7 = r6.n;     // Catch: Throwable -> L136
        int r8 = r6.p;     // Catch: Throwable -> L136
        int r10 = 0;
    L5:
        if (r10 >= r8) goto L10;
        Object r12 = r7[r10];     // Catch: Throwable -> L136
        if (((sh4) r12).a == r28) goto L11;
        r10 = r10 + 1;     // Catch: Throwable -> L136
    L11:
        sh4 r13 = (sh4) r12;     // Catch: Throwable -> L136
        boolean r9 = true;
        if (r13 != null) goto L14;
        r28.getClass();     // Catch: Throwable -> L136
        jz4.j(1, r28);     // Catch: Throwable -> L136
        r13 = new sh4(r28);     // Catch: Throwable -> L136
        r6.b(r13);     // Catch: Throwable -> L136
    L14:
        sh4 r2 = (sh4) this.j;     // Catch: Throwable -> L136
        long r14 = this.b;     // Catch: Throwable -> L136
        monitor-exit(r5);
        Object r11 = r6;
        if (r14 == (-1)) goto L150;
        r11 = r6;
        if (r14 == r3) goto L150;
        String r15 = Thread.currentThread().getName();
        StringBuilder r16 = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
        r16.append(r14);
        r16.append("), currentThread={id=");
        r16.append(r3);
        r16.append(", name=");
        r16.append(r15);
        r16.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        oo3.a(r16.toString());
        r11 = r16;
    L150:
        Object r17 = this.h;     // Catch: Throwable -> L29
        monitor-enter(r17);     // Catch: Throwable -> L29
        this.j = r13;     // Catch: Throwable -> L124
        this.b = r3;     // Catch: Throwable -> L124
        monitor-exit(r17);     // Catch: Throwable -> L29
        kl3 r4 = (kl3) this.f;     // Catch: Throwable -> L29
        Object r18 = r13.b;     // Catch: Throwable -> L29
        p03 r19 = r13.c;     // Catch: Throwable -> L29
        int r20 = r13.d;     // Catch: Throwable -> L29
        r13.b = r27;     // Catch: Throwable -> L29
        r13.c = (p03) r13.f.g(r27);     // Catch: Throwable -> L29
        if (r13.d != (-1)) goto L31;
        r13.d = Long.hashCode(jh4.j().g());     // Catch: Throwable -> L29
    L31:
        qg1 r0 = r13.i;     // Catch: Throwable -> L29
        f13 r21 = uc5.n();     // Catch: Throwable -> L29
        r21.b(r0);     // Catch: Throwable -> L35
        if (r4 != null) goto L37;
        r29.invoke();     // Catch: Throwable -> L35
        sh4 r210 = r13;
    L62:
        r21.k(r21.p - 1);     // Catch: Throwable -> L29
        sh4 r110 = r210;
        Object r1 = r110.b;     // Catch: Throwable -> L29
        r1.getClass();     // Catch: Throwable -> L29
        int r22 = r110.d;     // Catch: Throwable -> L29
        p03 r23 = r110.c;     // Catch: Throwable -> L29
        if (r23 != null) goto L152;
    L96:
        long r111 = r14;
    L99:
        r110.b = r18;     // Catch: Throwable -> L108
        r110.c = r19;     // Catch: Throwable -> L108
        r110.d = r20;     // Catch: Throwable -> L108
        Object r24 = this.h;
        monitor-enter(r24);
        this.j = r2;     // Catch: Throwable -> L105
        this.b = r111;     // Catch: Throwable -> L105
        monitor-exit(r24);
        return;
    L105:
        th = move-exception;
        throw th;
    L108:
        th = th;
    L109:
        long r25 = r111;
    L128:
        Object r26 = this.h;
        monitor-enter(r26);
        this.j = r2;     // Catch: Throwable -> L133
        this.b = r25;     // Catch: Throwable -> L133
        monitor-exit(r26);
        throw th;
    L133:
        th = move-exception;
        throw th;
    L152:
        long[] r112 = r23.a;     // Catch: Throwable -> L97
        int r113 = r112.length - 2;     // Catch: Throwable -> L97
        if (r113 < 0) goto L96;
        int r114 = 0;
    L67:
        long r30 = r112[r114];     // Catch: Throwable -> L97
        boolean r115 = r9;
        p03 r116 = r23;
        if (((((~r30) << 7) & r30) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L93;
        int r31 = 8 - ((~(r114 - r113)) >>> 31);     // Catch: Throwable -> L97
        int r32 = 0;
    L70:
        if (r32 >= r31) goto L90;
        if ((r30 & 255) >= 128) goto L88;
        int r211 = r32;
        int r33 = (r114 << 3) + r211;     // Catch: Throwable -> L97
        long r212 = r30;
        p03 r34 = r116;
        Object r117 = r34.b[r33];     // Catch: Throwable -> L97
        r111 = r14;
        if (r34.c[r33] == r22) goto L78;
        boolean r118 = r115;
    L79:
        if (r118 == false) goto L85;
        w03 r119 = r110.e;     // Catch: Throwable -> L108
        te5.I(r119, r117, r1);     // Catch: Throwable -> L108
        Object r213 = r1;
        if ((r117 instanceof dp0) == true) goto L83;
    L86:
        if (r118 == false) goto L89;
        r34.f(r33);     // Catch: Throwable -> L108
    L89:
        r32 = r211 + 1;     // Catch: Throwable -> L108
        long r214 = r111;
        r116 = r34;
        r30 = r212 >> 8;     // Catch: Throwable -> L108
        r14 = r214;
        r1 = r213;
        goto L70
    L83:
        if (r119.c(r117) == true) goto L86;
        te5.J(r110.l, r117);     // Catch: Throwable -> L108
        r110.m.remove(r117);     // Catch: Throwable -> L108
        goto L86
    L85:
        r213 = r1;
        goto L86
    L78:
        r118 = false;
        goto L79
    L88:
        r213 = r1;
        r211 = r32;
        r212 = r30;
        r34 = r116;
        r111 = r14;
        goto L89
    L90:
        Object r215 = r1;
        p03 r35 = r116;
        r111 = r14;
        if (r31 != 8) goto L99;
    L94:
        if (r114 == r113) goto L99;
        r114 = r114 + 1;     // Catch: Throwable -> L108
        r23 = r35;
        r9 = r115;
        r14 = r111;
        r1 = r215;
        goto L67
    L93:
        r215 = r1;
        r35 = r116;
        r111 = r14;
    L97:
        th = th;
        r111 = r14;
        goto L109
    L37:
        ch4 r120 = (ch4) jh4.b.f();     // Catch: Throwable -> L35
        if ((r120 instanceof ox4) == false) goto L47;
        r210 = r13;
        if (((ox4) r120).t != te5.m()) goto L48;
        if1 r121 = ((ox4) r120).r;     // Catch: Throwable -> L35
        if1 r122 = ((ox4) r120).s;     // Catch: Throwable -> L35
        ((ox4) r120).r = jh4.k(r4, r121, true);     // Catch: Throwable -> L44
        ((ox4) r120).s = r122;     // Catch: Throwable -> L44
        r29.invoke();     // Catch: Throwable -> L44
        ((ox4) r120).r = r121;     // Catch: Throwable -> L35
        ((ox4) r120).s = r122;     // Catch: Throwable -> L35
        goto L62
    L44:
        th = move-exception;
        ((ox4) r120).r = r121;     // Catch: Throwable -> L35
        ((ox4) r120).s = r122;     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L48:
        if (r120 == null) goto L54;
        if ((r120 instanceof a13) == true) goto L54;
        ch4 r123 = r120.u(r4);     // Catch: Throwable -> L35
    L148:
        ch4 r36 = r123.j();     // Catch: Throwable -> L110
        r29.invoke();     // Catch: Throwable -> L112
        ch4.q(r36);     // Catch: Throwable -> L110
        r123.c();     // Catch: Throwable -> L35
    L112:
        th = move-exception;
        ch4.q(r36);     // Catch: Throwable -> L116
        throw th;     // Catch: Throwable -> L116
    L116:
        th = th;
    L162:
        r123.c();     // Catch: Throwable -> L119
        throw th;     // Catch: Throwable -> L119
    L119:
        th = th;
    L120:
        r21.k(r21.p - 1);     // Catch: Throwable -> L122
        throw th;     // Catch: Throwable -> L122
    L110:
        th = th;
    L54:
        if ((r120 instanceof a13) == false) goto L56;
        a13 r124 = (a13) r120;     // Catch: Throwable -> L35
    L57:
        r123 = new ox4(r124, r4, null, true, false);     // Catch: Throwable -> L35
        goto L148
    L56:
        r124 = null;
        goto L57
    L47:
        r210 = r13;
    L35:
        th = th;
        goto L120
    L122:
        th = th;
        r25 = r11;
    L124:
        th = move-exception;
        throw th;     // Catch: Throwable -> L122
    L29:
        th = th;
        r25 = r14;
        goto L128
    L10:
        r12 = null;
    L136:
        th = move-exception;
        throw th;
    }

    public pp3(Context r3) {
        this.b = 0;
        this.c = r3;
        this.f = b(r3);
        this.d = null;
    }
}
