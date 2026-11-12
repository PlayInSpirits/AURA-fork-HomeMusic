package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 {
    public static final ThreadLocal b = null;
    public final TextPaint a;

    static {
        b = new ThreadLocal();
    }

    public wk0() {
        TextPaint r0 = new TextPaint();
        this.a = r0;
        r0.setTextSize(10.0f);
    }
}
