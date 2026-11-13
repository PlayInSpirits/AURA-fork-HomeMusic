package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pd3 {
    public final mc a;
    public final int b;
    public final int c;

    public pd3(mc mcVar, int i, int i2) {
        this.a = mcVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pd3) {
            pd3 pd3Var = (pd3) obj;
            if (this.a == pd3Var.a && this.b == pd3Var.b && this.c == pd3Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f34.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return f34.i(sb, this.c, ")");
    }
}
