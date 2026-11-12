package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cq4 {
    public static final String d = cx.i("SystemJobInfoConverter");
    public final ComponentName a;
    public final xi4 b;
    public final boolean c;

    public cq4(Context context, xi4 xi4Var, boolean z) {
        this.b = xi4Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
