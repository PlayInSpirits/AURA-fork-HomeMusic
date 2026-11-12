package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends rx1 {
    public final /* synthetic */ int d;

    public vo0(s24 r2) {
        this.d = 1;
        r2.getClass();
        super(r2);
    }

    @Override // defpackage.rx1
    public final String e() {
        switch(this.d) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    L6:
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    L8:
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    L10:
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    L12:
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    L14:
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    L16:
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    public final void l(df1 r12, Object r13) {
        int r0 = 3;
        switch(this.d) {
            case 0: goto L129;
            case 1: goto L127;
            case 2: goto L125;
            case 3: goto L123;
            case 4: goto L122;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        gd5 r14 = (gd5) r13;
        r12.h(1, r14.a);
        r12.h(2, r14.b);
        return;
    L6:
        dd5 r15 = (dd5) r13;
        r12.h(1, r15.a);
        r12.c(2, uc5.X(r15.b));
        r12.h(3, r15.c);
        r12.h(4, r15.d);
        oh0 r11 = r15.e;
        oh0 r4 = oh0.b;
        r12.x(5, bu.E(r11));
        r12.x(6, bu.E(r15.f));
        r12.c(7, r15.g);
        r12.c(8, r15.h);
        r12.c(9, r15.i);
        r12.c(10, r15.k);
        int r6 = r15.l;
        if (r6 == 0) goto L120;
        int r7 = xa3.w(r6);
        if (r7 == 0) goto L13;
        if (r7 != 1) goto L12;
        int r8 = 1;
    L14:
        r12.c(11, r8);
        r12.c(12, r15.m);
        r12.c(13, r15.n);
        r12.c(14, r15.o);
        r12.c(15, r15.p);
        r12.c(16, r15.q ? 1 : 0);
        int r9 = r15.r;
        if (r9 == 0) goto L119;
        int r10 = xa3.w(r9);
        if (r10 == 0) goto L21;
        if (r10 != 1) goto L20;
        int r16 = 1;
    L22:
        r12.c(17, r16);
        r12.c(18, r15.s);
        r12.c(19, r15.t);
        r12.c(20, r15.u);
        r12.c(21, r15.v);
        r12.c(22, r15.w);
        String r17 = r15.x;
        if (r17 != null) goto L25;
        r12.e(23);
    L26:
        mc0 r18 = r15.j;
        int r19 = r18.a;
        if (r19 == 0) goto L118;
        int r20 = xa3.w(r19);
        if (r20 == 0) goto L39;
        if (r20 == 1) goto L42;
        if (r20 == 2) goto L41;
        if (r20 == 3) goto L43;
        if (r20 != 4) goto L35;
        r0 = 4;
        goto L43
    L35:
        if (Build.VERSION.SDK_INT < 30) goto L38;
        if (r19 != 6) goto L38;
        r0 = 5;
    L38:
        nz2.t(b11.y(r19), " to int", "Could not convert ");
    L43:
        r12.c(24, r0);
        o53 r1 = r18.b;
        r1.getClass();
        int r2 = Build.VERSION.SDK_INT;
        if (r2 >= 28) goto L46;
        byte[] r110 = new byte[0];
    L82:
        r12.x(25, r110);
        r12.c(26, r18.c ? 1 : 0);
        r12.c(27, r18.d ? 1 : 0);
        r12.c(28, r18.e ? 1 : 0);
        r12.c(29, r18.f ? 1 : 0);
        r12.c(30, r18.g);
        r12.c(31, r18.h);
        Set r111 = r18.i;
        r111.getClass();
        if (r111.isEmpty() == false) goto L85;
        byte[] r112 = new byte[0];
    L96:
        r12.x(32, r112);
        return;
    L85:
        ByteArrayOutputStream r113 = new ByteArrayOutputStream();
        ObjectOutputStream r3 = new ObjectOutputStream(r113);     // Catch: Throwable -> L98
        r3.writeInt(r111.size());     // Catch: Throwable -> L92
        Iterator r114 = r111.iterator();     // Catch: Throwable -> L92
    L89:
        if (r114.hasNext() == false) goto L94;
        lc0 r5 = (lc0) r114.next();     // Catch: Throwable -> L92
        r3.writeUTF(r5.a.toString());     // Catch: Throwable -> L92
        r3.writeBoolean(r5.b);     // Catch: Throwable -> L92
    L94:
        r3.close();     // Catch: Throwable -> L98
        r113.close();
        r112 = r113.toByteArray();
        r112.getClass();
    L92:
        th = move-exception;
        throw th;     // Catch: Throwable -> L101
    L101:
        th = move-exception;
        q05.h(r3, th);     // Catch: Throwable -> L98
        throw th;     // Catch: Throwable -> L98
    L98:
        th = move-exception;
        throw th;     // Catch: Throwable -> L105
    L105:
        th = move-exception;
        q05.h(r113, th);
        throw th;
    L46:
        NetworkRequest r21 = (NetworkRequest) r1.a;
        if (r21 != null) goto L49;
        r110 = new byte[0];
        goto L82
    L49:
        ByteArrayOutputStream r22 = new ByteArrayOutputStream();
        ObjectOutputStream r23 = new ObjectOutputStream(r22);     // Catch: Throwable -> L108
        if (r2 < 31) goto L54;
        int[] r115 = go2.z(r21);     // Catch: Throwable -> L74
        r115.getClass();     // Catch: Throwable -> L74
    L62:
        if (Build.VERSION.SDK_INT < 31) goto L64;
        int[] r24 = go2.D(r21);     // Catch: Throwable -> L74
        r24.getClass();     // Catch: Throwable -> L74
    L71:
        r23.writeInt(r115.length);     // Catch: Throwable -> L74
        int r25 = r115.length;     // Catch: Throwable -> L74
        int r26 = 0;
    L72:
        if (r26 >= r25) goto L76;
        r23.writeInt(r115[r26]);     // Catch: Throwable -> L74
        r26 = r26 + 1;     // Catch: Throwable -> L74
        goto L72
    L76:
        r23.writeInt(r24.length);     // Catch: Throwable -> L74
        int r116 = r24.length;     // Catch: Throwable -> L74
        int r27 = 0;
    L77:
        if (r27 >= r116) goto L80;
        r23.writeInt(r24[r27]);     // Catch: Throwable -> L74
        r27 = r27 + 1;
        goto L77
    L80:
        r23.close();     // Catch: Throwable -> L108
        r22.close();
        r110 = r22.toByteArray();
        r110.getClass();
        goto L82
    L64:
        int[] r28 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};     // Catch: Throwable -> L74
        ArrayList r29 = new ArrayList();     // Catch: Throwable -> L74
        int r30 = 0;
    L65:
        if (r30 >= 29) goto L70;
        int r31 = r28[r30];     // Catch: Throwable -> L74
        if (sr0.A(r21, r31) == false) goto L69;
        r29.add(Integer.valueOf(r31));     // Catch: Throwable -> L74
    L69:
        r30 = r30 + 1;     // Catch: Throwable -> L74
        goto L65
    L70:
        r24 = q40.P0(r29);     // Catch: Throwable -> L74
        goto L71
    L54:
        int[] r32 = {2, 0, 3, 6, 9, 8, 4, 1, 5};     // Catch: Throwable -> L74
        ArrayList r33 = new ArrayList();     // Catch: Throwable -> L74
        int r34 = 0;
    L55:
        if (r34 >= 9) goto L60;
        int r35 = r32[r34];     // Catch: Throwable -> L74
        if (sr0.s(r21, r35) == false) goto L59;
        r33.add(Integer.valueOf(r35));     // Catch: Throwable -> L74
    L59:
        r34 = r34 + 1;     // Catch: Throwable -> L74
        goto L55
    L60:
        r115 = q40.P0(r33);     // Catch: Throwable -> L74
    L74:
        th = move-exception;
        throw th;     // Catch: Throwable -> L111
    L111:
        th = move-exception;
        q05.h(r23, th);     // Catch: Throwable -> L108
        throw th;     // Catch: Throwable -> L108
    L108:
        th = move-exception;
        throw th;     // Catch: Throwable -> L115
    L115:
        th = move-exception;
        q05.h(r22, th);
        throw th;
    L41:
        r0 = 2;
        goto L43
    L42:
        r0 = 1;
    L39:
        r0 = 0;
        goto L43
    L118:
        throw null;
    L25:
        r12.h(23, r17);
        goto L26
    L20:
        er1.n();
        return;
    L21:
        r16 = 0;
        goto L22
    L119:
        throw null;
    L12:
        er1.n();
        return;
    L13:
        r8 = 0;
        goto L14
    L120:
        throw null;
    L123:
        wc5 r117 = (wc5) r13;
        r12.h(1, r117.a);
        r12.h(2, r117.b);
        return;
    L125:
        zp4 r118 = (zp4) r13;
        r12.h(1, r118.a);
        r12.c(2, r118.b);
        r12.c(3, r118.c);
        return;
    L127:
        fp3 r119 = (fp3) r13;
        r12.h(1, r119.a);
        r12.c(2, r119.b.longValue());
        return;
    L129:
        to0 r120 = (to0) r13;
        r12.h(1, r120.a);
        r12.h(2, r120.b);
        return;
    L122:
        throw new ClassCastException();
    }

    public final void m(Object r2) {
        df1 r0 = a();
        l(r0, r2);     // Catch: Throwable -> L6
        r0.o.executeInsert();     // Catch: Throwable -> L6
        h(r0);
        return;
    L6:
        th = move-exception;
        h(r0);
        throw th;
    }

    public /* synthetic */ vo0(s24 r1, int r2) {
        this.d = r2;
        super(r1);
    }
}
