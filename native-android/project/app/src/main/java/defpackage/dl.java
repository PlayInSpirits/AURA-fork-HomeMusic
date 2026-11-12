package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dl implements th4 {
    public final /* synthetic */ int n;
    public int o;
    public long p;
    public int q;

    public dl(int r2, int r3, long r4) {
        this.n = 0;
        this.o = r2;
        this.p = r4;
        this.q = r3;
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder("AtomSizeTooSmall{type=");
        r0.append(f35.g0(this.o));
        r0.append(", size=");
        r0.append(this.p);
        r0.append(", minHeaderSize=");
        return f34.i(r0, this.q, "}");
    L5:
        return super.toString();
    }

    public /* synthetic */ dl() {
        this.n = 1;
    }
}
