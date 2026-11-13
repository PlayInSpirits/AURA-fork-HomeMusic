package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ph2 extends InsetDrawable {
    public ph2(android.graphics.drawable.Drawable a0, int a1, int a2, int a3, int a4) {
        super(a0, a1, a2, a3, a4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
