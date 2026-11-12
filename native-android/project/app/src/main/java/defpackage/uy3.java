package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uy3 {
    public Set a;
    public x80 b;
    public final f13 c;
    public x03 d;
    public f13 e;
    public final f13 f;
    public final f13 g;
    public x03 h;
    public w03 i;
    public ArrayList j;
    public x03 k;

    public uy3() {
        f13 f13Var = new f13(new wg1[16]);
        this.c = f13Var;
        x03 x03Var = w54.a;
        this.d = new x03();
        this.e = f13Var;
        this.f = new f13(new Object[16]);
        this.g = new f13(new gf1[16]);
    }

    public static final boolean f(wg1 wg1Var, f13 f13Var) {
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            vy3 vy3Var = ((wg1) objArr[i2]).a;
            if (vy3Var instanceof ff3) {
                f13 f13Var2 = ((ff3) vy3Var).o;
                if (f13Var2.j(wg1Var) || f(wg1Var, f13Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        f13 f13Var = this.c;
        f13Var.g();
        this.d.b();
        this.e = f13Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                vy3 vy3Var = (vy3) it.next();
                it.remove();
                vy3Var.a();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        f13 f13Var = this.f;
        int i = 4;
        if (f13Var.p != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                x03 x03Var = this.h;
                int i2 = f13Var.p;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = f13Var.n[i2];
                    try {
                        if (obj instanceof wg1) {
                            vy3 vy3Var = ((wg1) obj).a;
                            set.remove(vy3Var);
                            vy3Var.c();
                        }
                        if (obj instanceof u70) {
                            if (x03Var == null || !x03Var.c(obj)) {
                                ((u70) obj).b();
                            } else {
                                ((u70) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        x80 x80Var = this.b;
                        if (x80Var != null) {
                            si0.T(th, new fa(i, x80Var, obj));
                        }
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        f13 f13Var2 = this.c;
        if (f13Var2.p != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = f13Var2.n;
                    int i3 = f13Var2.p;
                    for (int i4 = 0; i4 < i3; i4++) {
                        wg1 wg1Var = (wg1) objArr[i4];
                        vy3 vy3Var2 = wg1Var.a;
                        set2.remove(vy3Var2);
                        try {
                            vy3Var2.d();
                        } catch (Throwable th3) {
                            x80 x80Var2 = this.b;
                            if (x80Var2 != null) {
                                si0.T(th3, new fa(i, x80Var2, wg1Var));
                            }
                            throw th3;
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public final void d() {
        f13 f13Var = this.g;
        if (f13Var.p != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = f13Var.n;
                int i = f13Var.p;
                for (int i2 = 0; i2 < i; i2++) {
                    ((gf1) objArr[i2]).invoke();
                }
                f13Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(wg1 wg1Var) {
        if (!this.d.c(wg1Var)) {
            x03 x03Var = this.k;
            if (x03Var == null || !x03Var.c(wg1Var)) {
                this.f.b(wg1Var);
                return;
            }
            return;
        }
        this.d.l(wg1Var);
        if (!this.e.j(wg1Var)) {
            f13 f13Var = this.c;
            if (!f13Var.j(wg1Var)) {
                f(wg1Var, f13Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(wg1Var.a);
    }

    public final void g(Set set, x80 x80Var) {
        a();
        this.a = set;
        this.b = x80Var;
    }
}
