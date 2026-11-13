package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class q14 extends jp {
    public q14(vd0 vd0Var) {
        super(vd0Var);
        if (vd0Var == null || vd0Var.getContext() == q01.n) {
            return;
        }
        kf2.n("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return q01.n;
    }
}
