package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.preference.Preference;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ us1(vb4 r2, int r3, Preference r4, long r5) {
        this.n = 0;
        this.q = r2;
        this.o = r3;
        this.r = r4;
        this.p = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Object r1 = this.r;
        Object r2 = this.q;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        List r3 = (List) r2;
        ArrayList r5 = gi1.M(r3);
        Handler r4 = new Handler(Looper.getMainLooper());
        r4.post(new wn2((bj2) r1, r5, this.o, this.p, 1));
        if (u52.c().a == true) goto L29;
        new vs3().c(r3, true, 0);
        return;
    L29:
        return;
    L8:
        ic2 r6 = (ic2) r2;
        List r7 = (List) r1;
        int r8 = this.o;
        long r9 = this.p;
    L13:
        e = move-exception;
        Log.e("MediaManager", "Error in startQueue: " + e.getMessage(), e);
        return;
    L10:
        if (r6.isDone() == false) goto L30;
        bo2.d.execute(new us1(r7, (bj2) r6.get(), r8, r9, 2));     // Catch: Throwable -> L13
        return;
    L30:
        return;
    L16:
        vb4 r10 = (vb4) r2;
        Preference r11 = (Preference) r1;
        if (r10.y() == false) goto L32;
        int r12 = this.o;
        if (r12 == 0) goto L33;
        String r13 = r10.s(R.string.homemusic_settings_mix_offline_summary);
        Integer r14 = Integer.valueOf(r12);
        Context r15 = r10.Z();
        long r16 = this.p;
        if (r16 < 1073741824) goto L24;
        String r17 = r15.getString(R.string.homemusic_size_gb, new Object[]{Double.valueOf(r16 / 1.073741824E9d)});
        r17.getClass();
    L25:
        r11.x(r13 + "\n" + r10.t(R.string.homemusic_settings_mix_offline_held, new Object[]{r14, r17}));
        return;
    L24:
        r17 = r15.getString(R.string.homemusic_size_mb, new Object[]{Double.valueOf(r16 / 1048576.0d)});
        r17.getClass();
        goto L25
    L33:
        return;
    }

    public /* synthetic */ us1(Object r1, Object r2, int r3, long r4, int r6) {
        this.n = r6;
        this.q = r1;
        this.r = r2;
        this.o = r3;
        this.p = r4;
    }
}
