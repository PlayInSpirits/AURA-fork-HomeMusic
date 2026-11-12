package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import app.homemusic.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dq2 extends cx3 {
    public wq2 u;
    public final ImageButton v;
    public final MediaRouteVolumeSlider w;
    public final /* synthetic */ lq2 x;

    public dq2(lq2 r1, View r2, ImageButton r3, MediaRouteVolumeSlider r4) {
        this.x = r1;
        super(r2);
        this.v = r3;
        this.w = r4;
        Context r0 = r1.B;
        Drawable r5 = zz1.r(r0, R.drawable.mr_cast_mute_button);
        if (fu.D(r0) == false) goto L5;
        r5.setTint(r0.getColor(R.color.mr_dynamic_dialog_icon_light));
    L5:
        r3.setImageDrawable(r5);
        if (fu.D(r0) == false) goto L8;
        int r6 = r0.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
        int r7 = r0.getColor(R.color.mr_cast_progressbar_background_light);
    L9:
        r4.a(r6, r7);
        return;
    L8:
        r6 = r0.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
        r7 = r0.getColor(R.color.mr_cast_progressbar_background_dark);
        goto L9
    }

    public final void s(wq2 r5) {
        this.u = r5;
        int r0 = r5.p;
        if (r0 != 0) goto L5;
        boolean r1 = true;
    L6:
        ImageButton r2 = this.v;
        r2.setActivated(r1);
        r2.setOnClickListener(new i4(7, this));
        wq2 r3 = this.u;
        MediaRouteVolumeSlider r4 = this.w;
        r4.setTag(r3);
        r4.setMax(r5.q);
        r4.setProgress(r0);
        r4.setOnSeekBarChangeListener(this.x.I);
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void t(boolean r3) {
        ImageButton r0 = this.v;
        if (r0.isActivated() != r3) goto L5;
        return;
    L5:
        r0.setActivated(r3);
        HashMap r1 = this.x.L;
        if (r3 == false) goto L9;
        r1.put(this.u.c, Integer.valueOf(this.w.getProgress()));
        return;
    L9:
        r1.remove(this.u.c);
    }
}
