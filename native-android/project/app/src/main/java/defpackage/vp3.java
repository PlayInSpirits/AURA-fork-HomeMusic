package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vp3 implements p82 {
    public final int a;
    public final rm3 b;
    public final if1 c;
    public nc0 d;
    public jn4 e;
    public in4 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public up3 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ ll r;

    public vp3(ll r1, int r2, rm3 r3, if1 r4) {
        this.r = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        int r5 = hx2.b;
        this.p = System.nanoTime() - hx2.a;
    }

    @Override // defpackage.p82
    public final void a() {
        this.m = true;
    }

    public final void b() {
        in4 r0 = this.f;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        this.f = null;
        jn4 r1 = this.e;
        if (r1 == null) goto L8;
        r1.a();
    L8:
        this.e = null;
        this.l = null;
    }

    public final boolean c(yn4 r3) {
        if (this.r.o == true) goto L7;
        return false;
    L7:
        if (this.m == false) goto L14;
        Trace.beginSection("compose:lazy:prefetch:execute:urgent");
        boolean r2 = d(r3);     // Catch: Throwable -> L11
        Trace.endSection();
    L15:
        si0.R("compose:lazy:prefetch:execute:item", -1);
        return r2;
    L11:
        th = move-exception;
        Trace.endSection();
        throw th;
    L14:
        r2 = d(r3);
        goto L15
    }

    @Override // defpackage.p82
    public final void cancel() {
        if (this.h == true) goto L6;
        this.h = true;
        b();
        return;
    }

    public final boolean d(yn4 r19) {
        int r1 = this.a;
        long r2 = r1;
        si0.R("compose:lazy:prefetch:execute:item", r2);
        nc3 r5 = (nc3) ((c82) this.r.p).b.invoke();
        if (this.h == true) goto L173;
        int r6 = r5.b();
        if (r1 < 0) goto L173;
        if (r1 >= r6) goto L173;
        Object r3 = r5.c(r1);
        Object r7 = this.j;
        if (r7 != null) goto L10;
    L13:
        rm3 r8 = this.b;
        zn r9 = (zn) r8.o;
        if (r9 != null) goto L20;
        w03 r10 = (w03) r8.n;
        Object r11 = r10.g(null);
        Object r12 = r11;
        if (r11 != null) goto L19;
        zn r13 = new zn();
        r13.e = -1;
        r10.l(null, r13);
        r12 = r13;
    L19:
        r9 = (zn) r12;
        r8.o = r9;
    L20:
        e();
        long r14 = r19.a();
        this.n = r14;
        int r15 = hx2.b;
        this.p = System.nanoTime() - hx2.a;
        this.o = 0;
        si0.R("compose:lazy:prefetch:available_time_nanos", r14);
        if (e() == true) goto L35;
        if (g(this.n, r9.a + r9.b) == false) goto L31;
        Trace.beginSection("compose:lazy:prefetch:compose");
        f(r3, r9);     // Catch: Throwable -> L27
        Trace.endSection();
    L27:
        th = move-exception;
        Trace.endSection();
        throw th;
    L31:
        if (e() == true) goto L35;
    L148:
        return true;
    L35:
        if (this.f == null) goto L49;
        if (g(this.n, r9.c) == false) goto L148;
        Trace.beginSection("compose:lazy:prefetch:apply");
        in4 r4 = this.f;     // Catch: Throwable -> L45
        if (r4 == null) goto L44;
        this.e = r4.apply();     // Catch: Throwable -> L45
        this.f = null;     // Catch: Throwable -> L45
        this.i = true;     // Catch: Throwable -> L45
        Trace.endSection();
        h();
        r9.c = zn.a(this.o, r9.c);
        goto L49
    L44:
        throw new IllegalArgumentException("Nothing to apply!");     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        Trace.endSection();
        throw th;
    L49:
        if (this.k == false) goto L51;
    L65:
        up3 r16 = this.l;
        if (r16 == null) goto L117;
        boolean r17 = this.m;
        List[] r18 = r16.b;
        int r110 = r16.c;
        List r111 = r16.a;
        if (r110 >= r111.size()) goto L117;
        if (r16.f.h == false) goto L73;
        fz1.c("Should not execute nested prefetch on canceled request");
    L73:
        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
        int r112 = r111.size();     // Catch: Throwable -> L114
        int r113 = 0;
    L75:
        if (r113 >= r112) goto L78;
        ((q82) r111.get(r113)).getClass();     // Catch: Throwable -> L114
        r113 = r113 + 1;
        goto L75
    L78:
        Trace.endSection();
        Trace.beginSection("compose:lazy:prefetch:nested");
    L183:
        if (r16.c >= r111.size()) goto L110;
        if (r18[r16.c] == null) goto L85;
    L93:
        List r20 = r18[r16.c];     // Catch: Throwable -> L111
        r20.getClass();     // Catch: Throwable -> L111
    L95:
        if (r16.d >= r20.size()) goto L108;
        vp3 r114 = (vp3) r20.get(r16.d);     // Catch: Throwable -> L111
        if (r17 == false) goto L103;
        if (r114 == null) goto L100;
        vp3 r115 = r114;
    L101:
        if (r115 == null) goto L103;
        r115.m = true;     // Catch: Throwable -> L111
        goto L103
    L100:
        r115 = null;
    L103:
        r16.e = true;     // Catch: Throwable -> L111
        if (r114.c(r19) == true) goto L105;
        r16.d++;     // Catch: Throwable -> L111
        goto L95
    L105:
        Trace.endSection();
        return true;
    L108:
        r16.d = 0;     // Catch: Throwable -> L111
        r16.c++;     // Catch: Throwable -> L111
        goto L183
    L85:
        if (r19.a() <= r12) goto L86;
        int r116 = r16.c;     // Catch: Throwable -> L111
        q82 r117 = (q82) r111.get(r116);     // Catch: Throwable -> L111
        uc3 r118 = r117.a;     // Catch: Throwable -> L111
        if (r118 != null) goto L91;
        List r119 = u01.n;     // Catch: Throwable -> L111
    L92:
        r18[r116] = r119;     // Catch: Throwable -> L111
        goto L93
    L91:
        o82 r21 = new o82(r117);     // Catch: Throwable -> L111
        r118.invoke(r21);     // Catch: Throwable -> L111
        ArrayList r22 = r21.a;     // Catch: Throwable -> L111
        r117.e = r22.size();     // Catch: Throwable -> L111
        r119 = r22;
        goto L92
    L86:
        Trace.endSection();
        return true;
    L110:
        Trace.endSection();
    L111:
        th = move-exception;
        Trace.endSection();
        throw th;
    L114:
        th = move-exception;
        Trace.endSection();
        throw th;
    L117:
        up3 r23 = this.l;
        if (r23 != null) goto L120;
    L124:
        nc0 r24 = this.d;
        if (this.g == true) goto L149;
        if (r24 == null) goto L149;
        if (g(this.n, r9.d) == false) goto L148;
        Trace.beginSection("compose:lazy:prefetch:measure");
        long r25 = r24.a;     // Catch: Throwable -> L145
        if (this.h == false) goto L134;
        fz1.a("Callers should check whether the request is still valid before calling performMeasure()");     // Catch: Throwable -> L145
    L134:
        if (this.g == false) goto L136;
        fz1.a("Request was already measured!");     // Catch: Throwable -> L145
    L136:
        this.g = true;     // Catch: Throwable -> L145
        jn4 r26 = this.e;     // Catch: Throwable -> L145
        if (r26 == null) goto L141;
        int r27 = r26.c();     // Catch: Throwable -> L145
        int r28 = 0;
    L139:
        if (r28 >= r27) goto L142;
        r26.d(r28, r25);     // Catch: Throwable -> L145
        r28 = r28 + 1;     // Catch: Throwable -> L145
    L142:
        Trace.endSection();
        h();
        r9.d = zn.a(this.o, r9.d);
        if1 r29 = this.c;
        if (r29 == null) goto L149;
        r29.invoke(this);
        goto L149
    L141:
        fz1.b("performComposition() must be called before performMeasure()");     // Catch: Throwable -> L145
        er1.a();     // Catch: Throwable -> L145
    L145:
        th = move-exception;
        Trace.endSection();
        throw th;
    L149:
        up3 r30 = this.l;
        if (this.g == true) goto L152;
        return false;
    L152:
        if (this.k == false) goto L193;
        if (r30 == null) goto L194;
        List r0 = r30.a;
        int r31 = r0.size();
        int r32 = Integer.MAX_VALUE;
        int r33 = 0;
    L155:
        if (r33 >= r31) goto L157;
        r32 = Math.min(r32, ((q82) r0.get(r33)).d);
        r33 = r33 + 1;
        goto L155
    L157:
        if (r32 != Integer.MAX_VALUE) goto L159;
        r32 = 0;
    L159:
        int r34 = r9.e;
        if (r34 != (-1)) goto L162;
        int r35 = r32;
    L163:
        r9.e = r35;
        int r36 = r0.size();
        int r37 = Integer.MAX_VALUE;
        int r38 = 0;
    L164:
        if (r38 >= r36) goto L166;
        r37 = Math.min(r37, ((q82) r0.get(r38)).e);
        r38 = r38 + 1;
        goto L164
    L166:
        if (r37 != Integer.MAX_VALUE) goto L168;
        r37 = 0;
    L168:
        if (r37 >= r32) goto L195;
        r9.d = 0;
        return false;
    L195:
        return false;
    L162:
        r35 = ((r34 * 3) + r32) / 4;
        goto L163
    L194:
        return false;
    L193:
        return false;
    L120:
        if (r23.e != true) goto L124;
        h();
        si0.R("compose:lazy:prefetch:execute:item", r2);
        up3 r39 = this.l;
        if (r39 == null) goto L124;
        r39.e = false;
        goto L124
    L51:
        if (this.n <= r12) goto L148;
        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
        jn4 r40 = this.e;     // Catch: Throwable -> L62
        if (r40 == null) goto L59;
        jx3 r41 = new jx3();     // Catch: Throwable -> L62
        r40.b(new ea(2, r41));     // Catch: Throwable -> L62
        List r42 = (List) r41.n;     // Catch: Throwable -> L62
        if (r42 == null) goto L58;
        up3 r43 = new up3(this, r42);     // Catch: Throwable -> L62
    L60:
        this.l = r43;     // Catch: Throwable -> L62
        this.k = true;     // Catch: Throwable -> L62
        Trace.endSection();
    L58:
        r43 = null;
        goto L60
    L59:
        fz1.b("Should precompose before resolving nested prefetch states");     // Catch: Throwable -> L62
        er1.a();     // Catch: Throwable -> L62
    L62:
        th = move-exception;
        Trace.endSection();
        throw th;
    L10:
        if (r3.equals(r7) == true) goto L13;
        b();
        return false;
    L173:
        b();
        return false;
    }

    public final boolean e() {
        if (this.i == true) goto L11;
        in4 r2 = this.f;
        if (r2 != null) goto L7;
        return false;
    L7:
        if (r2.d() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final void f(Object r5, zn r6) {
        in4 r0 = this.f;
        if (r0 != null) goto L10;
        ll r1 = this.r;
        wf1 r2 = ((c82) r1.p).a(this.a, r5);
        o72 r3 = ((kn4) r1.q).a();
        int r4 = 12;
        if (r3.n.G() == true) goto L8;
        in4 r7 = new xc5(r4, r3, r5);
    L7:
        r0 = r7;
        this.f = r0;
        this.j = r5;
        goto L10
    L8:
        r3.k(r5, r2, true);
        r7 = new hd5(r4, r3, r5);
    L10:
        this.q = false;
    L12:
        if (r0.d() == true) goto L16;
        if (this.q == true) goto L16;
        r0.e(new bt2(this, r6));
    L16:
        h();
        boolean r8 = this.q;
        long r9 = this.o;
        if (r8 == false) goto L20;
        r6.b = zn.a(r9, r6.b);
        return;
    L20:
        r6.a = zn.a(r9, r6.a);
    }

    public final boolean g(long r1, long r3) {
        if (this.m == false) goto L6;
        r3 = 0;
    L6:
        if (r1 <= r3) goto L9;
        return true;
    L9:
        return false;
    }

    public final void h() {
        int r1 = hx2.b;
        long r2 = System.nanoTime() - hx2.a;
        long r3 = this.p;
        long r13 = 0;
        if (((r3 - 1) | 1) != Long.MAX_VALUE) goto L14;
        if (r2 != r3) goto L9;
        om0 r4 = mx0.n;
    L7:
        int r7 = 1;
    L31:
        long r5 = r13 >> r7;
        om0 r6 = mx0.n;
        if ((((int) r13) & r7) != 0) goto L35;
        long r9 = r5;
    L41:
        this.o = r9;
        long r8 = this.n - r9;
        this.n = r8;
        this.p = r2;
        si0.R("compose:lazy:prefetch:available_time_nanos", r8);
        return;
    L35:
        if (r5 <= 9223372036854L) goto L38;
        r9 = Long.MAX_VALUE;
        goto L41
    L38:
        if (r5 >= (-9223372036854L)) goto L40;
        r9 = Long.MIN_VALUE;
        goto L41
    L40:
        r9 = r5 * 1000000;
        goto L41
    L9:
        if (r3 >= 0) goto L11;
        long r10 = mx0.p;
    L12:
        r13 = ((-(r10 >> 1)) << 1) + ((long) (((int) r10) & 1));
        int r11 = nx0.a;
        goto L7
    L11:
        r10 = mx0.o;
        goto L12
    L14:
        if ((1 | (r2 - 1)) == Long.MAX_VALUE) goto L16;
        long r12 = r2 - r3;
        r7 = 1;
        long r14 = (~(r12 ^ r3)) & (r12 ^ r2);
        ox0 r15 = ox0.o;
        if (r14 >= 0) goto L30;
        ox0 r16 = ox0.p;
        if (r15.compareTo(r16) >= 0) goto L26;
        long r17 = (r2 / 1000000) - (r3 / 1000000);
        long r18 = (r2 % 1000000) - (r3 % 1000000);
        om0 r19 = mx0.n;
        r13 = mx0.b(e35.W(r17, r16), e35.W(r18, r15));
        goto L31
    L26:
        if (r12 >= 0) goto L28;
        long r20 = mx0.p;
    L29:
        r13 = ((-(r20 >> 1)) << 1) + ((long) (((int) r20) & 1));
        int r21 = nx0.a;
        goto L31
    L28:
        r20 = mx0.o;
        goto L29
    L30:
        r13 = e35.W(r12, r15);
        goto L31
    L16:
        if (r2 >= 0) goto L19;
        long r22 = mx0.p;
    L18:
        r13 = r22;
        goto L7
    L19:
        r22 = mx0.o;
        goto L18
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}
