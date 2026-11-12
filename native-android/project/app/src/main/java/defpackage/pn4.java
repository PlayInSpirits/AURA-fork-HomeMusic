package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pn4 {
    public static final q45 p = null;
    public final q45 a;
    public final c12 b;
    public gp3 c;
    public gp3 d;
    public xc5 e;
    public rm3 f;
    public hd5 g;
    public xc5 h;
    public gp3 i;
    public wo0 j;
    public rm3 k;
    public rm3 l;
    public xc5 m;
    public wo0 n;
    public xc5 o;

    static {
        p = new q45();
    }

    public pn4(c12 r2) {
        this.a = p;
        this.b = r2;
    }

    public final xc5 a() {
        if (this.h != null) goto L6;
        this.h = new xc5(this, 1);
    L6:
        return this.h;
    }

    public final rm3 b() {
        if (this.l != null) goto L6;
        this.l = new rm3(this, 4);
    L6:
        return this.l;
    }

    public final gp3 c() {
        if (this.d != null) goto L6;
        this.d = new gp3(this, 4);
    L6:
        return this.d;
    }

    public final xc5 d() {
        if (this.m != null) goto L6;
        this.m = new xc5(this, 11);
    L6:
        return this.m;
    }

    public final gp3 e() {
        if (this.i != null) goto L6;
        this.i = new gp3(this, 13);
    L6:
        return this.i;
    }

    public final HashMap f() {
        HashMap r0 = new HashMap();
        c12 r1 = this.b;
        r0.put("u", (String) r1.p);
        i61 r2 = (i61) r1.q;
        if (r2 == null) goto L13;
        String r3 = (String) r2.o;
        if (r3 == null) goto L7;
        r0.put("p", r3);
    L7:
        String r4 = (String) r2.p;
        if (r4 == null) goto L10;
        r0.put("s", r4);
    L10:
        String r5 = (String) r2.q;
        if (r5 == null) goto L13;
        r0.put("t", r5);
    L13:
        r0.put("v", this.a.n);
        r0.put("c", "Tempus");
        r0.put("f", "json");
        return r0;
    }

    public final rm3 g() {
        if (this.f != null) goto L6;
        this.f = new rm3(this, 17);
    L6:
        return this.f;
    }

    public final wo0 h() {
        if (this.j != null) goto L6;
        this.j = new wo0(this, 18);
    L6:
        return this.j;
    }

    public final wo0 i() {
        if (this.n != null) goto L6;
        this.n = new wo0(this, 20);
    L6:
        return this.n;
    }

    public final String j() {
        return (((String) this.b.o) + "/rest/").replace("//rest", "/rest");
    }
}
