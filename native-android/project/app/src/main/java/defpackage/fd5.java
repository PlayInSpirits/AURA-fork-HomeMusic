package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fd5 {
    public final WorkDatabase_Impl a;
    public final vo0 b;
    public final aq4 c;
    public final aq4 d;
    public final aq4 e;
    public final aq4 f;
    public final aq4 g;
    public final aq4 h;
    public final aq4 i;
    public final aq4 j;
    public final aq4 k;
    public final aq4 l;
    public final aq4 m;
    public final aq4 n;

    public fd5(WorkDatabase_Impl r4) {
        this.a = r4;
        int r1 = 5;
        this.b = new vo0(r4, r1);
        new aq4(r4, 12);
        this.c = new aq4(r4, 13);
        this.d = new aq4(r4, 14);
        this.e = new aq4(r4, 15);
        this.f = new aq4(r4, 16);
        this.g = new aq4(r4, 17);
        this.h = new aq4(r4, 18);
        this.i = new aq4(r4, 19);
        this.j = new aq4(r4, 4);
        new aq4(r4, r1);
        this.k = new aq4(r4, 6);
        this.l = new aq4(r4, 7);
        this.m = new aq4(r4, 8);
        new aq4(r4, 9);
        new aq4(r4, 10);
        this.n = new aq4(r4, 11);
    }

    public final void a(String r4) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r3 = this.c;
        df1 r1 = r3.a();
        r1.h(1, r4);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r3.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r3.h(r1);
        throw th;
    }

    public final ArrayList b() {
        w24 r1 = w24.b(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        r1.c(1, 200);
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r3 = xl.H(r2, r1);
        int r4 = e35.x(r3, "id");     // Catch: Throwable -> L44
        int r5 = e35.x(r3, "state");     // Catch: Throwable -> L44
        int r6 = e35.x(r3, "worker_class_name");     // Catch: Throwable -> L44
        int r7 = e35.x(r3, "input_merger_class_name");     // Catch: Throwable -> L44
        int r8 = e35.x(r3, "input");     // Catch: Throwable -> L44
        int r9 = e35.x(r3, "output");     // Catch: Throwable -> L44
        int r10 = e35.x(r3, "initial_delay");     // Catch: Throwable -> L44
        int r11 = e35.x(r3, "interval_duration");     // Catch: Throwable -> L44
        int r12 = e35.x(r3, "flex_duration");     // Catch: Throwable -> L44
        int r13 = e35.x(r3, "run_attempt_count");     // Catch: Throwable -> L44
        int r14 = e35.x(r3, "backoff_policy");     // Catch: Throwable -> L44
        int r15 = e35.x(r3, "backoff_delay_duration");     // Catch: Throwable -> L44
        int r16 = e35.x(r3, "last_enqueue_time");     // Catch: Throwable -> L44
        int r0 = e35.x(r3, "minimum_retention_duration");     // Catch: Throwable -> L44
        w24 r17 = r1;
        int r80 = e35.x(r3, "schedule_requested_at");     // Catch: Throwable -> L40
        int r18 = e35.x(r3, "run_in_foreground");     // Catch: Throwable -> L40
        int r19 = e35.x(r3, "out_of_quota_policy");     // Catch: Throwable -> L40
        int r110 = e35.x(r3, "period_count");     // Catch: Throwable -> L40
        int r20 = e35.x(r3, "generation");     // Catch: Throwable -> L40
        int r21 = e35.x(r3, "next_schedule_time_override");     // Catch: Throwable -> L40
        int r22 = e35.x(r3, "next_schedule_time_override_generation");     // Catch: Throwable -> L40
        int r23 = e35.x(r3, "stop_reason");     // Catch: Throwable -> L40
        int r24 = e35.x(r3, "trace_tag");     // Catch: Throwable -> L40
        int r25 = e35.x(r3, "required_network_type");     // Catch: Throwable -> L40
        int r26 = e35.x(r3, "required_network_request");     // Catch: Throwable -> L40
        int r27 = e35.x(r3, "requires_charging");     // Catch: Throwable -> L40
        int r28 = e35.x(r3, "requires_device_idle");     // Catch: Throwable -> L40
        int r29 = e35.x(r3, "requires_battery_not_low");     // Catch: Throwable -> L40
        int r30 = e35.x(r3, "requires_storage_not_low");     // Catch: Throwable -> L40
        int r31 = e35.x(r3, "trigger_content_update_delay");     // Catch: Throwable -> L40
        int r32 = e35.x(r3, "trigger_max_content_delay");     // Catch: Throwable -> L40
        int r33 = e35.x(r3, "content_uri_triggers");     // Catch: Throwable -> L40
        int r34 = r0;
        ArrayList r35 = new ArrayList(r3.getCount());     // Catch: Throwable -> L40
    L6:
        if (r3.moveToNext() == false) goto L42;
        String r36 = r3.getString(r4);     // Catch: Throwable -> L40
        int r37 = uc5.x(r3.getInt(r5));     // Catch: Throwable -> L40
        String r38 = r3.getString(r6);     // Catch: Throwable -> L40
        String r39 = r3.getString(r7);     // Catch: Throwable -> L40
        oh0 r40 = oh0.a(r3.getBlob(r8));     // Catch: Throwable -> L40
        oh0 r41 = oh0.a(r3.getBlob(r9));     // Catch: Throwable -> L40
        long r42 = r3.getLong(r10);     // Catch: Throwable -> L40
        long r44 = r3.getLong(r11);     // Catch: Throwable -> L40
        long r46 = r3.getLong(r12);     // Catch: Throwable -> L40
        int r49 = r3.getInt(r13);     // Catch: Throwable -> L40
        int r50 = uc5.u(r3.getInt(r14));     // Catch: Throwable -> L40
        long r51 = r3.getLong(r15);     // Catch: Throwable -> L40
        long r53 = r3.getLong(r16);     // Catch: Throwable -> L40
        int r43 = r34;
        long r55 = r3.getLong(r43);     // Catch: Throwable -> L40
        r34 = r43;
        int r45 = r80;
        long r57 = r3.getLong(r45);     // Catch: Throwable -> L40
        r80 = r45;
        int r47 = r18;
        if (r3.getInt(r47) == 0) goto L12;
        boolean r59 = true;
    L11:
        r18 = r47;
        int r48 = r19;
        int r60 = uc5.w(r3.getInt(r48));     // Catch: Throwable -> L40
        r19 = r48;
        int r52 = r110;
        int r61 = r3.getInt(r52);     // Catch: Throwable -> L40
        r110 = r52;
        int r54 = r20;
        int r62 = r3.getInt(r54);     // Catch: Throwable -> L40
        r20 = r54;
        int r56 = r21;
        long r63 = r3.getLong(r56);     // Catch: Throwable -> L40
        r21 = r56;
        int r58 = r22;
        int r65 = r3.getInt(r58);     // Catch: Throwable -> L40
        r22 = r58;
        int r64 = r23;
        int r66 = r3.getInt(r64);     // Catch: Throwable -> L40
        r23 = r64;
        int r67 = r24;
        if (r3.isNull(r67) == false) goto L17;
        String r210 = null;
    L16:
        String r68 = r210;
        r24 = r67;
        int r69 = r25;
        int r70 = uc5.v(r3.getInt(r69));     // Catch: Throwable -> L40
        r25 = r69;
        int r71 = r26;
        o53 r610 = uc5.a0(r3.getBlob(r71));     // Catch: Throwable -> L40
        r26 = r71;
        int r72 = r27;
        if (r3.getInt(r72) == 0) goto L22;
        boolean r73 = true;
    L21:
        r27 = r72;
        int r74 = r28;
        if (r3.getInt(r74) == 0) goto L27;
        boolean r75 = true;
    L26:
        r28 = r74;
        int r76 = r29;
        if (r3.getInt(r76) == 0) goto L32;
        boolean r77 = true;
    L31:
        r29 = r76;
        int r78 = r30;
        if (r3.getInt(r78) == 0) goto L37;
        boolean r79 = true;
    L36:
        r30 = r78;
        int r81 = r31;
        long r710 = r3.getLong(r81);     // Catch: Throwable -> L40
        r31 = r81;
        int r82 = r32;
        long r711 = r3.getLong(r82);     // Catch: Throwable -> L40
        r32 = r82;
        int r83 = r33;
        r33 = r83;
        r35.add(new dd5(r36, r37, r38, r39, r40, r41, r42, r44, r46, new mc0(r610, r70, r73, r75, r77, r79, r710, r711, uc5.b(r3.getBlob(r83))), r49, r50, r51, r53, r55, r57, r59, r60, r61, r62, r63, r65, r66, r68));     // Catch: Throwable -> L40
        goto L6
    L37:
        r79 = false;
        goto L36
    L32:
        r77 = false;
        goto L31
    L27:
        r75 = false;
        goto L26
    L22:
        r73 = false;
        goto L21
    L17:
        r210 = r3.getString(r67);     // Catch: Throwable -> L40
        goto L16
    L12:
        r59 = false;
        goto L11
    L42:
        r3.close();
        r17.j();
        return r35;
    L40:
        th = th;
    L46:
        r3.close();
        r17.j();
        throw th;
    L44:
        th = th;
        r17 = r1;
        goto L46
    }

    public final ArrayList c(int r80) {
        w24 r1 = w24.b(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        r1.c(1, r80);
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r3 = xl.H(r2, r1);
        int r4 = e35.x(r3, "id");     // Catch: Throwable -> L44
        int r5 = e35.x(r3, "state");     // Catch: Throwable -> L44
        int r6 = e35.x(r3, "worker_class_name");     // Catch: Throwable -> L44
        int r7 = e35.x(r3, "input_merger_class_name");     // Catch: Throwable -> L44
        int r8 = e35.x(r3, "input");     // Catch: Throwable -> L44
        int r9 = e35.x(r3, "output");     // Catch: Throwable -> L44
        int r10 = e35.x(r3, "initial_delay");     // Catch: Throwable -> L44
        int r11 = e35.x(r3, "interval_duration");     // Catch: Throwable -> L44
        int r12 = e35.x(r3, "flex_duration");     // Catch: Throwable -> L44
        int r13 = e35.x(r3, "run_attempt_count");     // Catch: Throwable -> L44
        int r14 = e35.x(r3, "backoff_policy");     // Catch: Throwable -> L44
        int r15 = e35.x(r3, "backoff_delay_duration");     // Catch: Throwable -> L44
        int r16 = e35.x(r3, "last_enqueue_time");     // Catch: Throwable -> L44
        int r0 = e35.x(r3, "minimum_retention_duration");     // Catch: Throwable -> L44
        w24 r17 = r1;
        int r79 = e35.x(r3, "schedule_requested_at");     // Catch: Throwable -> L40
        int r81 = e35.x(r3, "run_in_foreground");     // Catch: Throwable -> L40
        int r18 = e35.x(r3, "out_of_quota_policy");     // Catch: Throwable -> L40
        int r19 = e35.x(r3, "period_count");     // Catch: Throwable -> L40
        int r110 = e35.x(r3, "generation");     // Catch: Throwable -> L40
        int r20 = e35.x(r3, "next_schedule_time_override");     // Catch: Throwable -> L40
        int r21 = e35.x(r3, "next_schedule_time_override_generation");     // Catch: Throwable -> L40
        int r22 = e35.x(r3, "stop_reason");     // Catch: Throwable -> L40
        int r23 = e35.x(r3, "trace_tag");     // Catch: Throwable -> L40
        int r24 = e35.x(r3, "required_network_type");     // Catch: Throwable -> L40
        int r25 = e35.x(r3, "required_network_request");     // Catch: Throwable -> L40
        int r26 = e35.x(r3, "requires_charging");     // Catch: Throwable -> L40
        int r27 = e35.x(r3, "requires_device_idle");     // Catch: Throwable -> L40
        int r28 = e35.x(r3, "requires_battery_not_low");     // Catch: Throwable -> L40
        int r29 = e35.x(r3, "requires_storage_not_low");     // Catch: Throwable -> L40
        int r30 = e35.x(r3, "trigger_content_update_delay");     // Catch: Throwable -> L40
        int r31 = e35.x(r3, "trigger_max_content_delay");     // Catch: Throwable -> L40
        int r32 = e35.x(r3, "content_uri_triggers");     // Catch: Throwable -> L40
        int r33 = r0;
        ArrayList r34 = new ArrayList(r3.getCount());     // Catch: Throwable -> L40
    L6:
        if (r3.moveToNext() == false) goto L42;
        String r35 = r3.getString(r4);     // Catch: Throwable -> L40
        int r36 = uc5.x(r3.getInt(r5));     // Catch: Throwable -> L40
        String r37 = r3.getString(r6);     // Catch: Throwable -> L40
        String r38 = r3.getString(r7);     // Catch: Throwable -> L40
        oh0 r39 = oh0.a(r3.getBlob(r8));     // Catch: Throwable -> L40
        oh0 r40 = oh0.a(r3.getBlob(r9));     // Catch: Throwable -> L40
        long r41 = r3.getLong(r10);     // Catch: Throwable -> L40
        long r43 = r3.getLong(r11);     // Catch: Throwable -> L40
        long r45 = r3.getLong(r12);     // Catch: Throwable -> L40
        int r48 = r3.getInt(r13);     // Catch: Throwable -> L40
        int r49 = uc5.u(r3.getInt(r14));     // Catch: Throwable -> L40
        long r50 = r3.getLong(r15);     // Catch: Throwable -> L40
        long r52 = r3.getLong(r16);     // Catch: Throwable -> L40
        int r42 = r33;
        long r54 = r3.getLong(r42);     // Catch: Throwable -> L40
        r33 = r42;
        int r44 = r79;
        long r56 = r3.getLong(r44);     // Catch: Throwable -> L40
        r79 = r44;
        int r46 = r81;
        if (r3.getInt(r46) == 0) goto L12;
        boolean r58 = true;
    L11:
        r81 = r46;
        int r47 = r18;
        int r59 = uc5.w(r3.getInt(r47));     // Catch: Throwable -> L40
        r18 = r47;
        int r51 = r19;
        int r60 = r3.getInt(r51);     // Catch: Throwable -> L40
        r19 = r51;
        int r53 = r110;
        int r61 = r3.getInt(r53);     // Catch: Throwable -> L40
        r110 = r53;
        int r55 = r20;
        long r62 = r3.getLong(r55);     // Catch: Throwable -> L40
        r20 = r55;
        int r57 = r21;
        int r64 = r3.getInt(r57);     // Catch: Throwable -> L40
        r21 = r57;
        int r63 = r22;
        int r65 = r3.getInt(r63);     // Catch: Throwable -> L40
        r22 = r63;
        int r66 = r23;
        if (r3.isNull(r66) == false) goto L17;
        String r210 = null;
    L16:
        String r67 = r210;
        r23 = r66;
        int r68 = r24;
        int r69 = uc5.v(r3.getInt(r68));     // Catch: Throwable -> L40
        r24 = r68;
        int r70 = r25;
        o53 r610 = uc5.a0(r3.getBlob(r70));     // Catch: Throwable -> L40
        r25 = r70;
        int r71 = r26;
        if (r3.getInt(r71) == 0) goto L22;
        boolean r72 = true;
    L21:
        r26 = r71;
        int r73 = r27;
        if (r3.getInt(r73) == 0) goto L27;
        boolean r74 = true;
    L26:
        r27 = r73;
        int r75 = r28;
        if (r3.getInt(r75) == 0) goto L32;
        boolean r76 = true;
    L31:
        r28 = r75;
        int r77 = r29;
        if (r3.getInt(r77) == 0) goto L37;
        boolean r78 = true;
    L36:
        r29 = r77;
        int r82 = r30;
        long r710 = r3.getLong(r82);     // Catch: Throwable -> L40
        r30 = r82;
        int r83 = r31;
        long r711 = r3.getLong(r83);     // Catch: Throwable -> L40
        r31 = r83;
        int r84 = r32;
        r32 = r84;
        r34.add(new dd5(r35, r36, r37, r38, r39, r40, r41, r43, r45, new mc0(r610, r69, r72, r74, r76, r78, r710, r711, uc5.b(r3.getBlob(r84))), r48, r49, r50, r52, r54, r56, r58, r59, r60, r61, r62, r64, r65, r67));     // Catch: Throwable -> L40
        goto L6
    L37:
        r78 = false;
        goto L36
    L32:
        r76 = false;
        goto L31
    L27:
        r74 = false;
        goto L26
    L22:
        r72 = false;
        goto L21
    L17:
        r210 = r3.getString(r66);     // Catch: Throwable -> L40
        goto L16
    L12:
        r58 = false;
        goto L11
    L42:
        r3.close();
        r17.j();
        return r34;
    L40:
        th = th;
    L46:
        r3.close();
        r17.j();
        throw th;
    L44:
        th = th;
        r17 = r1;
        goto L46
    }

    public final ArrayList d() {
        w24 r1 = w24.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r3 = xl.H(r2, r1);
        int r4 = e35.x(r3, "id");     // Catch: Throwable -> L44
        int r5 = e35.x(r3, "state");     // Catch: Throwable -> L44
        int r6 = e35.x(r3, "worker_class_name");     // Catch: Throwable -> L44
        int r7 = e35.x(r3, "input_merger_class_name");     // Catch: Throwable -> L44
        int r8 = e35.x(r3, "input");     // Catch: Throwable -> L44
        int r9 = e35.x(r3, "output");     // Catch: Throwable -> L44
        int r10 = e35.x(r3, "initial_delay");     // Catch: Throwable -> L44
        int r11 = e35.x(r3, "interval_duration");     // Catch: Throwable -> L44
        int r12 = e35.x(r3, "flex_duration");     // Catch: Throwable -> L44
        int r13 = e35.x(r3, "run_attempt_count");     // Catch: Throwable -> L44
        int r14 = e35.x(r3, "backoff_policy");     // Catch: Throwable -> L44
        int r15 = e35.x(r3, "backoff_delay_duration");     // Catch: Throwable -> L44
        int r16 = e35.x(r3, "last_enqueue_time");     // Catch: Throwable -> L44
        int r0 = e35.x(r3, "minimum_retention_duration");     // Catch: Throwable -> L44
        w24 r17 = r1;
        int r80 = e35.x(r3, "schedule_requested_at");     // Catch: Throwable -> L40
        int r18 = e35.x(r3, "run_in_foreground");     // Catch: Throwable -> L40
        int r19 = e35.x(r3, "out_of_quota_policy");     // Catch: Throwable -> L40
        int r110 = e35.x(r3, "period_count");     // Catch: Throwable -> L40
        int r20 = e35.x(r3, "generation");     // Catch: Throwable -> L40
        int r21 = e35.x(r3, "next_schedule_time_override");     // Catch: Throwable -> L40
        int r22 = e35.x(r3, "next_schedule_time_override_generation");     // Catch: Throwable -> L40
        int r23 = e35.x(r3, "stop_reason");     // Catch: Throwable -> L40
        int r24 = e35.x(r3, "trace_tag");     // Catch: Throwable -> L40
        int r25 = e35.x(r3, "required_network_type");     // Catch: Throwable -> L40
        int r26 = e35.x(r3, "required_network_request");     // Catch: Throwable -> L40
        int r27 = e35.x(r3, "requires_charging");     // Catch: Throwable -> L40
        int r28 = e35.x(r3, "requires_device_idle");     // Catch: Throwable -> L40
        int r29 = e35.x(r3, "requires_battery_not_low");     // Catch: Throwable -> L40
        int r30 = e35.x(r3, "requires_storage_not_low");     // Catch: Throwable -> L40
        int r31 = e35.x(r3, "trigger_content_update_delay");     // Catch: Throwable -> L40
        int r32 = e35.x(r3, "trigger_max_content_delay");     // Catch: Throwable -> L40
        int r33 = e35.x(r3, "content_uri_triggers");     // Catch: Throwable -> L40
        int r34 = r0;
        ArrayList r35 = new ArrayList(r3.getCount());     // Catch: Throwable -> L40
    L6:
        if (r3.moveToNext() == false) goto L42;
        String r36 = r3.getString(r4);     // Catch: Throwable -> L40
        int r37 = uc5.x(r3.getInt(r5));     // Catch: Throwable -> L40
        String r38 = r3.getString(r6);     // Catch: Throwable -> L40
        String r39 = r3.getString(r7);     // Catch: Throwable -> L40
        oh0 r40 = oh0.a(r3.getBlob(r8));     // Catch: Throwable -> L40
        oh0 r41 = oh0.a(r3.getBlob(r9));     // Catch: Throwable -> L40
        long r42 = r3.getLong(r10);     // Catch: Throwable -> L40
        long r44 = r3.getLong(r11);     // Catch: Throwable -> L40
        long r46 = r3.getLong(r12);     // Catch: Throwable -> L40
        int r49 = r3.getInt(r13);     // Catch: Throwable -> L40
        int r50 = uc5.u(r3.getInt(r14));     // Catch: Throwable -> L40
        long r51 = r3.getLong(r15);     // Catch: Throwable -> L40
        long r53 = r3.getLong(r16);     // Catch: Throwable -> L40
        int r43 = r34;
        long r55 = r3.getLong(r43);     // Catch: Throwable -> L40
        r34 = r43;
        int r45 = r80;
        long r57 = r3.getLong(r45);     // Catch: Throwable -> L40
        r80 = r45;
        int r47 = r18;
        if (r3.getInt(r47) == 0) goto L12;
        boolean r59 = true;
    L11:
        r18 = r47;
        int r48 = r19;
        int r60 = uc5.w(r3.getInt(r48));     // Catch: Throwable -> L40
        r19 = r48;
        int r52 = r110;
        int r61 = r3.getInt(r52);     // Catch: Throwable -> L40
        r110 = r52;
        int r54 = r20;
        int r62 = r3.getInt(r54);     // Catch: Throwable -> L40
        r20 = r54;
        int r56 = r21;
        long r63 = r3.getLong(r56);     // Catch: Throwable -> L40
        r21 = r56;
        int r58 = r22;
        int r65 = r3.getInt(r58);     // Catch: Throwable -> L40
        r22 = r58;
        int r64 = r23;
        int r66 = r3.getInt(r64);     // Catch: Throwable -> L40
        r23 = r64;
        int r67 = r24;
        if (r3.isNull(r67) == false) goto L17;
        String r210 = null;
    L16:
        String r68 = r210;
        r24 = r67;
        int r69 = r25;
        int r70 = uc5.v(r3.getInt(r69));     // Catch: Throwable -> L40
        r25 = r69;
        int r71 = r26;
        o53 r610 = uc5.a0(r3.getBlob(r71));     // Catch: Throwable -> L40
        r26 = r71;
        int r72 = r27;
        if (r3.getInt(r72) == 0) goto L22;
        boolean r73 = true;
    L21:
        r27 = r72;
        int r74 = r28;
        if (r3.getInt(r74) == 0) goto L27;
        boolean r75 = true;
    L26:
        r28 = r74;
        int r76 = r29;
        if (r3.getInt(r76) == 0) goto L32;
        boolean r77 = true;
    L31:
        r29 = r76;
        int r78 = r30;
        if (r3.getInt(r78) == 0) goto L37;
        boolean r79 = true;
    L36:
        r30 = r78;
        int r81 = r31;
        long r710 = r3.getLong(r81);     // Catch: Throwable -> L40
        r31 = r81;
        int r82 = r32;
        long r711 = r3.getLong(r82);     // Catch: Throwable -> L40
        r32 = r82;
        int r83 = r33;
        r33 = r83;
        r35.add(new dd5(r36, r37, r38, r39, r40, r41, r42, r44, r46, new mc0(r610, r70, r73, r75, r77, r79, r710, r711, uc5.b(r3.getBlob(r83))), r49, r50, r51, r53, r55, r57, r59, r60, r61, r62, r63, r65, r66, r68));     // Catch: Throwable -> L40
        goto L6
    L37:
        r79 = false;
        goto L36
    L32:
        r77 = false;
        goto L31
    L27:
        r75 = false;
        goto L26
    L22:
        r73 = false;
        goto L21
    L17:
        r210 = r3.getString(r67);     // Catch: Throwable -> L40
        goto L16
    L12:
        r59 = false;
        goto L11
    L42:
        r3.close();
        r17.j();
        return r35;
    L40:
        th = th;
    L46:
        r3.close();
        r17.j();
        throw th;
    L44:
        th = th;
        r17 = r1;
        goto L46
    }

    public final ArrayList e() {
        w24 r1 = w24.b(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r3 = xl.H(r2, r1);
        int r4 = e35.x(r3, "id");     // Catch: Throwable -> L44
        int r5 = e35.x(r3, "state");     // Catch: Throwable -> L44
        int r6 = e35.x(r3, "worker_class_name");     // Catch: Throwable -> L44
        int r7 = e35.x(r3, "input_merger_class_name");     // Catch: Throwable -> L44
        int r8 = e35.x(r3, "input");     // Catch: Throwable -> L44
        int r9 = e35.x(r3, "output");     // Catch: Throwable -> L44
        int r10 = e35.x(r3, "initial_delay");     // Catch: Throwable -> L44
        int r11 = e35.x(r3, "interval_duration");     // Catch: Throwable -> L44
        int r12 = e35.x(r3, "flex_duration");     // Catch: Throwable -> L44
        int r13 = e35.x(r3, "run_attempt_count");     // Catch: Throwable -> L44
        int r14 = e35.x(r3, "backoff_policy");     // Catch: Throwable -> L44
        int r15 = e35.x(r3, "backoff_delay_duration");     // Catch: Throwable -> L44
        int r16 = e35.x(r3, "last_enqueue_time");     // Catch: Throwable -> L44
        int r0 = e35.x(r3, "minimum_retention_duration");     // Catch: Throwable -> L44
        w24 r17 = r1;
        int r80 = e35.x(r3, "schedule_requested_at");     // Catch: Throwable -> L40
        int r18 = e35.x(r3, "run_in_foreground");     // Catch: Throwable -> L40
        int r19 = e35.x(r3, "out_of_quota_policy");     // Catch: Throwable -> L40
        int r110 = e35.x(r3, "period_count");     // Catch: Throwable -> L40
        int r20 = e35.x(r3, "generation");     // Catch: Throwable -> L40
        int r21 = e35.x(r3, "next_schedule_time_override");     // Catch: Throwable -> L40
        int r22 = e35.x(r3, "next_schedule_time_override_generation");     // Catch: Throwable -> L40
        int r23 = e35.x(r3, "stop_reason");     // Catch: Throwable -> L40
        int r24 = e35.x(r3, "trace_tag");     // Catch: Throwable -> L40
        int r25 = e35.x(r3, "required_network_type");     // Catch: Throwable -> L40
        int r26 = e35.x(r3, "required_network_request");     // Catch: Throwable -> L40
        int r27 = e35.x(r3, "requires_charging");     // Catch: Throwable -> L40
        int r28 = e35.x(r3, "requires_device_idle");     // Catch: Throwable -> L40
        int r29 = e35.x(r3, "requires_battery_not_low");     // Catch: Throwable -> L40
        int r30 = e35.x(r3, "requires_storage_not_low");     // Catch: Throwable -> L40
        int r31 = e35.x(r3, "trigger_content_update_delay");     // Catch: Throwable -> L40
        int r32 = e35.x(r3, "trigger_max_content_delay");     // Catch: Throwable -> L40
        int r33 = e35.x(r3, "content_uri_triggers");     // Catch: Throwable -> L40
        int r34 = r0;
        ArrayList r35 = new ArrayList(r3.getCount());     // Catch: Throwable -> L40
    L6:
        if (r3.moveToNext() == false) goto L42;
        String r36 = r3.getString(r4);     // Catch: Throwable -> L40
        int r37 = uc5.x(r3.getInt(r5));     // Catch: Throwable -> L40
        String r38 = r3.getString(r6);     // Catch: Throwable -> L40
        String r39 = r3.getString(r7);     // Catch: Throwable -> L40
        oh0 r40 = oh0.a(r3.getBlob(r8));     // Catch: Throwable -> L40
        oh0 r41 = oh0.a(r3.getBlob(r9));     // Catch: Throwable -> L40
        long r42 = r3.getLong(r10);     // Catch: Throwable -> L40
        long r44 = r3.getLong(r11);     // Catch: Throwable -> L40
        long r46 = r3.getLong(r12);     // Catch: Throwable -> L40
        int r49 = r3.getInt(r13);     // Catch: Throwable -> L40
        int r50 = uc5.u(r3.getInt(r14));     // Catch: Throwable -> L40
        long r51 = r3.getLong(r15);     // Catch: Throwable -> L40
        long r53 = r3.getLong(r16);     // Catch: Throwable -> L40
        int r43 = r34;
        long r55 = r3.getLong(r43);     // Catch: Throwable -> L40
        r34 = r43;
        int r45 = r80;
        long r57 = r3.getLong(r45);     // Catch: Throwable -> L40
        r80 = r45;
        int r47 = r18;
        if (r3.getInt(r47) == 0) goto L12;
        boolean r59 = true;
    L11:
        r18 = r47;
        int r48 = r19;
        int r60 = uc5.w(r3.getInt(r48));     // Catch: Throwable -> L40
        r19 = r48;
        int r52 = r110;
        int r61 = r3.getInt(r52);     // Catch: Throwable -> L40
        r110 = r52;
        int r54 = r20;
        int r62 = r3.getInt(r54);     // Catch: Throwable -> L40
        r20 = r54;
        int r56 = r21;
        long r63 = r3.getLong(r56);     // Catch: Throwable -> L40
        r21 = r56;
        int r58 = r22;
        int r65 = r3.getInt(r58);     // Catch: Throwable -> L40
        r22 = r58;
        int r64 = r23;
        int r66 = r3.getInt(r64);     // Catch: Throwable -> L40
        r23 = r64;
        int r67 = r24;
        if (r3.isNull(r67) == false) goto L17;
        String r210 = null;
    L16:
        String r68 = r210;
        r24 = r67;
        int r69 = r25;
        int r70 = uc5.v(r3.getInt(r69));     // Catch: Throwable -> L40
        r25 = r69;
        int r71 = r26;
        o53 r610 = uc5.a0(r3.getBlob(r71));     // Catch: Throwable -> L40
        r26 = r71;
        int r72 = r27;
        if (r3.getInt(r72) == 0) goto L22;
        boolean r73 = true;
    L21:
        r27 = r72;
        int r74 = r28;
        if (r3.getInt(r74) == 0) goto L27;
        boolean r75 = true;
    L26:
        r28 = r74;
        int r76 = r29;
        if (r3.getInt(r76) == 0) goto L32;
        boolean r77 = true;
    L31:
        r29 = r76;
        int r78 = r30;
        if (r3.getInt(r78) == 0) goto L37;
        boolean r79 = true;
    L36:
        r30 = r78;
        int r81 = r31;
        long r710 = r3.getLong(r81);     // Catch: Throwable -> L40
        r31 = r81;
        int r82 = r32;
        long r711 = r3.getLong(r82);     // Catch: Throwable -> L40
        r32 = r82;
        int r83 = r33;
        r33 = r83;
        r35.add(new dd5(r36, r37, r38, r39, r40, r41, r42, r44, r46, new mc0(r610, r70, r73, r75, r77, r79, r710, r711, uc5.b(r3.getBlob(r83))), r49, r50, r51, r53, r55, r57, r59, r60, r61, r62, r63, r65, r66, r68));     // Catch: Throwable -> L40
        goto L6
    L37:
        r79 = false;
        goto L36
    L32:
        r77 = false;
        goto L31
    L27:
        r75 = false;
        goto L26
    L22:
        r73 = false;
        goto L21
    L17:
        r210 = r3.getString(r67);     // Catch: Throwable -> L40
        goto L16
    L12:
        r59 = false;
        goto L11
    L42:
        r3.close();
        r17.j();
        return r35;
    L40:
        th = th;
    L46:
        r3.close();
        r17.j();
        throw th;
    L44:
        th = th;
        r17 = r1;
        goto L46
    }

    public final ArrayList f() {
        w24 r1 = w24.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r3 = xl.H(r2, r1);
        int r4 = e35.x(r3, "id");     // Catch: Throwable -> L44
        int r5 = e35.x(r3, "state");     // Catch: Throwable -> L44
        int r6 = e35.x(r3, "worker_class_name");     // Catch: Throwable -> L44
        int r7 = e35.x(r3, "input_merger_class_name");     // Catch: Throwable -> L44
        int r8 = e35.x(r3, "input");     // Catch: Throwable -> L44
        int r9 = e35.x(r3, "output");     // Catch: Throwable -> L44
        int r10 = e35.x(r3, "initial_delay");     // Catch: Throwable -> L44
        int r11 = e35.x(r3, "interval_duration");     // Catch: Throwable -> L44
        int r12 = e35.x(r3, "flex_duration");     // Catch: Throwable -> L44
        int r13 = e35.x(r3, "run_attempt_count");     // Catch: Throwable -> L44
        int r14 = e35.x(r3, "backoff_policy");     // Catch: Throwable -> L44
        int r15 = e35.x(r3, "backoff_delay_duration");     // Catch: Throwable -> L44
        int r16 = e35.x(r3, "last_enqueue_time");     // Catch: Throwable -> L44
        int r0 = e35.x(r3, "minimum_retention_duration");     // Catch: Throwable -> L44
        w24 r17 = r1;
        int r80 = e35.x(r3, "schedule_requested_at");     // Catch: Throwable -> L40
        int r18 = e35.x(r3, "run_in_foreground");     // Catch: Throwable -> L40
        int r19 = e35.x(r3, "out_of_quota_policy");     // Catch: Throwable -> L40
        int r110 = e35.x(r3, "period_count");     // Catch: Throwable -> L40
        int r20 = e35.x(r3, "generation");     // Catch: Throwable -> L40
        int r21 = e35.x(r3, "next_schedule_time_override");     // Catch: Throwable -> L40
        int r22 = e35.x(r3, "next_schedule_time_override_generation");     // Catch: Throwable -> L40
        int r23 = e35.x(r3, "stop_reason");     // Catch: Throwable -> L40
        int r24 = e35.x(r3, "trace_tag");     // Catch: Throwable -> L40
        int r25 = e35.x(r3, "required_network_type");     // Catch: Throwable -> L40
        int r26 = e35.x(r3, "required_network_request");     // Catch: Throwable -> L40
        int r27 = e35.x(r3, "requires_charging");     // Catch: Throwable -> L40
        int r28 = e35.x(r3, "requires_device_idle");     // Catch: Throwable -> L40
        int r29 = e35.x(r3, "requires_battery_not_low");     // Catch: Throwable -> L40
        int r30 = e35.x(r3, "requires_storage_not_low");     // Catch: Throwable -> L40
        int r31 = e35.x(r3, "trigger_content_update_delay");     // Catch: Throwable -> L40
        int r32 = e35.x(r3, "trigger_max_content_delay");     // Catch: Throwable -> L40
        int r33 = e35.x(r3, "content_uri_triggers");     // Catch: Throwable -> L40
        int r34 = r0;
        ArrayList r35 = new ArrayList(r3.getCount());     // Catch: Throwable -> L40
    L6:
        if (r3.moveToNext() == false) goto L42;
        String r36 = r3.getString(r4);     // Catch: Throwable -> L40
        int r37 = uc5.x(r3.getInt(r5));     // Catch: Throwable -> L40
        String r38 = r3.getString(r6);     // Catch: Throwable -> L40
        String r39 = r3.getString(r7);     // Catch: Throwable -> L40
        oh0 r40 = oh0.a(r3.getBlob(r8));     // Catch: Throwable -> L40
        oh0 r41 = oh0.a(r3.getBlob(r9));     // Catch: Throwable -> L40
        long r42 = r3.getLong(r10);     // Catch: Throwable -> L40
        long r44 = r3.getLong(r11);     // Catch: Throwable -> L40
        long r46 = r3.getLong(r12);     // Catch: Throwable -> L40
        int r49 = r3.getInt(r13);     // Catch: Throwable -> L40
        int r50 = uc5.u(r3.getInt(r14));     // Catch: Throwable -> L40
        long r51 = r3.getLong(r15);     // Catch: Throwable -> L40
        long r53 = r3.getLong(r16);     // Catch: Throwable -> L40
        int r43 = r34;
        long r55 = r3.getLong(r43);     // Catch: Throwable -> L40
        r34 = r43;
        int r45 = r80;
        long r57 = r3.getLong(r45);     // Catch: Throwable -> L40
        r80 = r45;
        int r47 = r18;
        if (r3.getInt(r47) == 0) goto L12;
        boolean r59 = true;
    L11:
        r18 = r47;
        int r48 = r19;
        int r60 = uc5.w(r3.getInt(r48));     // Catch: Throwable -> L40
        r19 = r48;
        int r52 = r110;
        int r61 = r3.getInt(r52);     // Catch: Throwable -> L40
        r110 = r52;
        int r54 = r20;
        int r62 = r3.getInt(r54);     // Catch: Throwable -> L40
        r20 = r54;
        int r56 = r21;
        long r63 = r3.getLong(r56);     // Catch: Throwable -> L40
        r21 = r56;
        int r58 = r22;
        int r65 = r3.getInt(r58);     // Catch: Throwable -> L40
        r22 = r58;
        int r64 = r23;
        int r66 = r3.getInt(r64);     // Catch: Throwable -> L40
        r23 = r64;
        int r67 = r24;
        if (r3.isNull(r67) == false) goto L17;
        String r210 = null;
    L16:
        String r68 = r210;
        r24 = r67;
        int r69 = r25;
        int r70 = uc5.v(r3.getInt(r69));     // Catch: Throwable -> L40
        r25 = r69;
        int r71 = r26;
        o53 r610 = uc5.a0(r3.getBlob(r71));     // Catch: Throwable -> L40
        r26 = r71;
        int r72 = r27;
        if (r3.getInt(r72) == 0) goto L22;
        boolean r73 = true;
    L21:
        r27 = r72;
        int r74 = r28;
        if (r3.getInt(r74) == 0) goto L27;
        boolean r75 = true;
    L26:
        r28 = r74;
        int r76 = r29;
        if (r3.getInt(r76) == 0) goto L32;
        boolean r77 = true;
    L31:
        r29 = r76;
        int r78 = r30;
        if (r3.getInt(r78) == 0) goto L37;
        boolean r79 = true;
    L36:
        r30 = r78;
        int r81 = r31;
        long r710 = r3.getLong(r81);     // Catch: Throwable -> L40
        r31 = r81;
        int r82 = r32;
        long r711 = r3.getLong(r82);     // Catch: Throwable -> L40
        r32 = r82;
        int r83 = r33;
        r33 = r83;
        r35.add(new dd5(r36, r37, r38, r39, r40, r41, r42, r44, r46, new mc0(r610, r70, r73, r75, r77, r79, r710, r711, uc5.b(r3.getBlob(r83))), r49, r50, r51, r53, r55, r57, r59, r60, r61, r62, r63, r65, r66, r68));     // Catch: Throwable -> L40
        goto L6
    L37:
        r79 = false;
        goto L36
    L32:
        r77 = false;
        goto L31
    L27:
        r75 = false;
        goto L26
    L22:
        r73 = false;
        goto L21
    L17:
        r210 = r3.getString(r67);     // Catch: Throwable -> L40
        goto L16
    L12:
        r59 = false;
        goto L11
    L42:
        r3.close();
        r17.j();
        return r35;
    L40:
        th = th;
    L46:
        r3.close();
        r17.j();
        throw th;
    L44:
        th = th;
        r17 = r1;
        goto L46
    }

    public final int g(String r3) {
        w24 r1 = w24.b(1, "SELECT state FROM workspec WHERE id=?");
        r1.h(1, r3);
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r4 = xl.H(r2, r1);
        int r0 = 0;
        if (r4.moveToFirst() == true) goto L6;
    L15:
        r4.close();
        r1.j();
        return r0;
    L6:
        if (r4.isNull(0) == false) goto L8;
        Integer r5 = null;
    L9:
        if (r5 == null) goto L15;
        r0 = uc5.x(r5.intValue());     // Catch: Throwable -> L13
        goto L15
    L8:
        r5 = Integer.valueOf(r4.getInt(0));     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r4.close();
        r1.j();
        throw th;
    }

    public final dd5 h(String r68) {
        w24 r1 = w24.b(1, "SELECT * FROM workspec WHERE id=?");
        r1.h(1, r68);
        WorkDatabase_Impl r2 = this.a;
        r2.b();
        Cursor r3 = xl.H(r2, r1);
        int r4 = e35.x(r3, "id");     // Catch: Throwable -> L42
        int r5 = e35.x(r3, "state");     // Catch: Throwable -> L42
        int r6 = e35.x(r3, "worker_class_name");     // Catch: Throwable -> L42
        int r7 = e35.x(r3, "input_merger_class_name");     // Catch: Throwable -> L42
        int r8 = e35.x(r3, "input");     // Catch: Throwable -> L42
        int r9 = e35.x(r3, "output");     // Catch: Throwable -> L42
        int r10 = e35.x(r3, "initial_delay");     // Catch: Throwable -> L42
        int r11 = e35.x(r3, "interval_duration");     // Catch: Throwable -> L42
        int r12 = e35.x(r3, "flex_duration");     // Catch: Throwable -> L42
        int r13 = e35.x(r3, "run_attempt_count");     // Catch: Throwable -> L42
        int r14 = e35.x(r3, "backoff_policy");     // Catch: Throwable -> L42
        int r15 = e35.x(r3, "backoff_delay_duration");     // Catch: Throwable -> L42
        int r16 = e35.x(r3, "last_enqueue_time");     // Catch: Throwable -> L42
        int r0 = e35.x(r3, "minimum_retention_duration");     // Catch: Throwable -> L42
        w24 r17 = r1;
        int r18 = e35.x(r3, "schedule_requested_at");     // Catch: Throwable -> L38
        int r19 = e35.x(r3, "run_in_foreground");     // Catch: Throwable -> L38
        int r20 = e35.x(r3, "out_of_quota_policy");     // Catch: Throwable -> L38
        int r21 = e35.x(r3, "period_count");     // Catch: Throwable -> L38
        int r22 = e35.x(r3, "generation");     // Catch: Throwable -> L38
        int r23 = e35.x(r3, "next_schedule_time_override");     // Catch: Throwable -> L38
        int r24 = e35.x(r3, "next_schedule_time_override_generation");     // Catch: Throwable -> L38
        int r25 = e35.x(r3, "stop_reason");     // Catch: Throwable -> L38
        int r26 = e35.x(r3, "trace_tag");     // Catch: Throwable -> L38
        int r27 = e35.x(r3, "required_network_type");     // Catch: Throwable -> L38
        int r28 = e35.x(r3, "required_network_request");     // Catch: Throwable -> L38
        int r29 = e35.x(r3, "requires_charging");     // Catch: Throwable -> L38
        int r30 = e35.x(r3, "requires_device_idle");     // Catch: Throwable -> L38
        int r31 = e35.x(r3, "requires_battery_not_low");     // Catch: Throwable -> L38
        int r32 = e35.x(r3, "requires_storage_not_low");     // Catch: Throwable -> L38
        int r33 = e35.x(r3, "trigger_content_update_delay");     // Catch: Throwable -> L38
        int r34 = e35.x(r3, "trigger_max_content_delay");     // Catch: Throwable -> L38
        int r35 = e35.x(r3, "content_uri_triggers");     // Catch: Throwable -> L38
        dd5 r36 = null;
        String r37 = null;
        if (r3.moveToFirst() == false) goto L40;
        String r38 = r3.getString(r4);     // Catch: Throwable -> L38
        int r39 = uc5.x(r3.getInt(r5));     // Catch: Throwable -> L38
        String r310 = r3.getString(r6);     // Catch: Throwable -> L38
        String r311 = r3.getString(r7);     // Catch: Throwable -> L38
        oh0 r312 = oh0.a(r3.getBlob(r8));     // Catch: Throwable -> L38
        oh0 r40 = oh0.a(r3.getBlob(r9));     // Catch: Throwable -> L38
        long r41 = r3.getLong(r10);     // Catch: Throwable -> L38
        long r43 = r3.getLong(r11);     // Catch: Throwable -> L38
        long r45 = r3.getLong(r12);     // Catch: Throwable -> L38
        int r48 = r3.getInt(r13);     // Catch: Throwable -> L38
        int r49 = uc5.u(r3.getInt(r14));     // Catch: Throwable -> L38
        long r50 = r3.getLong(r15);     // Catch: Throwable -> L38
        long r52 = r3.getLong(r16);     // Catch: Throwable -> L38
        long r54 = r3.getLong(r0);     // Catch: Throwable -> L38
        long r56 = r3.getLong(r18);     // Catch: Throwable -> L38
        if (r3.getInt(r19) == 0) goto L11;
        boolean r58 = true;
    L12:
        int r59 = uc5.w(r3.getInt(r20));     // Catch: Throwable -> L38
        int r60 = r3.getInt(r21);     // Catch: Throwable -> L38
        int r61 = r3.getInt(r22);     // Catch: Throwable -> L38
        long r62 = r3.getLong(r23);     // Catch: Throwable -> L38
        int r64 = r3.getInt(r24);     // Catch: Throwable -> L38
        int r65 = r3.getInt(r25);     // Catch: Throwable -> L38
        if (r3.isNull(r26) == false) goto L15;
    L14:
        String r66 = r37;
        int r42 = uc5.v(r3.getInt(r27));     // Catch: Throwable -> L38
        o53 r44 = uc5.a0(r3.getBlob(r28));     // Catch: Throwable -> L38
        if (r3.getInt(r29) == 0) goto L20;
        boolean r46 = true;
    L22:
        if (r3.getInt(r30) == 0) goto L25;
        boolean r47 = true;
    L27:
        if (r3.getInt(r31) == 0) goto L30;
        boolean r51 = true;
    L32:
        if (r3.getInt(r32) == 0) goto L35;
        boolean r110 = true;
    L36:
        r36 = new dd5(r38, r39, r310, r311, r312, r40, r41, r43, r45, new mc0(r44, r42, r46, r47, r51, r110, r3.getLong(r33), r3.getLong(r34), uc5.b(r3.getBlob(r35))), r48, r49, r50, r52, r54, r56, r58, r59, r60, r61, r62, r64, r65, r66);     // Catch: Throwable -> L38
        goto L40
    L35:
        r110 = false;
        goto L36
    L30:
        r51 = false;
        goto L32
    L25:
        r47 = false;
        goto L27
    L20:
        r46 = false;
        goto L22
    L15:
        r37 = r3.getString(r26);     // Catch: Throwable -> L38
        goto L14
    L11:
        r58 = false;
    L40:
        r3.close();
        r17.j();
        return r36;
    L38:
        th = th;
    L44:
        r3.close();
        r17.j();
        throw th;
    L42:
        th = th;
        r17 = r1;
        goto L44
    }

    public final ArrayList i(String r6) {
        w24 r1 = w24.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        r1.h(1, r6);
        WorkDatabase_Impl r5 = this.a;
        r5.b();
        Cursor r7 = xl.H(r5, r1);
        ArrayList r8 = new ArrayList(r7.getCount());     // Catch: Throwable -> L8
    L5:
        if (r7.moveToNext() == false) goto L10;
        String r2 = r7.getString(0);     // Catch: Throwable -> L8
        int r3 = uc5.x(r7.getInt(1));     // Catch: Throwable -> L8
        r2.getClass();     // Catch: Throwable -> L8
        cd5 r4 = new cd5();     // Catch: Throwable -> L8
        r4.a = r2;     // Catch: Throwable -> L8
        r4.b = r3;     // Catch: Throwable -> L8
        r8.add(r4);     // Catch: Throwable -> L8
        goto L5
    L10:
        r7.close();
        r1.j();
        return r8;
    L8:
        th = move-exception;
        r7.close();
        r1.j();
        throw th;
    }

    public final void j(String r4, long r5) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r3 = this.l;
        df1 r1 = r3.a();
        r1.c(1, r5);
        r1.h(2, r4);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r3.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r3.h(r1);
        throw th;
    }

    public final void k(int r5, String r6) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r4 = this.k;
        df1 r1 = r4.a();
        r1.h(1, r6);
        r1.c(2, r5);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r4.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r4.h(r1);
        throw th;
    }

    public final void l(String r4, long r5) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r3 = this.h;
        df1 r1 = r3.a();
        r1.c(1, r5);
        r1.h(2, r4);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r3.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r3.h(r1);
        throw th;
    }

    public final void m(String r4, oh0 r5) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r3 = this.g;
        df1 r1 = r3.a();
        oh0 r2 = oh0.b;
        r1.x(1, bu.E(r5));
        r1.h(2, r4);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r3.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r3.h(r1);
        throw th;
    }

    public final void n(int r5, String r6) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r4 = this.d;
        df1 r1 = r4.a();
        r1.c(1, uc5.X(r5));
        r1.h(2, r6);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r4.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r4.h(r1);
        throw th;
    }

    public final void o(int r6, String r7) {
        WorkDatabase_Impl r0 = this.a;
        r0.b();
        aq4 r5 = this.n;
        df1 r1 = r5.a();
        r1.c(1, r6);
        r1.h(2, r7);
        r0.c();     // Catch: Throwable -> L8
        r1.b();     // Catch: Throwable -> L10
        r0.t();     // Catch: Throwable -> L10
        r0.o();     // Catch: Throwable -> L8
        r5.h(r1);
        return;
    L10:
        th = move-exception;
        r0.o();     // Catch: Throwable -> L8
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r5.h(r1);
        throw th;
    }
}
