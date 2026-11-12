package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 implements Runnable {
    public static final String r = cx.i("ForceStopRunnable");
    public static final long s = 315360000000L;
    public final Context n;
    public final sc5 o;
    public final rv1 p;
    public int q = 0;

    public lb1(Context context, sc5 sc5Var) {
        this.n = context.getApplicationContext();
        this.o = sc5Var;
        this.p = sc5Var.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + s;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0222  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    public final void a() {
        boolean z;
        rv1 rv1Var = this.p;
        sc5 sc5Var = this.o;
        WorkDatabase workDatabase = sc5Var.c;
        r90 r90Var = sc5Var.b;
        rv1 rv1Var2 = sc5Var.g;
        WorkDatabase workDatabase2 = sc5Var.c;
        String str = dq4.s;
        Context context = this.n;
        JobScheduler jobSchedulerA = w22.a(context);
        ArrayList arrayListB = dq4.b(context, jobSchedulerA);
        bq4 bq4VarX = workDatabase.x();
        bq4VarX.getClass();
        w24 w24VarB = w24.b(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bq4VarX.n;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            ArrayList arrayList = new ArrayList(cursorH.getCount());
            while (cursorH.moveToNext()) {
                arrayList.add(cursorH.getString(0));
            }
            cursorH.close();
            w24VarB.j();
            HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
            if (arrayListB != null && !arrayListB.isEmpty()) {
                int size = arrayListB.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListB.get(i);
                    i++;
                    JobInfo jobInfo = (JobInfo) obj;
                    rc5 rc5VarF = dq4.f(jobInfo);
                    if (rc5VarF != null) {
                        hashSet.add(rc5VarF.a);
                    } else {
                        dq4.a(jobSchedulerA, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                if (!hashSet.contains((String) obj2)) {
                    cx.f().b(dq4.s, "Reconciling jobs");
                    z = true;
                    break;
                }
            }
            if (z) {
                workDatabase.c();
                try {
                    fd5 fd5VarA = workDatabase.A();
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        fd5VarA.j((String) obj3, -1L);
                    }
                    workDatabase.t();
                    workDatabase.o();
                } catch (Throwable th) {
                    workDatabase.o();
                    throw th;
                }
            }
            fd5 fd5VarA2 = workDatabase2.A();
            yc5 yc5VarZ = workDatabase2.z();
            workDatabase2.c();
            try {
                ArrayList arrayListE = fd5VarA2.e();
                boolean zIsEmpty = arrayListE.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListE.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj4 = arrayListE.get(i4);
                        i4++;
                        String str2 = ((dd5) obj4).a;
                        fd5VarA2.n(1, str2);
                        fd5VarA2.o(-512, str2);
                        fd5VarA2.j(str2, -1L);
                        zIsEmpty = zIsEmpty;
                    }
                }
                boolean z2 = zIsEmpty;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) yc5VarZ.n;
                workDatabase_Impl2.b();
                aq4 aq4Var = (aq4) yc5VarZ.p;
                df1 df1VarA = aq4Var.a();
                try {
                    workDatabase_Impl2.c();
                    try {
                        df1VarA.b();
                        workDatabase_Impl2.t();
                        workDatabase_Impl2.o();
                        aq4Var.h(df1VarA);
                        workDatabase2.t();
                        workDatabase2.o();
                        boolean z3 = !z2 || z;
                        Long l = rv1Var2.a.w().l("reschedule_needed");
                        String str3 = r;
                        if (l != null && l.longValue() == 1) {
                            cx.f().b(str3, "Rescheduling Workers.");
                            sc5Var.d();
                            rv1Var2.getClass();
                            rv1Var2.a.w().n(new fp3("reschedule_needed", 0L));
                            return;
                        }
                        try {
                            int i5 = Build.VERSION.SDK_INT;
                            int i6 = i5 >= 31 ? 570425344 : 536870912;
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
                            if (i5 < 30) {
                                if (broadcast == null) {
                                    c(context);
                                    cx.f().b(str3, "Application was force-stopped, rescheduling.");
                                    sc5Var.d();
                                    r90Var.d.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    rv1Var.getClass();
                                    rv1Var.a.w().n(new fp3("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                    return;
                                }
                                if (z3) {
                                    cx.f().b(str3, "Found unfinished work, scheduling it.");
                                    c64.b(r90Var, workDatabase2, sc5Var.e);
                                }
                            }
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                Long l2 = rv1Var.a.w().l("last_force_stop_ms");
                                long jLongValue = l2 != null ? l2.longValue() : 0L;
                                for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                                    ApplicationExitInfo applicationExitInfoD = l3.d(historicalProcessExitReasons.get(i7));
                                    if (applicationExitInfoD.getReason() == 10 && applicationExitInfoD.getTimestamp() >= jLongValue) {
                                        cx.f().b(str3, "Application was force-stopped, rescheduling.");
                                        sc5Var.d();
                                        r90Var.d.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        rv1Var.getClass();
                                        rv1Var.a.w().n(new fp3("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                        return;
                                    }
                                }
                            }
                            if (z3) {
                                cx.f().b(str3, "Found unfinished work, scheduling it.");
                                c64.b(r90Var, workDatabase2, sc5Var.e);
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            if (cx.f().a <= 5) {
                                Log.w(str3, "Ignoring exception", e);
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            if (cx.f().a <= 5) {
                                Log.w(str3, "Ignoring exception", e);
                            }
                        }
                    } catch (Throwable th2) {
                        workDatabase_Impl2.o();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    aq4Var.h(df1VarA);
                    throw th3;
                }
            } catch (Throwable th4) {
                workDatabase2.o();
                throw th4;
            }
        } catch (Throwable th5) {
            cursorH.close();
            w24VarB.j();
            throw th5;
        }
    }

    public final boolean b() {
        r90 r90Var = this.o.b;
        r90Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = r;
        if (zIsEmpty) {
            cx.f().b(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = nq3.a(this.n, r90Var);
        cx.f().b(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.n;
        String str = r;
        sc5 sc5Var = this.o;
        try {
            if (!b()) {
                sc5Var.c();
                return;
            }
            while (true) {
                try {
                    jz4.E(context);
                    cx.f().b(str, "Performing cleanup operations.");
                    try {
                        a();
                        sc5Var.c();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.q + 1;
                        this.q = i;
                        if (i >= 3) {
                            String str2 = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            cx.f().e(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            sc5Var.b.getClass();
                            throw illegalStateException;
                        }
                        cx.f().c(str, "Retrying after " + (((long) i) * 300), e);
                        try {
                            Thread.sleep(((long) this.q) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    cx.f().d(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    sc5Var.b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            sc5Var.c();
            throw th;
        }
    }
}
