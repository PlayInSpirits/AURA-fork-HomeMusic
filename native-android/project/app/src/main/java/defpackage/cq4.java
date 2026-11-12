package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cq4 {
    public static final String d = null;
    public final ComponentName a;
    public final xi4 b;
    public final boolean c;

    static {
        d = cx.i("SystemJobInfoConverter");
    }

    public cq4(Context r2, xi4 r3, boolean r4) {
        this.b = r3;
        this.a = new ComponentName(r2.getApplicationContext(), SystemJobService.class);
        this.c = r4;
    }
}
