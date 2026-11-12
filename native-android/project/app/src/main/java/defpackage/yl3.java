package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl3 extends cx3 {
    public final x12 u;
    public final /* synthetic */ ej v;

    /* JADX WARN: Illegal instructions before constructor call */
    public yl3(ej ejVar, x12 x12Var) {
        this.v = ejVar;
        ConstraintLayout constraintLayout = x12Var.a;
        super(constraintLayout);
        this.u = x12Var;
        final int i = 1;
        x12Var.e.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xl3
            public final /* synthetic */ yl3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                yl3 yl3Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        ej ejVar2 = yl3Var.v;
                        bundle.putParcelable("PLAYLIST_OBJECT", (Parcelable) ejVar2.r.get(yl3Var.c()));
                        ejVar2.t.onPlaylistClick(bundle);
                        break;
                    default:
                        yl3Var.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(15, this));
        x12Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: xl3
            public final /* synthetic */ yl3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                yl3 yl3Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        ej ejVar2 = yl3Var.v;
                        bundle.putParcelable("PLAYLIST_OBJECT", (Parcelable) ejVar2.r.get(yl3Var.c()));
                        ejVar2.t.onPlaylistClick(bundle);
                        break;
                    default:
                        yl3Var.s();
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        ej ejVar = this.v;
        bundle.putParcelable("PLAYLIST_OBJECT", (Parcelable) ejVar.r.get(c()));
        ejVar.t.onPlaylistLongClick(bundle);
    }
}
