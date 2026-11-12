package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 {
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public final long a;
    public final long b;
    public final String c;

    static {
        String r0 = f35.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public y5(long r4, long r6, String r8) {
        if (r4 == (-9223372036854775807L)) goto L5;
    L9:
        boolean r0 = true;
    L10:
        rr2.l(r0);
        if (r4 != (-9223372036854775807L)) goto L14;
        r4 = 0;
    L14:
        this.a = r4;
        this.b = r6;
        this.c = r8;
        return;
    L5:
        if (r6 != (-9223372036854775807L)) goto L9;
        if (r8 != null) goto L9;
        r0 = false;
        goto L10
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L17:
        return false;
    L8:
        if (y5.class != r7.getClass()) goto L17;
        y5 r8 = (y5) r7;
        if (this.a != r8.a) goto L17;
        if (this.b != r8.b) goto L17;
        if (Objects.equals(this.c, r8.c) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c});
    }
}
