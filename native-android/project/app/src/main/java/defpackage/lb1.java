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
    public static final String r = null;
    public static final long s = 0;
    public final Context n;
    public final sc5 o;
    public final rv1 p;
    public int q;

    static {
        r = cx.i("ForceStopRunnable");
        s = 315360000000L;
    }

    public lb1(Context r1, sc5 r2) {
        this.n = r1.getApplicationContext();
        this.o = r2;
        this.p = r2.g;
        this.q = 0;
    }

    public static void c(Context r5) {
        AlarmManager r0 = (AlarmManager) r5.getSystemService("alarm");
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r1 = 167772160;
    L6:
        Intent r2 = new Intent();
        r2.setComponent(new ComponentName(r5, ForceStopRunnable$BroadcastReceiver.class));
        r2.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent r6 = PendingIntent.getBroadcast(r5, -1, r2, r1);
        long r3 = System.currentTimeMillis() + s;
        if (r0 == null) goto L10;
        r0.setExact(0, r3, r6);
        return;
    L10:
        return;
    L5:
        r1 = 134217728;
        goto L6
    }

    public final void a() {
        rv1 r2 = this.p;
        sc5 r3 = this.o;
        WorkDatabase r4 = r3.c;
        r90 r5 = r3.b;
        rv1 r6 = r3.g;
        WorkDatabase r7 = r3.c;
        String r8 = dq4.s;
        Context r0 = this.n;
        JobScheduler r9 = w22.a(r0);
        ArrayList r10 = dq4.b(r0, r9);
        bq4 r11 = r4.x();
        r11.getClass();
        w24 r12 = w24.b(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl r13 = (WorkDatabase_Impl) r11.n;
        r13.b();
        Cursor r14 = xl.H(r13, r12);
        ArrayList r15 = new ArrayList(r14.getCount());     // Catch: Throwable -> L8
    L5:
        if (r14.moveToNext() == false) goto L10;
        r15.add(r14.getString(0));     // Catch: Throwable -> L8
        goto L5
    L10:
        r14.close();
        r12.j();
        if (r10 == null) goto L13;
        int r16 = r10.size();
    L14:
        HashSet r17 = new HashSet(r16);
        if (r10 != null) goto L17;
    L25:
        int r18 = r15.size();
        int r19 = 0;
    L26:
        if (r19 >= r18) goto L30;
        Object r110 = r15.get(r19);
        r19 = r19 + 1;
        if (r17.contains((String) r110) == true) goto L26;
        cx.f().b(dq4.s, "Reconciling jobs");
        boolean r20 = true;
    L32:
        if (r20 == false) goto L43;
        r4.c();
        fd5 r21 = r4.A();     // Catch: Throwable -> L37
        int r111 = r15.size();     // Catch: Throwable -> L37
        int r112 = 0;
    L35:
        if (r112 >= r111) goto L39;
        Object r113 = r15.get(r112);     // Catch: Throwable -> L37
        r112 = r112 + 1;     // Catch: Throwable -> L37
        r21.j((String) r113, -1);     // Catch: Throwable -> L37
        goto L35
    L39:
        r4.t();     // Catch: Throwable -> L37
        r4.o();
    L37:
        th = move-exception;
        r4.o();
        throw th;
    L43:
        fd5 r22 = r7.A();
        yc5 r23 = r7.z();
        r7.c();
        ArrayList r114 = r22.e();     // Catch: Throwable -> L49
        boolean r115 = r114.isEmpty();     // Catch: Throwable -> L49
        if (r115 == true) goto L51;
        int r116 = r114.size();     // Catch: Throwable -> L49
        int r117 = 0;
    L47:
        if (r117 >= r116) goto L51;
        Object r118 = r114.get(r117);     // Catch: Throwable -> L49
        r117 = r117 + 1;     // Catch: Throwable -> L49
        String r119 = ((dd5) r118).a;     // Catch: Throwable -> L49
        r22.n(1, r119);     // Catch: Throwable -> L49
        r22.o(-512, r119);     // Catch: Throwable -> L49
        r22.j(r119, -1);     // Catch: Throwable -> L49
        r115 = r115;
    L51:
        boolean r120 = r115;
        WorkDatabase_Impl r24 = (WorkDatabase_Impl) r23.n;     // Catch: Throwable -> L49
        r24.b();     // Catch: Throwable -> L49
        aq4 r25 = (aq4) r23.p;     // Catch: Throwable -> L49
        df1 r121 = r25.a();     // Catch: Throwable -> L49
        r24.c();     // Catch: Throwable -> L107
        r121.b();     // Catch: Throwable -> L109
        r24.t();     // Catch: Throwable -> L109
        r24.o();     // Catch: Throwable -> L107
        r25.h(r121);     // Catch: Throwable -> L49
        r7.t();     // Catch: Throwable -> L49
        r7.o();
        if (r120 == false) goto L61;
        if (r20 == true) goto L61;
        boolean r122 = false;
    L62:
        Long r26 = r6.a.w().l("reschedule_needed");
        long r123 = 0;
        String r27 = r;
        if (r26 != null) goto L65;
    L126:
        int r28 = Build.VERSION.SDK_INT;     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        if (r28 < 31) goto L71;
        int r29 = 570425344;
    L72:
        Intent r30 = new Intent();     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        r30.setComponent(new ComponentName(r0, ForceStopRunnable$BroadcastReceiver.class));     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        r30.setAction("ACTION_FORCE_STOP_RESCHEDULE");     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        PendingIntent r31 = PendingIntent.getBroadcast(r0, -1, r30, r29);     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        if (r28 < 30) goto L96;
        if (r31 == null) goto L80;
        r31.cancel();     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
    L80:
        List r1 = l3.r((ActivityManager) r0.getSystemService("activity"));     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        if (r1 != null) goto L83;
    L99:
        if (r122 == false) goto L141;
        cx.f().b(r27, "Found unfinished work, scheduling it.");
        c64.b(r5, r7, r3.e);
        return;
    L141:
        return;
    L83:
        if (r1.isEmpty() == true) goto L99;
        Long r32 = r2.a.w().l("last_force_stop_ms");     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        if (r32 == null) goto L87;
        r123 = r32.longValue();     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
    L87:
        int r33 = 0;
    L89:
        if (r33 >= r1.size()) goto L99;
        ApplicationExitInfo r34 = l3.d(r1.get(r33));     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        if (l3.b(r34) != 10) goto L95;
        if (l3.c(r34) < r123) goto L95;
    L105:
        cx.f().b(r27, "Application was force-stopped, rescheduling.");
        r3.d();
        r5.d.getClass();
        long r35 = System.currentTimeMillis();
        r2.getClass();
        r2.a.w().n(new fp3("last_force_stop_ms", Long.valueOf(r35)));
        return;
    L95:
        r33 = r33 + 1;     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        goto L89
    L96:
        if (r31 != null) goto L99;
        c(r0);     // Catch: IllegalArgumentException -> L76 SecurityException -> L78
        goto L105
    L71:
        r29 = 536870912;
    L76:
        e = e;
    L103:
        if (cx.f().a > 5) goto L105;
        Log.w(r27, "Ignoring exception", e);
    L78:
        e = e;
        goto L103
    L65:
        if (r26.longValue() != 1) goto L126;
        cx.f().b(r27, "Rescheduling Workers.");
        r3.d();
        r6.getClass();
        r6.a.w().n(new fp3("reschedule_needed", 0L));
        return;
    L61:
        r122 = true;
        goto L62
    L109:
        th = move-exception;
        r24.o();     // Catch: Throwable -> L107
        throw th;     // Catch: Throwable -> L107
    L107:
        th = move-exception;
        r25.h(r121);     // Catch: Throwable -> L49
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        r7.o();
        throw th;
    L30:
        r20 = false;
        goto L32
    L17:
        if (r10.isEmpty() == true) goto L25;
        int r124 = r10.size();
        int r125 = 0;
    L19:
        if (r125 >= r124) goto L25;
        Object r126 = r10.get(r125);
        r125 = r125 + 1;
        JobInfo r127 = (JobInfo) r126;
        rc5 r128 = dq4.f(r127);
        if (r128 == null) goto L23;
        r17.add(r128.a);
        goto L19
    L23:
        dq4.a(r9, r127.getId());
        goto L19
    L13:
        r16 = 0;
    L8:
        th = move-exception;
        r14.close();
        r12.j();
        throw th;
    }

    public final boolean b() {
        r90 r0 = this.o.b;
        r0.getClass();
        boolean r1 = TextUtils.isEmpty(null);
        String r2 = r;
        if (r1 == false) goto L6;
        cx.f().b(r2, "The default process name was not specified.");
        return true;
    L6:
        boolean r4 = nq3.a(this.n, r0);
        cx.f().b(r2, "Is default app process = " + r4);
        return r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context r0 = this.n;
        String r1 = r;
        sc5 r2 = this.o;
    L12:
        th = move-exception;
        r2.c();
        throw th;
    L4:
        if (b() == true) goto L47;
        r2.c();
        return;
    L47:
        jz4.E(r0);     // Catch: Throwable -> L12 SQLiteException -> L41
        cx.f().b(r1, "Performing cleanup operations.");     // Catch: Throwable -> L12
        a();     // Catch: Throwable -> L12 SQLiteTableLockedException -> L14 SQLiteFullException -> L16 SQLiteDiskIOException -> L18 SQLiteDatabaseLockedException -> L20 SQLiteDatabaseCorruptException -> L22 SQLiteConstraintException -> L24 SQLiteCantOpenDatabaseException -> L26 Throwable -> L28
        r2.c();
        return;
    L28:
        e = move-exception;
        int r4 = this.q + 1;     // Catch: Throwable -> L12
        this.q = r4;     // Catch: Throwable -> L12
        if (r4 >= 3) goto L32;
        cx.f().c(r1, "Retrying after " + (((long) r4) * 300), e);     // Catch: Throwable -> L12
        Thread.sleep(((long) this.q) * 300);     // Catch: InterruptedException -> L46 Throwable -> L12
        goto L47
    L32:
        if (((UserManager) r0.getSystemService(UserManager.class)).isUserUnlocked() == false) goto L34;
        String r11 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
    L35:
        cx.f().e(r1, r11, e);     // Catch: Throwable -> L12
        IllegalStateException r3 = new IllegalStateException(r11, e);     // Catch: Throwable -> L12
        r2.b.getClass();     // Catch: Throwable -> L12
        throw r3;     // Catch: Throwable -> L12
    L34:
        r11 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
        goto L35
    L41:
        e = move-exception;
        cx.f().d(r1, "Unexpected SQLite exception during migrations");     // Catch: Throwable -> L12
        IllegalStateException r5 = new IllegalStateException("Unexpected SQLite exception during migrations", e);     // Catch: Throwable -> L12
        r2.b.getClass();     // Catch: Throwable -> L12
        throw r5;     // Catch: Throwable -> L12
    }
}
