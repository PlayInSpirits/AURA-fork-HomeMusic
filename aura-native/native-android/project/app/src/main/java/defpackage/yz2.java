package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz2 extends cx3 {
    public final z12 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public yz2(zd0 zd0Var, z12 z12Var) {
        this.v = zd0Var;
        ConstraintLayout constraintLayout = z12Var.a;
        super(constraintLayout);
        this.u = z12Var;
        final int i = 1;
        z12Var.e.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xz2
            public final /* synthetic */ yz2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                yz2 yz2Var = this.o;
                switch (i3) {
                    case 0:
                        yz2Var.s();
                        break;
                    case 1:
                        yz2Var.s();
                        break;
                    default:
                        zd0 zd0Var2 = yz2Var.v;
                        if (((Child) zd0Var2.r.get(yz2Var.c())).isDir()) {
                            Bundle bundle = new Bundle();
                            bundle.putString("MUSIC_DIRECTORY_ID", ((Child) zd0Var2.r.get(yz2Var.c())).getId());
                            ((DirectoryFragment) zd0Var2.s).onMusicDirectoryPlay(bundle);
                        }
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(13, this));
        z12Var.c.setOnClickListener(new View.OnClickListener(this) { // from class: xz2
            public final /* synthetic */ yz2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                yz2 yz2Var = this.o;
                switch (i3) {
                    case 0:
                        yz2Var.s();
                        break;
                    case 1:
                        yz2Var.s();
                        break;
                    default:
                        zd0 zd0Var2 = yz2Var.v;
                        if (((Child) zd0Var2.r.get(yz2Var.c())).isDir()) {
                            Bundle bundle = new Bundle();
                            bundle.putString("MUSIC_DIRECTORY_ID", ((Child) zd0Var2.r.get(yz2Var.c())).getId());
                            ((DirectoryFragment) zd0Var2.s).onMusicDirectoryPlay(bundle);
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        z12Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: xz2
            public final /* synthetic */ yz2 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                yz2 yz2Var = this.o;
                switch (i4) {
                    case 0:
                        yz2Var.s();
                        break;
                    case 1:
                        yz2Var.s();
                        break;
                    default:
                        zd0 zd0Var2 = yz2Var.v;
                        if (((Child) zd0Var2.r.get(yz2Var.c())).isDir()) {
                            Bundle bundle = new Bundle();
                            bundle.putString("MUSIC_DIRECTORY_ID", ((Child) zd0Var2.r.get(yz2Var.c())).getId());
                            ((DirectoryFragment) zd0Var2.s).onMusicDirectoryPlay(bundle);
                        }
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        zd0 zd0Var = this.v;
        DirectoryFragment directoryFragment = (DirectoryFragment) zd0Var.s;
        if (((Child) zd0Var.r.get(c())).isDir()) {
            bundle.putString("MUSIC_DIRECTORY_ID", ((Child) zd0Var.r.get(c())).getId());
            directoryFragment.onMusicDirectoryClick(bundle);
        } else {
            bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(zd0Var.r));
            bundle.putInt("ITEM_POSITION", c());
            directoryFragment.onMediaClick(bundle);
        }
    }
}
