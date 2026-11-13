package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import app.homemusic.R;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class dq2 extends cx3 {
    public wq2 u;
    public final ImageButton v;
    public final MediaRouteVolumeSlider w;
    public final /* synthetic */ lq2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(lq2 lq2Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.x = lq2Var;
        this.v = imageButton;
        this.w = mediaRouteVolumeSlider;
        Context context = lq2Var.B;
        Drawable r = zz1.r(context, R.drawable.mr_cast_mute_button);
        if (fu.D(context)) {
            r.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(r);
        if (fu.D(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void s(wq2 wq2Var) {
        this.u = wq2Var;
        int i = wq2Var.p;
        boolean z = i == 0;
        ImageButton imageButton = this.v;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new i4(7, this));
        wq2 wq2Var2 = this.u;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.w;
        mediaRouteVolumeSlider.setTag(wq2Var2);
        mediaRouteVolumeSlider.setMax(wq2Var.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.x.I);
    }

    public final void t(boolean z) {
        ImageButton imageButton = this.v;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap hashMap = this.x.L;
        if (z) {
            hashMap.put(this.u.c, Integer.valueOf(this.w.getProgress()));
        } else {
            hashMap.remove(this.u.c);
        }
    }
}
