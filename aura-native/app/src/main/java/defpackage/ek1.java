package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ek1 extends kw3 {
    public final int a;
    public final int b;

    public ek1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.kw3
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw3Var) {
        cx3 N = RecyclerView.N(view);
        int b = N != null ? N.b() : -1;
        int i = this.a;
        int i2 = b % i;
        int i3 = this.b;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        if (b >= i) {
            rect.top = i3;
        }
    }
}
