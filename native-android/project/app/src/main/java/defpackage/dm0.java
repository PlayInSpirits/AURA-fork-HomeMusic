package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements lt2 {
    public final au a;
    public final bi0 b;
    public om0 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public dm0(bi0 r4, n51 r5) {
        this.b = r4;
        om0 r0 = new om0(1);
        this.c = r0;
        au r2 = new au(r5, r0);
        this.a = r2;
        if (r4 == ((bi0) r2.e)) goto L5;
        r2.e = r4;
        ((HashMap) r2.c).clear();
        ((HashMap) r2.d).clear();
    L5:
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static lt2 f(Class r1, bi0 r2) {
        return (lt2) r1.getConstructor(new Class[]{bi0.class}).newInstance(new Object[]{r2});
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    @Override // defpackage.lt2
    public final void a(om0 r2) {
        this.c = r2;
        au r1 = this.a;
        r1.f = r2;
        ((n51) r1.b).a(r2);
        Iterator r3 = ((HashMap) r1.d).values().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        ((lt2) r3.next()).a(r2);
        goto L4
    }

    @Override // defpackage.lt2
    public final void b() {
        au r0 = this.a;
        r0.getClass();
        ((n51) r0.b).b();
    }

    @Override // defpackage.lt2
    public final void c(boolean r2) {
        this.i = r2;
        au r1 = this.a;
        r1.a = r2;
        ((n51) r1.b).d(r2);
        Iterator r3 = ((HashMap) r1.d).values().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        ((lt2) r3.next()).c(r2);
        goto L4
    }

    @Override // defpackage.lt2
    public final bq d(gn2 r35) {
        gn2 r1 = r35;
        r1.b.getClass();
        String r2 = r1.b.a.getScheme();
        if (r2 != null) goto L5;
    L8:
        boolean r3 = Objects.equals(r1.b.b, "application/x-image-uri");
        bn2 r4 = r1.b;
        if (r3 == true) goto L120;
        int r5 = f35.J(r4.a, r4.b);
        if (r1.b.h == (-9223372036854775807L)) goto L128;
        n51 r6 = (n51) this.a.b;
        if ((r6 instanceof sk0) == false) goto L22;
        sk0 r7 = (sk0) r6;
        monitor-enter(r7);
        r7.f = 1;     // Catch: Throwable -> L19
        monitor-exit(r7);
    L19:
        th = move-exception;
        throw th;
    L22:
        n51 r8 = (n51) this.a.b;
        if ((r8 instanceof sk0) == false) goto L128;
        sk0 r9 = (sk0) r8;
        monitor-enter(r9);
        r9.g = 1;     // Catch: Throwable -> L29
        monitor-exit(r9);
    L29:
        th = move-exception;
        throw th;
    L128:
        lt2 r10 = this.a.c(r5);     // Catch: ClassNotFoundException -> L117
        zm2 r11 = r1.c.a();
        an2 r12 = r1.c;
        if (r12.a != (-9223372036854775807L)) goto L37;
        r11.a = this.d;
    L37:
        if (r12.d != (-3.4028235E38f)) goto L40;
        r11.d = this.g;
    L40:
        if (r12.e != (-3.4028235E38f)) goto L43;
        r11.e = this.h;
    L43:
        if (r12.b != (-9223372036854775807L)) goto L46;
        r11.b = this.e;
    L46:
        if (r12.c != (-9223372036854775807L)) goto L48;
        r11.c = this.f;
    L48:
        an2 r13 = new an2(r11);
        if (r13.equals(r1.c) == true) goto L51;
        tm2 r14 = r1.a();
        r14.l = r13.a();
        r1 = r14.a();
    L51:
        bq r15 = r10.d(r1);
        yw1 r16 = r1.b.g;
        if (r16.isEmpty() == true) goto L100;
        bq[] r17 = new bq[r16.size() + 1];
        r17[0] = r15;
        int r18 = 0;
    L55:
        if (r18 >= r16.size()) goto L99;
        if (this.i == false) goto L97;
        sb1 r19 = new sb1();
        r19.m = lw2.m(((fn2) r16.get(r18)).b);
        r19.d = ((fn2) r16.get(r18)).c;
        r19.e = ((fn2) r16.get(r18)).d;
        r19.f = ((fn2) r16.get(r18)).e;
        r19.b = ((fn2) r16.get(r18)).f;
        r19.a = ((fn2) r16.get(r18)).g;
        final tb1 r110 = new tb1(r19);
        n51 r20 = new zl0(this, r110);
        bi0 r111 = this.b;
        ss2 r112 = new ss2(10, r20);
        Object r21 = new Object();
        i80 r113 = new i80(28);
        if (this.c.n(r110) == false) goto L61;
        sb1 r22 = r110.a();
        r22.m = lw2.m("application/x-media3-cues");
        r22.j = r110.n;
        r22.K = this.c.R(r110);
        r110 = new tb1(r22);
    L61:
        tb1 r114 = r110;
        int r23 = r18 + 1;
        String r115 = ((fn2) r16.get(r18)).a.toString();
        um2 r116 = new um2();
        xm2 r117 = new xm2();
        List r24 = Collections.EMPTY_LIST;
        gy3 r26 = gy3.r;
        zm2 r25 = new zm2();
        cn2 r33 = cn2.d;
        if (r115 != null) goto L64;
        Uri r27 = null;
    L66:
        if (((Uri) r117.e) != null) goto L68;
    L71:
        boolean r118 = true;
    L72:
        rr2.w(r118);
        if (r27 != null) goto L75;
        bn2 r30 = null;
    L80:
        gn2 r28 = new gn2("", new wm2(r116), r30, new an2(r25), do2.K, r33);
        r30.getClass();
        r28.b.getClass();
        ym2 r29 = r28.b.c;
        if (r29 != null) goto L84;
        ww0 r31 = ww0.a;
    L94:
        r17[r23] = new kr3(r28, r111, r112, r31, r113, 1048576, r114);
    L98:
        r18 = r18 + 1;
        goto L55
    L84:
        monitor-enter(r21);
        if (r29.equals(null) == true) goto L90;
        r31 = yc5.a(r29);     // Catch: Throwable -> L88
    L91:
        r31.getClass();     // Catch: Throwable -> L88
        monitor-exit(r21);     // Catch: Throwable -> L88
        goto L94
    L90:
        r31 = null;
    L88:
        th = move-exception;
        throw th;
    L75:
        if (((UUID) r117.d) == null) goto L77;
        ym2 r210 = new ym2(r117);
    L78:
        r30 = new bn2(r27, null, r210, null, r24, null, r26, -9223372036854775807L);
        goto L80
    L77:
        r210 = null;
        goto L78
    L68:
        if (((UUID) r117.d) != null) goto L71;
        r118 = false;
        goto L72
    L64:
        r27 = Uri.parse(r115);
        goto L66
    L97:
        bi0 r32 = this.b;
        r32.getClass();
        r17[r18 + 1] = new hf4((fn2) r16.get(r18), r32, new i80(28));
        goto L98
    L99:
        r15 = new ov2(r17);
    L100:
        wm2 r0 = r1.e;
        if (r0.b == 0) goto L103;
    L107:
        c40 r34 = new c40(r15);
        long r36 = r0.b;
        if (r36 < 0) goto L110;
        boolean r37 = true;
    L111:
        rr2.l(r37);
        rr2.w(!r34.h);
        r34.b = r36;
        long r38 = r0.d;
        rr2.w(!r34.h);
        r34.c = r38;
        boolean r39 = !r0.g;
        rr2.w(!r34.h);
        r34.d = r39;
        boolean r40 = r0.e;
        rr2.w(!r34.h);
        r34.e = r40;
        boolean r41 = r0.f;
        rr2.w(!r34.h);
        r34.f = r41;
        boolean r42 = r0.h;
        rr2.w(!r34.h);
        r34.g = r42;
        r34.h = true;
        r15 = new e40(r34);
    L112:
        r1.b.getClass();
        if (r1.b.d != null) goto L115;
        return r15;
    L115:
        l93.q0("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return r15;
    L110:
        r37 = false;
        goto L111
    L103:
        if (r0.d != Long.MIN_VALUE) goto L107;
        if (r0.f == true) goto L107;
    L117:
        e = move-exception;
        throw new IllegalStateException(e);
    L120:
        long r43 = r4.h;
        String r44 = f35.a;
        throw null;
    L5:
        if (r2.equals("ssai") == false) goto L8;
        throw null;
    }

    @Override // defpackage.lt2
    public final lt2 e(yc5 r3) {
        rr2.s(r3, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        au r0 = this.a;
        r0.g = r3;
        Iterator r1 = ((HashMap) r0.d).values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((lt2) r1.next()).e(r3);
        goto L4
    L6:
        return this;
    }

    public dm0(Context r2, sk0 r3) {
        this(new rf2(r2), r3);
    }
}
