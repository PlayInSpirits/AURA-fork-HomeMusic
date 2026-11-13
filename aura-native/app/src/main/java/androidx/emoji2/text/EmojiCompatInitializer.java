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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements yy1 {
    @Override // defpackage.yy1
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.yy1
    public final Object b(Context context) {
        Object obj;
        sa1 sa1Var = new sa1(new vj(context, 2));
        sa1Var.a = 1;
        if (tz0.k == null) {
            synchronized (tz0.j) {
                try {
                    if (tz0.k == null) {
                        tz0.k = new tz0(sa1Var);
                    }
                } finally {
                }
            }
        }
        r20 t = r20.t(context);
        t.getClass();
        synchronized (r20.s) {
            try {
                obj = ((HashMap) t.o).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = t.r(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        ea2 h = ((ba2) obj).h();
        h.a(new uz0(this, h));
        return Boolean.TRUE;
    }
}
