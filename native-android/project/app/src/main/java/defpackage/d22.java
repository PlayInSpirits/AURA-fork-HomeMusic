package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 extends GestureDetector.SimpleOnGestureListener {
    public boolean n;
    public final /* synthetic */ f22 o;

    public d22(f22 r1) {
        this.o = r1;
        this.n = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent r1) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent r6) {
        f22 r0 = this.o;
        e22 r1 = r0.m;
        if (this.n == false) goto L22;
        View r5 = r0.n(r6);
        if (r5 == null) goto L17;
        cx3 r7 = r0.r.M(r5);
        if (r7 == null) goto L18;
        RecyclerView r2 = r0.r;
        int r3 = r1.c;
        int r4 = r3 | 3;
        if ((e22.b(((r3 << 8) | r4) | 196608, r2.getLayoutDirection()) & 16711680) == 0) goto L19;
        int r8 = r6.getPointerId(0);
        int r9 = r0.l;
        if (r8 != r9) goto L20;
        int r10 = r6.findPointerIndex(r9);
        float r11 = r6.getX(r10);
        float r12 = r6.getY(r10);
        r0.d = r11;
        r0.e = r12;
        r0.i = 0.0f;
        r0.h = 0.0f;
        r1.getClass();
        if ((r1 instanceof vl3) == true) goto L21;
        r0.r(r7, 2);
        return;
    L21:
        return;
    L20:
        return;
    L19:
        return;
    L18:
        return;
    L17:
        return;
    }
}
