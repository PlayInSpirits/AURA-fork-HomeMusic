package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yv4 {
    public static final String c = null;
    public static final String d = null;
    public final sv4 a;
    public final yw1 b;

    static {
        String r0 = f35.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public yv4(sv4 r3, List r4) {
        if (r4.isEmpty() == false) goto L5;
    L11:
        this.a = r3;
        this.b = yw1.k(r4);
        return;
    L5:
        if (((Integer) Collections.min(r4)).intValue() < 0) goto L10;
        if (((Integer) Collections.max(r4)).intValue() < r3.a) goto L11;
    L10:
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (yv4.class != r5.getClass()) goto L15;
        yv4 r6 = (yv4) r5;
        if (this.a.equals(r6.a) == false) goto L15;
        if (this.b.equals(r6.b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode();
        return (this.b.hashCode() * 31) + r0;
    }
}
