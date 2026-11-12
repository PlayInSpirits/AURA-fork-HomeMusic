package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sj1 {
    public boolean A;
    public RectF B;
    public final uj1 a;
    public oo0 b;
    public r62 c;
    public if1 d;
    public final ir0 e;
    public Outline f;
    public boolean g;
    public long h;
    public long i;
    public float j;
    public ya4 k;
    public nc l;
    public nc m;
    public boolean n;
    public mz o;
    public gc p;
    public int q;
    public final jw r;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;

    static {
        h12.c(Build.FINGERPRINT, "robolectric");
    }

    public sj1(uj1 r6) {
        this.a = r6;
        this.b = gb.b;
        this.c = r62.n;
        this.d = k5.q;
        this.e = new ir0(2, this);
        this.g = true;
        this.h = 0;
        this.i = 9205357640488583168L;
        this.r = new jw();
        r6.F(false);
        this.t = 0;
        this.u = 0;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        if (this.g == false) goto L59;
        boolean r1 = this.A;
        Outline r3 = null;
        uj1 r4 = this.a;
        if (r1 == false) goto L7;
    L10:
        nc r2 = this.l;
        if (r2 == null) goto L51;
        RectF r8 = this.B;
        if (r8 != null) goto L15;
        r8 = new RectF();
        this.B = r8;
    L15:
        boolean r9 = r2 instanceof nc;
        if (r9 == false) goto L49;
        Path r11 = r2.a;
        r11.computeBounds(r8, false);
        int r12 = Build.VERSION.SDK_INT;
        if (r12 <= 28) goto L20;
    L26:
        Outline r13 = this.f;
        if (r13 != null) goto L30;
        r13 = new Outline();
        this.f = r13;
    L30:
        if (r12 < 30) goto L35;
        if (r9 == false) goto L33;
        xq2.q(r13, r11);
    L37:
        r13.offset(this.v, this.w);
        this.n = !r13.canClip();
    L38:
        this.l = r2;
        if (r13 == null) goto L41;
        r13.setAlpha(r4.b());
        r3 = r13;
    L41:
        int r5 = Math.round(r8.width());
        r4.d(r3, (4294967295L & ((long) Math.round(r8.height()))) | (((long) r5) << 32));
        if (this.n == true) goto L44;
    L46:
        r4.F(this.A);
        goto L59
    L44:
        if (this.A == false) goto L46;
        r4.F(false);
        r4.f();
        goto L59
    L33:
        er1.l("Unable to obtain android.graphics.Path");
        return;
    L35:
        if (r9 == false) goto L47;
        r13.setConvexPath(r11);
        goto L37
    L47:
        er1.l("Unable to obtain android.graphics.Path");
        return;
    L20:
        if (r11.isConvex() == true) goto L26;
        Outline r10 = this.f;
        if (r10 == null) goto L25;
        r10.setEmpty();
    L25:
        this.n = true;
        r13 = null;
        goto L38
    L49:
        er1.l("Unable to obtain android.graphics.Path");
        return;
    L51:
        r4.F(this.A);
        Outline r6 = this.f;
        if (r6 != null) goto L54;
        r6 = new Outline();
        this.f = r6;
    L54:
        Outline r14 = r6;
        long r15 = l93.o0(this.u);
        long r16 = this.h;
        long r17 = this.i;
        if (r17 == 9205357640488583168L) goto L58;
        r15 = r17;
    L58:
        int r7 = (int) (r16 >> 32);
        int r18 = (int) (r16 & 4294967295L);
        int r19 = (int) (r15 >> 32);
        int r110 = (int) (r15 & 4294967295L);
        r14.setRoundRect(Math.round(Float.intBitsToFloat(r7)), Math.round(Float.intBitsToFloat(r18)), Math.round(Float.intBitsToFloat(r19) + Float.intBitsToFloat(r7)), Math.round(Float.intBitsToFloat(r110) + Float.intBitsToFloat(r18)), this.j);
        r14.setAlpha(r4.b());
        int r20 = Math.round(Float.intBitsToFloat(r19));
        r4.d(r14, (4294967295L & ((long) Math.round(Float.intBitsToFloat(r110)))) | (((long) r20) << 32));
        goto L59
    L7:
        if (r4.M() > 0.0f) goto L10;
        r4.F(false);
        r4.d(null, 0);
    L59:
        this.g = false;
    }

    public final void b() {
        if (this.s == true) goto L5;
        return;
    L5:
        if (this.q != 0) goto L34;
        jw r0 = this.r;
        sj1 r1 = (sj1) r0.o;
        if (r1 == null) goto L9;
        r1.e();
        r0.o = null;
    L9:
        x03 r2 = (x03) r0.q;
        if (r2 == null) goto L26;
        Object[] r3 = r2.b;
        long[] r4 = r2.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L25;
        int r6 = 0;
    L14:
        long r7 = r4[r6];
        if (((((~r7) << 7) & r7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r8 = 8 - ((~(r6 - r5)) >>> 31);
        int r10 = 0;
    L17:
        if (r10 >= r8) goto L22;
        if ((255 & r7) >= 128) goto L21;
        ((sj1) r3[(r6 << 3) + r10]).e();
    L21:
        r7 = r7 >> 8;
        r10 = r10 + 1;
        goto L17
    L22:
        if (r8 != 8) goto L25;
    L23:
        if (r6 == r5) goto L25;
        r6 = r6 + 1;
    L25:
        r2.b();
    L26:
        this.a.f();
        return;
    }

    public final void c(sv0 r14) {
        jw r0 = this.r;
        r0.p = (sj1) r0.o;
        x03 r1 = (x03) r0.q;
        if (r1 != null) goto L5;
    L10:
        r0.n = true;
        this.d.invoke(r14);
        r0.n = false;
        sj1 r15 = (sj1) r0.p;
        if (r15 == null) goto L13;
        r15.e();
    L13:
        x03 r16 = (x03) r0.r;
        if (r16 != null) goto L16;
        return;
    L16:
        if (r16.h() == false) goto L39;
        Object[] r2 = r16.b;
        long[] r3 = r16.a;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L31;
        int r5 = 0;
    L20:
        long r6 = r3[r5];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L29;
        int r7 = 8 - ((~(r5 - r4)) >>> 31);
        int r8 = 0;
    L23:
        if (r8 >= r7) goto L28;
        if ((255 & r6) >= 128) goto L27;
        ((sj1) r2[(r5 << 3) + r8]).e();
    L27:
        r6 = r6 >> 8;
        r8 = r8 + 1;
        goto L23
    L28:
        if (r7 != 8) goto L31;
    L29:
        if (r5 == r4) goto L31;
        r5 = r5 + 1;
    L31:
        r16.b();
        return;
    L39:
        return;
    L5:
        if (r1.h() == false) goto L10;
        x03 r9 = (x03) r0.r;
        if (r9 != null) goto L9;
        x03 r10 = w54.a;
        r9 = new x03();
        r0.r = r9;
    L9:
        r9.j(r1);
        r1.b();
        goto L10
    }

    public final ya4 d() {
        ya4 r0 = this.k;
        nc r1 = this.l;
        if (r0 == null) goto L5;
        return r0;
    L5:
        if (r1 == null) goto L8;
        mb3 r2 = new mb3(r1);
        this.k = r2;
        return r2;
    L8:
        long r3 = l93.o0(this.u);
        long r4 = this.h;
        long r5 = this.i;
        if (r5 == 9205357640488583168L) goto L12;
        r3 = r5;
    L12:
        float r6 = Float.intBitsToFloat((int) (r4 >> 32));
        float r7 = Float.intBitsToFloat((int) (r4 & 4294967295L));
        float r8 = Float.intBitsToFloat((int) (r3 >> 32)) + r6;
        float r9 = Float.intBitsToFloat((int) (r3 & 4294967295L)) + r7;
        float r10 = this.j;
        if (r10 <= 0.0f) goto L15;
        ya4 r11 = new ob3(wr1.a(r6, r7, r8, r9, (Float.floatToRawIntBits(r10) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(r10)))));
    L16:
        this.k = r11;
        return r11;
    L15:
        r11 = new nb3(new wv3(r6, r7, r8, r9));
        goto L16
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(long r7, long r9, float r11) {
        float r0 = this.v;
        float r1 = this.w;
        long r2 = Float.floatToRawIntBits(r0);
        long r8 = g83.e(r7, (((long) Float.floatToRawIntBits(r1)) & 4294967295L) | (r2 << 32));
        if (g83.b(this.h, r8) == true) goto L5;
    L12:
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = r8;
        this.i = r9;
        this.j = r11;
        a();
        return;
    L5:
        if (qf4.a(this.i, r9) == false) goto L12;
        if (this.j != r11) goto L12;
        if (this.l != null) goto L12;
    }
}
