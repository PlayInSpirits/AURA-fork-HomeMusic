package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o42 {
    public static final String c = null;
    public static final String d = null;
    public final String a;
    public final String b;

    static {
        String r0 = f35.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public o42(String r1, String r2) {
        this.a = f35.R(r1);
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (o42.class != r5.getClass()) goto L15;
        o42 r6 = (o42) r5;
        if (Objects.equals(this.a, r6.a) == false) goto L15;
        if (Objects.equals(this.b, r6.b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = this.b.hashCode() * 31;
        String r1 = this.a;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L7:
        return r0 + r2;
    L5:
        r2 = 0;
        goto L7
    }
}
