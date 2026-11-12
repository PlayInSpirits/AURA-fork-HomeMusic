package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sl4 implements rl4 {
    public final fl n = new fl(0);

    public final boolean e(int i) {
        return (this.n.get() & i) != 0;
    }

    public final void f(int i) {
        fl flVar;
        int i2;
        do {
            flVar = this.n;
            i2 = flVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!flVar.compareAndSet(i2, i2 | i));
    }
}
