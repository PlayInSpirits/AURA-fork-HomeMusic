package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ur0 {
    public final String a;
    public final int b;
    public final int c;

    public ur0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        return this.a.equals(ur0Var.a) && this.b == ur0Var.b && this.c == ur0Var.c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return f34.i(sb, this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
