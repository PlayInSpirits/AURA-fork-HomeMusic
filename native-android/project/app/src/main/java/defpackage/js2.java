package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class js2 implements er2 {
    public final ms2 n;

    public js2(ms2 r1) {
        this.n = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (r3.getClass() == js2.class) goto L10;
        return false;
    L10:
        return Objects.equals(this.n, ((js2) r3).n);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.n});
    }
}
