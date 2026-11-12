package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends jg implements z4 {
    public final /* synthetic */ y4 q;

    public v4(y4 r2, Context r3) {
        this.q = r2;
        super(r3, null, R.attr.actionOverflowButtonStyle);
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
        if (super.performClick() == false) goto L5;
        return true;
    L5:
        playSoundEffect(0);
        this.q.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r4, int r5, int r6, int r7) {
        boolean r8 = super.setFrame(r4, r5, r6, r7);
        Drawable r9 = getDrawable();
        Drawable r10 = getBackground();
        if (r9 == null) goto L6;
        if (r10 == null) goto L6;
        int r11 = getWidth();
        int r12 = getHeight();
        int r0 = Math.max(r11, r12) / 2;
        int r1 = getPaddingLeft() - getPaddingRight();
        int r13 = (r11 + r1) / 2;
        int r14 = (r12 + (getPaddingTop() - getPaddingBottom())) / 2;
        r10.setHotspotBounds(r13 - r0, r14 - r0, r13 + r0, r14 + r0);
    L6:
        return r8;
    }
}
