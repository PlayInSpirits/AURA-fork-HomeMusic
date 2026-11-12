package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ek1 extends kw3 {
    public final int a;
    public final int b;

    public ek1(int r1, int r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.kw3
    public final void f(Rect r2, View r3, RecyclerView r4, yw3 r5) {
        cx3 r6 = RecyclerView.N(r3);
        if (r6 == null) goto L5;
        int r7 = r6.b();
    L6:
        int r8 = this.a;
        int r9 = r7 % r8;
        int r1 = this.b;
        r2.left = (r9 * r1) / r8;
        r2.right = r1 - (((r9 + 1) * r1) / r8);
        if (r7 < r8) goto L10;
        r2.top = r1;
        return;
    L10:
        return;
    L5:
        r7 = -1;
        goto L6
    }
}
