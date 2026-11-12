package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ba2;
import defpackage.ea2;
import defpackage.r20;
import defpackage.sa1;
import defpackage.tz0;
import defpackage.uz0;
import defpackage.vj;
import defpackage.yy1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements yy1 {
    @Override // defpackage.yy1
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.yy1
    public final Object b(Context context) {
        Object objR;
        sa1 sa1Var = new sa1(new vj(context, 2));
        sa1Var.a = 1;
        if (tz0.k == null) {
            synchronized (tz0.j) {
                try {
                    if (tz0.k == null) {
                        tz0.k = new tz0(sa1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r20 r20VarT = r20.t(context);
        r20VarT.getClass();
        synchronized (r20.s) {
            try {
                objR = ((HashMap) r20VarT.o).get(ProcessLifecycleInitializer.class);
                if (objR == null) {
                    objR = r20VarT.r(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ea2 ea2VarH = ((ba2) objR).h();
        ea2VarH.a(new uz0(this, ea2VarH));
        return Boolean.TRUE;
    }
}
