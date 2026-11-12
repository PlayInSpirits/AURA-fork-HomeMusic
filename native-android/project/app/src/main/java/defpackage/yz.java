package defpackage;

import com.eddyizm.tempus.homemusic.HubException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz {
    public final xz a;
    public final vz b;
    public final HubException c;

    public /* synthetic */ yz(xz r2, vz r3, int r4) {
        if ((r4 & 2) == 0) goto L5;
        r3 = null;
    L5:
        this(r2, r3, null);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof yz) == true) goto L8;
        return false;
    L8:
        yz r6 = (yz) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r6.c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = 0;
        vz r2 = this.b;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        HubException r5 = this.c;
        if (r5 == null) goto L11;
        r1 = r5.hashCode();
    L11:
        return r4 + r1;
    L5:
        r3 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "Result(outcome=" + this.a + ", command=" + this.b + ", error=" + this.c + ")";
    }

    public yz(xz r1, vz r2, HubException r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }
}
