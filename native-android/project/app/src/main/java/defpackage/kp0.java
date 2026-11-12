package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp0 {
    public static final String a = null;

    static {
        a = cx.i("DiagnosticsWrkr");
    }

    public static final String a(xc5 r20, hd5 r21, bq4 r22, ArrayList r23) {
        StringBuilder r0 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int r1 = r23.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L29;
        Object r5 = r23.get(r3);
        r3 = r3 + 1;
        dd5 r6 = (dd5) r5;
        rc5 r7 = q05.m(r6);
        String r8 = r6.a;
        zp4 r9 = r22.k(r7);
        if (r9 == null) goto L7;
        Integer r10 = Integer.valueOf(r9.c);
    L8:
        r20.getClass();
        w24 r11 = w24.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
        r11.h(1, r8);
        WorkDatabase_Impl r12 = (WorkDatabase_Impl) r20.o;
        r12.b();
        Cursor r13 = xl.H(r12, r11);
        ArrayList r14 = new ArrayList(r13.getCount());     // Catch: Throwable -> L14
    L11:
        if (r13.moveToNext() == false) goto L16;
        r14.add(r13.getString(0));     // Catch: Throwable -> L14
        goto L11
    L16:
        r13.close();
        r11.j();
        String r15 = q40.B0(r14, ",", null, null, null, 62);
        String r16 = q40.B0(r21.j(r8), ",", null, null, null, 62);
        StringBuilder r17 = xa3.j("\n", r8, "\t ");
        r17.append(r6.c);
        r17.append("\t ");
        r17.append(r10);
        r17.append("\t ");
        switch(r6.b) {
            case 1: goto L24;
            case 2: goto L23;
            case 3: goto L22;
            case 4: goto L21;
            case 5: goto L20;
            case 6: goto L19;
            default: goto L18;
        };
    L19:
        String r18 = "CANCELLED";
    L25:
        r17.append(r18);
        r17.append("\t ");
        r17.append(r15);
        r17.append("\t ");
        r17.append(r16);
        r17.append('\t');
        r0.append(r17.toString());
        goto L3
    L20:
        r18 = "BLOCKED";
        goto L25
    L21:
        r18 = "FAILED";
        goto L25
    L22:
        r18 = "SUCCEEDED";
        goto L25
    L23:
        r18 = "RUNNING";
        goto L25
    L24:
        r18 = "ENQUEUED";
        goto L25
    L18:
        throw null;
    L14:
        th = move-exception;
        r13.close();
        r11.j();
        throw th;
    L7:
        r10 = null;
        goto L8
    L29:
        return r0.toString();
    }
}
