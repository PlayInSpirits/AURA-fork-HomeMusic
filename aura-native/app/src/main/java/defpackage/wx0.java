package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wx0 implements mz0 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public wx0(List list) {
        this.a = 0;
        this.f = list;
        this.g = new wv4[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void a(be3 be3Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (be3Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (be3Var.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (be3Var.a() == 0) {
                            z = false;
                        } else {
                            if (be3Var.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = be3Var.b;
                    int a = be3Var.a();
                    for (wv4 wv4Var : (wv4[]) this.g) {
                        be3Var.N(i);
                        wv4Var.e(a, be3Var);
                    }
                    this.e += a;
                    break;
                }
                break;
            default:
                be3 be3Var2 = (be3) this.f;
                ((wv4) this.g).getClass();
                if (this.b) {
                    int a2 = be3Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(be3Var.a, be3Var.b, be3Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            be3Var2.N(0);
                            if (73 != be3Var2.A() || 68 != be3Var2.A() || 51 != be3Var2.A()) {
                                l93.q0("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                be3Var2.O(3);
                                this.d = be3Var2.z() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((wv4) this.g).e(min2, be3Var);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    rr2.w(this.c != -9223372036854775807L);
                    for (wv4 wv4Var : (wv4[]) this.g) {
                        wv4Var.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((wv4) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    rr2.w(this.c != -9223372036854775807L);
                    ((wv4) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        switch (this.a) {
            case 0:
                wv4[] wv4VarArr = (wv4[]) this.g;
                for (int i = 0; i < wv4VarArr.length; i++) {
                    ry4 ry4Var = (ry4) ((List) this.f).get(i);
                    sy4Var.a();
                    sy4Var.b();
                    wv4 t = m51Var.t(sy4Var.d, 3);
                    sb1 sb1Var = new sb1();
                    sy4Var.b();
                    sb1Var.a = sy4Var.e;
                    sb1Var.l = lw2.m("video/mp2t");
                    sb1Var.m = lw2.m("application/dvbsubs");
                    sb1Var.p = Collections.singletonList(ry4Var.b);
                    sb1Var.d = ry4Var.a;
                    f34.l(sb1Var, t);
                    wv4VarArr[i] = t;
                }
                break;
            default:
                sy4Var.a();
                sy4Var.b();
                wv4 t2 = m51Var.t(sy4Var.d, 5);
                this.g = t2;
                sb1 sb1Var2 = new sb1();
                sy4Var.b();
                sb1Var2.a = sy4Var.e;
                sb1Var2.l = lw2.m("video/mp2t");
                sb1Var2.m = lw2.m("application/id3");
                f34.l(sb1Var2, t2);
                break;
        }
    }

    public wx0() {
        this.a = 1;
        this.f = new be3(10);
        this.c = -9223372036854775807L;
    }
}
