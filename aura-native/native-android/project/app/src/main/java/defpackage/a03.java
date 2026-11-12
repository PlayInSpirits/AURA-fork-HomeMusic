package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Artist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a03 extends cx3 {
    public final z12 u;
    public final /* synthetic */ b03 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public a03(b03 b03Var, z12 z12Var) {
        this.v = b03Var;
        ConstraintLayout constraintLayout = z12Var.a;
        super(constraintLayout);
        this.u = z12Var;
        final int i = 1;
        z12Var.e.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zz2
            public final /* synthetic */ a03 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                a03 a03Var = this.o;
                switch (i3) {
                    case 0:
                        a03Var.s();
                        break;
                    case 1:
                        a03Var.s();
                        break;
                    default:
                        Bundle bundle = new Bundle();
                        b03 b03Var2 = a03Var.v;
                        bundle.putString("MUSIC_DIRECTORY_ID", ((Artist) b03Var2.r.get(a03Var.c())).getId());
                        b03Var2.q.onMusicIndexPlay(bundle);
                        break;
                }
            }
        });
        z12Var.c.setOnClickListener(new View.OnClickListener(this) { // from class: zz2
            public final /* synthetic */ a03 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                a03 a03Var = this.o;
                switch (i3) {
                    case 0:
                        a03Var.s();
                        break;
                    case 1:
                        a03Var.s();
                        break;
                    default:
                        Bundle bundle = new Bundle();
                        b03 b03Var2 = a03Var.v;
                        bundle.putString("MUSIC_DIRECTORY_ID", ((Artist) b03Var2.r.get(a03Var.c())).getId());
                        b03Var2.q.onMusicIndexPlay(bundle);
                        break;
                }
            }
        });
        final int i3 = 2;
        z12Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: zz2
            public final /* synthetic */ a03 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                a03 a03Var = this.o;
                switch (i4) {
                    case 0:
                        a03Var.s();
                        break;
                    case 1:
                        a03Var.s();
                        break;
                    default:
                        Bundle bundle = new Bundle();
                        b03 b03Var2 = a03Var.v;
                        bundle.putString("MUSIC_DIRECTORY_ID", ((Artist) b03Var2.r.get(a03Var.c())).getId());
                        b03Var2.q.onMusicIndexPlay(bundle);
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        b03 b03Var = this.v;
        bundle.putString("MUSIC_DIRECTORY_ID", ((Artist) b03Var.r.get(c())).getId());
        b03Var.q.onMusicIndexClick(bundle);
    }
}
