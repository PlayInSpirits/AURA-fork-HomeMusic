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

    public y7(Application application) {
        super(application);
        this.c = new k03(new ArrayList());
        this.d = new k03(Boolean.TRUE);
        this.e = 0;
        this.f = 2;
    }

    public final void c() {
        zg5 zg5Var = new zg5(this);
        int i = this.e;
        this.e = i + 1;
        int i2 = SmartPlan.MAX_QUEUE * i;
        App.f(false).a().q("alphabeticalByName", SmartPlan.MAX_QUEUE, i2, null, null).enqueue(new x7(i2, 0, zg5Var));
    }
}
