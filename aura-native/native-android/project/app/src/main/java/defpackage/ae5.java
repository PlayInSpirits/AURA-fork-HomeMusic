package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae5 {
    public static final ae5 b;
    public si1 a;

    static {
        ae5 ae5Var = new ae5();
        ae5Var.a = null;
        b = ae5Var;
    }

    public static si1 a(Context context) {
        si1 si1Var;
        ae5 ae5Var = b;
        synchronized (ae5Var) {
            try {
                if (ae5Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    ae5Var.a = new si1(13, context);
                }
                si1Var = ae5Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return si1Var;
    }
}
