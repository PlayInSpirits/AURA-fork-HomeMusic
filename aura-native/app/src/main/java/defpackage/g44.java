package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g44 extends h44 implements Iterator {
    public f44 n;
    public boolean o = true;
    public final /* synthetic */ i44 p;

    public g44(i44 i44Var) {
        this.p = i44Var;
    }

    @Override // defpackage.h44
    public final void a(f44 f44Var) {
        f44 f44Var2 = this.n;
        if (f44Var == f44Var2) {
            f44 f44Var3 = f44Var2.q;
            this.n = f44Var3;
            this.o = f44Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o) {
            return this.p.n != null;
        }
        f44 f44Var = this.n;
        return (f44Var == null || f44Var.p == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.o) {
            this.o = false;
            this.n = this.p.n;
        } else {
            f44 f44Var = this.n;
            this.n = f44Var != null ? f44Var.p : null;
        }
        return this.n;
    }
}
