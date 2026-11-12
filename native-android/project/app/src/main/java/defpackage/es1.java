package defpackage;

import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class es1 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ es1(HubFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r6, Object r7) {
        int r0 = this.n;
        j15 r2 = j15.a;
        HubFragment r5 = this.o;
        List r8 = (List) r6;
        int r9 = ((Integer) r7).intValue();
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        List r1 = HubFragment.y0;
        r8.getClass();
        ExecutorService r3 = ms1.a;
        MainActivity r10 = r5.m0;
        if (r10 == null) goto L8;
        ms1.a(r10, r8, r9, null);
        return r2;
    L8:
        h12.Q("activity");
        throw null;
    L10:
        List r4 = HubFragment.y0;
        r8.getClass();
        ExecutorService r11 = ms1.a;
        MainActivity r12 = r5.m0;
        if (r12 == null) goto L18;
        ArrayList r13 = new ArrayList(r40.k0(r8, 10));
        Iterator r14 = r8.iterator();
    L14:
        if (r14.hasNext() == false) goto L16;
        String r15 = (String) r14.next();
        HubTracks$Item r16 = new HubTracks$Item();
        r16.setSongId(r15);
        r13.add(r16);
        goto L14
    L16:
        ms1.a(r12, r13, r9, null);
        return r2;
    L18:
        h12.Q("activity");
        throw null;
    }
}
