package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class un {
    public static /* bridge */ /* synthetic */ Bitmap a(MediaMetadataRetriever r0, long r1, int r3, int r4, int r5) {
        return r0.getScaledFrameAtTime(r1, r3, r4, r5);
    }

    public static /* bridge */ /* synthetic */ void b(AutofillManager r0, View r1, int r2, boolean r3) {
        r0.notifyViewVisibilityChanged(r1, r2, r3);
    }
}
