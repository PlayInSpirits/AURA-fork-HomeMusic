package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ge {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ge(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        dz1.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return h12.c(this.a, geVar.a) && this.b == geVar.b && this.c == geVar.c && h12.c(this.d, geVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + f34.d(this.c, f34.d(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public ge(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
