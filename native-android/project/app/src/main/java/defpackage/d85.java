package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d85 {
    public static final f85 a = null;
    public static final r00 b = null;

    static {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        a = new g85();
    L6:
        Class<Float> r3 = Float.class;
        b = new r00(r3, "translationAlpha", 15);
        Class<Rect> r4 = Rect.class;
        new r00(r4, "clipBounds", 16);
        return;
    L5:
        a = new f85();
        goto L6
    }

    public static void a(View r6, int r7, int r8, int r9, int r10) {
        a.V(r6, r7, r8, r9, r10);
    }
}
