package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class e64 extends c0 implements ye0 {
    public final vd0 s;

    public e64(vd0 r2, ne0 r3) {
        super(r3, true);
        this.s = r2;
    }

    @Override // defpackage.a32
    public final boolean P() {
        return true;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 r1 = this.s;
        if ((r1 instanceof ye0) == true) goto L5;
        return null;
    L5:
        return (ye0) r1;
    }

    @Override // defpackage.a32
    public void l(Object r1) {
        uc5.T(ya4.x(this.s), hw.I(r1));
    }

    @Override // defpackage.a32
    public void m(Object r1) {
        this.s.resumeWith(hw.I(r1));
    }
}
