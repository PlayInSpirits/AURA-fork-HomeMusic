package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe4 {
    public do2 A;
    public int B;
    public int C;
    public int D;
    public Long E;
    public ne4 F;
    public xm G;
    public xm H;
    public xm I;
    public xm J;
    public boolean K;
    public int L;
    public long M;
    public mi3 a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public PlaybackException f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public qh3 l;
    public cw4 m;
    public il n;
    public float o;
    public float p;
    public s55 q;
    public jg0 r;
    public hp0 s;
    public int t;
    public pf4 u;
    public qv2 v;
    public yw1 w;
    public cu4 x;
    public jw4 y;
    public do2 z;

    public oe4() {
        this.a = mi3.b;
        this.b = false;
        this.c = 1;
        this.d = 1;
        this.e = 0;
        this.f = null;
        this.g = 0;
        this.h = false;
        this.i = 5000;
        this.j = 15000;
        this.k = 3000;
        this.l = qh3.d;
        this.m = cw4.J;
        this.n = il.i;
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = s55.d;
        this.r = jg0.d;
        this.s = hp0.e;
        this.t = 0;
        this.u = pf4.c;
        this.v = new qv2(-9223372036854775807L, new pv2[0]);
        this.w = gy3.r;
        this.x = cu4.a;
        this.y = null;
        this.z = null;
        this.A = do2.K;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = null;
        this.F = new xm(-9223372036854775807L);
        xm r1 = ne4.k;
        this.G = r1;
        this.H = new xm(-9223372036854775807L);
        this.I = r1;
        this.J = r1;
        this.K = false;
        this.L = 5;
        this.M = 0;
    }

    public final void a() {
        this.C = -1;
        this.D = -1;
    }

    public final void b(ArrayList r5) {
        HashSet r0 = new HashSet();
        int r1 = 0;
    L4:
        if (r1 >= r5.size()) goto L6;
        rr2.k("Duplicate MediaItemData UID in playlist", r0.add(((he4) r5.get(r1)).a));
        r1 = r1 + 1;
        goto L4
    L6:
        this.w = yw1.k(r5);
        this.x = new le4(this.w);
        this.y = null;
        this.z = null;
    }

    public final void c(float r3) {
        if (r3 >= 0.0f) goto L5;
    L7:
        boolean r1 = false;
    L8:
        rr2.l(r1);
        if (r3 == 0.0f) goto L11;
        float r0 = r3;
    L12:
        this.p = r0;
        this.o = r3;
        return;
    L11:
        r0 = this.o;
        goto L12
    L5:
        if (r3 > 1.0f) goto L7;
        r1 = true;
        goto L8
    }
}
