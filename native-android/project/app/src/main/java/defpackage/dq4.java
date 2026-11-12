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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dq4 implements a64 {
    public static final String s = null;
    public final Context n;
    public final JobScheduler o;
    public final cq4 p;
    public final WorkDatabase q;
    public final r90 r;

    static {
        s = cx.i("SystemJobScheduler");
    }

    public dq4(Context r5, WorkDatabase r6, r90 r7) {
        JobScheduler r0 = w22.a(r5);
        cq4 r1 = new cq4(r5, r7.d, r7.l);
        this.n = r5;
        this.o = r0;
        this.p = r1;
        this.q = r6;
        this.r = r7;
    }

    public static void a(JobScheduler r3, int r4) {
        r3.cancel(r4);     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        cx r0 = cx.f();
        String r5 = String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(r4)});
        r0.e(s, r5, th);
    }

    public static ArrayList b(Context r4, JobScheduler r5) {
        String r0 = w22.a;
        r5.getClass();
        List<JobInfo> r6 = r5.getAllPendingJobs();     // Catch: Throwable -> L5
        r6.getClass();     // Catch: Throwable -> L5
    L7:
        if (r6 != null) goto L9;
        return null;
    L9:
        ArrayList r1 = new ArrayList(r6.size());
        ComponentName r2 = new ComponentName(r4, SystemJobService.class);
        Iterator<JobInfo> r7 = r6.iterator();
    L11:
        if (r7.hasNext() == false) goto L15;
        JobInfo r8 = r7.next();
        if (r2.equals(r8.getService()) == false) goto L11;
        r1.add(r8);
        goto L11
    L15:
        return r1;
    L5:
        th = move-exception;
        cx.f().e(w22.a, "getAllPendingJobs() is not reliable on this device.", th);
        r6 = null;
        goto L7
    }

    public static rc5 f(JobInfo r3) {
        PersistableBundle r4 = r3.getExtras();
        if (r4 != null) goto L11;
        return null;
    L11:
        if (r4.containsKey("EXTRA_WORK_SPEC_ID") == false) goto L13;
        return new rc5(r4.getInt("EXTRA_WORK_SPEC_GENERATION", 0), r4.getString("EXTRA_WORK_SPEC_ID"));
    L13:
        return null;
    L14:
        return null;
    }

    @Override // defpackage.a64
    public final boolean c() {
        return true;
    }

    @Override // defpackage.a64
    public final void d(String r9) {
        Context r0 = this.n;
        JobScheduler r1 = this.o;
        ArrayList r2 = b(r0, r1);
        int r3 = 0;
        if (r2 != null) goto L5;
        ArrayList r4 = null;
    L13:
        if (r4 != null) goto L15;
        return;
    L15:
        if (r4.isEmpty() == true) goto L44;
        int r5 = r4.size();
    L17:
        if (r3 >= r5) goto L19;
        Object r6 = r4.get(r3);
        r3 = r3 + 1;
        a(r1, ((Integer) r6).intValue());
        goto L17
    L19:
        bq4 r8 = this.q.x();
        WorkDatabase_Impl r7 = (WorkDatabase_Impl) r8.n;
        r7.b();
        aq4 r10 = (aq4) r8.q;
        df1 r11 = r10.a();
        r11.h(1, r9);
        r7.c();     // Catch: Throwable -> L25
        r11.b();     // Catch: Throwable -> L27
        r7.t();     // Catch: Throwable -> L27
        r7.o();     // Catch: Throwable -> L25
        r10.h(r11);
        return;
    L27:
        th = move-exception;
        r7.o();     // Catch: Throwable -> L25
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        r10.h(r11);
        throw th;
    L44:
        return;
    L5:
        ArrayList r12 = new ArrayList(2);
        int r13 = r2.size();
        int r14 = 0;
    L6:
        if (r14 >= r13) goto L12;
        Object r15 = r2.get(r14);
        r14 = r14 + 1;
        JobInfo r16 = (JobInfo) r15;
        rc5 r17 = f(r16);
        if (r17 == null) goto L6;
        if (r9.equals(r17.a) == false) goto L6;
        r12.add(Integer.valueOf(r16.getId()));
        goto L6
    L12:
        r4 = r12;
        goto L13
    }

    @Override // defpackage.a64
    public final void e(dd5... r12) {
        r90 r0 = this.r;
        WorkDatabase r2 = this.q;
        int r3 = 0;
        final rv1 r1 = new rv1(r2, 0);
        int r4 = r12.length;
    L3:
        if (r3 >= r4) goto L26;
        dd5 r5 = r12[r3];
        r2.c();
        fd5 r6 = r2.A();     // Catch: Throwable -> L10
        String r7 = r5.a;     // Catch: Throwable -> L10
        dd5 r8 = r6.h(r7);     // Catch: Throwable -> L10
        String r9 = s;
        if (r8 != null) goto L13;
        cx.f().k(r9, "Skipping scheduling " + r7 + " because it's no longer in the DB");     // Catch: Throwable -> L10
        r2.t();     // Catch: Throwable -> L10
    L9:
        r2.o();
        r3 = r3 + 1;
        goto L3
    L13:
        if (r8.b == 1) goto L15;
        cx.f().k(r9, "Skipping scheduling " + r7 + " because it is no longer enqueued");     // Catch: Throwable -> L10
        r2.t();     // Catch: Throwable -> L10
        goto L9
    L15:
        rc5 r10 = q05.m(r5);     // Catch: Throwable -> L10
        zp4 r11 = r2.x().k(r10);     // Catch: Throwable -> L10
        if (r11 == null) goto L18;
        int r13 = r11.c;     // Catch: Throwable -> L10
    L19:
        if (r11 != null) goto L21;
        r2.x().n(new zp4(r10.a, r10.b, r13));     // Catch: Throwable -> L10
    L21:
        g(r5, r13);     // Catch: Throwable -> L10
        r2.t();     // Catch: Throwable -> L10
        goto L9
    L18:
        r0.getClass();     // Catch: Throwable -> L10
        final int r14 = r0.i;     // Catch: Throwable -> L10
        Object r15 = r1.a.r(new qv1(r1, r14));     // Catch: Throwable -> L10
        r15.getClass();     // Catch: Throwable -> L10
        r13 = ((Number) r15).intValue();     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r2.o();
        throw th;
    }

    public final void g(dd5 r17, int r18) {
        cq4 r3 = this.p;
        r3.getClass();
        mc0 r4 = r17.j;
        PersistableBundle r5 = new PersistableBundle();
        String r6 = r17.a;
        r5.putString("EXTRA_WORK_SPEC_ID", r6);
        r5.putInt("EXTRA_WORK_SPEC_GENERATION", r17.t);
        r5.putBoolean("EXTRA_IS_PERIODIC", r17.d());
        JobInfo.Builder r7 = new JobInfo.Builder(r18, r3.a);
        boolean r8 = r4.c;
        Set r9 = r4.i;
        JobInfo.Builder r10 = r7.setRequiresCharging(r8);
        boolean r11 = r4.d;
        JobInfo.Builder r12 = r10.setRequiresDeviceIdle(r11).setExtras(r5);
        NetworkRequest r13 = r4.a();
        int r14 = Build.VERSION.SDK_INT;
        if (r14 < 28) goto L6;
        if (r13 == null) goto L6;
        r12.getClass();
        vl4.j(r12, r13);
    L27:
        if (r11 == false) goto L29;
    L33:
        long r15 = r17.a();
        r3.b.getClass();
        long r16 = Math.max(r15 - System.currentTimeMillis(), 0);
        if (r14 > 28) goto L37;
        r12.setMinimumLatency(r16);
    L45:
        if (r9.isEmpty() == true) goto L51;
        Iterator r19 = r9.iterator();
    L48:
        if (r19.hasNext() == false) goto L50;
        lc0 r20 = (lc0) r19.next();
        r12.addTriggerContentUri(new JobInfo.TriggerContentUri(r20.a, r20.b ? 1 : 0));
        goto L48
    L50:
        r12.setTriggerContentUpdateDelay(r4.g);
        r12.setTriggerContentMaxDelay(r4.h);
    L51:
        r12.setPersisted(false);
        int r21 = Build.VERSION.SDK_INT;
        if (r21 < 26) goto L55;
        rg3.i(r12, r4.e);
        rg3.q(r12, r4.f);
    L55:
        if (r17.k <= 0) goto L57;
        boolean r22 = true;
    L59:
        if (r16 <= 0) goto L61;
        boolean r23 = true;
    L63:
        if (r21 < 31) goto L70;
        if (r17.q == false) goto L70;
        if (r22 == true) goto L70;
        if (r23 == true) goto L70;
        go2.k(r12);
    L70:
        if (r21 < 35) goto L74;
        String r24 = r17.x;
        if (r24 == null) goto L74;
        vk.d(r12, r24);
    L74:
        JobInfo r25 = r12.build();
        String r26 = s;
        cx.f().b(r26, "Scheduling work ID " + r6 + "Job ID " + r18);
    L89:
        e = e;
        int r27 = 0;
    L88:
        IllegalStateException r2 = e;
        String r0 = w22.a;
        Context r28 = this.n;
        r28.getClass();
        WorkDatabase r1 = this.q;
        r1.getClass();
        r90 r29 = this.r;
        r29.getClass();
        int r30 = Build.VERSION.SDK_INT;
        if (r30 < 31) goto L97;
        int r31 = 150;
    L98:
        int r32 = r1.A().f().size();
        String r33 = "<faulty JobScheduler failed to getPendingJobs>";
        if (r30 < 34) goto L121;
        JobScheduler r34 = w22.a(r28);
        String r110 = null;
        List<JobInfo> r35 = r34.getAllPendingJobs();     // Catch: Throwable -> L103
        r35.getClass();     // Catch: Throwable -> L103
    L105:
        if (r35 == null) goto L125;
        ArrayList r36 = b(r28, r34);
        if (r36 == null) goto L109;
        int r37 = r35.size() - r36.size();
    L110:
        if (r37 != 0) goto L112;
        String r38 = null;
    L113:
        Object r39 = r28.getSystemService("jobscheduler");
        r39.getClass();
        ArrayList r40 = b(r28, (JobScheduler) r39);
        if (r40 == null) goto L116;
        int r111 = r40.size();
    L117:
        if (r111 == 0) goto L120;
        r110 = r111 + " from WorkManager in the default namespace";
    L120:
        r33 = q40.B0(ti.i0(new String[]{r35.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", r38, r110}), ",\n", null, null, null, 62);
        goto L125
    L116:
        r111 = r27;
        goto L117
    L112:
        r38 = r37 + " of which are not owned by WorkManager";
        goto L113
    L109:
        r37 = r27;
    L125:
        String r41 = "JobScheduler " + r31 + " job limit exceeded.\nIn JobScheduler there are " + r33 + ".\nThere are " + r32 + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + r29.k + '.';
        cx.f().d(r26, r41);
        mj0.j(r41, r2);
        return;
    L103:
        th = move-exception;
        cx.f().e(w22.a, "getAllPendingJobs() is not reliable on this device.", th);
        r35 = null;
        goto L105
    L121:
        ArrayList r42 = b(r28, w22.a(r28));
        if (r42 == null) goto L125;
        r33 = r42.size() + " jobs from WorkManager";
        goto L125
    L97:
        r31 = 100;
    L85:
        th = move-exception;
        cx.f().e(r26, "Unable to schedule " + r17, th);
        return;
    L76:
        if (this.o.schedule(r25) != 0) goto L91;
        cx.f().k(r26, "Unable to schedule work ID " + r6);     // Catch: Throwable -> L85 IllegalStateException -> L89
        if (r17.q == false) goto L134;
        if (r17.r != 1) goto L135;
        r27 = 0;
        r17.q = false;     // Catch: Throwable -> L85 IllegalStateException -> L87
        cx.f().b(r26, "Scheduling a non-expedited job (work ID " + r6 + ")");     // Catch: Throwable -> L85 IllegalStateException -> L87
        g(r17, r18);     // Catch: Throwable -> L85 IllegalStateException -> L87
        return;
    L87:
        e = e;
        goto L88
    L135:
        return;
    L134:
        return;
    L91:
        return;
    L61:
        r23 = false;
        goto L63
    L57:
        r22 = false;
        goto L59
    L37:
        if (r16 <= 0) goto L40;
        r12.setMinimumLatency(r16);
        goto L45
    L40:
        if (r17.q == true) goto L45;
        if (r3.c == false) goto L45;
        vl4.e(r12);
        goto L45
    L29:
        if (r17.l != 2) goto L31;
        int r43 = 0;
    L32:
        r12.setBackoffCriteria(r17.m, r43);
        goto L33
    L31:
        r43 = 1;
    L6:
        int r44 = r4.a;
        if (r14 >= 30) goto L9;
    L11:
        int r112 = xa3.w(r44);
        if (r112 == 0) goto L25;
        if (r112 == 1) goto L23;
        if (r112 == 2) goto L24;
        int r113 = 3;
        if (r112 == 3) goto L26;
        r113 = 4;
        if (r112 != 4) goto L22;
        if (r14 >= 26) goto L26;
    L22:
        cx.f().b(cq4.d, "API version too low. Cannot convert network type value ".concat(b11.y(r44)));
    L26:
        r12.setRequiredNetworkType(r113);
        goto L27
    L24:
        r113 = 2;
    L23:
        r113 = 1;
        goto L26
    L25:
        r113 = 0;
        goto L26
    L9:
        if (r44 != 6) goto L11;
        vl4.f(r12, new NetworkRequest.Builder().addCapability(25).build());
        goto L27
    }
}
