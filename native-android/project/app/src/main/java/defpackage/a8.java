package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.AlbumID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 extends cx3 {
    public final x12 u;
    public final /* synthetic */ b8 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public a8(b8 b8Var, x12 x12Var) {
        this.v = b8Var;
        ConstraintLayout constraintLayout = x12Var.a;
        super(constraintLayout);
        this.u = x12Var;
        final int i = 1;
        x12Var.e.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: z7
            public final /* synthetic */ a8 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                a8 a8Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        b8 b8Var2 = a8Var.v;
                        bundle.putParcelable("ALBUM_OBJECT", ((AlbumID3) b8Var2.t.get(a8Var.c())).strippedForNav());
                        b8Var2.r.onAlbumClick(bundle);
                        break;
                    default:
                        a8Var.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(3, this));
        x12Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: z7
            public final /* synthetic */ a8 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                a8 a8Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        b8 b8Var2 = a8Var.v;
                        bundle.putParcelable("ALBUM_OBJECT", ((AlbumID3) b8Var2.t.get(a8Var.c())).strippedForNav());
                        b8Var2.r.onAlbumClick(bundle);
                        break;
                    default:
                        a8Var.s();
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        b8 b8Var = this.v;
        bundle.putParcelable("ALBUM_OBJECT", ((AlbumID3) b8Var.t.get(c())).strippedForNav());
        b8Var.r.onAlbumLongClick(bundle);
    }
}
