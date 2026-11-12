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

    public /* synthetic */ kh3(HashSet hashSet, int i) {
        this.n = i;
        this.o = hashSet;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.n;
        HashSet hashSet = this.o;
        PlayEvent playEvent = (PlayEvent) obj;
        switch (i) {
            case 0:
                playEvent.getClass();
                zContains = hashSet.contains(playEvent.getEventId());
                break;
            case 1:
                zContains = SmartSession.sent$lambda$1(hashSet, playEvent);
                break;
            default:
                zContains = WaveSession.sent$lambda$1(hashSet, playEvent);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
