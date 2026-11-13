package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pn4 {
    public static final q45 p = new q45();
    public final q45 a = p;
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

    public pn4(c12 c12Var) {
        this.b = c12Var;
    }

    public final xc5 a() {
        if (this.h == null) {
            this.h = new xc5(this, 1);
        }
        return this.h;
    }

    public final rm3 b() {
        if (this.l == null) {
            this.l = new rm3(this, 4);
        }
        return this.l;
    }

    public final gp3 c() {
        if (this.d == null) {
            this.d = new gp3(this, 4);
        }
        return this.d;
    }

    public final xc5 d() {
        if (this.m == null) {
            this.m = new xc5(this, 11);
        }
        return this.m;
    }

    public final gp3 e() {
        if (this.i == null) {
            this.i = new gp3(this, 13);
        }
        return this.i;
    }

    public final HashMap f() {
        HashMap hashMap = new HashMap();
        c12 c12Var = this.b;
        hashMap.put("u", (String) c12Var.p);
        i61 i61Var = (i61) c12Var.q;
        if (i61Var != null) {
            String str = (String) i61Var.o;
            if (str != null) {
                hashMap.put("p", str);
            }
            String str2 = (String) i61Var.p;
            if (str2 != null) {
                hashMap.put("s", str2);
            }
            String str3 = (String) i61Var.q;
            if (str3 != null) {
                hashMap.put("t", str3);
            }
        }
        hashMap.put("v", this.a.n);
        hashMap.put("c", "Tempus");
        hashMap.put("f", "json");
        return hashMap;
    }

    public final rm3 g() {
        if (this.f == null) {
            this.f = new rm3(this, 17);
        }
        return this.f;
    }

    public final wo0 h() {
        if (this.j == null) {
            this.j = new wo0(this, 18);
        }
        return this.j;
    }

    public final wo0 i() {
        if (this.n == null) {
            this.n = new wo0(this, 20);
        }
        return this.n;
    }

    public final String j() {
        return (((String) this.b.o) + "/rest/").replace("//rest", "/rest");
    }
}
