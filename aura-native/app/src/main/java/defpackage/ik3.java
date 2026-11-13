package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ik3 {
    public static final ik3 c = new ik3("");
    public static final ik3 d = new ik3("preload");
    public final String a;
    public final rm2 b;

    public ik3(String str) {
        rm2 rm2Var;
        LogSessionId logSessionId;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            rm2Var = new rm2(7, false);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            rm2Var.o = logSessionId;
        } else {
            rm2Var = null;
        }
        this.b = rm2Var;
    }

    public final synchronized LogSessionId a() {
        rm2 rm2Var;
        rm2Var = this.b;
        rm2Var.getClass();
        return (LogSessionId) rm2Var.o;
    }
}
