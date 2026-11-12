package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bw4 {
    public boolean A;
    public yw1 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public yw1 m;
    public yw1 n;
    public yw1 o;
    public int p;
    public yw1 q;
    public yw1 r;
    public int s;
    public int t;
    public int u;
    public yw1 v;
    public aw4 w;
    public boolean x;
    public yw1 y;
    public int z;

    public bw4() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = true;
        this.l = true;
        vw1 r2 = yw1.o;
        gy3 r3 = gy3.r;
        this.m = r3;
        this.n = r3;
        this.o = r3;
        this.p = 0;
        this.q = r3;
        this.r = r3;
        this.s = 0;
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.v = r3;
        this.w = aw4.d;
        this.x = false;
        this.y = r3;
        this.z = 0;
        this.A = true;
        this.B = r3;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static gy3 f(String[] r4) {
        uw1 r0 = yw1.j();
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        String r3 = r4[r2];
        r3.getClass();
        r0.c(f35.R(r3));
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.f();
    }

    public void a(yv4 r2) {
        this.H.put(r2.a, r2);
    }

    public cw4 b() {
        return new cw4(this);
    }

    public bw4 c() {
        this.H.clear();
        return this;
    }

    public bw4 d(int r3) {
        Iterator r0 = this.H.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        if (((yv4) r0.next()).a.c != r3) goto L4;
        r0.remove();
        goto L4
    L8:
        return this;
    }

    public final void e(cw4 r3) {
        this.a = r3.a;
        this.b = r3.b;
        this.c = r3.c;
        this.d = r3.d;
        this.e = r3.e;
        this.f = r3.f;
        this.g = r3.g;
        this.h = r3.h;
        this.i = r3.i;
        this.j = r3.j;
        this.k = r3.k;
        this.l = r3.l;
        this.n = r3.n;
        this.m = r3.m;
        this.o = r3.o;
        this.p = r3.p;
        this.q = r3.q;
        this.s = r3.s;
        this.r = r3.r;
        this.t = r3.t;
        this.u = r3.u;
        this.v = r3.v;
        this.w = r3.w;
        this.x = r3.x;
        this.y = r3.y;
        this.z = r3.A;
        this.A = r3.B;
        this.B = r3.z;
        this.C = r3.C;
        this.D = r3.D;
        this.E = r3.E;
        this.F = r3.F;
        this.G = r3.G;
        this.I = new HashSet(r3.I);
        this.H = new HashMap(r3.H);
    }

    public bw4 g() {
        this.C = -3;
        return this;
    }

    public bw4 h(yv4 r3) {
        sv4 r0 = r3.a;
        d(r0.c);
        this.H.put(r0, r3);
        return this;
    }

    public bw4 i() {
        return j(new String[0]);
    }

    public bw4 j(String... r1) {
        this.y = f(r1);
        this.A = false;
        return this;
    }

    public bw4 k() {
        this.z = 0;
        this.A = false;
        return this;
    }

    public bw4 l(int r2, boolean r3) {
        HashSet r0 = this.I;
        if (r3 == false) goto L6;
        r0.add(Integer.valueOf(r2));
        return this;
    L6:
        r0.remove(Integer.valueOf(r2));
        return this;
    }
}
