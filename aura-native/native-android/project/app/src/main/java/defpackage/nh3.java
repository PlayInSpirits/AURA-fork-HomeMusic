package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartPlan;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nh3 {
    public final lh3 a;
    public final q b;
    public final gf1 c;
    public final gf1 d;
    public final gf1 e;
    public final gf1 f;
    public int g;

    public nh3(lh3 lh3Var, q qVar, na naVar, na naVar2, na naVar3, na naVar4) {
        lh3Var.getClass();
        this.a = lh3Var;
        this.b = qVar;
        this.c = naVar;
        this.d = naVar2;
        this.e = naVar3;
        this.f = naVar4;
    }

    public final synchronized Long a() {
        List listF0;
        int size;
        final boolean zBooleanValue = ((Boolean) this.c.invoke()).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) this.d.invoke()).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) this.f.invoke()).booleanValue();
        int size2 = SmartPlan.MAX_QUEUE;
        while (true) {
            lh3 lh3Var = this.a;
            final String str = (String) this.e.invoke();
            synchronized (lh3Var) {
                listF0 = fa4.f0(fa4.e0(new h71(new w40(0, lh3Var.a()), true, new if1() { // from class: jh3
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        PlayEvent playEvent = (PlayEvent) obj;
                        playEvent.getClass();
                        return Boolean.valueOf(playEvent.getRejected() == null && playEvent.supported(zBooleanValue, zBooleanValue2, zBooleanValue3) && (playEvent.getAccount() == null || h12.c(playEvent.getAccount(), str)));
                    }
                }), size2));
            }
            if (listF0.isEmpty()) {
                this.g = 0;
                lh3 lh3Var2 = this.a;
                synchronized (lh3Var2) {
                    size = lh3Var2.a().size();
                }
                return size > 0 ? 300000L : null;
            }
            int iOrdinal = ((mh3) this.b.invoke(listF0)).ordinal();
            if (iOrdinal == 0) {
                this.g = 0;
                this.a.c(listF0);
            } else if (iOrdinal == 1) {
                this.g = 0;
            } else {
                if (iOrdinal == 2) {
                    break;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        break;
                    }
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.g++;
                    return 21600000L;
                }
                if (listF0.size() <= 1) {
                    lh3 lh3Var3 = this.a;
                    Map mapSingletonMap = Collections.singletonMap(((PlayEvent) q40.I0(listF0)).getEventId(), "Server rejected single event as too large (413)");
                    mapSingletonMap.getClass();
                    lh3Var3.b(mapSingletonMap);
                } else {
                    size2 = listF0.size() / 2;
                    if (size2 < 1) {
                        size2 = 1;
                    }
                }
            }
        }
        int i = this.g;
        this.g = i + 1;
        long jM = 30000 << gb.m(i, 0, 10);
        if (jM > 1800000) {
            jM = 1800000;
        }
        return Long.valueOf(jM);
    }
}
