package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r61 extends dj1 {
    public static final rf2 k = new rf2("Fido.FIDO2_API", new u02(9), new pa(6));
    public static final rf2 l = new rf2("RestoreCredential.API", new u02(1), new pa(6));
    public static final rf2 m = new rf2("ClientTelemetry.API", new u02(4), new pa(6));
    public static int n = 1;

    public synchronized int c() {
        int i;
        try {
            i = n;
            if (i == 1) {
                Context context = this.a;
                ej1 ej1Var = ej1.c;
                int iB = ej1Var.b(context, 12451000);
                if (iB == 0) {
                    i = 4;
                    n = 4;
                } else if (ej1Var.a(iB, context, null) != null || oy0.a(context) == 0) {
                    i = 2;
                    n = 2;
                } else {
                    i = 3;
                    n = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
