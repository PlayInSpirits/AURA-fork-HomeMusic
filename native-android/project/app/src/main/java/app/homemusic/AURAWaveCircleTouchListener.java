package app.homemusic;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class AURAWaveCircleTouchListener implements View.OnTouchListener {
    private boolean tracking;

    private static boolean insideCircle(View view, MotionEvent motionEvent) {
        int width = view.getWidth();
        int height = view.getHeight();
        float fMin = Math.min(width, height) * 0.5f;
        float x = motionEvent.getX() - (width * 0.5f);
        float y = motionEvent.getY() - (height * 0.5f);
        return (x * x) + (y * y) <= fMin * fMin;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            boolean zInsideCircle = insideCircle(view, motionEvent);
            this.tracking = zInsideCircle;
            view.setPressed(zInsideCircle);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                view.setPressed(this.tracking & insideCircle(view, motionEvent));
                return true;
            }
            this.tracking = false;
            view.setPressed(false);
            return true;
        }
        boolean zInsideCircle2 = this.tracking & insideCircle(view, motionEvent);
        this.tracking = false;
        view.setPressed(false);
        if (!zInsideCircle2) {
            return true;
        }
        view.performClick();
        return true;
    }
}
