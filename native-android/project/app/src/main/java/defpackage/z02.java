package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z02 extends cx3 {
    public final lv4 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public z02(zd0 zd0Var, lv4 lv4Var) {
        this.v = zd0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) lv4Var.n;
        super(constraintLayout);
        this.u = lv4Var;
        final int i = 1;
        ((TextView) lv4Var.t).setSelected(true);
        ((TextView) lv4Var.s).setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: y02
            public final /* synthetic */ z02 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                z02 z02Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        zd0 zd0Var2 = z02Var.v;
                        bundle.putParcelable("INTERNET_RADIO_STATION_OBJECT", (Parcelable) zd0Var2.r.get(z02Var.c()));
                        ((hp1) zd0Var2.s).onInternetRadioStationClick(bundle);
                        break;
                    default:
                        z02Var.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(11, this));
        ((ImageView) lv4Var.r).setOnClickListener(new View.OnClickListener(this) { // from class: y02
            public final /* synthetic */ z02 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                z02 z02Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        zd0 zd0Var2 = z02Var.v;
                        bundle.putParcelable("INTERNET_RADIO_STATION_OBJECT", (Parcelable) zd0Var2.r.get(z02Var.c()));
                        ((hp1) zd0Var2.s).onInternetRadioStationClick(bundle);
                        break;
                    default:
                        z02Var.s();
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        zd0 zd0Var = this.v;
        bundle.putParcelable("INTERNET_RADIO_STATION_OBJECT", (Parcelable) zd0Var.r.get(c()));
        ((hp1) zd0Var.s).onInternetRadioStationLongClick(bundle);
    }
}
