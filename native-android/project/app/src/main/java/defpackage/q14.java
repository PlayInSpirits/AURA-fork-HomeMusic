package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q14 extends jp {
    public q14(vd0 r1) {
        super(r1);
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.getContext() == q01.n) goto L10;
        kf2.n("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return q01.n;
    }
}
