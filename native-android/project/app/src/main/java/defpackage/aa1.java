package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aa1 implements Comparator {
    public final Rect n;
    public final Rect o;
    public final boolean p;
    public final om0 q;

    public aa1(boolean r2, om0 r3) {
        this.n = new Rect();
        this.o = new Rect();
        this.p = r2;
        this.q = r3;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        this.q.getClass();
        Rect r0 = this.n;
        ((v3) r3).f(r0);
        Rect r5 = this.o;
        ((v3) r4).f(r5);
        int r6 = r0.top;
        int r1 = r5.top;
        if (r6 < r1) goto L33;
        if (r6 > r1) goto L37;
        int r7 = r0.left;
        int r2 = r5.left;
        boolean r8 = this.p;
        if (r7 >= r2) goto L11;
        if (r8 == true) goto L38;
        return -1;
    L38:
        return 1;
    L11:
        if (r7 <= r2) goto L14;
        if (r8 == true) goto L34;
        return 1;
    L34:
        return -1;
    L14:
        int r9 = r0.bottom;
        int r10 = r5.bottom;
        if (r9 < r10) goto L35;
        if (r9 > r10) goto L39;
        int r11 = r0.right;
        int r12 = r5.right;
        if (r11 >= r12) goto L23;
        if (r8 == true) goto L40;
        return -1;
    L40:
        return 1;
    L23:
        if (r11 <= r12) goto L29;
        if (r8 == false) goto L36;
        return -1;
    L36:
        return 1;
    L29:
        return 0;
    L39:
        return 1;
    L35:
        return -1;
    L37:
        return 1;
    L33:
        return -1;
    }
}
