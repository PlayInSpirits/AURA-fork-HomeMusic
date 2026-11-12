package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hf5 {
    public final ve a;
    public final p61 b;

    public /* synthetic */ hf5(ve r1, p61 r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if ((r3 instanceof hf5) == false) goto L13;
        hf5 r4 = (hf5) r3;
        if (au0.n(this.a, r4.a) == true) goto L8;
        return false;
    L8:
        if (au0.n(this.b, r4.b) == false) goto L15;
        return true;
    L15:
        return false;
    L13:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qr2 r0 = new qr2(this);
        r0.c(this.a, "key");
        r0.c(this.b, "feature");
        return r0.toString();
    }
}
