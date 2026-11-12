package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s55 {
    public static final s55 d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public final int a;
    public final int b;
    public final float c;

    static {
        d = new s55(0, 0);
        String r0 = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public s55(int r1, float r2, int r3) {
        this.a = r1;
        this.b = r3;
        this.c = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s55) == false) goto L14;
        s55 r6 = (s55) r5;
        if (this.a != r6.a) goto L14;
        if (this.b != r6.b) goto L14;
        if (this.c != r6.c) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = (((217 + this.a) * 31) + this.b) * 31;
        return Float.floatToRawIntBits(this.c) + r0;
    }

    public s55(int r2, int r3) {
        this(r2, 1.0f, r3);
    }
}
