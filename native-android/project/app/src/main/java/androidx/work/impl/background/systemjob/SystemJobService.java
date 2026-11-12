package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.cx;
import defpackage.gl4;
import defpackage.kf2;
import defpackage.mj0;
import defpackage.ne;
import defpackage.nh0;
import defpackage.pq3;
import defpackage.qe;
import defpackage.rc5;
import defpackage.rm3;
import defpackage.sc5;
import defpackage.w21;
import defpackage.xa3;
import defpackage.z45;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements w21 {
    public static final String r = cx.i("SystemJobService");
    public sc5 n;
    public final HashMap o = new HashMap();
    public final nh0 p = new nh0(1);
    public rm3 q;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        kf2.o(xa3.h("Cannot invoke ", str, " on a background thread"));
    }

    public static rc5 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new rc5(extras.getInt("EXTRA_WORK_SPEC_GENERATION"), extras.getString("EXTRA_WORK_SPEC_ID"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.w21
    public final void b(rc5 rc5Var, boolean z) {
        a("onExecuted");
        cx.f().b(r, rc5Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.o.remove(rc5Var);
        this.p.b(rc5Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            sc5 sc5VarB = sc5.b(getApplicationContext());
            this.n = sc5VarB;
            pq3 pq3Var = sc5VarB.f;
            this.q = new rm3(pq3Var, sc5VarB.d);
            pq3Var.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                cx.f().k(r, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                mj0.j("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        sc5 sc5Var = this.n;
        if (sc5Var != null) {
            sc5Var.f.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        sc5 sc5Var = this.n;
        String str = r;
        if (sc5Var == null) {
            cx.f().b(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        rc5 rc5VarC = c(jobParameters);
        if (rc5VarC == null) {
            cx.f().d(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.o;
        if (map.containsKey(rc5VarC)) {
            cx.f().b(str, "Job is already being executed by SystemJobService: " + rc5VarC);
            return false;
        }
        cx.f().b(str, "onStartJob for " + rc5VarC);
        map.put(rc5VarC, jobParameters);
        z45 z45Var = new z45(5);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ne.f(jobParameters);
        }
        this.q.Q(this.p.d(rc5VarC), z45Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.n == null) {
            cx.f().b(r, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        rc5 rc5VarC = c(jobParameters);
        if (rc5VarC == null) {
            cx.f().d(r, "WorkSpec id not found!");
            return false;
        }
        cx.f().b(r, "onStopJob for " + rc5VarC);
        this.o.remove(rc5VarC);
        gl4 gl4VarB = this.p.b(rc5VarC);
        if (gl4VarB != null) {
            int iC = Build.VERSION.SDK_INT >= 31 ? qe.c(jobParameters) : -512;
            rm3 rm3Var = this.q;
            rm3Var.getClass();
            rm3Var.R(gl4VarB, iC);
        }
        pq3 pq3Var = this.n.f;
        String str = rc5VarC.a;
        synchronized (pq3Var.k) {
            zContains = pq3Var.i.contains(str);
        }
        return !zContains;
    }
}
