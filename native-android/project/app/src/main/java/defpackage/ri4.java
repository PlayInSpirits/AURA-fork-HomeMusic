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

    public /* synthetic */ ri4(int r1, int r2, Object r3) {
        this.a = r2;
        this.b = r3;
        this.c = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r4) {
        int r0 = this.a;
        int r2 = this.c;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        b r5 = (b) r3;
        List r6 = (List) r4;
        if (r6 != null) goto L7;
        return;
    L7:
        if (r2 != r5.F) goto L25;
        r6.sort(Comparator.comparing(new m7(8), Comparator.nullsFirst(Comparator.naturalOrder())).reversed());
        r5.m.k(r6.subList(0, Math.min(20, r6.size())));
        return;
    L25:
        return;
    L10:
        SongListPageFragment r7 = (SongListPageFragment) r3;
        List r8 = (List) r4;
        if (r7.l0 != null) goto L13;
        return;
    L13:
        if (r2 != r7.s0) goto L27;
        r7.r0 = false;
        r7.p0.r(r8);
        r7.j0();
        r7.k0(r8);
        return;
    L27:
        return;
    L17:
        SongListPageFragment r9 = (SongListPageFragment) r3;
        List r10 = (List) r4;
        if (r9.l0 != null) goto L20;
        return;
    L20:
        if (r2 != r9.s0) goto L29;
        r9.r0 = false;
        r9.p0.r(r10);
        r9.j0();
        r9.k0(r10);
        return;
    }
}
