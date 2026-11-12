package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xy4 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public String l;
    public int m;
    public int n;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public int q;
    public yr4 r;
    public float s;
    public String t;
    public String u;

    public xy4() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.m = -1;
        this.n = -1;
        this.q = -1;
        this.s = Float.MAX_VALUE;
    }

    public final void a(xy4 r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (this.c == true) goto L9;
        if (r5.c == false) goto L9;
        this.b = r5.b;
        this.c = true;
    L9:
        if (this.h != (-1)) goto L12;
        this.h = r5.h;
    L12:
        if (this.i != (-1)) goto L15;
        this.i = r5.i;
    L15:
        if (this.a != null) goto L20;
        String r0 = r5.a;
        if (r0 == null) goto L20;
        this.a = r0;
    L20:
        if (this.f != (-1)) goto L23;
        this.f = r5.f;
    L23:
        if (this.g != (-1)) goto L26;
        this.g = r5.g;
    L26:
        if (this.n != (-1)) goto L29;
        this.n = r5.n;
    L29:
        if (this.o != null) goto L34;
        Layout.Alignment r1 = r5.o;
        if (r1 == null) goto L34;
        this.o = r1;
    L34:
        if (this.p != null) goto L39;
        Layout.Alignment r2 = r5.p;
        if (r2 == null) goto L39;
        this.p = r2;
    L39:
        if (this.q != (-1)) goto L42;
        this.q = r5.q;
    L42:
        if (this.j != (-1)) goto L45;
        this.j = r5.j;
        this.k = r5.k;
    L45:
        if (this.r != null) goto L48;
        this.r = r5.r;
    L48:
        if (this.s != Float.MAX_VALUE) goto L51;
        this.s = r5.s;
    L51:
        if (this.t != null) goto L54;
        this.t = r5.t;
    L54:
        if (this.u != null) goto L57;
        this.u = r5.u;
    L57:
        if (this.e == true) goto L62;
        if (r5.e == false) goto L62;
        this.d = r5.d;
        this.e = true;
    L62:
        if (this.m != (-1)) goto L68;
        int r6 = r5.m;
        if (r6 == (-1)) goto L69;
        this.m = r6;
        return;
    L69:
        return;
    }
}
