package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.bq4;
import defpackage.cx;
import defpackage.dd5;
import defpackage.e35;
import defpackage.fd5;
import defpackage.hd5;
import defpackage.kp0;
import defpackage.mc0;
import defpackage.mc2;
import defpackage.nc2;
import defpackage.o53;
import defpackage.oh0;
import defpackage.sc5;
import defpackage.uc5;
import defpackage.w24;
import defpackage.xc5;
import defpackage.xl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final nc2 d() throws Throwable {
        w24 w24Var;
        bq4 bq4Var;
        xc5 xc5Var;
        hd5 hd5Var;
        sc5 sc5VarB = sc5.b(this.a);
        WorkDatabase workDatabase = sc5VarB.c;
        workDatabase.getClass();
        fd5 fd5VarA = workDatabase.A();
        xc5 xc5VarY = workDatabase.y();
        hd5 hd5VarB = workDatabase.B();
        bq4 bq4VarX = workDatabase.x();
        sc5VarB.b.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        fd5VarA.getClass();
        w24 w24VarB = w24.b(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        w24VarB.c(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = fd5VarA.a;
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
            w24Var = w24VarB;
            try {
                int iX12 = e35.x(cursorH, "backoff_delay_duration");
                int iX13 = e35.x(cursorH, "last_enqueue_time");
                int iX14 = e35.x(cursorH, "minimum_retention_duration");
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
                    int i4 = iX10;
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
                    arrayList.add(new dd5(string, iX33, string2, string3, oh0VarA, oh0VarA2, j, j2, j3, new mc0(o53VarA0, iV, z2, z3, z4, z5, j9, j10, uc5.b(cursorH.getBlob(i26))), i2, iU, j4, j5, j6, j7, z, iW, i9, i11, j8, i14, i16, string4));
                    iX10 = i4;
                    i = i3;
                }
                cursorH.close();
                w24Var.j();
                ArrayList arrayListE = fd5VarA.e();
                ArrayList arrayListB = fd5VarA.b();
                if (arrayList.isEmpty()) {
                    bq4Var = bq4VarX;
                    xc5Var = xc5VarY;
                    hd5Var = hd5VarB;
                } else {
                    cx cxVarF = cx.f();
                    String str = kp0.a;
                    cxVarF.g(str, "Recently completed work:\n\n");
                    bq4Var = bq4VarX;
                    xc5Var = xc5VarY;
                    hd5Var = hd5VarB;
                    cx.f().g(str, kp0.a(xc5Var, hd5Var, bq4Var, arrayList));
                }
                if (!arrayListE.isEmpty()) {
                    cx cxVarF2 = cx.f();
                    String str2 = kp0.a;
                    cxVarF2.g(str2, "Running work:\n\n");
                    cx.f().g(str2, kp0.a(xc5Var, hd5Var, bq4Var, arrayListE));
                }
                if (!arrayListB.isEmpty()) {
                    cx cxVarF3 = cx.f();
                    String str3 = kp0.a;
                    cxVarF3.g(str3, "Enqueued work:\n\n");
                    cx.f().g(str3, kp0.a(xc5Var, hd5Var, bq4Var, arrayListB));
                }
                return new mc2();
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
}
