package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class he3 extends i35 {
    public uo b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public uo g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ym4 q;
    public final nc r;
    public nc s;
    public nc t;
    public final r72 u;

    public he3() {
        int i = c45.a;
        this.d = u01.n;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        nc a = pc.a();
        this.r = a;
        this.s = a;
        this.u = rr2.K(b92.n, new rd2(4));
    }

    @Override // defpackage.i35
    public final void a(sv0 sv0Var) {
        sv0 sv0Var2;
        if (this.n) {
            gh0.E(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        uo uoVar = this.b;
        if (uoVar != null) {
            sv0Var2 = sv0Var;
            sv0.I(sv0Var2, this.s, uoVar, this.c, null, 56);
        } else {
            sv0Var2 = sv0Var;
        }
        uo uoVar2 = this.g;
        if (uoVar2 != null) {
            ym4 ym4Var = this.q;
            if (this.o || ym4Var == null) {
                ym4Var = new ym4(this.f, this.j, this.h, this.i);
                this.q = ym4Var;
                this.o = false;
            }
            sv0.I(sv0Var2, this.s, uoVar2, this.e, ym4Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        nc ncVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = ncVar;
            return;
        }
        if (h12.c(this.s, ncVar)) {
            this.s = pc.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        r72 r72Var = this.u;
        ((oc) r72Var.getValue()).a.setPath(ncVar != null ? ncVar.a : null, false);
        float length = ((oc) r72Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((oc) r72Var.getValue()).a(f4, f5, this.s);
            return;
        }
        nc ncVar2 = this.t;
        if (ncVar2 == null) {
            ncVar2 = pc.a();
            this.t = ncVar2;
        }
        Path path2 = ncVar2.a;
        path2.reset();
        ((oc) r72Var.getValue()).a(f4, length, ncVar2);
        nc.a(this.s, ncVar2);
        path2.reset();
        ((oc) r72Var.getValue()).a(0.0f, f5, ncVar2);
        nc.a(this.s, ncVar2);
    }

    public final String toString() {
        return this.r.toString();
    }
}
