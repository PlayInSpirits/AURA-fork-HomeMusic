package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class aa1 implements Comparator {
    public final Rect n = new Rect();
    public final Rect o = new Rect();
    public final boolean p;
    public final om0 q;

    public aa1(boolean z, om0 om0Var) {
        this.p = z;
        this.q = om0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.q.getClass();
        Rect rect = this.n;
        ((v3) obj).f(rect);
        Rect rect2 = this.o;
        ((v3) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.p;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
