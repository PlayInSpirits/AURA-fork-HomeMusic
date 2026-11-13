package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
    public int e;
    public int f;
    public int g;
    public int h;
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
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;

    public bw4() {
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        this.m = gy3Var;
        this.n = gy3Var;
        this.o = gy3Var;
        this.p = 0;
        this.q = gy3Var;
        this.r = gy3Var;
        this.s = 0;
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.v = gy3Var;
        this.w = aw4.d;
        this.x = false;
        this.y = gy3Var;
        this.z = 0;
        this.A = true;
        this.B = gy3Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static gy3 f(String[] strArr) {
        uw1 j = yw1.j();
        for (String str : strArr) {
            str.getClass();
            j.c(f35.R(str));
        }
        return j.f();
    }

    public void a(yv4 yv4Var) {
        this.H.put(yv4Var.a, yv4Var);
    }

    public cw4 b() {
        return new cw4(this);
    }

    public bw4 c() {
        this.H.clear();
        return this;
    }

    public bw4 d(int i) {
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            if (((yv4) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(cw4 cw4Var) {
        this.a = cw4Var.a;
        this.b = cw4Var.b;
        this.c = cw4Var.c;
        this.d = cw4Var.d;
        this.e = cw4Var.e;
        this.f = cw4Var.f;
        this.g = cw4Var.g;
        this.h = cw4Var.h;
        this.i = cw4Var.i;
        this.j = cw4Var.j;
        this.k = cw4Var.k;
        this.l = cw4Var.l;
        this.n = cw4Var.n;
        this.m = cw4Var.m;
        this.o = cw4Var.o;
        this.p = cw4Var.p;
        this.q = cw4Var.q;
        this.s = cw4Var.s;
        this.r = cw4Var.r;
        this.t = cw4Var.t;
        this.u = cw4Var.u;
        this.v = cw4Var.v;
        this.w = cw4Var.w;
        this.x = cw4Var.x;
        this.y = cw4Var.y;
        this.z = cw4Var.A;
        this.A = cw4Var.B;
        this.B = cw4Var.z;
        this.C = cw4Var.C;
        this.D = cw4Var.D;
        this.E = cw4Var.E;
        this.F = cw4Var.F;
        this.G = cw4Var.G;
        this.I = new HashSet(cw4Var.I);
        this.H = new HashMap(cw4Var.H);
    }

    public bw4 g() {
        this.C = -3;
        return this;
    }

    public bw4 h(yv4 yv4Var) {
        sv4 sv4Var = yv4Var.a;
        d(sv4Var.c);
        this.H.put(sv4Var, yv4Var);
        return this;
    }

    public bw4 i() {
        return j(new String[0]);
    }

    public bw4 j(String... strArr) {
        this.y = f(strArr);
        this.A = false;
        return this;
    }

    public bw4 k() {
        this.z = 0;
        this.A = false;
        return this;
    }

    public bw4 l(int i, boolean z) {
        HashSet hashSet = this.I;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
