package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fq2 extends dq2 {
    public final /* synthetic */ jq2 A;
    public final TextView y;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public fq2(jq2 jq2Var, View view) {
        this.A = jq2Var;
        lq2 lq2Var = jq2Var.z;
        super(lq2Var, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.y = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = lq2Var.B.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.z = (int) typedValue.getDimension(displayMetrics);
    }
}
