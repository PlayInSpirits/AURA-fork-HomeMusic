package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g82 implements kl4 {
    public final zd3 n;
    public int o;

    static {
    }

    public g82(int r4) {
        int r0 = (r4 / 30) * 30;
        this.n = new zd3(gb.g0(Math.max(r0 - 100, 0), r0 + 130), rv2.D);
        this.o = r4;
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return (j02) this.n.getValue();
    }
}
