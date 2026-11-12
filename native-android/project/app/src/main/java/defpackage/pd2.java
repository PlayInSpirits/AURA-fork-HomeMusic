package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pd2 {
    public final long a;
    public final float b;
    public final long c;

    public pd2(od2 r3) {
        this.a = r3.a;
        this.b = r3.b;
        this.c = r3.c;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof pd2) == true) goto L8;
        return false;
    L8:
        pd2 r9 = (pd2) r8;
        if (this.a == r9.a) goto L11;
    L15:
        return false;
    L11:
        if (this.b != r9.b) goto L15;
        if (this.c != r9.c) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
