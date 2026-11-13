package defpackage;

import com.eddyizm.tempus.ui.fragment.SongListPageFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class si4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SongListPageFragment o;

    public /* synthetic */ si4(SongListPageFragment songListPageFragment, int i) {
        this.n = i;
        this.o = songListPageFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        SongListPageFragment songListPageFragment = this.o;
        switch (i) {
            case 0:
                songListPageFragment.i0();
                break;
            default:
                songListPageFragment.k0(songListPageFragment.p0.u);
                break;
        }
    }
}
