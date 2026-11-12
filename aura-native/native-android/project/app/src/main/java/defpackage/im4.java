package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class im4 {
    public wv4 b;
    public m51 c;
    public l83 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final bl0 a = new bl0(1);
    public rf2 j = new rf2();

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(be3 be3Var);

    public abstract boolean c(be3 be3Var, long j, rf2 rf2Var);

    public void d(boolean z) {
        if (z) {
            this.j = new rf2();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
