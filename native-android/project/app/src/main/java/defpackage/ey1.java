package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey1 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public ey1(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r11;
        this.h = r13;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + vr1.H(this.a) + ", uptimeMillis=" + this.b + ", position=" + g83.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + g83.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + this.i + ")";
    }
}
