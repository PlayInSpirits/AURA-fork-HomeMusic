package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zm3 extends cx3 {
    public final z40 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public zm3(zd0 zd0Var, z40 z40Var) {
        this.v = zd0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) z40Var.n;
        super(constraintLayout);
        this.u = z40Var;
        final int i = 1;
        ((TextView) z40Var.r).setSelected(true);
        ((TextView) z40Var.p).setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ym3
            public final /* synthetic */ zm3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                zm3 zm3Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        zd0 zd0Var2 = zm3Var.v;
                        bundle.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) zd0Var2.r.get(zm3Var.c()));
                        ((gp1) zd0Var2.s).onPodcastChannelClick(bundle);
                        break;
                    default:
                        zm3Var.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(17, this));
        ((ImageView) z40Var.q).setOnClickListener(new View.OnClickListener(this) { // from class: ym3
            public final /* synthetic */ zm3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                zm3 zm3Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        zd0 zd0Var2 = zm3Var.v;
                        bundle.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) zd0Var2.r.get(zm3Var.c()));
                        ((gp1) zd0Var2.s).onPodcastChannelClick(bundle);
                        break;
                    default:
                        zm3Var.s();
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        zd0 zd0Var = this.v;
        bundle.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) zd0Var.r.get(c()));
        ((gp1) zd0Var.s).onPodcastChannelLongClick(bundle);
    }
}
