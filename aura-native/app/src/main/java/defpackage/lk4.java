package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lk4 implements vd0, ye0 {
    public final vd0 n;
    public final ne0 o;

    public lk4(vd0 vd0Var, ne0 ne0Var) {
        this.n = vd0Var;
        this.o = ne0Var;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 vd0Var = this.n;
        if (vd0Var instanceof ye0) {
            return (ye0) vd0Var;
        }
        return null;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.o;
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        this.n.resumeWith(obj);
    }
}
