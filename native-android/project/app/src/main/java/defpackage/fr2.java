package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr2 {
    public final ms2 a;
    public final int b;
    public final int c;
    public final er2 d;
    public final Bundle e;

    public fr2(ms2 r1, int r2, int r3, boolean r4, er2 r5, Bundle r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
        this.e = r6;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof fr2) == true) goto L6;
        return false;
    L6:
        if (this != r3) goto L9;
        return true;
    L9:
        fr2 r4 = (fr2) r3;
        er2 r0 = r4.d;
        er2 r1 = this.d;
        if (r1 != null) goto L16;
        if (r0 != null) goto L16;
        return this.a.equals(r4.a);
    L16:
        return Objects.equals(r1, r0);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.d, this.a});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ControllerInfo {pkg=");
        ms2 r2 = this.a;
        r0.append(r2.a.a);
        r0.append(", uid=");
        return f34.i(r0, r2.a.c, "}");
    }
}
