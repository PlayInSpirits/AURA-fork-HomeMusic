package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ur0 {
    public final String a;
    public final int b;
    public final int c;

    public ur0(String r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ur0) == false) goto L19;
        ur0 r5 = (ur0) r4;
        if (this.a.equals(r5.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r5.b) goto L13;
        return false;
    L13:
        if (this.c != r5.c) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    }

    public final int hashCode() {
        Integer r2 = Integer.valueOf(this.b);
        Integer r3 = Integer.valueOf(this.c);
        Float r4 = Float.valueOf(1.0f);
        return Objects.hash(new Object[]{this.a, r2, r3, r4, 0, 0, 0, r4});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("DisplayShapeCompat{ spec=");
        r0.append(Integer.valueOf(this.a.hashCode()));
        r0.append(" displayWidth=");
        r0.append(this.b);
        r0.append(" displayHeight=");
        return f34.i(r0, this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
