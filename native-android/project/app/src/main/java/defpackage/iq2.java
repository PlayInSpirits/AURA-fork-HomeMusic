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

    /* JADX WARN: Illegal instructions before constructor call */
    public iq2(jq2 jq2Var, View view) {
        this.H = jq2Var;
        lq2 lq2Var = jq2Var.z;
        super(lq2Var, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.G = new i4(9, this);
        this.y = view;
        this.z = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.A = progressBar;
        this.B = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.C = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.D = checkBox;
        Context context = lq2Var.B;
        Drawable drawableR = zz1.r(context, R.drawable.mr_cast_checkbox);
        if (fu.D(context)) {
            drawableR.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(drawableR);
        fu.M(context, progressBar);
        this.E = fu.v(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.F = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean u(wq2 wq2Var) {
        if (wq2Var.g()) {
            return true;
        }
        tq2 tq2VarA = this.H.z.w.a();
        if (tq2VarA == null) {
            return false;
        }
        mq2 mq2Var = (mq2) tq2VarA.x.get(wq2Var.c);
        return (mq2Var != null ? mq2Var.b : 4) == 3;
    }

    public final void v(boolean z, boolean z2) {
        CheckBox checkBox = this.D;
        checkBox.setEnabled(false);
        this.y.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.z.setVisibility(4);
            this.A.setVisibility(0);
        }
        if (z2) {
            this.H.p(this.C, z ? this.F : 0);
        }
    }
}
