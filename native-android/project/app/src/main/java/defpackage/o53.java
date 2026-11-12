package defpackage;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o53 {
    public static final String b = null;
    public final Object a;

    static {
        b = cx.i("NetworkRequestCompat");
    }

    public o53(NetworkRequest r1) {
        this.a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o53) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.a, ((o53) r4).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}
