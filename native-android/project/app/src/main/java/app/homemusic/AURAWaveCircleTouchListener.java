package app.homemusic;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class AURAWaveCircleTouchListener implements View.OnTouchListener {
    private boolean tracking;

    public AURAWaveCircleTouchListener() {
    }

    private static boolean insideCircle(View r8, MotionEvent r9) {
        int r0 = r8.getWidth();
        int r1 = r8.getHeight();
        float r2 = Math.min(r0, r1) * 0.5f;
        float r6 = r9.getX() - (r0 * 0.5f);
        float r7 = r9.getY() - (r1 * 0.5f);
        if (((r6 * r6) + (r7 * r7)) <= (r2 * r2)) goto L6;
        return false;
    L6:
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View r4, MotionEvent r5) {
        int r0 = r5.getActionMasked();
        if (r0 != 0) goto L7;
        boolean r1 = insideCircle(r4, r5);
        this.tracking = r1;
        r4.setPressed(r1);
        return true;
    L7:
        if (r0 != 1) goto L14;
        boolean r2 = this.tracking & insideCircle(r4, r5);
        this.tracking = false;
        r4.setPressed(false);
        if (r2 == false) goto L19;
        r4.performClick();
        return true;
    L19:
        return true;
    L14:
        if (r0 != 2) goto L17;
        r4.setPressed(this.tracking & insideCircle(r4, r5));
        return true;
    L17:
        this.tracking = false;
        r4.setPressed(false);
        return true;
    }
}
