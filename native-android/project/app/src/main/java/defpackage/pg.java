package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pg extends SeekBar {
    public final qg n;

    public pg(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        gt4.a(this, getContext());
        qg r4 = new qg(this);
        this.n = r4;
        r4.C(r2, r3);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        qg r2 = this.n;
        pg r0 = r2.q;
        Drawable r3 = r2.r;
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.isStateful() == true) goto L7;
        return;
    L7:
        if (r3.setState(r0.getDrawableState()) == false) goto L12;
        r0.invalidateDrawable(r3);
        return;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.n.r;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas r2) {
        monitor-enter(this);
        super.onDraw(r2);     // Catch: Throwable -> L6
        this.n.L(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
