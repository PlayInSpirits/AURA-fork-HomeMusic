package androidx.work;

import android.content.Context;
import defpackage.cx;
import defpackage.i80;
import defpackage.r90;
import defpackage.sc5;
import defpackage.uc5;
import defpackage.yy1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements yy1 {
    public static final String a = cx.i("WrkMgrInitializer");

    @Override // defpackage.yy1
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.yy1
    public final Object b(Context context) {
        cx.f().b(a, "Initializing WorkManager with default configuration.");
        r90 r90Var = new r90(new i80(2));
        context.getClass();
        synchronized (sc5.m) {
            try {
                sc5 sc5Var = sc5.k;
                if (sc5Var != null && sc5.l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (sc5Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (sc5.l == null) {
                        sc5.l = uc5.l(applicationContext, r90Var);
                    }
                    sc5.k = sc5.l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sc5.b(context);
    }
}
