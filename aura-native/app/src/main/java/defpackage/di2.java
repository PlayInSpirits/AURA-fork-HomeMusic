package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class di2 extends mg {
    public di2(android.content.Context a0, android.util.AttributeSet a1) {
        super(a0, a1);
    }

    public static final int[][] t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList r;
    public boolean s;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.r == null) {
            int t2 = g12.t(this, app.homemusic.R.attr.colorControlActivated);
            int t3 = g12.t(this, app.homemusic.R.attr.colorOnSurface);
            int t4 = g12.t(this, app.homemusic.R.attr.colorSurface);
            this.r = new ColorStateList(t, new int[]{g12.H(t4, 1.0f, t2), g12.H(t4, 0.54f, t3), g12.H(t4, 0.38f, t3), g12.H(t4, 0.38f, t3)});
        }
        return this.r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.s = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
