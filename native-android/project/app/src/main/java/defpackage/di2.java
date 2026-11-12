package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class di2 extends mg {
    public static final int[][] t = null;
    public ColorStateList r;
    public boolean s;

    static {
        t = new int[][]{new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.r != null) goto L6;
        int r0 = g12.t(this, app.homemusic.R.attr.colorControlActivated);
        int r1 = g12.t(this, app.homemusic.R.attr.colorOnSurface);
        int r2 = g12.t(this, app.homemusic.R.attr.colorSurface);
        int[] r3 = {g12.H(r2, 1.0f, r0), g12.H(r2, 0.54f, r1), g12.H(r2, 0.38f, r1), g12.H(r2, 0.38f, r1)};
        this.r = new ColorStateList(t, r3);
    L6:
        return this.r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s == true) goto L5;
        return;
    L5:
        if (getButtonTintList() != null) goto L9;
        setUseMaterialThemeColors(true);
        return;
    }

    public void setUseMaterialThemeColors(boolean r1) {
        this.s = r1;
        if (r1 == false) goto L6;
        setButtonTintList(getMaterialThemeColorsTintList());
        return;
    L6:
        setButtonTintList(null);
    }
}
