package defpackage;

import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vs3 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;

    public /* synthetic */ ss3(vs3 vs3Var, String str, long j, int i) {
        this.n = i;
        this.o = vs3Var;
        this.p = str;
        this.q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        vs3 vs3Var = this.o;
        switch (i) {
            case 0:
                ns3 ns3Var = vs3Var.a;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                s24 s24Var = (s24) ns3Var.o;
                final long j = this.q;
                final String str = this.p;
                xl.E(s24Var, false, true, new if1() { // from class: js3
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) throws Exception {
                        long j2 = jCurrentTimeMillis;
                        long j3 = j;
                        z34 z34VarU = ((x34) obj).U("UPDATE queue SET last_play=?, playing_changed=? WHERE id=?");
                        try {
                            z34VarU.c(1, j2);
                            z34VarU.c(2, j3);
                            String str2 = str;
                            if (str2 == null) {
                                z34VarU.e(3);
                            } else {
                                z34VarU.r(3, str2);
                            }
                            z34VarU.O();
                            return null;
                        } finally {
                            z34VarU.close();
                        }
                    }
                });
                break;
            default:
                vs3.d((List) vs3Var.a.c().stream().map(new bi2(28)).collect(Collectors.toList()), this.p, this.q);
                break;
        }
    }
}
