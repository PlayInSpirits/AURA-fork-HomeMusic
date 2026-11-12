package defpackage;

import android.widget.Button;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi4 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SongListPageFragment b;

    public /* synthetic */ oi4(SongListPageFragment songListPageFragment, int i) {
        this.a = i;
        this.b = songListPageFragment;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        SongListPageFragment songListPageFragment = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (songListPageFragment.p0 != null) {
                    Boolean bool = (Boolean) songListPageFragment.o0.c.d();
                    ni4 ni4Var = songListPageFragment.p0;
                    if (bool != null && bool.booleanValue()) {
                        z = true;
                    }
                    ni4Var.s(str, z);
                }
                break;
            case 1:
                if (songListPageFragment.l0 != null) {
                    String str2 = songListPageFragment.n0.e;
                    str2.getClass();
                    switch (str2) {
                        case "MEDIA_BY_GENRE":
                        case "MEDIA_BY_YEAR":
                            ((Button) songListPageFragment.l0.g).setVisibility(8);
                            break;
                        case "MEDIA_STARRED":
                        case "MEDIA_BY_ARTIST":
                        case "MEDIA_BY_GENRES":
                            ((Button) songListPageFragment.l0.g).setVisibility(0);
                            break;
                    }
                    ((Button) songListPageFragment.l0.f).setOnClickListener(new pi4(songListPageFragment, 1));
                }
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                if (songListPageFragment.p0 != null) {
                    String str3 = (String) songListPageFragment.o0.b.d();
                    ni4 ni4Var2 = songListPageFragment.p0;
                    if (bool2 != null && bool2.booleanValue()) {
                        z = true;
                    }
                    ni4Var2.s(str3, z);
                }
                break;
        }
    }
}
