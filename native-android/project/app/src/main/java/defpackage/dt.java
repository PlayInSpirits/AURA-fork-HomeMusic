package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dt {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public dt(int r4, long r5) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        z9.i();
        ColorFilter r0 = z9.e(e35.U(r5), q05.A(r4));
    L6:
        this.a = r0;
        this.b = r5;
        this.c = r4;
        return;
    L5:
        r0 = new PorterDuffColorFilter(e35.U(r5), q05.B(r4));
        goto L6
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof dt) == true) goto L8;
        return false;
    L8:
        dt r9 = (dt) r8;
        long r3 = r9.b;
        if (x40.c(this.b, r3) == true) goto L12;
        return false;
    L12:
        if (this.c != r9.c) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = x40.h;
        int r1 = Long.hashCode(this.b) * 31;
        return Integer.hashCode(this.c) + r1;
    }

    public final String toString() {
        return f34.h("BlendModeColorFilter(color=", x40.h(this.b), ", blendMode=", e35.X(this.c), ")");
    }
}
