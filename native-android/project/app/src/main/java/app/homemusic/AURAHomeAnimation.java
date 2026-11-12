package app.homemusic;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.kc1;

/* JADX INFO: loaded from: classes.dex */
public final class AURAHomeAnimation {
    public static void stop(kc1 kc1Var) {
        View viewFindViewById;
        View view = kc1Var.T;
        if (view != null && (viewFindViewById = view.findViewById(R.id.fragment_home_nested_scroll_view)) != null) {
            Drawable background = viewFindViewById.getBackground();
            if (background instanceof AnimationDrawable) {
                ((AnimationDrawable) background).stop();
            }
        }
        AURAVersion.waveButton = null;
    }
}
