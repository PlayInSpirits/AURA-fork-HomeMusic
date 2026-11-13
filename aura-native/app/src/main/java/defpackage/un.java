/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.autofill.AutofillManager;

public abstract class un {
    public static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long l16, int n16, int n17, int n18) {
        return mediaMetadataRetriever.getScaledFrameAtTime(l16, n16, n17, n18);
    }

    public static void b(AutofillManager autofillManager, View view, int n16, boolean bl5) {
        autofillManager.notifyViewVisibilityChanged(view, n16, bl5);
    }
}

