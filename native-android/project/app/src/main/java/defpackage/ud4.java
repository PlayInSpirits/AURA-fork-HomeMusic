package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ud4 implements le {
    public static final ud4 n = null;

    static {
        n = new ud4();
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L6;
        return true;
    L6:
        if ((r3 instanceof ud4) == true) goto L9;
        return false;
    L9:
        if (au0.n(null, null) == true) goto L11;
    L19:
        return false;
    L11:
        if (au0.n(null, null) == false) goto L19;
        if (au0.n(null, null) == false) goto L19;
        if (au0.n(null, null) == false) goto L19;
        if (au0.n(null, null) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        Boolean r0 = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{r0, r0, null, r0, r0, null, null, null, null});
    }
}
