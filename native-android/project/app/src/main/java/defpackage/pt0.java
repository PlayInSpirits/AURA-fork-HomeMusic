package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Error;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pt0 {
    public static final AtomicBoolean a = null;

    static {
        a = new AtomicBoolean(false);
    }

    public static Child a(pn4 r4, String r5) {
        Response r6 = r4.c().m(r5).execute();
        if (r6.isSuccessful() == true) goto L5;
        StringBuilder r7 = xa3.j("getSong for ", r5, " returned HTTP ");
        r7.append(r6.code());
        throw new IOException(r7.toString());
    L5:
        if (r6.body() == null) goto L28;
        SubsonicResponse r8 = ((ApiResponse) r6.body()).getSubsonicResponse();
        if (r8 != null) goto L9;
        mj0.i(xa3.h("getSong for ", r5, " returned no subsonic response"));
        return null;
    L9:
        if (ResponseStatus.FAILED.equals(r8.getStatus()) == false) goto L21;
        Error r9 = r8.getError();
        if (r9 != null) goto L13;
    L19:
        mj0.i(xa3.h("getSong for ", r5, " failed without an error code"));
        return null;
    L13:
        if (r9.getCode() == null) goto L19;
        if (r9.getCode().intValue() != 70) goto L17;
        return null;
    L17:
        StringBuilder r10 = xa3.j("getSong for ", r5, " failed with ");
        r10.append(r9.getCode());
        r10.append(" ");
        r10.append(r9.getMessage());
        throw new IOException(r10.toString());
    L21:
        Child r11 = r8.getSong();
        if (r11 == null) goto L24;
        return r11;
    L24:
        mj0.i(xa3.h("getSong for ", r5, " succeeded without a song"));
        return null;
    L28:
        mj0.i(xa3.h("getSong for ", r5, " returned an empty body"));
        return null;
    }

    public static int b(Context r9, ss0 r10, ArrayList r11) {
        if (r11.isEmpty() == true) goto L17;
        ArrayList r0 = new ArrayList();
        int r2 = r11.size();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L15;
        Object r5 = r11.get(r3);
        r3 = r3 + 1;
        Download r6 = (Download) r5;
        if (((Download) xl.E((s24) r10.n, true, false, new rs0(r10, r6.getId()))) != null) goto L7;
        eu0 r4 = au0.w(r9);
        String r7 = r6.getId();
        r4.getClass();
        if (eu0.d(r7) == false) goto L7;
        r0.add(r6);
        goto L7
    L15:
        r11.clear();
        if (r0.isEmpty() == true) goto L17;
        xl.E((s24) r10.n, false, true, new o(7, r10, r0));
        return r0.size();
    L17:
        return 0;
    }

    public static boolean c() {
        if (ud3.y() == null) goto L5;
        return true;
    L5:
        if (ud3.J() != null) goto L7;
        return false;
    L7:
        if (ud3.B() != null) goto L14;
        return false;
    L14:
        return true;
    }

    public static void d(int r2) {
        App.b().getClass();
        App.c().edit().putInt("download_database_repaired_version", r2).apply();
    }

    public static void e(Context r23) {
        int r8 = AppDatabase.y().j().w().u();
        App.b().getClass();
        boolean r10 = false;
        if (App.c().getInt("download_database_repaired_version", 0) != r8) goto L6;
        return;
    L6:
        if (c() == true) goto L9;
        return;
    L9:
        monitor-enter(au0.class);
        au0.m(r23);     // Catch: Throwable -> L87
        lt0 r0 = au0.t;     // Catch: Throwable -> L87
        monitor-exit(au0.class);
        fk0 r1 = r0.b;
        ArrayList r9 = new ArrayList();
        ek0 r13 = r1.g(new int[]{3});     // Catch: Exception -> L25
    L97:
        Cursor r2 = r13.n;     // Catch: Throwable -> L21
        if (r2.moveToPosition(r2.getPosition() + 1) == false) goto L23;
        ns0 r3 = fk0.e(r13.n);     // Catch: Throwable -> L21
        if (r3.h.a <= 0) goto L97;
        tt0 r4 = r3.a;     // Catch: Throwable -> L21
        r9.add(new ot0(r4.n, r4.o.toString()));     // Catch: Throwable -> L21
    L23:
        r13.close();     // Catch: Exception -> L25
    L33:
        if (r9 == null) goto L122;
        ss0 r14 = AppDatabase.y().w();
        ArrayList r15 = new ArrayList();
        int r5 = r9.size();
        int r16 = 0;
    L36:
        if (r16 >= r5) goto L41;
        Object r17 = r9.get(r16);
        r16 = r16 + 1;
        ot0 r11 = (ot0) r17;
        int r19 = r5;
        int r20 = r8;
        if (((Download) xl.E((s24) r14.n, true, false, new rs0(r14, r11.a))) != null) goto L40;
        r15.add(r11);
    L40:
        r10 = false;
        r5 = r19;
        r8 = r20;
        goto L36
    L41:
        int r21 = r8;
        boolean r12 = r10;
        if (r15.isEmpty() == false) goto L45;
        d(r21);
        return;
    L45:
        pn4 r18 = App.f(r12);
        ArrayList r22 = new ArrayList();
        int r110 = r15.size();     // Catch: Throwable -> L83
        int r6 = 0;
        int r111 = 0;
        int r112 = 0;
        boolean r113 = false;
    L48:
        if (r6 >= r110) goto L73;
        r6 = r6 + 1;     // Catch: Throwable -> L53
        r110 = r110;
        ot0 r114 = (ot0) r15.get(r6);     // Catch: Throwable -> L53
        Child r7 = a(r18, r114.a);     // Catch: Throwable -> L53 IOException -> L66
    L51:
        if (r7 != null) goto L55;
        Log.d("DownloadRepair", "Skipped " + r114.a + ": the server no longer has it");     // Catch: Throwable -> L53
        pn4 r115 = r18;
    L58:
        r18 = r115;
        r112 = 0;
        goto L48
    L55:
        r115 = r18;
        if (r114.a.equals(r7.getId()) == true) goto L59;
        Log.w("DownloadRepair", "Skipped " + r114.a + ": the server answered with id " + r7.getId());     // Catch: Throwable -> L53
        goto L58
    L59:
        Download r24 = new Download(r7);     // Catch: Throwable -> L53
        r24.setDownloadState(1);     // Catch: Throwable -> L53
        r24.setDownloadUri(r114.b);     // Catch: Throwable -> L53
        Uri r25 = Uri.parse(r114.b);     // Catch: Throwable -> L53
        if (r25.isOpaque() == true) goto L63;
        e03.a(r24, r25.getQueryParameter("format"), r25.getQueryParameter("maxBitRate"));     // Catch: Throwable -> L53
    L63:
        r22.add(r24);     // Catch: Throwable -> L53
        if (r22.size() < 50) goto L58;
        r111 = r111 + b(r23, r14, r22);     // Catch: Throwable -> L53
    L66:
        e = move-exception;
        pn4 r116 = r18;
        r112 = r112 + 1;     // Catch: Throwable -> L53
        if (r112 >= 3) goto L70;
        Log.w("DownloadRepair", "Skipped " + r114.a, e);     // Catch: Throwable -> L53
        r18 = r116;
        r113 = true;
        goto L48
    L70:
        Log.w("DownloadRepair", "Stopped the repair, " + r112 + " failures in a row", e);     // Catch: Throwable -> L53
        StringBuilder r26 = f34.j(b(r23, r14, r22) + r111, "Restored ", " of ");
        r26.append(r15.size());
        r26.append(" download rows");
        Log.d("DownloadRepair", r26.toString());
        return;
    L53:
        th = th;
        int r117 = r111;
    L85:
        StringBuilder r27 = f34.j(b(r23, r14, r22) + r117, "Restored ", " of ");
        r27.append(r15.size());
        r27.append(" download rows");
        Log.d("DownloadRepair", r27.toString());
        throw th;
    L73:
        int r28 = b(r23, r14, r22) + r111;
        StringBuilder r29 = f34.j(r28, "Restored ", " of ");
        r29.append(r15.size());
        r29.append(" download rows");
        Log.d("DownloadRepair", r29.toString());
        if (r113 == true) goto L123;
        if (r28 <= 0) goto L79;
        d(r21);
        return;
    L79:
        App.b().getClass();
        int r30 = App.c().getInt("download_repair_attempts", 0) + 1;
        App.b().getClass();
        App.c().edit().putInt("download_repair_attempts", r30).apply();
        if (r30 < 3) goto L119;
        d(r21);
        return;
    L119:
        return;
    L123:
        return;
    L83:
        th = th;
        r117 = 0;
        goto L85
    L122:
        return;
    L21:
        th = move-exception;
        r13.close();     // Catch: Throwable -> L29
    L118:
        throw th;     // Catch: Exception -> L25
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L25
        throw th;     // Catch: Exception -> L25
    L25:
        e = move-exception;
        Log.w("DownloadRepair", "Failed to read the download index", e);
        r9 = null;
    L87:
        th = move-exception;
        throw th;
    }
}
