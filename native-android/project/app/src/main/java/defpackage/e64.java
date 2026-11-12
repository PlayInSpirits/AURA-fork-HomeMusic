package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class e64 extends c0 implements ye0 {
    public final vd0 s;

    public e64(vd0 vd0Var, ne0 ne0Var) {
        super(ne0Var, true);
        this.s = vd0Var;
    }

    @Override // defpackage.a32
    public final boolean P() {
        return true;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 vd0Var = this.s;
        if (vd0Var instanceof ye0) {
            return (ye0) vd0Var;
        }
        return null;
    }

    @Override // defpackage.a32
    public void l(Object obj) {
        uc5.T(ya4.x(this.s), hw.I(obj));
    }

    @Override // defpackage.a32
    public void m(Object obj) {
        this.s.resumeWith(hw.I(obj));
    }
}
