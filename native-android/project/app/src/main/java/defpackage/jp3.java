package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jp3 extends kw3 {
    public Drawable a;
    public int b;
    public boolean c;
    public final /* synthetic */ kp3 d;

    public jp3(kp3 r1) {
        this.d = r1;
        this.c = true;
    }

    @Override // defpackage.kw3
    public final void f(Rect r1, View r2, RecyclerView r3, yw3 r4) {
        if (i(r2, r3) == false) goto L6;
        r1.bottom = this.b;
        return;
    }

    @Override // defpackage.kw3
    public final void h(Canvas r8, RecyclerView r9) {
        if (this.a == null) goto L11;
        int r0 = r9.getChildCount();
        int r1 = r9.getWidth();
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L15;
        View r4 = r9.getChildAt(r3);
        if (i(r4, r9) == false) goto L10;
        int r5 = r4.getHeight() + ((int) r4.getY());
        this.a.setBounds(0, r5, r1, this.b + r5);
        this.a.draw(r8);
    L10:
        r3 = r3 + 1;
        goto L6
    L15:
        return;
    }

    public final boolean i(View r3, RecyclerView r4) {
        cx3 r0 = r4.M(r3);
        if ((r0 instanceof rp3) == true) goto L5;
        return false;
    L5:
        if (((rp3) r0).y == false) goto L16;
        boolean r2 = this.c;
        int r5 = r4.indexOfChild(r3);
        if (r5 >= (r4.getChildCount() - 1)) goto L13;
        cx3 r6 = r4.M(r4.getChildAt(r5 + 1));
        if ((r6 instanceof rp3) == true) goto L11;
        return false;
    L11:
        if (((rp3) r6).x == false) goto L18;
        return true;
    L18:
        return false;
    L13:
        return r2;
    L16:
        return false;
    }
}
