package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iq2 extends dq2 {
    public final ProgressBar A;
    public final TextView B;
    public final RelativeLayout C;
    public final CheckBox D;
    public final float E;
    public final int F;
    public final i4 G;
    public final /* synthetic */ jq2 H;
    public final View y;
    public final ImageView z;

    public iq2(jq2 r4, View r5) {
        this.H = r4;
        lq2 r6 = r4.z;
        super(r6, r5, (ImageButton) r5.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) r5.findViewById(R.id.mr_cast_volume_slider));
        this.G = new i4(9, this);
        this.y = r5;
        this.z = (ImageView) r5.findViewById(R.id.mr_cast_route_icon);
        ProgressBar r0 = (ProgressBar) r5.findViewById(R.id.mr_cast_route_progress_bar);
        this.A = r0;
        this.B = (TextView) r5.findViewById(R.id.mr_cast_route_name);
        this.C = (RelativeLayout) r5.findViewById(R.id.mr_cast_volume_layout);
        CheckBox r7 = (CheckBox) r5.findViewById(R.id.mr_cast_checkbox);
        this.D = r7;
        Context r8 = r6.B;
        Drawable r1 = zz1.r(r8, R.drawable.mr_cast_checkbox);
        if (fu.D(r8) == false) goto L5;
        r1.setTint(r8.getColor(R.color.mr_dynamic_dialog_icon_light));
    L5:
        r7.setButtonDrawable(r1);
        fu.M(r8, r0);
        this.E = fu.v(r8);
        Resources r9 = r8.getResources();
        DisplayMetrics r10 = r9.getDisplayMetrics();
        TypedValue r2 = new TypedValue();
        r9.getValue(R.dimen.mr_dynamic_dialog_row_height, r2, true);
        this.F = (int) r2.getDimension(r10);
    }

    public final boolean u(wq2 r2) {
        if (r2.g() == true) goto L17;
        tq2 r1 = this.H.z.w.a();
        if (r1 == null) goto L15;
        mq2 r3 = (mq2) r1.x.get(r2.c);
        if (r3 == null) goto L10;
        int r4 = r3.b;
    L12:
        if (r4 != 3) goto L18;
        return true;
    L18:
        return false;
    L10:
        r4 = 4;
        goto L12
    L15:
        return false;
    L17:
        return true;
    }

    public final void v(boolean r4, boolean r5) {
        CheckBox r0 = this.D;
        int r1 = 0;
        r0.setEnabled(false);
        this.y.setEnabled(false);
        r0.setChecked(r4);
        if (r4 == false) goto L5;
        this.z.setVisibility(4);
        this.A.setVisibility(0);
    L5:
        if (r5 == false) goto L10;
        if (r4 == false) goto L8;
        r1 = this.F;
    L8:
        this.H.p(this.C, r1);
        return;
    }
}
