package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uv3 implements bi {
    public final h03 n = new h03();
    public final q03 o = new q03();
    public final Object p;

    public uv3(Object obj) {
        this.p = obj;
    }

    @Override // defpackage.bi
    public final void a(int i, Object obj) {
        h03 h03Var = this.n;
        h03Var.a(5);
        h03Var.a(i);
        this.o.a(obj);
    }

    @Override // defpackage.bi
    public final void b(Object obj) {
        this.n.a(1);
        this.o.a(obj);
    }

    @Override // defpackage.bi
    public final void c() {
        this.n.a(8);
    }

    @Override // defpackage.bi
    public final void d(int i, int i2, int i3) {
        h03 h03Var = this.n;
        h03Var.a(3);
        h03Var.a(i);
        h03Var.a(i2);
        h03Var.a(i3);
    }

    @Override // defpackage.bi
    public final void e(int i, int i2) {
        h03 h03Var = this.n;
        h03Var.a(2);
        h03Var.a(i);
        h03Var.a(i2);
    }

    public final void f(d15 d15Var, uy3 uy3Var) {
        Exception exc;
        h03 h03Var = this.n;
        int i = h03Var.b;
        q03 q03Var = new q03();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            q03 q03Var2 = this.o;
            if (i2 >= i) {
                if (i3 != q03Var2.b) {
                    l80.a("Applier operation size mismatch");
                }
                q03Var2.d();
                h03Var.b = 0;
                d15Var.i();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (h03Var.b(i2)) {
                        case 0:
                            d15Var.g();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            d15Var.b(q03Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            d15Var.e(h03Var.b(i4), h03Var.b(i6));
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    d15Var.d(h03Var.b(i4), h03Var.b(i7), h03Var.b(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            d15Var.f();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            d15Var.a(h03Var.b(i4), q03Var2.f(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                h03Var.b(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objF = q03Var2.f(i3);
                            objF.getClass();
                            jz4.j(2, objF);
                            i3 += 2;
                            d15Var.m((wf1) objF, q03Var2.f(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = d15Var.p;
                            if (obj instanceof u70) {
                                u70 u70Var = (u70) obj;
                                if (uy3Var.f.j(u70Var)) {
                                    u70Var.b();
                                }
                            }
                            q03Var.a(obj);
                            d15Var.c();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    d15Var.i();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new w70(q03Var2, q03Var, h03Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.bi
    public final void g() {
        this.n.a(0);
    }

    @Override // defpackage.bi
    public final void h(int i, Object obj) {
        h03 h03Var = this.n;
        h03Var.a(6);
        h03Var.a(i);
        this.o.a(obj);
    }

    @Override // defpackage.bi
    public final Object j() {
        return this.p;
    }

    @Override // defpackage.bi
    public final void m(wf1 wf1Var, Object obj) {
        this.n.a(7);
        q03 q03Var = this.o;
        q03Var.a(wf1Var);
        q03Var.a(obj);
    }
}
