package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye {
    /* JADX INFO: Access modifiers changed from: private */
    public static ColorStateList b(Drawable drawable) {
        if (z9.u(drawable)) {
            return z9.g(drawable).getColorStateList();
        }
        return null;
    }
}
