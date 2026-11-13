package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v4 extends jg implements z4 {
    public final /* synthetic */ y4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(y4 y4Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.q = y4Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        e35.S(this, getContentDescription());
        setOnTouchListener(new r4(this, this));
    }

    @Override // defpackage.z4
    public final boolean a() {
        return false;
    }

    @Override // defpackage.z4
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.q.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
