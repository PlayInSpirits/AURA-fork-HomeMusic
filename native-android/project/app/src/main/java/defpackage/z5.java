package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 {
    public static final z5 f = null;
    public static final x5 g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final x5[] e;

    static {
        f = new z5(new x5[0], 0, -9223372036854775807L, 0);
        x5 r8 = new x5(0, -1, -1, new int[0], new gn2[0], new long[0], 0, false, new String[0], new y5[0], false);
        int[] r0 = r8.f;
        int r1 = r0.length;
        int r2 = Math.max(0, r1);
        int[] r14 = Arrays.copyOf(r0, r2);
        Arrays.fill(r14, r1, r2, 0);
        long[] r3 = r8.g;
        int r4 = r3.length;
        int r5 = Math.max(0, r4);
        long[] r6 = Arrays.copyOf(r3, r5);
        Arrays.fill(r6, r4, r5, -9223372036854775807L);
        gn2[] r15 = (gn2[]) Arrays.copyOf(r8.e, 0);
        String[] r20 = (String[]) Arrays.copyOf(r8.h, 0);
        y5[] r7 = r8.i;
        y5[] r21 = (y5[]) Arrays.copyOf(r7, Math.max(0, r7.length));
        boolean r9 = r8.k;
        boolean r10 = r8.l;
        g = new x5(r8.a, 0, r8.c, r14, r15, r6, r8.j, r9, r20, r21, r10);
        String r11 = f35.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public z5(x5[] r1, long r2, long r4, int r6) {
        this.b = r2;
        this.c = r4;
        this.a = r1.length + r6;
        this.e = r1;
        this.d = r6;
    }

    public final x5 a(int r2) {
        int r0 = this.d;
        if (r2 >= r0) goto L7;
        return g;
    L7:
        return this.e[r2 - r0];
    }

    public final boolean equals(Object r5) {
        if (this == r5) goto L22;
        if (r5 != null) goto L6;
        return false;
    L6:
        if (z5.class != r5.getClass()) goto L28;
        z5 r6 = (z5) r5;
        if (this.a == r6.a) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L13;
        return false;
    L13:
        if (this.c == r6.c) goto L15;
        return false;
    L15:
        if (this.d == r6.d) goto L17;
        return false;
    L17:
        if (Arrays.equals(this.e, r6.e) == false) goto L27;
        return true;
    L27:
        return false;
    L28:
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        int r0 = ((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31;
        return Arrays.hashCode(this.e) + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        r0.append(this.b);
        r0.append(", adGroups=[");
        int r2 = 0;
    L3:
        x5[] r3 = this.e;
        if (r2 >= r3.length) goto L31;
        r0.append("adGroup(timeUs=");
        r0.append(r3[r2].a);
        r0.append(", ads=[");
        int r4 = 0;
    L7:
        if (r4 >= r3[r2].f.length) goto L27;
        r0.append("ad(state=");
        int r6 = r3[r2].f[r4];
        if (r6 == 0) goto L22;
        if (r6 != 1) goto L12;
        r0.append('R');
    L23:
        r0.append(", durationUs=");
        r0.append(r3[r2].g[r4]);
        r0.append(')');
        if (r4 >= (r3[r2].f.length - 1)) goto L26;
        r0.append(", ");
    L26:
        r4 = r4 + 1;
        goto L7
    L12:
        if (r6 != 2) goto L14;
        r0.append('S');
        goto L23
    L14:
        if (r6 != 3) goto L16;
        r0.append('P');
        goto L23
    L16:
        if (r6 == 4) goto L18;
        r0.append('?');
        goto L23
    L18:
        r0.append('!');
        goto L23
    L22:
        r0.append('_');
        goto L23
    L27:
        r0.append("])");
        if (r2 >= (r3.length - 1)) goto L30;
        r0.append(", ");
    L30:
        r2 = r2 + 1;
        goto L3
    L31:
        r0.append("])");
        return r0.toString();
    }
}
