package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dl implements th4 {
    public final /* synthetic */ int n = 1;
    public int o;
    public long p;
    public int q;

    public dl(int i, int i2, long j) {
        this.o = i;
        this.p = j;
        this.q = i2;
    }

    public String toString() {
        switch (this.n) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(f35.g0(this.o));
                sb.append(", size=");
                sb.append(this.p);
                sb.append(", minHeaderSize=");
                return f34.i(sb, this.q, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dl() {
    }
}
