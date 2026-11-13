package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dt {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public dt(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            z9.i();
            porterDuffColorFilter = z9.e(e35.U(j), q05.A(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(e35.U(j), q05.B(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj;
        return x40.c(this.b, dtVar.b) && this.c == dtVar.c;
    }

    public final int hashCode() {
        int i = x40.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return f34.h("BlendModeColorFilter(color=", x40.h(this.b), ", blendMode=", e35.X(this.c), ")");
    }
}
