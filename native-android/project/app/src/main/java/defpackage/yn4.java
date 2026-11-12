package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn4 {
    public static final yn4 c = null;
    public boolean a;
    public long b;

    static {
        c = new yn4(false, -9223372036854775807L);
    }

    public yn4(boolean r1, long r2) {
        this.b = r2;
        this.a = r1;
    }

    public long a() {
        if (this.a == false) goto L7;
        return Long.MAX_VALUE;
    L7:
        return Math.max(0, this.b - System.nanoTime());
    }
}
