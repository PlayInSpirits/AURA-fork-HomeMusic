/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Paint;
import android.view.WindowInsets;

public abstract class fb5 {
    public static long a(Paint paint) {
        return paint.getColorLong();
    }

    public static Insets b(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    public static void c(Paint paint, long l16) {
        paint.setColor(l16);
    }

    public static void d(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }
}

