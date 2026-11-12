package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d85 {
    public static final f85 a;
    public static final r00 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new g85();
        } else {
            a = new f85();
        }
        b = new r00(Float.class, "translationAlpha", 15);
        new r00(Rect.class, "clipBounds", 16);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.V(view, i, i2, i3, i4);
    }
}
