package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveSession;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HashSet o;

    public /* synthetic */ kh3(HashSet r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r2) {
        int r0 = this.n;
        HashSet r1 = this.o;
        PlayEvent r3 = (PlayEvent) r2;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        boolean r4 = WaveSession.a(r1, r3);
    L6:
        return Boolean.valueOf(r4);
    L7:
        r4 = SmartSession.a(r1, r3);
        goto L6
    L8:
        r3.getClass();
        r4 = r1.contains(r3.getEventId());
        goto L6
    }
}
