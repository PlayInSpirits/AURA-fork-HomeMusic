package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tn4 implements Comparable {
    public final long n;
    public final byte[] o;

    public tn4(long j, byte[] bArr) {
        this.n = j;
        this.o = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.n, ((tn4) obj).n);
    }
}
