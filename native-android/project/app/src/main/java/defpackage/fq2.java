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

    public fq2(jq2 r4, View r5) {
        this.A = r4;
        lq2 r6 = r4.z;
        super(r6, r5, (ImageButton) r5.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) r5.findViewById(R.id.mr_cast_volume_slider));
        this.y = (TextView) r5.findViewById(R.id.mr_group_volume_route_name);
        Resources r7 = r6.B.getResources();
        DisplayMetrics r8 = r7.getDisplayMetrics();
        TypedValue r0 = new TypedValue();
        r7.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, r0, true);
        this.z = (int) r0.getDimension(r8);
    }
}
