package defpackage;

import android.app.Application;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.SmartPlan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class y7 extends hd {
    public final k03 c;
    public final k03 d;
    public int e;
    public int f;

    public y7(Application r2) {
        super(r2);
        this.c = new k03(new ArrayList());
        this.d = new k03(Boolean.TRUE);
        this.e = 0;
        this.f = 2;
    }

    public final void c() {
        zg5 r0 = new zg5(this);
        int r1 = this.e;
        this.e = r1 + 1;
        int r6 = SmartPlan.MAX_QUEUE * r1;
        App.f(false).a().q("alphabeticalByName", SmartPlan.MAX_QUEUE, r6, null, null).enqueue(new x7(r6, 0, r0));
    }
}
