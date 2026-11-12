package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dq4 implements a64 {
    public static final String s = cx.i("SystemJobScheduler");
    public final Context n;
    public final JobScheduler o;
    public final cq4 p;
    public final WorkDatabase q;
    public final r90 r;

    public dq4(Context context, WorkDatabase workDatabase, r90 r90Var) {
        JobScheduler jobSchedulerA = w22.a(context);
        cq4 cq4Var = new cq4(context, r90Var.d, r90Var.l);
        this.n = context;
        this.o = jobSchedulerA;
        this.p = cq4Var;
        this.q = workDatabase;
        this.r = r90Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            cx.f().e(s, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = w22.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            cx.f().e(w22.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static rc5 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new rc5(extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0), extras.getString("EXTRA_WORK_SPEC_ID"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.a64
    public final boolean c() {
        return true;
    }

    @Override // defpackage.a64
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.n;
        JobScheduler jobScheduler = this.o;
        ArrayList arrayListB = b(context, jobScheduler);
        int i = 0;
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListB.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListB.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                rc5 rc5VarF = f(jobInfo);
                if (rc5VarF != null && str.equals(rc5VarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            a(jobScheduler, ((Integer) obj2).intValue());
        }
        bq4 bq4VarX = this.q.x();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bq4VarX.n;
        workDatabase_Impl.b();
        aq4 aq4Var = (aq4) bq4VarX.q;
        df1 df1VarA = aq4Var.a();
        df1VarA.h(1, str);
        try {
            workDatabase_Impl.c();
            try {
                df1VarA.b();
                workDatabase_Impl.t();
                workDatabase_Impl.o();
                aq4Var.h(df1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.o();
                throw th;
            }
        } catch (Throwable th2) {
            aq4Var.h(df1VarA);
            throw th2;
        }
    }

    @Override // defpackage.a64
    public final void e(dd5... dd5VarArr) {
        int iIntValue;
        r90 r90Var = this.r;
        WorkDatabase workDatabase = this.q;
        final rv1 rv1Var = new rv1(workDatabase, 0);
        for (dd5 dd5Var : dd5VarArr) {
            workDatabase.c();
            try {
                fd5 fd5VarA = workDatabase.A();
                String str = dd5Var.a;
                dd5 dd5VarH = fd5VarA.h(str);
                String str2 = s;
                if (dd5VarH == null) {
                    cx.f().k(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.t();
                } else if (dd5VarH.b != 1) {
                    cx.f().k(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.t();
                } else {
                    rc5 rc5VarM = q05.m(dd5Var);
                    zp4 zp4VarK = workDatabase.x().k(rc5VarM);
                    if (zp4VarK != null) {
                        iIntValue = zp4VarK.c;
                    } else {
                        r90Var.getClass();
                        final int i = r90Var.i;
                        Object objR = rv1Var.a.r(new Callable() { // from class: qv1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = rv1Var.a;
                                Long l = workDatabase2.w().l("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = l != null ? (int) l.longValue() : 0;
                                workDatabase2.w().n(new fp3("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.w().n(new fp3("next_job_scheduler_id", 1L));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        });
                        objR.getClass();
                        iIntValue = ((Number) objR).intValue();
                    }
                    if (zp4VarK == null) {
                        workDatabase.x().n(new zp4(rc5VarM.a, rc5VarM.b, iIntValue));
                    }
                    g(dd5Var, iIntValue);
                    workDatabase.t();
                }
                workDatabase.o();
            } catch (Throwable th) {
                workDatabase.o();
                throw th;
            }
        }
    }

    public final void g(dd5 dd5Var, int i) {
        int i2;
        int i3;
        List<JobInfo> allPendingJobs;
        String str;
        cq4 cq4Var = this.p;
        cq4Var.getClass();
        mc0 mc0Var = dd5Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = dd5Var.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", dd5Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", dd5Var.d());
        JobInfo.Builder builder = new JobInfo.Builder(i, cq4Var.a);
        boolean z = mc0Var.c;
        Set<lc0> set = mc0Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = mc0Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = mc0Var.a();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28 || networkRequestA == null) {
            int i5 = mc0Var.a;
            if (i4 < 30 || i5 != 6) {
                int iW = xa3.w(i5);
                if (iW == 0) {
                    i2 = 0;
                } else if (iW == 1) {
                    i2 = 1;
                } else if (iW != 2) {
                    i2 = 3;
                    if (iW != 3) {
                        i2 = 4;
                        if (iW != 4 || i4 < 26) {
                            cx.f().b(cq4.d, "API version too low. Cannot convert network type value ".concat(b11.y(i5)));
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(dd5Var.m, dd5Var.l == 2 ? 0 : 1);
        }
        long jA = dd5Var.a();
        cq4Var.b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!dd5Var.q && cq4Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (lc0 lc0Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(lc0Var.a, lc0Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(mc0Var.g);
            extras.setTriggerContentMaxDelay(mc0Var.h);
        }
        extras.setPersisted(false);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            extras.setRequiresBatteryNotLow(mc0Var.e);
            extras.setRequiresStorageNotLow(mc0Var.f);
        }
        boolean z3 = dd5Var.k > 0;
        boolean z4 = jMax > 0;
        if (i6 >= 31 && dd5Var.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i6 >= 35 && (str = dd5Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        String str3 = s;
        cx.f().b(str3, "Scheduling work ID " + str2 + "Job ID " + i);
        try {
            try {
                if (this.o.schedule(jobInfoBuild) != 0) {
                    return;
                }
                cx.f().k(str3, "Unable to schedule work ID " + str2);
                if (!dd5Var.q || dd5Var.r != 1) {
                    return;
                }
                i3 = 0;
                try {
                    dd5Var.q = false;
                    cx.f().b(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(dd5Var, i);
                    return;
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                i3 = 0;
            }
        } catch (Throwable th) {
            cx.f().e(str3, "Unable to schedule " + dd5Var, th);
            return;
        }
        IllegalStateException illegalStateException = e;
        String str4 = w22.a;
        Context context = this.n;
        context.getClass();
        WorkDatabase workDatabase = this.q;
        workDatabase.getClass();
        r90 r90Var = this.r;
        r90Var.getClass();
        int i7 = Build.VERSION.SDK_INT;
        int i8 = i7 >= 31 ? 150 : 100;
        int size = workDatabase.A().f().size();
        String strB0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i7 >= 34) {
            JobScheduler jobSchedulerA = w22.a(context);
            try {
                allPendingJobs = jobSchedulerA.getAllPendingJobs();
                allPendingJobs.getClass();
            } catch (Throwable th2) {
                cx.f().e(w22.a, "getAllPendingJobs() is not reliable on this device.", th2);
                allPendingJobs = null;
            }
            if (allPendingJobs != null) {
                ArrayList arrayListB = b(context, jobSchedulerA);
                int size2 = arrayListB != null ? allPendingJobs.size() - arrayListB.size() : i3;
                String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                Object systemService = context.getSystemService("jobscheduler");
                systemService.getClass();
                ArrayList arrayListB2 = b(context, (JobScheduler) systemService);
                int size3 = arrayListB2 != null ? arrayListB2.size() : i3;
                strB0 = q40.B0(ti.i0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
            }
        } else {
            ArrayList arrayListB3 = b(context, w22.a(context));
            if (arrayListB3 != null) {
                strB0 = arrayListB3.size() + " jobs from WorkManager";
            }
        }
        String str6 = "JobScheduler " + i8 + " job limit exceeded.\nIn JobScheduler there are " + strB0 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + r90Var.k + '.';
        cx.f().d(str3, str6);
        mj0.j(str6, illegalStateException);
    }
}
