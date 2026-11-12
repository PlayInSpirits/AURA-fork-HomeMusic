package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.eddyizm.tempus.homemusic.PlayEvent;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements yf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ lc(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.yf1
    public final Object d(Object r19, Object r20, Object r21, Object r22) {
        int r1 = this.n;
        Object r0 = this.o;
        switch(r1) {
            case 0: goto L20;
            case 1: goto L18;
            default: goto L4;
        };
    L4:
        LinkedHashMap r2 = ((ps1) r0).o;
        String r3 = (String) r19;
        oh3 r4 = (oh3) r20;
        Long r6 = (Long) r21;
        ((Long) r22).getClass();
        r3.getClass();
        r4.getClass();
        if (r3.equals(PlayEvent.START) == false) goto L7;
        String r5 = r4.f;
        b00 r7 = b00.a;
        r2.put(r5, b00.a());
    L7:
        ih3 r8 = PlayEvent.Companion;
        String r9 = r4.a;
        String r10 = rs1.f();
        long r11 = System.currentTimeMillis();
        Long r12 = Long.valueOf(r4.b);
        String r13 = r4.c;
        String r14 = r4.f;
        rs1 r15 = rs1.a;
        String r16 = (String) rs1.k.getValue();
        Long r17 = Long.valueOf(r4.g);
        String r18 = (String) r2.get(r4.f);
        ag2 r110 = r4.d;
        k62 r23 = r4.e;
        String r111 = null;
        if (r23 == null) goto L10;
        String r24 = r23.a;
    L11:
        if (r23 == null) goto L13;
        r111 = r23.b;
    L13:
        r8.getClass();
        rs1.j(ih3.b(r3, r9, r10, r11, r6, r12, r13, r14, r16, r17, r18, r110, r24, r111));
        if (ti.t0(new String[]{PlayEvent.SKIP, PlayEvent.FINISH, "interrupted", "error"}).contains(r3) == false) goto L17;
        r2.remove(r4.f);
    L17:
        return j15.a;
    L10:
        r24 = null;
        goto L11
    L18:
        SQLiteDatabase r25 = (SQLiteDatabase) r19;
        SQLiteQuery r26 = (SQLiteQuery) r22;
        r26.getClass();
        ((wo4) r0).n(new cf1(r26));
        return new SQLiteCursor((SQLiteCursorDriver) r20, (String) r21, r26);
    L20:
        mc r27 = (mc) r0;
        n05 r28 = ((ia1) r27.r).b((vk0) r19, (gb1) r20, ((eb1) r21).a, ((fb1) r22).a);
        if ((r28 instanceof n05) == true) goto L23;
        z05 r29 = new z05(r28, r27.w);
        r27.w = r29;
        Object r30 = r29.q;
        r30.getClass();
        return (Typeface) r30;
    L23:
        Object r31 = r28.n;
        r31.getClass();
        return (Typeface) r31;
    }
}
