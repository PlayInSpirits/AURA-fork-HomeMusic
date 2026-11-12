package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class im4 {
    public final bl0 a;
    public wv4 b;
    public m51 c;
    public l83 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public rf2 j;
    public long k;
    public boolean l;
    public boolean m;

    public im4() {
        this.a = new bl0(1);
        this.j = new rf2();
    }

    public void a(long r1) {
        this.g = r1;
    }

    public abstract long b(be3 r1);

    public abstract boolean c(be3 r1, long r2, rf2 r4);

    public void d(boolean r5) {
        if (r5 == false) goto L5;
        this.j = new rf2();
        this.f = 0;
        this.h = 0;
    L6:
        this.e = -1;
        this.g = 0;
        return;
    L5:
        this.h = 1;
        goto L6
    }
}
