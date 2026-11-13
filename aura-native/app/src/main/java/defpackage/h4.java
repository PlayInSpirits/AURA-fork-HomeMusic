package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h4 extends Drawable {
    public final ActionBarContainer a;

    public h4(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.t) {
            Drawable drawable = actionBarContainer.s;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.r;
        if (drawable3 == null || !actionBarContainer.u) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.t) {
            if (actionBarContainer.s != null) {
                actionBarContainer.q.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.q;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
