package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h75 {
    public final View a;
    public int b;
    public int c;
    public int d;

    public h75(View r1) {
        this.a = r1;
    }

    public final void a() {
        int r0 = this.d;
        View r1 = this.a;
        int r2 = r0 - (r1.getTop() - this.b);
        WeakHashMap r3 = j65.a;
        r1.offsetTopAndBottom(r2);
        r1.offsetLeftAndRight(0 - (r1.getLeft() - this.c));
    }

    public final boolean b(int r2) {
        if (this.d == r2) goto L6;
        this.d = r2;
        a();
        return true;
    L6:
        return false;
    }
}
