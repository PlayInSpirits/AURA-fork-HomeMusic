package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u83 {
    public final w83 a;
    public boolean b;
    public bq4 c;
    public final v83 d;
    public boolean e;

    public u83(v83 v83Var, w83 w83Var) {
        v83Var.getClass();
        boolean z = v83Var.b;
        this.a = w83Var;
        this.b = z;
        this.d = v83Var;
        this.e = true;
    }

    public final void a() {
        bq4 bq4Var = this.c;
        if (bq4Var == null || !((LinkedHashSet) bq4Var.p).remove(this)) {
            return;
        }
        w33 w33Var = (w33) bq4Var.o;
        w33Var.getClass();
        if (this == w33Var.f) {
            if (w33Var.g == -1) {
                this.d.getClass();
            }
            w33Var.f = null;
            w33Var.g = 0;
            w33Var.h = null;
        }
        w33Var.d.remove(this);
        w33Var.e.remove(this);
        this.c = null;
        w33Var.b();
    }

    public final void b(boolean z) {
        w33 w33Var;
        this.e = z;
        boolean z2 = z && this.d.b;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        bq4 bq4Var = this.c;
        if (bq4Var == null || (w33Var = (w33) bq4Var.o) == null) {
            return;
        }
        w33Var.b();
    }
}
