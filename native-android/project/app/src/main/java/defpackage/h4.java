package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends Drawable {
    public final ActionBarContainer a;

    public h4(ActionBarContainer r1) {
        this.a = r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        ActionBarContainer r1 = this.a;
        if (r1.t == false) goto L8;
        Drawable r3 = r1.s;
        if (r3 == null) goto L17;
        r3.draw(r2);
        return;
    L17:
        return;
    L8:
        Drawable r0 = r1.q;
        if (r0 == null) goto L11;
        r0.draw(r2);
    L11:
        Drawable r4 = r1.r;
        if (r4 != null) goto L14;
        return;
    L14:
        if (r1.u == false) goto L19;
        r4.draw(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline r2) {
        ActionBarContainer r1 = this.a;
        if (r1.t == true) goto L5;
        Drawable r3 = r1.q;
        if (r3 == null) goto L13;
        r3.getOutline(r2);
        return;
    L13:
        return;
    L5:
        if (r1.s == null) goto L12;
        r1.q.getOutline(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
    }
}
