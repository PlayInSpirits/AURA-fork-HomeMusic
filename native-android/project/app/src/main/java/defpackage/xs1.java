package defpackage;

import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ MainActivity o;

    public /* synthetic */ xs1(MainActivity mainActivity, int i) {
        this.n = i;
        this.o = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        MainActivity mainActivity = this.o;
        switch (i) {
            case 0:
                if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    mainActivity.H();
                    break;
                }
                break;
            case 1:
                mainActivity.t();
                break;
            default:
                int i2 = MainActivity.e0;
                try {
                    ((bj2) mainActivity.P.get()).v(new tf2(mainActivity));
                    if (((bj2) mainActivity.P.get()).a() != null && mainActivity.W.Y == 5) {
                        try {
                            ((au) mainActivity.V.n).d(true);
                        } catch (InterruptedException e) {
                            e = e;
                        }
                        break;
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    e = e2;
                }
                e.printStackTrace();
                break;
        }
    }
}
