package defpackage;

import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Paint;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fb5 {
    public static /* bridge */ /* synthetic */ long a(Paint r2) {
        return r2.getColorLong();
    }

    public static /* bridge */ /* synthetic */ Insets b(WindowInsets r0) {
        return r0.getSystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ void c(Paint r0, long r1) {
        r0.setColor(r1);
    }

    public static /* bridge */ /* synthetic */ void d(Paint r0, BlendMode r1) {
        r0.setBlendMode(r1);
    }
}
