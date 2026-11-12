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

    public wm1(String str, vm1 vm1Var, long j, int i, long j2, ow0 ow0Var, String str2, String str3, long j3, long j4, boolean z) {
        this.n = str;
        this.o = vm1Var;
        this.p = j;
        this.q = i;
        this.r = j2;
        this.s = ow0Var;
        this.t = str2;
        this.u = str3;
        this.v = j3;
        this.w = j4;
        this.x = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.r;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
