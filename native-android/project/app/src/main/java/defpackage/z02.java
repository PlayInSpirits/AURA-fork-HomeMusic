package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z02 extends cx3 {
    public final lv4 u;
    public final /* synthetic */ zd0 v;

    public z02(zd0 r4, lv4 r5) {
        this.v = r4;
        ConstraintLayout r6 = (ConstraintLayout) r5.n;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        ((TextView) r5.t).setSelected(true);
        ((TextView) r5.s).setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new y02(this, r2));
        r6.setOnLongClickListener(new q6(11, this));
        ((ImageView) r5.r).setOnClickListener(new y02(this, r1));
    }

    public final void s() {
        Bundle r0 = new Bundle();
        zd0 r1 = this.v;
        r0.putParcelable("INTERNET_RADIO_STATION_OBJECT", (Parcelable) r1.r.get(c()));
        ((hp1) r1.s).onInternetRadioStationLongClick(r0);
    }
}
