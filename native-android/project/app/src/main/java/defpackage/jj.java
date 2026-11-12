package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.ArtistID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jj extends cx3 {
    public final x12 u;
    public final /* synthetic */ b8 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public jj(b8 b8Var, x12 x12Var) {
        this.v = b8Var;
        ConstraintLayout constraintLayout = x12Var.a;
        super(constraintLayout);
        this.u = x12Var;
        final int i = 1;
        x12Var.e.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ij
            public final /* synthetic */ jj o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                jj jjVar = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        b8 b8Var2 = jjVar.v;
                        bundle.putParcelable("ARTIST_OBJECT", ((ArtistID3) b8Var2.t.get(jjVar.c())).strippedForNav());
                        b8Var2.r.onArtistClick(bundle);
                        break;
                    default:
                        jjVar.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(7, this));
        x12Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: ij
            public final /* synthetic */ jj o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                jj jjVar = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        b8 b8Var2 = jjVar.v;
                        bundle.putParcelable("ARTIST_OBJECT", ((ArtistID3) b8Var2.t.get(jjVar.c())).strippedForNav());
                        b8Var2.r.onArtistClick(bundle);
                        break;
                    default:
                        jjVar.s();
                        break;
                }
            }
        });
    }

    public final boolean s() {
        Bundle bundle = new Bundle();
        b8 b8Var = this.v;
        bundle.putParcelable("ARTIST_OBJECT", ((ArtistID3) b8Var.t.get(c())).strippedForNav());
        b8Var.r.onArtistLongClick(bundle);
        return true;
    }
}
