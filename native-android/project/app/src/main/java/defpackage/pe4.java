package defpackage;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pe4 {
    public final int A;
    public final int B;
    public final int C;
    public final ne4 D;
    public final xm E;
    public final xm F;
    public final xm G;
    public final xm H;
    public final boolean I;
    public final int J;
    public final long K;
    public final boolean L;
    public final mi3 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final PlaybackException f;
    public final int g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final qh3 l;
    public final cw4 m;
    public final il n;
    public final float o;
    public final float p;
    public final s55 q;
    public final jg0 r;
    public final hp0 s;
    public final int t;
    public final pf4 u;
    public final qv2 v;
    public final cu4 w;
    public final jw4 x;
    public final do2 y;
    public final do2 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [iw4] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public pe4(oe4 r19) {
        jw4 r2 = r19.y;
        do2 r3 = r19.z;
        boolean r8 = false;
        if (r19.x.p() == false) goto L21;
        int r4 = r19.d;
        if (r4 == 1) goto L9;
        if (r4 == 4) goto L9;
        boolean r5 = false;
    L10:
        rr2.k("Empty playlist only allowed in STATE_IDLE or STATE_ENDED", r5);
        if (r19.C == (-1)) goto L13;
    L15:
        boolean r6 = false;
    L16:
        rr2.k("Ads not allowed if playlist is empty", r6);
        if (r2 != null) goto L19;
        r2 = jw4.b;
    L19:
        if (r3 != null) goto L68;
        r3 = do2.K;
    L68:
        if (r19.f != null) goto L70;
    L74:
        int r7 = r19.d;
        ne4 r9 = r19.F;
        Long r10 = r19.E;
        if (r10 != null) goto L77;
    L88:
        xm r11 = r19.G;
        this.a = r19.a;
        this.b = r19.b;
        this.c = r19.c;
        this.d = r19.d;
        this.e = r19.e;
        this.f = r19.f;
        this.g = r19.g;
        this.h = r19.h;
        this.i = r19.i;
        this.j = r19.j;
        this.k = r19.k;
        this.l = r19.l;
        this.m = r19.m;
        this.n = r19.n;
        this.o = r19.o;
        this.p = r19.p;
        this.q = r19.q;
        this.r = r19.r;
        this.s = r19.s;
        this.t = r19.t;
        this.u = r19.u;
        this.v = r19.v;
        this.w = r19.x;
        r2.getClass();
        this.x = r2;
        this.y = r3;
        this.z = r19.A;
        this.A = r19.B;
        this.B = r19.C;
        this.C = r19.D;
        this.D = r9;
        this.E = r11;
        this.F = r19.H;
        this.G = r19.I;
        this.H = r19.J;
        this.I = r19.K;
        this.J = r19.L;
        this.K = r19.M;
        this.L = r8;
        return;
    L77:
        if (r19.C == (-1)) goto L79;
    L87:
        r9 = new xm(r19.E.longValue());
        goto L88
    L79:
        if (r19.b == false) goto L87;
        if (r19.d != 3) goto L87;
        if (r19.e != 0) goto L87;
        if (r10.longValue() == (-9223372036854775807L)) goto L87;
        final long r12 = r19.E.longValue();
        final float r14 = r19.l.a;
        final long r13 = SystemClock.elapsedRealtime();
        r9 = new me4(r12, r13, r14);
        goto L88
    L70:
        if (r19.d != 1) goto L72;
        boolean r15 = true;
    L73:
        rr2.k("Player error only allowed in STATE_IDLE", r15);
        goto L74
    L72:
        r15 = false;
        goto L73
    L13:
        if (r19.D != (-1)) goto L15;
        r6 = true;
    L9:
        r5 = true;
        goto L10
    L21:
        int r16 = r19.B;
        if (r16 != (-1)) goto L25;
        int r17 = 0;
    L30:
        if (r19.C == (-1)) goto L46;
        zt4 r18 = new zt4();
        bu4 r110 = new bu4();
        Long r20 = r19.E;
        if (r20 == null) goto L34;
        long r21 = r20.longValue();
    L35:
        cu4 r111 = r19.x;
        r19.x.f(r111.b(r111.i(r110, r18, r17, f35.Q(r21)).first), r18, false);
        if (r19.C >= r18.g.a) goto L38;
        boolean r22 = true;
    L39:
        rr2.k("PeriodData has less ad groups than adGroupIndex", r22);
        int r23 = r18.g.a(r19.C).b;
        if (r23 == (-1)) goto L46;
        if (r19.D >= r23) goto L44;
        boolean r24 = true;
    L45:
        rr2.k("Ad group has less ads than adIndexInGroupIndex", r24);
        goto L46
    L44:
        r24 = false;
        goto L45
    L38:
        r22 = false;
        goto L39
    L34:
        r21 = r19.F.get();
    L46:
        yw1 r25 = r19.w;
        if (r25 == null) goto L49;
        he4 r26 = (he4) r25.get(r17);
        jw4 r27 = r26.b;
        r3 = r26.d;
        r2 = r27;
    L49:
        if (r3 != null) goto L66;
        gn2 r28 = r19.x.m(r17, new bu4(), 0).b;
        r2.getClass();
        co2 r29 = new co2();
        yw1 r30 = r2.a;
        int r112 = r30.size();
        int r113 = 0;
    L51:
        if (r113 >= r112) goto L65;
        ?? r114 = (iw4) r30.get(r113);
        ?? r115 = r8;
    L54:
        if (r115 >= r114.a) goto L64;
        if (r114.e[r115] == false) goto L63;
        tb1 r116 = r114.a(r115);
        if (r116.l == null) goto L63;
        ?? r117 = r8;
    L60:
        pv2[] r31 = r116.l.a;
        if (r117 >= r31.length) goto L63;
        r31[r117].b(r29);
        r117 = r117 + 1;
    L63:
        r8 = false;
        r115 = r115 + 1;
        goto L54
    L64:
        r113 = r113 + 1;
        r8 = false;
        goto L51
    L65:
        r29.b(r28.d);
        r3 = new do2(r29);
        r8 = true;
        goto L68
    L66:
        r8 = false;
        goto L68
    L25:
        if (r16 >= r19.x.o()) goto L27;
        boolean r32 = true;
    L28:
        rr2.k("currentMediaItemIndex must be less than playlist.size()", r32);
        r17 = r16;
        goto L30
    L27:
        r32 = false;
        goto L28
    }

    public final oe4 a() {
        oe4 r0 = new oe4();
        r0.a = this.a;
        r0.b = this.b;
        r0.c = this.c;
        r0.d = this.d;
        r0.e = this.e;
        r0.f = this.f;
        r0.g = this.g;
        r0.h = this.h;
        r0.i = this.i;
        r0.j = this.j;
        r0.k = this.k;
        r0.l = this.l;
        r0.m = this.m;
        r0.n = this.n;
        r0.o = this.o;
        r0.p = this.p;
        r0.q = this.q;
        r0.r = this.r;
        r0.s = this.s;
        r0.t = this.t;
        r0.u = this.u;
        r0.v = this.v;
        cu4 r1 = this.w;
        r0.x = r1;
        if ((r1 instanceof le4) == false) goto L5;
        r0.w = ((le4) r1).e;
    L10:
        r0.A = this.z;
        r0.B = this.A;
        r0.C = this.B;
        r0.D = this.C;
        r0.E = null;
        r0.F = this.D;
        r0.G = this.E;
        r0.H = this.F;
        r0.I = this.G;
        r0.J = this.H;
        r0.K = this.I;
        r0.L = this.J;
        r0.M = this.K;
        return r0;
    L5:
        r0.y = this.x;
        if (this.L == false) goto L8;
        do2 r2 = null;
    L9:
        r0.z = r2;
        goto L10
    L8:
        r2 = this.y;
        goto L9
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L5;
        return true;
    L5:
        if ((r7 instanceof pe4) == false) goto L84;
        pe4 r8 = (pe4) r7;
        if (this.b != r8.b) goto L84;
        if (this.c != r8.c) goto L84;
        if (this.a.equals(r8.a) == false) goto L84;
        if (this.d != r8.d) goto L84;
        if (this.e != r8.e) goto L84;
        if (this.f == r8.f) goto L21;
        return false;
    L21:
        if (this.g != r8.g) goto L84;
        if (this.h != r8.h) goto L84;
        if (this.i != r8.i) goto L84;
        if (this.j != r8.j) goto L84;
        if (this.k != r8.k) goto L84;
        if (this.l.equals(r8.l) == false) goto L84;
        if (this.m.equals(r8.m) == false) goto L84;
        if (this.n.equals(r8.n) == false) goto L84;
        if (this.o != r8.o) goto L84;
        if (this.p != r8.p) goto L84;
        if (this.q.equals(r8.q) == false) goto L84;
        if (this.r.equals(r8.r) == false) goto L84;
        if (this.s.equals(r8.s) == false) goto L84;
        if (this.t != r8.t) goto L84;
        if (this.u.equals(r8.u) == false) goto L84;
        if (this.v.equals(r8.v) == false) goto L84;
        if (this.w.equals(r8.w) == false) goto L84;
        if (this.x.equals(r8.x) == false) goto L84;
        if (this.y.equals(r8.y) == false) goto L84;
        if (this.z.equals(r8.z) == false) goto L84;
        if (this.A != r8.A) goto L84;
        if (this.B != r8.B) goto L84;
        if (this.C != r8.C) goto L84;
        if (this.D.equals(r8.D) == false) goto L84;
        if (this.E.equals(r8.E) == false) goto L84;
        if (this.F.equals(r8.F) == false) goto L84;
        if (this.G.equals(r8.G) == false) goto L84;
        if (this.H.equals(r8.H) == false) goto L84;
        if (this.I != r8.I) goto L84;
        if (this.J != r8.J) goto L84;
        if (this.K != r8.K) goto L84;
        return true;
    L84:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((((((this.a.hashCode() + 217) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        PlaybackException r1 = this.f;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = (((((r0 + r2) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 961;
        long r4 = this.i;
        int r5 = (r3 + ((int) (r4 ^ (r4 >>> 32)))) * 31;
        long r6 = this.j;
        int r7 = (r5 + ((int) (r6 ^ (r6 >>> 32)))) * 31;
        long r8 = this.k;
        int r9 = (r7 + ((int) (r8 ^ (r8 >>> 32)))) * 31;
        int r10 = (this.l.hashCode() + r9) * 31;
        int r11 = (this.m.hashCode() + r10) * 31;
        int r12 = (this.n.hashCode() + r11) * 31;
        int r13 = (Float.floatToRawIntBits(this.o) + r12) * 31;
        int r14 = (Float.floatToRawIntBits(this.p) + r13) * 31;
        int r15 = (this.q.hashCode() + r14) * 31;
        int r16 = (this.r.hashCode() + r15) * 31;
        int r17 = (((this.s.hashCode() + r16) * 31) + this.t) * 961;
        int r18 = (this.u.hashCode() + r17) * 961;
        int r19 = (this.v.hashCode() + r18) * 31;
        int r20 = (this.w.hashCode() + r19) * 31;
        int r21 = (this.x.a.hashCode() + r20) * 31;
        int r22 = (this.y.hashCode() + r21) * 31;
        int r23 = (((((((this.z.hashCode() + r22) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31;
        int r24 = (this.D.hashCode() + r23) * 31;
        int r25 = (this.E.hashCode() + r24) * 31;
        int r26 = (this.F.hashCode() + r25) * 31;
        int r27 = (this.G.hashCode() + r26) * 31;
        int r28 = (((((this.H.hashCode() + r27) * 31) + (this.I ? 1 : 0)) * 31) + this.J) * 31;
        long r29 = this.K;
        return r28 + ((int) ((r29 >>> 32) ^ r29));
    L5:
        r2 = r1.hashCode();
        goto L6
    }
}
