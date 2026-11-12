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

    public fd5(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        int i = 5;
        this.b = new vo0(workDatabase_Impl, i);
        new aq4(workDatabase_Impl, 12);
        this.c = new aq4(workDatabase_Impl, 13);
        this.d = new aq4(workDatabase_Impl, 14);
        this.e = new aq4(workDatabase_Impl, 15);
        this.f = new aq4(workDatabase_Impl, 16);
        this.g = new aq4(workDatabase_Impl, 17);
        this.h = new aq4(workDatabase_Impl, 18);
        this.i = new aq4(workDatabase_Impl, 19);
        this.j = new aq4(workDatabase_Impl, 4);
        new aq4(workDatabase_Impl, i);
        this.k = new aq4(workDatabase_Impl, 6);
        this.l = new aq4(workDatabase_Impl, 7);
        this.m = new aq4(workDatabase_Impl, 8);
        new aq4(workDatabase_Impl, 9);
        new aq4(workDatabase_Impl, 10);
        this.n = new aq4(workDatabase_Impl, 11);
    }

    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.c;
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

    public final ArrayList b() throws Throwable {
        w24 w24Var;
        w24 w24VarB = w24.b(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        w24VarB.c(1, 200L);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = e35.x(cursorH, "id");
            int iX2 = e35.x(cursorH, "state");
            int iX3 = e35.x(cursorH, "worker_class_name");
            int iX4 = e35.x(cursorH, "input_merger_class_name");
            int iX5 = e35.x(cursorH, "input");
            int iX6 = e35.x(cursorH, "output");
            int iX7 = e35.x(cursorH, "initial_delay");
            int iX8 = e35.x(cursorH, "interval_duration");
            int iX9 = e35.x(cursorH, "flex_duration");
            int iX10 = e35.x(cursorH, "run_attempt_count");
            int iX11 = e35.x(cursorH, "backoff_policy");
            int iX12 = e35.x(cursorH, "backoff_delay_duration");
            int iX13 = e35.x(cursorH, "last_enqueue_time");
            int iX14 = e35.x(cursorH, "minimum_retention_duration");
            w24Var = w24VarB;
            try {
                int iX15 = e35.x(cursorH, "schedule_requested_at");
                int iX16 = e35.x(cursorH, "run_in_foreground");
                int iX17 = e35.x(cursorH, "out_of_quota_policy");
                int iX18 = e35.x(cursorH, "period_count");
                int iX19 = e35.x(cursorH, "generation");
                int iX20 = e35.x(cursorH, "next_schedule_time_override");
                int iX21 = e35.x(cursorH, "next_schedule_time_override_generation");
                int iX22 = e35.x(cursorH, "stop_reason");
                int iX23 = e35.x(cursorH, "trace_tag");
                int iX24 = e35.x(cursorH, "required_network_type");
                int iX25 = e35.x(cursorH, "required_network_request");
                int iX26 = e35.x(cursorH, "requires_charging");
                int iX27 = e35.x(cursorH, "requires_device_idle");
                int iX28 = e35.x(cursorH, "requires_battery_not_low");
                int iX29 = e35.x(cursorH, "requires_storage_not_low");
                int iX30 = e35.x(cursorH, "trigger_content_update_delay");
                int iX31 = e35.x(cursorH, "trigger_max_content_delay");
                int iX32 = e35.x(cursorH, "content_uri_triggers");
                int i = iX14;
                ArrayList arrayList = new ArrayList(cursorH.getCount());
                while (cursorH.moveToNext()) {
                    String string = cursorH.getString(iX);
                    int iX33 = uc5.x(cursorH.getInt(iX2));
                    String string2 = cursorH.getString(iX3);
                    String string3 = cursorH.getString(iX4);
                    oh0 oh0VarA = oh0.a(cursorH.getBlob(iX5));
                    oh0 oh0VarA2 = oh0.a(cursorH.getBlob(iX6));
                    long j = cursorH.getLong(iX7);
                    long j2 = cursorH.getLong(iX8);
                    long j3 = cursorH.getLong(iX9);
                    int i2 = cursorH.getInt(iX10);
                    int iU = uc5.u(cursorH.getInt(iX11));
                    long j4 = cursorH.getLong(iX12);
                    long j5 = cursorH.getLong(iX13);
                    int i3 = i;
                    long j6 = cursorH.getLong(i3);
                    i = i3;
                    int i4 = iX15;
                    long j7 = cursorH.getLong(i4);
                    iX15 = i4;
                    int i5 = iX16;
                    boolean z = cursorH.getInt(i5) != 0;
                    iX16 = i5;
                    int i6 = iX17;
                    int iW = uc5.w(cursorH.getInt(i6));
                    iX17 = i6;
                    int i7 = iX18;
                    int i8 = cursorH.getInt(i7);
                    iX18 = i7;
                    int i9 = iX19;
                    int i10 = cursorH.getInt(i9);
                    iX19 = i9;
                    int i11 = iX20;
                    long j8 = cursorH.getLong(i11);
                    iX20 = i11;
                    int i12 = iX21;
                    int i13 = cursorH.getInt(i12);
                    iX21 = i12;
                    int i14 = iX22;
                    int i15 = cursorH.getInt(i14);
                    iX22 = i14;
                    int i16 = iX23;
                    String string4 = cursorH.isNull(i16) ? null : cursorH.getString(i16);
                    iX23 = i16;
                    int i17 = iX24;
                    int iV = uc5.v(cursorH.getInt(i17));
                    iX24 = i17;
                    int i18 = iX25;
                    o53 o53VarA0 = uc5.a0(cursorH.getBlob(i18));
                    iX25 = i18;
                    int i19 = iX26;
                    boolean z2 = cursorH.getInt(i19) != 0;
                    iX26 = i19;
                    int i20 = iX27;
                    boolean z3 = cursorH.getInt(i20) != 0;
                    iX27 = i20;
                    int i21 = iX28;
                    boolean z4 = cursorH.getInt(i21) != 0;
                    iX28 = i21;
                    int i22 = iX29;
                    boolean z5 = cursorH.getInt(i22) != 0;
                    iX29 = i22;
                    int i23 = iX30;
                    long j9 = cursorH.getLong(i23);
                    iX30 = i23;
                    int i24 = iX31;
                    long j10 = cursorH.getLong(i24);
                    iX31 = i24;
                    int i25 = iX32;
                    iX32 = i25;
                    arrayList.add(new dd5(string, iX33, string2, string3, oh0VarA, oh0VarA2, j, j2, j3, new mc0(o53VarA0, iV, z2, z3, z4, z5, j9, j10, uc5.b(cursorH.getBlob(i25))), i2, iU, j4, j5, j6, j7, z, iW, i8, i10, j8, i13, i15, string4));
                }
                cursorH.close();
                w24Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorH.close();
                w24Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            w24Var = w24VarB;
        }
    }

    public final ArrayList c(int i) throws Throwable {
        w24 w24Var;
        w24 w24VarB = w24.b(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        w24VarB.c(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = e35.x(cursorH, "id");
            int iX2 = e35.x(cursorH, "state");
            int iX3 = e35.x(cursorH, "worker_class_name");
            int iX4 = e35.x(cursorH, "input_merger_class_name");
            int iX5 = e35.x(cursorH, "input");
            int iX6 = e35.x(cursorH, "output");
            int iX7 = e35.x(cursorH, "initial_delay");
            int iX8 = e35.x(cursorH, "interval_duration");
            int iX9 = e35.x(cursorH, "flex_duration");
            int iX10 = e35.x(cursorH, "run_attempt_count");
            int iX11 = e35.x(cursorH, "backoff_policy");
            int iX12 = e35.x(cursorH, "backoff_delay_duration");
            int iX13 = e35.x(cursorH, "last_enqueue_time");
            int iX14 = e35.x(cursorH, "minimum_retention_duration");
            w24Var = w24VarB;
            try {
                int iX15 = e35.x(cursorH, "schedule_requested_at");
                int iX16 = e35.x(cursorH, "run_in_foreground");
                int iX17 = e35.x(cursorH, "out_of_quota_policy");
                int iX18 = e35.x(cursorH, "period_count");
                int iX19 = e35.x(cursorH, "generation");
                int iX20 = e35.x(cursorH, "next_schedule_time_override");
                int iX21 = e35.x(cursorH, "next_schedule_time_override_generation");
                int iX22 = e35.x(cursorH, "stop_reason");
                int iX23 = e35.x(cursorH, "trace_tag");
                int iX24 = e35.x(cursorH, "required_network_type");
                int iX25 = e35.x(cursorH, "required_network_request");
                int iX26 = e35.x(cursorH, "requires_charging");
                int iX27 = e35.x(cursorH, "requires_device_idle");
                int iX28 = e35.x(cursorH, "requires_battery_not_low");
                int iX29 = e35.x(cursorH, "requires_storage_not_low");
                int iX30 = e35.x(cursorH, "trigger_content_update_delay");
                int iX31 = e35.x(cursorH, "trigger_max_content_delay");
                int iX32 = e35.x(cursorH, "content_uri_triggers");
                int i2 = iX14;
                ArrayList arrayList = new ArrayList(cursorH.getCount());
                while (cursorH.moveToNext()) {
                    String string = cursorH.getString(iX);
                    int iX33 = uc5.x(cursorH.getInt(iX2));
                    String string2 = cursorH.getString(iX3);
                    String string3 = cursorH.getString(iX4);
                    oh0 oh0VarA = oh0.a(cursorH.getBlob(iX5));
                    oh0 oh0VarA2 = oh0.a(cursorH.getBlob(iX6));
                    long j = cursorH.getLong(iX7);
                    long j2 = cursorH.getLong(iX8);
                    long j3 = cursorH.getLong(iX9);
                    int i3 = cursorH.getInt(iX10);
                    int iU = uc5.u(cursorH.getInt(iX11));
                    long j4 = cursorH.getLong(iX12);
                    long j5 = cursorH.getLong(iX13);
                    int i4 = i2;
                    long j6 = cursorH.getLong(i4);
                    i2 = i4;
                    int i5 = iX15;
                    long j7 = cursorH.getLong(i5);
                    iX15 = i5;
                    int i6 = iX16;
                    boolean z = cursorH.getInt(i6) != 0;
                    iX16 = i6;
                    int i7 = iX17;
                    int iW = uc5.w(cursorH.getInt(i7));
                    iX17 = i7;
                    int i8 = iX18;
                    int i9 = cursorH.getInt(i8);
                    iX18 = i8;
                    int i10 = iX19;
                    int i11 = cursorH.getInt(i10);
                    iX19 = i10;
                    int i12 = iX20;
                    long j8 = cursorH.getLong(i12);
                    iX20 = i12;
                    int i13 = iX21;
                    int i14 = cursorH.getInt(i13);
                    iX21 = i13;
                    int i15 = iX22;
                    int i16 = cursorH.getInt(i15);
                    iX22 = i15;
                    int i17 = iX23;
                    String string4 = cursorH.isNull(i17) ? null : cursorH.getString(i17);
                    iX23 = i17;
                    int i18 = iX24;
                    int iV = uc5.v(cursorH.getInt(i18));
                    iX24 = i18;
                    int i19 = iX25;
                    o53 o53VarA0 = uc5.a0(cursorH.getBlob(i19));
                    iX25 = i19;
                    int i20 = iX26;
                    boolean z2 = cursorH.getInt(i20) != 0;
                    iX26 = i20;
                    int i21 = iX27;
                    boolean z3 = cursorH.getInt(i21) != 0;
                    iX27 = i21;
                    int i22 = iX28;
                    boolean z4 = cursorH.getInt(i22) != 0;
                    iX28 = i22;
                    int i23 = iX29;
                    boolean z5 = cursorH.getInt(i23) != 0;
                    iX29 = i23;
                    int i24 = iX30;
                    long j9 = cursorH.getLong(i24);
                    iX30 = i24;
                    int i25 = iX31;
                    long j10 = cursorH.getLong(i25);
                    iX31 = i25;
                    int i26 = iX32;
                    iX32 = i26;
                    arrayList.add(new dd5(string, iX33, string2, string3, oh0VarA, oh0VarA2, j, j2, j3, new mc0(o53VarA0, iV, z2, z3, z4, z5, j9, j10, uc5.b(cursorH.getBlob(i26))), i3, iU, j4, j5, j6, j7, z, iW, i9, i11, j8, i14, i16, string4));
                }
                cursorH.close();
                w24Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorH.close();
                w24Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            w24Var = w24VarB;
        }
    }

    public final ArrayList d() throws Throwable {
        w24 w24Var;
        w24 w24VarB = w24.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = e35.x(cursorH, "id");
            int iX2 = e35.x(cursorH, "state");
            int iX3 = e35.x(cursorH, "worker_class_name");
            int iX4 = e35.x(cursorH, "input_merger_class_name");
            int iX5 = e35.x(cursorH, "input");
            int iX6 = e35.x(cursorH, "output");
            int iX7 = e35.x(cursorH, "initial_delay");
            int iX8 = e35.x(cursorH, "interval_duration");
            int iX9 = e35.x(cursorH, "flex_duration");
            int iX10 = e35.x(cursorH, "run_attempt_count");
            int iX11 = e35.x(cursorH, "backoff_policy");
            int iX12 = e35.x(cursorH, "backoff_delay_duration");
            int iX13 = e35.x(cursorH, "last_enqueue_time");
            int iX14 = e35.x(cursorH, "minimum_retention_duration");
            w24Var = w24VarB;
            try {
                int iX15 = e35.x(cursorH, "schedule_requested_at");
                int iX16 = e35.x(cursorH, "run_in_foreground");
                int iX17 = e35.x(cursorH, "out_of_quota_policy");
                int iX18 = e35.x(cursorH, "period_count");
                int iX19 = e35.x(cursorH, "generation");
                int iX20 = e35.x(cursorH, "next_schedule_time_override");
                int iX21 = e35.x(cursorH, "next_schedule_time_override_generation");
                int iX22 = e35.x(cursorH, "stop_reason");
                int iX23 = e35.x(cursorH, "trace_tag");
                int iX24 = e35.x(cursorH, "required_network_type");
                int iX25 = e35.x(cursorH, "required_network_request");
                int iX26 = e35.x(cursorH, "requires_charging");
                int iX27 = e35.x(cursorH, "requires_device_idle");
                int iX28 = e35.x(cursorH, "requires_battery_not_low");
                int iX29 = e35.x(cursorH, "requires_storage_not_low");
                int iX30 = e35.x(cursorH, "trigger_content_update_delay");
                int iX31 = e35.x(cursorH, "trigger_max_content_delay");
                int iX32 = e35.x(cursorH, "content_uri_triggers");
                int i = iX14;
                ArrayList arrayList = new ArrayList(cursorH.getCount());
                while (cursorH.moveToNext()) {
                    String string = cursorH.getString(iX);
                    int iX33 = uc5.x(cursorH.getInt(iX2));
                    String string2 = cursorH.getString(iX3);
                    String string3 = cursorH.getString(iX4);
                    oh0 oh0VarA = oh0.a(cursorH.getBlob(iX5));
                    oh0 oh0VarA2 = oh0.a(cursorH.getBlob(iX6));
                    long j = cursorH.getLong(iX7);
                    long j2 = cursorH.getLong(iX8);
                    long j3 = cursorH.getLong(iX9);
                    int i2 = cursorH.getInt(iX10);
                    int iU = uc5.u(cursorH.getInt(iX11));
                    long j4 = cursorH.getLong(iX12);
                    long j5 = cursorH.getLong(iX13);
                    int i3 = i;
                    long j6 = cursorH.getLong(i3);
                    i = i3;
                    int i4 = iX15;
                    long j7 = cursorH.getLong(i4);
                    iX15 = i4;
                    int i5 = iX16;
                    boolean z = cursorH.getInt(i5) != 0;
                    iX16 = i5;
                    int i6 = iX17;
                    int iW = uc5.w(cursorH.getInt(i6));
                    iX17 = i6;
                    int i7 = iX18;
                    int i8 = cursorH.getInt(i7);
                    iX18 = i7;
                    int i9 = iX19;
                    int i10 = cursorH.getInt(i9);
                    iX19 = i9;
                    int i11 = iX20;
                    long j8 = cursorH.getLong(i11);
                    iX20 = i11;
                    int i12 = iX21;
                    int i13 = cursorH.getInt(i12);
                    iX21 = i12;
                    int i14 = iX22;
                    int i15 = cursorH.getInt(i14);
                    iX22 = i14;
                    int i16 = iX23;
                    String string4 = cursorH.isNull(i16) ? null : cursorH.getString(i16);
                    iX23 = i16;
                    int i17 = iX24;
                    int iV = uc5.v(cursorH.getInt(i17));
                    iX24 = i17;
                    int i18 = iX25;
                    o53 o53VarA0 = uc5.a0(cursorH.getBlob(i18));
                    iX25 = i18;
                    int i19 = iX26;
                    boolean z2 = cursorH.getInt(i19) != 0;
                    iX26 = i19;
                    int i20 = iX27;
                    boolean z3 = cursorH.getInt(i20) != 0;
                    iX27 = i20;
                    int i21 = iX28;
                    boolean z4 = cursorH.getInt(i21) != 0;
                    iX28 = i21;
                    int i22 = iX29;
                    boolean z5 = cursorH.getInt(i22) != 0;
                    iX29 = i22;
                    int i23 = iX30;
                    long j9 = cursorH.getLong(i23);
                    iX30 = i23;
                    int i24 = iX31;
                    long j10 = cursorH.getLong(i24);
                    iX31 = i24;
                    int i25 = iX32;
                    iX32 = i25;
                    arrayList.add(new dd5(string, iX33, string2, string3, oh0VarA, oh0VarA2, j, j2, j3, new mc0(o53VarA0, iV, z2, z3, z4, z5, j9, j10, uc5.b(cursorH.getBlob(i25))), i2, iU, j4, j5, j6, j7, z, iW, i8, i10, j8, i13, i15, string4));
                }
                cursorH.close();
                w24Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorH.close();
                w24Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            w24Var = w24VarB;
        }
    }

    public final ArrayList e() throws Throwable {
        w24 w24Var;
        w24 w24VarB = w24.b(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = e35.x(cursorH, "id");
            int iX2 = e35.x(cursorH, "state");
            int iX3 = e35.x(cursorH, "worker_class_name");
            int iX4 = e35.x(cursorH, "input_merger_class_name");
            int iX5 = e35.x(cursorH, "input");
            int iX6 = e35.x(cursorH, "output");
            int iX7 = e35.x(cursorH, "initial_delay");
            int iX8 = e35.x(cursorH, "interval_duration");
            int iX9 = e35.x(cursorH, "flex_duration");
            int iX10 = e35.x(cursorH, "run_attempt_count");
            int iX11 = e35.x(cursorH, "backoff_policy");
            int iX12 = e35.x(cursorH, "backoff_delay_duration");
            int iX13 = e35.x(cursorH, "last_enqueue_time");
            int iX14 = e35.x(cursorH, "minimum_retention_duration");
            w24Var = w24VarB;
            try {
                int iX15 = e35.x(cursorH, "schedule_requested_at");
                int iX16 = e35.x(cursorH, "run_in_foreground");
                int iX17 = e35.x(cursorH, "out_of_quota_policy");
                int iX18 = e35.x(cursorH, "period_count");
                int iX19 = e35.x(cursorH, "generation");
                int iX20 = e35.x(cursorH, "next_schedule_time_override");
                int iX21 = e35.x(cursorH, "next_schedule_time_override_generation");
                int iX22 = e35.x(cursorH, "stop_reason");
                int iX23 = e35.x(cursorH, "trace_tag");
                int iX24 = e35.x(cursorH, "required_network_type");
                int iX25 = e35.x(cursorH, "required_network_request");
                int iX26 = e35.x(cursorH, "requires_charging");
                int iX27 = e35.x(cursorH, "requires_device_idle");
                int iX28 = e35.x(cursorH, "requires_battery_not_low");
                int iX29 = e35.x(cursorH, "requires_storage_not_low");
                int iX30 = e35.x(cursorH, "trigger_content_update_delay");
                int iX31 = e35.x(cursorH, "trigger_max_content_delay");
                int iX32 = e35.x(cursorH, "content_uri_triggers");
                int i = iX14;
                ArrayList arrayList = new ArrayList(cursorH.getCount());
                while (cursorH.moveToNext()) {
                    String string = cursorH.getString(iX);
                    int iX33 = uc5.x(cursorH.getInt(iX2));
                    String string2 = cursorH.getString(iX3);
                    String string3 = cursorH.getString(iX4);
                    oh0 oh0VarA = oh0.a(cursorH.getBlob(iX5));
                    oh0 oh0VarA2 = oh0.a(cursorH.getBlob(iX6));
                    long j = cursorH.getLong(iX7);
                    long j2 = cursorH.getLong(iX8);
                    long j3 = cursorH.getLong(iX9);
                    int i2 = cursorH.getInt(iX10);
                    int iU = uc5.u(cursorH.getInt(iX11));
                    long j4 = cursorH.getLong(iX12);
                    long j5 = cursorH.getLong(iX13);
                    int i3 = i;
                    long j6 = cursorH.getLong(i3);
                    i = i3;
                    int i4 = iX15;
                    long j7 = cursorH.getLong(i4);
                    iX15 = i4;
                    int i5 = iX16;
                    boolean z = cursorH.getInt(i5) != 0;
                    iX16 = i5;
                    int i6 = iX17;
                    int iW = uc5.w(cursorH.getInt(i6));
                    iX17 = i6;
                    int i7 = iX18;
                    int i8 = cursorH.getInt(i7);
                    iX18 = i7;
                    int i9 = iX19;
                    int i10 = cursorH.getInt(i9);
                    iX19 = i9;
                    int i11 = iX20;
                    long j8 = cursorH.getLong(i11);
                    iX20 = i11;
                    int i12 = iX21;
                    int i13 = cursorH.getInt(i12);
                    iX21 = i12;
                    int i14 = iX22;
                    int i15 = cursorH.getInt(i14);
                    iX22 = i14;
                    int i16 = iX23;
                    String string4 = cursorH.isNull(i16) ? null : cursorH.getString(i16);
                    iX23 = i16;
                    int i17 = iX24;
                    int iV = uc5.v(cursorH.getInt(i17));
                    iX24 = i17;
                    int i18 = iX25;
                    o53 o53VarA0 = uc5.a0(cursorH.getBlob(i18));
                    iX25 = i18;
                    int i19 = iX26;
                    boolean z2 = cursorH.getInt(i19) != 0;
                    iX26 = i19;
                    int i20 = iX27;
                    boolean z3 = cursorH.getInt(i20) != 0;
                    iX27 = i20;
                    int i21 = iX28;
                    boolean z4 = cursorH.getInt(i21) != 0;
                    iX28 = i21;
                    int i22 = iX29;
                    boolean z5 = cursorH.getInt(i22) != 0;
                    iX29 = i22;
                    int i23 = iX30;
                    long j9 = cursorH.getLong(i23);
                    iX30 = i23;
                    int i24 = iX31;
                    long j10 = cursorH.getLong(i24);
                    iX31 = i24;
                    int i25 = iX32;
                    iX32 = i25;
                    arrayList.add(new dd5(string, iX33, string2, string3, oh0VarA, oh0VarA2, j, j2, j3, new mc0(o53VarA0, iV, z2, z3, z4, z5, j9, j10, uc5.b(cursorH.getBlob(i25))), i2, iU, j4, j5, j6, j7, z, iW, i8, i10, j8, i13, i15, string4));
                }
                cursorH.close();
                w24Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorH.close();
                w24Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            w24Var = w24VarB;
        }
    }

    public final ArrayList f() {
        w24 w24Var;
        w24 w24VarB = w24.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = e35.x(cursorH, "id");
            int iX2 = e35.x(cursorH, "state");
            int iX3 = e35.x(cursorH, "worker_class_name");
            int iX4 = e35.x(cursorH, "input_merger_class_name");
            int iX5 = e35.x(cursorH, "input");
            int iX6 = e35.x(cursorH, "output");
            int iX7 = e35.x(cursorH, "initial_delay");
            int iX8 = e35.x(cursorH, "interval_duration");
            int iX9 = e35.x(cursorH, "flex_duration");
            int iX10 = e35.x(cursorH, "run_attempt_count");
            int iX11 = e35.x(cursorH, "backoff_policy");
            int iX12 = e35.x(cursorH, "backoff_delay_duration");
            int iX13 = e35.x(cursorH, "last_enqueue_time");
            int iX14 = e35.x(cursorH, "minimum_retention_duration");
            w24Var = w24VarB;
            try {
                int iX15 = e35.x(cursorH, "schedule_requested_at");
                int iX16 = e35.x(cursorH, "run_in_foreground");
                int iX17 = e35.x(cursorH, "out_of_quota_policy");
                int iX18 = e35.x(cursorH, "period_count");
                int iX19 = e35.x(cursorH, "generation");
                int iX20 = e35.x(cursorH, "next_schedule_time_override");
                int iX21 = e35.x(cursorH, "next_schedule_time_override_generation");
                int iX22 = e35.x(cursorH, "stop_reason");
                int iX23 = e35.x(cursorH, "trace_tag");
                int iX24 = e35.x(cursorH, "required_network_type");
                int iX25 = e35.x(cursorH, "required_network_request");
                int iX26 = e35.x(cursorH, "requires_charging");
                int iX27 = e35.x(cursorH, "requires_device_idle");
                int iX28 = e35.x(cursorH, "requires_battery_not_low");
                int iX29 = e35.x(cursorH, "requires_storage_not_low");
                int iX30 = e35.x(cursorH, "trigger_content_update_delay");
                int iX31 = e35.x(cursorH, "trigger_max_content_delay");
                int iX32 = e35.x(cursorH, "content_uri_triggers");
                int i = iX14;
                ArrayList arrayList = new ArrayList(cursorH.getCount());
                while (cursorH.moveToNext()) {
                    String string = cursorH.getString(iX);
                    int iX33 = uc5.x(cursorH.getInt(iX2));
                    String string2 = cursorH.getString(iX3);
                    String string3 = cursorH.getString(iX4);
                    oh0 oh0VarA = oh0.a(cursorH.getBlob(iX5));
                    oh0 oh0VarA2 = oh0.a(cursorH.getBlob(iX6));
                    long j = cursorH.getLong(iX7);
                    long j2 = cursorH.getLong(iX8);
                    long j3 = cursorH.getLong(iX9);
                    int i2 = cursorH.getInt(iX10);
                    int iU = uc5.u(cursorH.getInt(iX11));
                    long j4 = cursorH.getLong(iX12);
                    long j5 = cursorH.getLong(iX13);
                    int i3 = i;
                    long j6 = cursorH.getLong(i3);
                    i = i3;
                    int i4 = iX15;
                    long j7 = cursorH.getLong(i4);
                    iX15 = i4;
                    int i5 = iX16;
                    boolean z = cursorH.getInt(i5) != 0;
                    iX16 = i5;
                    int i6 = iX17;
                    int iW = uc5.w(cursorH.getInt(i6));
                    iX17 = i6;
                    int i7 = iX18;
                    int i8 = cursorH.getInt(i7);
                    iX18 = i7;
                    int i9 = iX19;
                    int i10 = cursorH.getInt(i9);
                    iX19 = i9;
                    int i11 = iX20;
                    long j8 = cursorH.getLong(i11);
                    iX20 = i11;
                    int i12 = iX21;
                    int i13 = cursorH.getInt(i12);
                    iX21 = i12;
                    int i14 = iX22;
                    int i15 = cursorH.getInt(i14);
                    iX22 = i14;
                    int i16 = iX23;
                    String string4 = cursorH.isNull(i16) ? null : cursorH.getString(i16);
                    iX23 = i16;
                    int i17 = iX24;
                    int iV = uc5.v(cursorH.getInt(i17));
                    iX24 = i17;
                    int i18 = iX25;
                    o53 o53VarA0 = uc5.a0(cursorH.getBlob(i18));
                    iX25 = i18;
                    int i19 = iX26;
                    boolean z2 = cursorH.getInt(i19) != 0;
                    iX26 = i19;
                    int i20 = iX27;
                    boolean z3 = cursorH.getInt(i20) != 0;
                    iX27 = i20;
                    int i21 = iX28;
                    boolean z4 = cursorH.getInt(i21) != 0;
                    iX28 = i21;
                    int i22 = iX29;
                    boolean z5 = cursorH.getInt(i22) != 0;
                    iX29 = i22;
                    int i23 = iX30;
                    long j9 = cursorH.getLong(i23);
                    iX30 = i23;
                    int i24 = iX31;
                    long j10 = cursorH.getLong(i24);
                    iX31 = i24;
                    int i25 = iX32;
                    iX32 = i25;
                    arrayList.add(new dd5(string, iX33, string2, string3, oh0VarA, oh0VarA2, j, j2, j3, new mc0(o53VarA0, iV, z2, z3, z4, z5, j9, j10, uc5.b(cursorH.getBlob(i25))), i2, iU, j4, j5, j6, j7, z, iW, i8, i10, j8, i13, i15, string4));
                }
                cursorH.close();
                w24Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorH.close();
                w24Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            w24Var = w24VarB;
        }
    }

    public final int g(String str) {
        w24 w24VarB = w24.b(1, "SELECT state FROM workspec WHERE id=?");
        w24VarB.h(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = 0;
            if (cursorH.moveToFirst()) {
                Integer numValueOf = cursorH.isNull(0) ? null : Integer.valueOf(cursorH.getInt(0));
                if (numValueOf != null) {
                    iX = uc5.x(numValueOf.intValue());
                }
            }
            return iX;
        } finally {
            cursorH.close();
            w24VarB.j();
        }
    }

    public final dd5 h(String str) throws Throwable {
        w24 w24Var;
        w24 w24VarB = w24.b(1, "SELECT * FROM workspec WHERE id=?");
        w24VarB.h(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int iX = e35.x(cursorH, "id");
            int iX2 = e35.x(cursorH, "state");
            int iX3 = e35.x(cursorH, "worker_class_name");
            int iX4 = e35.x(cursorH, "input_merger_class_name");
            int iX5 = e35.x(cursorH, "input");
            int iX6 = e35.x(cursorH, "output");
            int iX7 = e35.x(cursorH, "initial_delay");
            int iX8 = e35.x(cursorH, "interval_duration");
            int iX9 = e35.x(cursorH, "flex_duration");
            int iX10 = e35.x(cursorH, "run_attempt_count");
            int iX11 = e35.x(cursorH, "backoff_policy");
            int iX12 = e35.x(cursorH, "backoff_delay_duration");
            int iX13 = e35.x(cursorH, "last_enqueue_time");
            int iX14 = e35.x(cursorH, "minimum_retention_duration");
            w24Var = w24VarB;
            try {
                int iX15 = e35.x(cursorH, "schedule_requested_at");
                int iX16 = e35.x(cursorH, "run_in_foreground");
                int iX17 = e35.x(cursorH, "out_of_quota_policy");
                int iX18 = e35.x(cursorH, "period_count");
                int iX19 = e35.x(cursorH, "generation");
                int iX20 = e35.x(cursorH, "next_schedule_time_override");
                int iX21 = e35.x(cursorH, "next_schedule_time_override_generation");
                int iX22 = e35.x(cursorH, "stop_reason");
                int iX23 = e35.x(cursorH, "trace_tag");
                int iX24 = e35.x(cursorH, "required_network_type");
                int iX25 = e35.x(cursorH, "required_network_request");
                int iX26 = e35.x(cursorH, "requires_charging");
                int iX27 = e35.x(cursorH, "requires_device_idle");
                int iX28 = e35.x(cursorH, "requires_battery_not_low");
                int iX29 = e35.x(cursorH, "requires_storage_not_low");
                int iX30 = e35.x(cursorH, "trigger_content_update_delay");
                int iX31 = e35.x(cursorH, "trigger_max_content_delay");
                int iX32 = e35.x(cursorH, "content_uri_triggers");
                dd5 dd5Var = null;
                if (cursorH.moveToFirst()) {
                    dd5Var = new dd5(cursorH.getString(iX), uc5.x(cursorH.getInt(iX2)), cursorH.getString(iX3), cursorH.getString(iX4), oh0.a(cursorH.getBlob(iX5)), oh0.a(cursorH.getBlob(iX6)), cursorH.getLong(iX7), cursorH.getLong(iX8), cursorH.getLong(iX9), new mc0(uc5.a0(cursorH.getBlob(iX25)), uc5.v(cursorH.getInt(iX24)), cursorH.getInt(iX26) != 0, cursorH.getInt(iX27) != 0, cursorH.getInt(iX28) != 0, cursorH.getInt(iX29) != 0, cursorH.getLong(iX30), cursorH.getLong(iX31), uc5.b(cursorH.getBlob(iX32))), cursorH.getInt(iX10), uc5.u(cursorH.getInt(iX11)), cursorH.getLong(iX12), cursorH.getLong(iX13), cursorH.getLong(iX14), cursorH.getLong(iX15), cursorH.getInt(iX16) != 0, uc5.w(cursorH.getInt(iX17)), cursorH.getInt(iX18), cursorH.getInt(iX19), cursorH.getLong(iX20), cursorH.getInt(iX21), cursorH.getInt(iX22), cursorH.isNull(iX23) ? null : cursorH.getString(iX23));
                }
                cursorH.close();
                w24Var.j();
                return dd5Var;
            } catch (Throwable th) {
                th = th;
                cursorH.close();
                w24Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            w24Var = w24VarB;
        }
    }

    public final ArrayList i(String str) {
        w24 w24VarB = w24.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        w24VarB.h(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            ArrayList arrayList = new ArrayList(cursorH.getCount());
            while (cursorH.moveToNext()) {
                String string = cursorH.getString(0);
                int iX = uc5.x(cursorH.getInt(1));
                string.getClass();
                cd5 cd5Var = new cd5();
                cd5Var.a = string;
                cd5Var.b = iX;
                arrayList.add(cd5Var);
            }
            cursorH.close();
            w24VarB.j();
            return arrayList;
        } catch (Throwable th) {
            cursorH.close();
            w24VarB.j();
            throw th;
        }
    }

    public final void j(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.l;
        df1 df1VarA = aq4Var.a();
        df1VarA.c(1, j);
        df1VarA.h(2, str);
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

    public final void k(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.k;
        df1 df1VarA = aq4Var.a();
        df1VarA.h(1, str);
        df1VarA.c(2, i);
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

    public final void l(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.h;
        df1 df1VarA = aq4Var.a();
        df1VarA.c(1, j);
        df1VarA.h(2, str);
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

    public final void m(String str, oh0 oh0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.g;
        df1 df1VarA = aq4Var.a();
        oh0 oh0Var2 = oh0.b;
        df1VarA.x(1, bu.E(oh0Var));
        df1VarA.h(2, str);
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

    public final void n(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.d;
        df1 df1VarA = aq4Var.a();
        df1VarA.c(1, uc5.X(i));
        df1VarA.h(2, str);
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

    public final void o(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aq4 aq4Var = this.n;
        df1 df1VarA = aq4Var.a();
        df1VarA.c(1, i);
        df1VarA.h(2, str);
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
}
