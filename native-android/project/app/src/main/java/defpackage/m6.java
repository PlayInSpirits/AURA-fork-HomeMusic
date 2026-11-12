package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends ya4 {
    @Override // defpackage.ya4
    public final int l(g60 g60Var) {
        int i;
        synchronized (g60Var) {
            i = g60Var.v - 1;
            g60Var.v = i;
        }
        return i;
    }
}
