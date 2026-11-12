package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class td0 implements we0 {
    public final ne0 n;

    public td0(ne0 ne0Var) {
        this.n = ne0Var;
    }

    @Override // defpackage.we0
    public final ne0 e() {
        return this.n;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.n + ')';
    }
}
