package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dn3 extends cx3 {
    public final w12 u;
    public final /* synthetic */ en3 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public dn3(en3 en3Var, w12 w12Var) {
        this.v = en3Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) w12Var.b;
        super(constraintLayout);
        this.u = w12Var;
        final int i = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cn3
            public final /* synthetic */ dn3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                dn3 dn3Var = this.o;
                switch (i2) {
                    case 0:
                        dn3Var.s();
                        break;
                    case 1:
                        dn3Var.s();
                        break;
                    case 2:
                        dn3Var.t();
                        break;
                    default:
                        en3 en3Var2 = dn3Var.v;
                        if (!((PodcastEpisode) en3Var2.r.get(dn3Var.c())).getStatus().equals("completed")) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("PODCAST_OBJECT", (Parcelable) en3Var2.r.get(dn3Var.c()));
                            en3Var2.q.onPodcastEpisodeAltClick(bundle);
                        }
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(18, this));
        final int i2 = 1;
        ((Button) w12Var.j).setOnClickListener(new View.OnClickListener(this) { // from class: cn3
            public final /* synthetic */ dn3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                dn3 dn3Var = this.o;
                switch (i3) {
                    case 0:
                        dn3Var.s();
                        break;
                    case 1:
                        dn3Var.s();
                        break;
                    case 2:
                        dn3Var.t();
                        break;
                    default:
                        en3 en3Var2 = dn3Var.v;
                        if (!((PodcastEpisode) en3Var2.r.get(dn3Var.c())).getStatus().equals("completed")) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("PODCAST_OBJECT", (Parcelable) en3Var2.r.get(dn3Var.c()));
                            en3Var2.q.onPodcastEpisodeAltClick(bundle);
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        ((Button) w12Var.i).setOnClickListener(new View.OnClickListener(this) { // from class: cn3
            public final /* synthetic */ dn3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                dn3 dn3Var = this.o;
                switch (i4) {
                    case 0:
                        dn3Var.s();
                        break;
                    case 1:
                        dn3Var.s();
                        break;
                    case 2:
                        dn3Var.t();
                        break;
                    default:
                        en3 en3Var2 = dn3Var.v;
                        if (!((PodcastEpisode) en3Var2.r.get(dn3Var.c())).getStatus().equals("completed")) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("PODCAST_OBJECT", (Parcelable) en3Var2.r.get(dn3Var.c()));
                            en3Var2.q.onPodcastEpisodeAltClick(bundle);
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        ((Button) w12Var.h).setOnClickListener(new View.OnClickListener(this) { // from class: cn3
            public final /* synthetic */ dn3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                dn3 dn3Var = this.o;
                switch (i5) {
                    case 0:
                        dn3Var.s();
                        break;
                    case 1:
                        dn3Var.s();
                        break;
                    case 2:
                        dn3Var.t();
                        break;
                    default:
                        en3 en3Var2 = dn3Var.v;
                        if (!((PodcastEpisode) en3Var2.r.get(dn3Var.c())).getStatus().equals("completed")) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("PODCAST_OBJECT", (Parcelable) en3Var2.r.get(dn3Var.c()));
                            en3Var2.q.onPodcastEpisodeAltClick(bundle);
                        }
                        break;
                }
            }
        });
    }

    public final void s() {
        en3 en3Var = this.v;
        if (((PodcastEpisode) en3Var.r.get(c())).getStatus().equals("completed")) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("PODCAST_OBJECT", (Parcelable) en3Var.r.get(c()));
            en3Var.q.onPodcastEpisodeClick(bundle);
        }
    }

    public final boolean t() {
        en3 en3Var = this.v;
        if (!((PodcastEpisode) en3Var.r.get(c())).getStatus().equals("completed")) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("PODCAST_OBJECT", (Parcelable) en3Var.r.get(c()));
        en3Var.q.onPodcastEpisodeLongClick(bundle);
        return true;
    }
}
