package androidx.media3.common.util;

import defpackage.b11;
import defpackage.tb4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int n;
    public final int o;

    /* JADX WARN: Illegal instructions before constructor call */
    public StuckPlayerException(int i, int i2) {
        String strJ;
        if (i == 0) {
            strJ = b11.j(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strJ = b11.j(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strJ = b11.j(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strJ = b11.j(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                tb4.a();
                throw null;
            }
            strJ = b11.j(i2, "Player stuck suppressed for ", " ms");
        }
        super(strJ);
        this.n = i;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.n == stuckPlayerException.n && this.o == stuckPlayerException.o;
    }

    public final int hashCode() {
        return ((527 + this.n) * 31) + this.o;
    }
}
