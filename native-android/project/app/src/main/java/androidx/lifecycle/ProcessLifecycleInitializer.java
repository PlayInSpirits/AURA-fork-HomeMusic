package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.kf2;
import defpackage.kq3;
import defpackage.lq3;
import defpackage.q92;
import defpackage.r20;
import defpackage.u01;
import defpackage.u92;
import defpackage.v92;
import defpackage.yy1;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements yy1 {
    @Override // defpackage.yy1
    public final List a() {
        return u01.n;
    }

    @Override // defpackage.yy1
    public final Object b(Context context) {
        context.getClass();
        r20 r20VarT = r20.t(context);
        r20VarT.getClass();
        if (!((HashSet) r20VarT.p).contains(ProcessLifecycleInitializer.class)) {
            kf2.o("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!v92.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new u92());
        }
        lq3 lq3Var = lq3.v;
        lq3Var.getClass();
        lq3Var.r = new Handler();
        lq3Var.s.d(q92.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new kq3(lq3Var));
        return lq3Var;
    }
}
