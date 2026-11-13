/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.ColorSpace;
import android.os.Build;
import android.window.BackEvent;

public abstract class no {
    public static int a() {
        return Build.VERSION.SDK_INT_FULL;
    }

    public static long b(BackEvent backEvent) {
        return backEvent.getFrameTimeMillis();
    }

    public static ColorSpace.Named c() {
        return ColorSpace.Named.OK_LAB;
    }

    public static long d(BackEvent backEvent) {
        return backEvent.getFrameTimeMillis();
    }
}

