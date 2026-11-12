package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cy {
    public static final long f = 0;
    public static final long g = 0;
    public long a;
    public long b;
    public Long c;
    public int d;
    public pi0 e;

    static {
        f = a35.a(ix2.b(1900, 0).s);
        g = a35.a(ix2.b(2100, 11).s);
    }

    public final dy a() {
        Bundle r0 = new Bundle();
        r0.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
        ix2 r4 = ix2.c(this.a);
        ix2 r5 = ix2.c(this.b);
        pi0 r6 = (pi0) r0.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long r1 = this.c;
        if (r1 != null) goto L6;
        ix2 r2 = null;
    L5:
        ix2 r7 = r2;
        return new dy(r4, r5, r6, r7, this.d);
    L6:
        r2 = ix2.c(r1.longValue());
        goto L5
    }
}
