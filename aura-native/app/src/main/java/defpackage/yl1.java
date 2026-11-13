package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yl1 extends ba5 {
    public yl1(defpackage.jc0 a0) {
        super(a0);
    }

    @Override // defpackage.uo0
    public final void a(uo0 uo0Var) {
        ep epVar = (ep) this.b;
        int i = epVar.r0;
        yo0 yo0Var = this.h;
        ArrayList arrayList = yo0Var.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((yo0) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            yo0Var.d(i3 + epVar.t0);
        } else {
            yo0Var.d(i2 + epVar.t0);
        }
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 jc0Var = this.b;
        if (jc0Var instanceof ep) {
            yo0 yo0Var = this.h;
            yo0Var.b = true;
            ArrayList arrayList = yo0Var.l;
            ep epVar = (ep) jc0Var;
            int i = epVar.r0;
            boolean z = epVar.s0;
            int i2 = 0;
            if (i == 0) {
                yo0Var.e = 4;
                while (i2 < epVar.q0) {
                    jc0 jc0Var2 = epVar.p0[i2];
                    if (z || jc0Var2.f0 != 8) {
                        yo0 yo0Var2 = jc0Var2.d.h;
                        yo0Var2.k.add(yo0Var);
                        arrayList.add(yo0Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                yo0Var.e = 5;
                while (i2 < epVar.q0) {
                    jc0 jc0Var3 = epVar.p0[i2];
                    if (z || jc0Var3.f0 != 8) {
                        yo0 yo0Var3 = jc0Var3.d.i;
                        yo0Var3.k.add(yo0Var);
                        arrayList.add(yo0Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                yo0Var.e = 6;
                while (i2 < epVar.q0) {
                    jc0 jc0Var4 = epVar.p0[i2];
                    if (z || jc0Var4.f0 != 8) {
                        yo0 yo0Var4 = jc0Var4.e.h;
                        yo0Var4.k.add(yo0Var);
                        arrayList.add(yo0Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            yo0Var.e = 7;
            while (i2 < epVar.q0) {
                jc0 jc0Var5 = epVar.p0[i2];
                if (z || jc0Var5.f0 != 8) {
                    yo0 yo0Var5 = jc0Var5.e.i;
                    yo0Var5.k.add(yo0Var);
                    arrayList.add(yo0Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.ba5
    public final void e() {
        jc0 jc0Var = this.b;
        if (jc0Var instanceof ep) {
            int i = ((ep) jc0Var).r0;
            yo0 yo0Var = this.h;
            if (i == 0 || i == 1) {
                jc0Var.X = yo0Var.g;
            } else {
                jc0Var.Y = yo0Var.g;
            }
        }
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ba5
    public final boolean k() {
        return false;
    }

    public final void m(yo0 yo0Var) {
        yo0 yo0Var2 = this.h;
        yo0Var2.k.add(yo0Var);
        yo0Var.l.add(yo0Var2);
    }
}
