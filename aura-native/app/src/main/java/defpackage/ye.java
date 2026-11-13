/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import defpackage.z9;

public abstract class ye {
    public static ColorStateList a(Drawable drawable) {
        return ye.b(drawable);
    }

    private static ColorStateList b(Drawable drawable) {
        if (z9.u(drawable)) {
            return z9.c(z9.g(drawable));
        }
        return null;
    }
}

