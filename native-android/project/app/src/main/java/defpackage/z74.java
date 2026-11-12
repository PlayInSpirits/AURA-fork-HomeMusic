package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z74 extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public z74(View r5, Rect r6, Rect r7) {
        super(r6, r5);
        int r0 = ViewConfiguration.get(r5.getContext()).getScaledTouchSlop();
        this.e = r0;
        Rect r1 = new Rect();
        this.b = r1;
        Rect r2 = new Rect();
        this.d = r2;
        Rect r3 = new Rect();
        this.c = r3;
        r1.set(r6);
        r2.set(r6);
        int r8 = -r0;
        r2.inset(r8, r8);
        r3.set(r7);
        this.a = r5;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent r9) {
        int r0 = (int) r9.getX();
        int r1 = (int) r9.getY();
        int r2 = r9.getAction();
        boolean r5 = true;
        if (r2 == 0) goto L17;
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L11;
        if (r2 != 3) goto L19;
        boolean r3 = this.f;
        this.f = false;
    L10:
        r5 = r3;
        boolean r4 = true;
    L20:
        if (r5 == false) goto L29;
        Rect r6 = this.c;
        View r8 = this.a;
        if (r4 == true) goto L24;
    L26:
        r9.setLocation(r0 - r6.left, r1 - r6.top);
    L28:
        return r8.dispatchTouchEvent(r9);
    L24:
        if (r6.contains(r0, r1) == true) goto L26;
        r9.setLocation(r8.getWidth() / 2, r8.getHeight() / 2);
        goto L28
    L29:
        return false;
    L19:
        r4 = true;
        r5 = false;
    L11:
        r3 = this.f;
        if (r3 == false) goto L10;
        if (this.d.contains(r0, r1) == true) goto L10;
        r5 = r3;
        r4 = false;
        goto L20
    L17:
        if (this.b.contains(r0, r1) == false) goto L19;
        this.f = true;
        r4 = true;
        goto L20
    }
}
