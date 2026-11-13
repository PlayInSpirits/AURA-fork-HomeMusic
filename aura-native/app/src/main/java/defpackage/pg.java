package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class pg extends SeekBar {
    public final qg n;

    public pg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gt4.a(this, getContext());
        qg qgVar = new qg(this);
        this.n = qgVar;
        qgVar.C(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        qg qgVar = this.n;
        pg pgVar = qgVar.q;
        Drawable drawable = qgVar.r;
        if (drawable != null && drawable.isStateful() && drawable.setState(pgVar.getDrawableState())) {
            pgVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n.r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.n.L(canvas);
    }
}
