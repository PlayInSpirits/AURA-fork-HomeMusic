package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt1 implements wf1 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ rt1(gf1 gf1Var, dx2 dx2Var, q82 q82Var, pc3 pc3Var, int i) {
        this.o = gf1Var;
        this.p = dx2Var;
        this.q = q82Var;
        this.r = pc3Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        switch (i) {
            case 0:
                return HubUpdater.download$lambda$0$0$0((LinearProgressIndicator) obj6, (TextView) obj5, (HubUpdater) obj4, (Activity) obj3, ((Long) obj).longValue(), ((Long) obj2).longValue());
            default:
                ((Integer) obj2).getClass();
                su3.b((gf1) obj6, (dx2) obj5, (q82) obj4, (pc3) obj3, (rg1) obj, xl.O(1));
                return j15.a;
        }
    }

    public /* synthetic */ rt1(LinearProgressIndicator linearProgressIndicator, TextView textView, HubUpdater hubUpdater, Activity activity) {
        this.o = linearProgressIndicator;
        this.p = textView;
        this.q = hubUpdater;
        this.r = activity;
    }
}
