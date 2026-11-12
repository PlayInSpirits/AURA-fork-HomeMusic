package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class os {
    public static final os e = null;
    public static os f;
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public int d;

    static {
        e = new os(-3, -9223372036854775807L, -1);
    }

    public os(int r2, long r3, long r5) {
        this.a = 0;
        this.d = r2;
        this.b = r3;
        this.c = r5;
    }

    public static void c(os r3, long r4, long r6, int r8) {
        if ((r8 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r8 & 2) == 0) goto L8;
        r6 = 0;
    L8:
        monitor-enter(r3);
        if (r4 < 0) goto L25;
        if (r6 < 0) goto L23;
        long r0 = r3.b + r4;     // Catch: Throwable -> L20
        r3.b = r0;     // Catch: Throwable -> L20
        long r5 = r3.c + r6;     // Catch: Throwable -> L20
        r3.c = r5;     // Catch: Throwable -> L20
        if (r5 > r0) goto L19;
        monitor-exit(r3);
        return;
    L19:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L20
    L23:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L20
    L25:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;
    }

    public void a(double r15, double r17, long r19) {
        float r2 = (r19 - 946728000000L) / 8.64E7f;
        float r3 = (0.01720197f * r2) + 6.24006f;
        double r4 = r3;
        double r8 = (((Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + ((Math.sin(2.0f * r3) * 3.4906598739326E-4d) + ((Math.sin(r4) * 0.03341960161924362d) + r4))) + 1.796593063d) + 3.141592653589793d;
        double r6 = (-r17) / 360.0d;
        double r5 = (Math.sin(2.0d * r8) * (-0.0069d)) + ((Math.sin(r4) * 0.0053d) + (((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + r6));
        double r7 = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(r8));
        double r9 = 0.01745329238474369d * r15;
        double r10 = (Math.sin(-0.10471975803375244d) - (Math.sin(r7) * Math.sin(r9))) / (Math.cos(r7) * Math.cos(r9));
        if (r10 < 1.0d) goto L7;
        this.d = 1;
        this.b = -1;
        this.c = -1;
        return;
    L7:
        if (r10 > (-1.0d)) goto L10;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        return;
    L10:
        double r11 = (float) (Math.acos(r10) / 6.283185307179586d);
        this.b = Math.round((r5 + r11) * 8.64E7d) + 946728000000L;
        long r12 = Math.round((r5 - r11) * 8.64E7d) + 946728000000L;
        this.c = r12;
        if (r12 < r19) goto L13;
    L16:
        this.d = 1;
        return;
    L13:
        if (this.b <= r19) goto L16;
        this.d = 0;
    }

    public synchronized long b() {
        monitor-enter(this);
        long r0 = this.b - this.c;
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.a) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "WindowCounter(streamId=" + this.d + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + b() + ')';
    }

    public os(int r2) {
        this.a = 2;
        this.d = r2;
    }

    public /* synthetic */ os() {
        this.a = 1;
    }
}
