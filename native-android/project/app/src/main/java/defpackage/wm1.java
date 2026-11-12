package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wm1 implements Comparable {
    public final String n;
    public final vm1 o;
    public final long p;
    public final int q;
    public final long r;
    public final ow0 s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final boolean x;

    public wm1(String r1, vm1 r2, long r3, int r5, long r6, ow0 r8, String r9, String r10, long r11, long r13, boolean r15) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r5;
        this.r = r6;
        this.s = r8;
        this.t = r9;
        this.u = r10;
        this.v = r11;
        this.w = r13;
        this.x = r15;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        Long r6 = (Long) r5;
        long r0 = r6.longValue();
        long r2 = this.r;
        if (r2 <= r0) goto L7;
        return 1;
    L7:
        if (r2 >= r6.longValue()) goto L10;
        return -1;
    L10:
        return 0;
    }
}
