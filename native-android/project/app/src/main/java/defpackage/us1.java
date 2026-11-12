package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.preference.Preference;
import app.homemusic.R;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ us1(vb4 vb4Var, int i, Preference preference, long j) {
        this.n = 0;
        this.q = vb4Var;
        this.o = i;
        this.r = preference;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String string;
        int i2 = this.n;
        Object obj = this.r;
        Object obj2 = this.q;
        switch (i2) {
            case 0:
                vb4 vb4Var = (vb4) obj2;
                Preference preference = (Preference) obj;
                if (vb4Var.y() && (i = this.o) != 0) {
                    String strS = vb4Var.s(R.string.homemusic_settings_mix_offline_summary);
                    Integer numValueOf = Integer.valueOf(i);
                    Context contextZ = vb4Var.Z();
                    long j = this.p;
                    if (j >= 1073741824) {
                        string = contextZ.getString(R.string.homemusic_size_gb, Double.valueOf(j / 1.073741824E9d));
                        string.getClass();
                    } else {
                        string = contextZ.getString(R.string.homemusic_size_mb, Double.valueOf(j / 1048576.0d));
                        string.getClass();
                    }
                    preference.x(strS + "\n" + vb4Var.t(R.string.homemusic_settings_mix_offline_held, numValueOf, string));
                    break;
                }
                break;
            case 1:
                ic2 ic2Var = (ic2) obj2;
                List list = (List) obj;
                int i3 = this.o;
                long j2 = this.p;
                try {
                    if (ic2Var.isDone()) {
                        bo2.d.execute(new us1(list, (bj2) ic2Var.get(), i3, j2, 2));
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e("MediaManager", "Error in startQueue: " + e.getMessage(), e);
                    return;
                }
                break;
            default:
                List list2 = (List) obj2;
                new Handler(Looper.getMainLooper()).post(new wn2((bj2) obj, gi1.M(list2), this.o, this.p, 1));
                if (!u52.c().a) {
                    new vs3().c(list2, true, 0);
                }
                break;
        }
    }

    public /* synthetic */ us1(Object obj, Object obj2, int i, long j, int i2) {
        this.n = i2;
        this.q = obj;
        this.r = obj2;
        this.o = i;
        this.p = j;
    }
}
