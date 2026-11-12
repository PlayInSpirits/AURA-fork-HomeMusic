package app.homemusic;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.kc1;

/* JADX INFO: loaded from: classes.dex */
public final class AURAHomeAnimation {
    public static void stop(kc1 r2) {
        View r0 = r2.T;
        if (r0 == null) goto L9;
        View r1 = r0.findViewById(R.id.fragment_home_nested_scroll_view);
        if (r1 == null) goto L9;
        Drawable r3 = r1.getBackground();
        if ((r3 instanceof AnimationDrawable) == false) goto L9;
        ((AnimationDrawable) r3).stop();
    L9:
        AURAVersion.waveButton = null;
    }
}
