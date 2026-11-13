package defpackage;

import android.content.Context;
import com.eddyizm.tempus.homemusic.SmartSession;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ct1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SmartSession o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Context q;

    public /* synthetic */ ct1(SmartSession smartSession, String str, Context context, int i) {
        this.n = i;
        this.o = smartSession;
        this.p = str;
        this.q = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        Object s14Var2;
        int i = this.n;
        Context context = this.q;
        String str = this.p;
        SmartSession smartSession = this.o;
        switch (i) {
            case 0:
                try {
                    s14Var2 = rr1.t(smartSession.getId(), str);
                } catch (Throwable th) {
                    s14Var2 = new s14(th);
                }
                io1.b.post(new t6(s14Var2, smartSession, str, context));
                break;
            default:
                try {
                    rr1.u(smartSession.getId(), str);
                    s14Var = j15.a;
                } catch (Throwable th2) {
                    s14Var = new s14(th2);
                }
                io1.b.post(new ws1(3, s14Var, context));
                break;
        }
    }
}
