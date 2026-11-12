package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ei0(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int r0 = this.a;
        int r3 = 0;
        boolean r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        Object r5 = null;
        Object r6 = this.c;
        Object r12 = this.b;
        switch(r0) {
            case 0: goto L132;
            case 1: goto L112;
            case 2: goto L92;
            case 3: goto L70;
            default: goto L4;
        };
    L4:
        pd5 r13 = (pd5) r12;
        td5 r7 = (td5) r6;
        String r1 = r7.c;
        fd5 r2 = r7.i;
        if ((r13 instanceof nd5) == false) goto L57;
        nc2 r14 = ((nd5) r13).a;
        int r8 = r2.g(r1);
        yc5 r9 = r7.h.z();
        WorkDatabase_Impl r10 = (WorkDatabase_Impl) r9.n;
        r10.b();
        aq4 r11 = (aq4) r9.o;
        df1 r15 = r11.a();
        r15.h(1, r1);
        r10.c();     // Catch: Throwable -> L48
        r15.b();     // Catch: Throwable -> L50
        r10.t();     // Catch: Throwable -> L50
        r10.o();     // Catch: Throwable -> L48
        r11.h(r15);
        if (r8 == 0) goto L163;
        if (r8 != 2) goto L46;
        dd5 r16 = r7.a;
        String r17 = r7.l;
        if ((r14 instanceof mc2) == false) goto L38;
        String r18 = ud5.a;
        cx.f().g(r18, "Worker result SUCCESS for " + r17);
        if (r16.d() == false) goto L19;
        r7.c();
        goto L163
    L19:
        r2.n(3, r1);
        oh0 r19 = ((mc2) r14).a;
        r19.getClass();
        r2.m(r1, r19);
        r7.f.getClass();
        long r20 = System.currentTimeMillis();
        wo0 r110 = r7.j;
        ArrayList r21 = r110.w(r1);
        int r22 = r21.size();
        int r23 = 0;
    L20:
        if (r23 >= r22) goto L163;
        Object r24 = r21.get(r23);
        r23 = r23 + 1;
        String r25 = (String) r24;
        if (r2.g(r25) != 5) goto L20;
        w24 r26 = w24.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        r26.h(1, r25);
        WorkDatabase_Impl r111 = (WorkDatabase_Impl) r110.n;
        r111.b();
        Cursor r112 = xl.H(r111, r26);
    L29:
        th = move-exception;
        r112.close();
        r26.j();
        throw th;
    L25:
        if (r112.moveToFirst() == false) goto L31;
        if (r112.getInt(0) == 0) goto L31;
        Object[] r113 = true;
    L32:
        r112.close();
        r26.j();
        if (r113 == false) goto L20;
        cx.f().g(ud5.a, "Setting status to enqueued for ".concat(r25));
        r2.n(1, r25);
        r2.l(r25, r20);
    L31:
        r113 = false;
        goto L32
    L38:
        if ((r14 instanceof lc2) == false) goto L41;
        String r114 = ud5.a;
        cx.f().g(r114, "Worker result RETRY for " + r17);
        r7.b(-256);
    L40:
        r4 = true;
        goto L163
    L41:
        String r27 = ud5.a;
        cx.f().g(r27, "Worker result FAILURE for " + r17);
        if (r16.d() == false) goto L44;
        r7.c();
        goto L163
    L44:
        r7.d(r14);
        goto L163
    L46:
        if (f34.c(r8) == true) goto L163;
        r7.b(-512);
    L163:
        return Boolean.valueOf(r4);
    L50:
        th = move-exception;
        r10.o();     // Catch: Throwable -> L48
        throw th;     // Catch: Throwable -> L48
    L48:
        th = move-exception;
        r11.h(r15);
        throw th;
    L57:
        if ((r13 instanceof md5) == false) goto L60;
        r7.d(((md5) r13).a);
        goto L163
    L60:
        if ((r13 instanceof od5) == false) goto L68;
        int r115 = ((od5) r13).a;
        int r28 = r2.g(r1);
        if (r28 != 0) goto L64;
    L66:
        String r116 = ud5.a;
        cx r29 = cx.f();
        StringBuilder r30 = xa3.j("Status for ", r1, " is ");
        r30.append(f34.q(r28));
        r30.append(" ; not doing any work");
        r29.b(r116, r30.toString());
        goto L163
    L64:
        if (f34.c(r28) == true) goto L66;
        String r31 = ud5.a;
        cx r32 = cx.f();
        StringBuilder r33 = xa3.j("Status for ", r1, " is ");
        r33.append(f34.q(r28));
        r33.append("; not doing any work and rescheduling for later execution");
        r32.b(r31, r33.toString());
        r2.n(1, r1);
        r2.o(r115, r1);
        r2.j(r1, -1);
        goto L40
    L68:
        er1.n();
        return null;
    L70:
        String r117 = (String) r12;
        f25 r34 = (f25) r6;
        r34.getClass();
        o83 r35 = (o83) r34.b.getValue();     // Catch: Exception -> L83
        nz3 r36 = new nz3();     // Catch: Exception -> L83
        r36.d(r117);     // Catch: Exception -> L83
        oz3 r37 = new oz3(r36);     // Catch: Exception -> L83
        r35.getClass();     // Catch: Exception -> L83
        k14 r38 = new bv3(r35, r37).c();     // Catch: Exception -> L83
        n14 r39 = r38.t;     // Catch: Throwable -> L78
        if (r38.C == true) goto L76;
    L74:
        String r40 = null;
    L81:
        r38.close();     // Catch: Exception -> L83
        r5 = r40;
    L91:
        return new kd3(r117, r5);
    L76:
        if (r39.source().G(1048577) == false) goto L80;
        Log.w("UpnpControlPoint", "description is over 1048576 bytes, ignoring it: ".concat(r117));     // Catch: Throwable -> L78
        goto L74
    L80:
        r40 = r39.string();     // Catch: Throwable -> L78
    L78:
        th = move-exception;
        throw th;     // Catch: Throwable -> L86
    L86:
        th = move-exception;
        q05.h(r38, th);     // Catch: Exception -> L83
        throw th;     // Catch: Exception -> L83
    L83:
        e = move-exception;
        Log.w("UpnpControlPoint", "GET failed: " + r117, e);
        goto L91
    L92:
        String r41 = (String) r6;
        ApiResponse r118 = (ApiResponse) ((gp3) r12).m(r41).execute().body();     // Catch: Throwable -> L99
        if (r118 == null) goto L101;
        SubsonicResponse r119 = r118.getSubsonicResponse();     // Catch: Throwable -> L99
        if (r119 == null) goto L101;
        Object r120 = r119.getSong();     // Catch: Throwable -> L99
    L103:
        Throwable r42 = bb3.a(r120);
        if (r42 == null) goto L107;
        Log.w("HubPlayer", "getSong(" + r41 + ")", r42);
    L107:
        if ((r120 instanceof s14) == true) goto L111;
        r5 = r120;
    L111:
        return (Child) r5;
    L101:
        r120 = null;
    L99:
        th = move-exception;
        r120 = new s14(th);
        goto L103
    L112:
        fi0 r121 = (fi0) r12;
        Uri r43 = (Uri) r6;
        ci0 r44 = r121.o.m();
        int r45 = r121.p;
        boolean r122 = r121.q;
        zj0 r46 = (zj0) r44;     // Catch: Throwable -> L129
        r46.b(new ii0(r43, 0, -1));     // Catch: Throwable -> L129
        byte[] r47 = new byte[1024];     // Catch: Throwable -> L129
        int r48 = 0;
    L115:
        if (r3 == (-1)) goto L122;
        if (r48 != r47.length) goto L119;
        r47 = Arrays.copyOf(r47, r47.length * 2);     // Catch: Throwable -> L129
    L119:
        r3 = r46.read(r47, r48, r47.length - r48);     // Catch: Throwable -> L129
        if (r3 == (-1)) goto L115;
        r48 = r48 + r3;     // Catch: Throwable -> L129
        goto L115
    L122:
        byte[] r49 = Arrays.copyOf(r47, r48);     // Catch: Throwable -> L129
        Bitmap r50 = gb.s(r49, r49.length, r45);     // Catch: Throwable -> L129
        if (r122 == true) goto L125;
    L127:
        r46.close();
        return r50;
    L125:
        if (Build.VERSION.SDK_INT < 31) goto L127;
        r50 = db.c(r50);     // Catch: Throwable -> L129
    L129:
        th = move-exception;
        ((zj0) r44).close();
        throw th;
    L132:
        fi0 r123 = (fi0) r12;
        byte[] r51 = (byte[]) r6;
        boolean r52 = r123.q;
        Bitmap r124 = gb.s(r51, r51.length, r123.p);
        if (r52 == true) goto L135;
        return r124;
    L135:
        if (Build.VERSION.SDK_INT >= 31) goto L137;
        return r124;
    L137:
        return db.c(r124);
    }
}
