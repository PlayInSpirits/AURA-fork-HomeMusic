package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new hu(0, 0, 0, 0);
    }

    public hu(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            kf2.e(xa3.e(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        kf2.e(xa3.e(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hu.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hu huVar = (hu) obj;
        return this.a == huVar.a && this.b == huVar.b && this.c == huVar.c && this.d == huVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hu.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return f34.i(sb, this.d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hu(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
