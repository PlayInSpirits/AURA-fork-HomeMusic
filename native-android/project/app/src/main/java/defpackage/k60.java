package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k60 implements w21 {
    public static final String s = null;
    public final Context n;
    public final HashMap o;
    public final Object p;
    public final xi4 q;
    public final qr2 r;

    static {
        s = cx.i("CommandHandler");
    }

    public k60(Context r1, xi4 r2, qr2 r3) {
        this.n = r1;
        this.q = r2;
        this.r = r3;
        this.o = new HashMap();
        this.p = new Object();
    }

    public static rc5 c(Intent r4) {
        String r1 = r4.getStringExtra("KEY_WORKSPEC_ID");
        return new rc5(r4.getIntExtra("KEY_WORKSPEC_GENERATION", 0), r1);
    }

    public static void d(Intent r2, rc5 r3) {
        r2.putExtra("KEY_WORKSPEC_ID", r3.a);
        r2.putExtra("KEY_WORKSPEC_GENERATION", r3.b);
    }

    public final void a(Intent r12, int r13, tp4 r14) {
        String r0 = r12.getAction();
        int r2 = 3;
        int r4 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(r0) == false) goto L28;
        cx.f().b(s, "Handling constraints changed " + r12);
        Context r1 = this.n;
        pc0 r15 = new pc0(r1, this.q, r13, r14);
        ArrayList r11 = r14.r.c.A().f();
        String r16 = ob0.a;
        int r17 = r11.size();
        boolean r3 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        int r8 = 0;
    L5:
        if (r8 >= r17) goto L15;
        Object r9 = r11.get(r8);
        r8 = r8 + 1;
        mc0 r10 = ((dd5) r9).j;
        r3 = r3 | r10.e;
        r5 = r5 | r10.c;
        r6 = r6 | r10.f;
        if (r10.a == 1) goto L9;
        boolean r18 = true;
    L10:
        r7 = r7 | r18;
        if (r3 == false) goto L5;
        if (r5 == false) goto L5;
        if (r6 == false) goto L5;
        if (r7 == false) goto L5;
    L9:
        r18 = false;
    L15:
        String r19 = ConstraintProxyUpdateReceiver.a;
        Intent r110 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        r110.setComponent(new ComponentName(r1, ConstraintProxyUpdateReceiver.class));
        r110.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", r3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", r5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", r6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", r7);
        r1.sendBroadcast(r110);
        ArrayList r111 = new ArrayList(r11.size());
        r15.a.getClass();
        long r20 = System.currentTimeMillis();
        int r21 = r11.size();
        int r22 = 0;
    L16:
        if (r22 >= r21) goto L24;
        Object r23 = r11.get(r22);
        r22 = r22 + 1;
        dd5 r24 = (dd5) r23;
        if (r20 < r24.a()) goto L16;
        if (r24.c() == false) goto L23;
        if (r15.c.c(r24) == false) goto L16;
    L23:
        r111.add(r24);
        goto L16
    L24:
        int r112 = r111.size();
    L25:
        if (r4 >= r112) goto L103;
        Object r25 = r111.get(r4);
        r4 = r4 + 1;
        dd5 r26 = (dd5) r25;
        String r27 = r26.a;
        rc5 r28 = q05.m(r26);
        Intent r29 = new Intent(r1, SystemAlarmService.class);
        r29.setAction("ACTION_DELAY_MET");
        d(r29, r28);
        cx.f().b(pc0.d, "Creating a delay_met command for workSpec with id (" + r27 + ")");
        ((vc5) r14.o.q).execute(new eh(r14, r29, r15.b, r2));
        goto L25
    L103:
        return;
    L28:
        if ("ACTION_RESCHEDULE".equals(r0) == false) goto L31;
        cx.f().b(s, "Handling reschedule " + r12 + ", " + r13);
        r14.r.d();
        return;
    L31:
        Bundle r30 = r12.getExtras();
        String[] r31 = {"KEY_WORKSPEC_ID"};
        if (r30 != null) goto L34;
    L110:
        cx.f().d(s, "Invalid request for " + r0 + " , requires KEY_WORKSPEC_ID .");
        return;
    L34:
        if (r30.isEmpty() == true) goto L110;
        if (r30.get(r31[0]) == null) goto L110;
        if ("ACTION_SCHEDULE_WORK".equals(r0) == false) goto L64;
        Context r113 = this.n;
        rc5 r114 = c(r12);
        cx r32 = cx.f();
        String r33 = s;
        r32.b(r33, "Handling schedule work for " + r114);
        WorkDatabase r34 = r14.r.c;
        r34.c();
        dd5 r35 = r34.A().h(r114.a);     // Catch: Throwable -> L47
        if (r35 != null) goto L50;
        cx.f().k(r33, "Skipping scheduling " + r114 + " because it's no longer in the DB");     // Catch: Throwable -> L47
        r34.o();
        return;
    L50:
        if (f34.c(r35.b) == false) goto L54;
        cx.f().k(r33, "Skipping scheduling " + r114 + "because it is finished.");     // Catch: Throwable -> L47
        r34.o();
        return;
    L54:
        long r36 = r35.a();     // Catch: Throwable -> L47
        if (r35.c() == true) goto L57;
        cx.f().b(r33, "Setting up Alarms for " + r114 + "at " + r36);     // Catch: Throwable -> L47
        o6.b(r113, r34, r114, r36);     // Catch: Throwable -> L47
    L58:
        r34.t();     // Catch: Throwable -> L47
        r34.o();
        return;
    L57:
        cx.f().b(r33, "Opportunistically setting an alarm for " + r114 + "at " + r36);     // Catch: Throwable -> L47
        o6.b(r113, r34, r114, r36);     // Catch: Throwable -> L47
        Intent r115 = new Intent(r113, SystemAlarmService.class);     // Catch: Throwable -> L47
        r115.setAction("ACTION_CONSTRAINTS_CHANGED");     // Catch: Throwable -> L47
        ((vc5) r14.o.q).execute(new eh(r14, r115, r13, r2));     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        r34.o();
        throw th;
    L64:
        if ("ACTION_DELAY_MET".equals(r0) == false) goto L78;
        Object r37 = this.p;
        monitor-enter(r37);
        rc5 r116 = c(r12);     // Catch: Throwable -> L70
        cx r38 = cx.f();     // Catch: Throwable -> L70
        String r39 = s;     // Catch: Throwable -> L70
        r38.b(r39, "Handing delay met for " + r116);     // Catch: Throwable -> L70
        if (this.o.containsKey(r116) == true) goto L72;
        co0 r40 = new co0(this.n, r13, r14, this.r.w(r116));     // Catch: Throwable -> L70
        this.o.put(r116, r40);     // Catch: Throwable -> L70
        r40.e();     // Catch: Throwable -> L70
    L73:
        monitor-exit(r37);     // Catch: Throwable -> L70
        return;
    L72:
        cx.f().b(r39, "WorkSpec " + r116 + " is is already being handled for ACTION_DELAY_MET");     // Catch: Throwable -> L70
    L70:
        th = move-exception;
        throw th;
    L78:
        if ("ACTION_STOP_WORK".equals(r0) == false) goto L105;
        qr2 r117 = this.r;
        Bundle r118 = r12.getExtras();
        String r41 = r118.getString("KEY_WORKSPEC_ID");
        if (r118.containsKey("KEY_WORKSPEC_GENERATION") == false) goto L84;
        int r119 = r118.getInt("KEY_WORKSPEC_GENERATION");
        ArrayList r42 = new ArrayList(1);
        gl4 r120 = r117.s(new rc5(r119, r41));
        List r43 = r42;
        if (r120 == null) goto L85;
        r42.add(r120);
        r43 = r42;
    L85:
        Iterator r121 = r43.iterator();
    L87:
        if (r121.hasNext() == false) goto L141;
        gl4 r122 = (gl4) r121.next();
        cx.f().b(s, "Handing stopWork work for " + r41);
        rm3 r44 = r14.w;
        r44.getClass();
        r122.getClass();
        r44.R(r122, -512);
        rc5 r123 = r122.a;
        Context r45 = this.n;
        WorkDatabase r46 = r14.r.c;
        String r47 = o6.a;
        bq4 r48 = r46.x();
        zp4 r49 = r48.k(r123);
        if (r49 == null) goto L102;
        o6.a(r45, r123, r49.c);
        cx.f().b(o6.a, "Removing SystemIdInfo for workSpecId (" + r123 + ")");
        String r50 = r123.a;
        int r51 = r123.b;
        WorkDatabase_Impl r52 = (WorkDatabase_Impl) r48.n;
        r52.b();
        aq4 r53 = (aq4) r48.p;
        df1 r54 = r53.a();
        r54.h(1, r50);
        r54.c(2, r51);
        r52.c();     // Catch: Throwable -> L95
        r54.b();     // Catch: Throwable -> L97
        r52.t();     // Catch: Throwable -> L97
        r52.o();     // Catch: Throwable -> L95
        r53.h(r54);
        goto L102
    L97:
        th = move-exception;
        r52.o();     // Catch: Throwable -> L95
        throw th;     // Catch: Throwable -> L95
    L95:
        th = move-exception;
        r53.h(r54);
        throw th;
    L102:
        r14.b(r123, false);
        goto L87
    L141:
        return;
    L84:
        r43 = r117.t(r41);
        goto L85
    L105:
        if ("ACTION_EXECUTION_COMPLETED".equals(r0) == false) goto L108;
        rc5 r124 = c(r12);
        boolean r55 = r12.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        cx.f().b(s, "Handling onExecutionCompleted " + r12 + ", " + r13);
        b(r124, r55);
        return;
    L108:
        cx.f().k(s, "Ignoring intent " + r12);
    }

    @Override // defpackage.w21
    public final void b(rc5 r3, boolean r4) {
        Object r0 = this.p;
        monitor-enter(r0);
        co0 r1 = (co0) this.o.remove(r3);     // Catch: Throwable -> L7
        this.r.s(r3);     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.f(r4);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
