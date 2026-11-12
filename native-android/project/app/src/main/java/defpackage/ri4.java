package defpackage;

import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.eddyizm.tempus.viewmodel.b;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri4 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ ri4(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        int i2 = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SongListPageFragment songListPageFragment = (SongListPageFragment) obj2;
                List list = (List) obj;
                if (songListPageFragment.l0 != null && i2 == songListPageFragment.s0) {
                    songListPageFragment.r0 = false;
                    songListPageFragment.p0.r(list);
                    songListPageFragment.j0();
                    songListPageFragment.k0(list);
                    break;
                }
                break;
            case 1:
                SongListPageFragment songListPageFragment2 = (SongListPageFragment) obj2;
                List list2 = (List) obj;
                if (songListPageFragment2.l0 != null && i2 == songListPageFragment2.s0) {
                    songListPageFragment2.r0 = false;
                    songListPageFragment2.p0.r(list2);
                    songListPageFragment2.j0();
                    songListPageFragment2.k0(list2);
                    break;
                }
                break;
            default:
                b bVar = (b) obj2;
                List list3 = (List) obj;
                if (list3 != null && i2 == bVar.F) {
                    list3.sort(Comparator.comparing(new m7(8), Comparator.nullsFirst(Comparator.naturalOrder())).reversed());
                    bVar.m.k(list3.subList(0, Math.min(20, list3.size())));
                    break;
                }
                break;
        }
    }
}
