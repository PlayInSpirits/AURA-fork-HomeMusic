package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n84 {
    public static final n84 c = null;
    public static final n84 d = null;
    public final long a;
    public final long b;

    static {
        n84 r0 = new n84(0, 0);
        new n84(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new n84(Long.MAX_VALUE, 0);
        new n84(0, Long.MAX_VALUE);
        d = r0;
    }

    public n84(long r6, long r8) {
        boolean r3 = false;
        if (r6 < 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.l(r2);
        if (r8 < 0) goto L9;
        r3 = true;
    L9:
        rr2.l(r3);
        this.a = r6;
        this.b = r8;
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final long a(long r17, long r19, long r21) {
        long r3 = this.a;
        long r8 = this.b;
        if (r3 == 0) goto L5;
    L7:
        String r0 = f35.a;
        long r10 = r17 - r3;
        long r4 = r3 ^ r17;
        boolean r5 = true;
        if (r4 < 0) goto L10;
        boolean r1 = true;
    L12:
        if ((r17 ^ r10) < 0) goto L14;
        boolean r6 = true;
    L16:
        if ((r1 | r6) == false) goto L18;
        long r12 = r10;
    L20:
        if (r12 != Long.MIN_VALUE) goto L24;
        if (r10 == Long.MIN_VALUE) goto L24;
    L27:
        r12 = Long.MIN_VALUE;
    L28:
        long r7 = f35.a(r17, r8);
        if (r12 <= r19) goto L31;
    L33:
        boolean r2 = false;
    L35:
        if (r12 <= r21) goto L37;
    L39:
        r5 = false;
    L40:
        if (r2 == false) goto L45;
        if (r5 == false) goto L45;
        if (Math.abs(r19 - r17) <= Math.abs(r21 - r17)) goto L46;
    L48:
        return r21;
    L46:
        return r19;
    L45:
        if (r2 == true) goto L46;
        if (r5 == true) goto L48;
        return r12;
    L37:
        if (r21 > r7) goto L39;
    L31:
        if (r19 > r7) goto L33;
        r2 = true;
    L24:
        if (r12 != Long.MAX_VALUE) goto L28;
        if (r10 == Long.MAX_VALUE) goto L28;
    L18:
        r12 = ((r10 >>> 63) ^ 1) + Long.MAX_VALUE;
        goto L20
    L14:
        r6 = false;
        goto L16
    L10:
        r1 = false;
        goto L12
    L5:
        if (r8 != 0) goto L7;
        return r17;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L15:
        return false;
    L8:
        if (n84.class != r7.getClass()) goto L15;
        n84 r8 = (n84) r7;
        if (this.a != r8.a) goto L15;
        if (this.b != r8.b) goto L15;
        return true;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
