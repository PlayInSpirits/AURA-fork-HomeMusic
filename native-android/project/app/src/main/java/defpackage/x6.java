package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.AlbumWithSongsID3;
import com.eddyizm.tempus.subsonic.models.Error;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x6 {
    public static final AtomicBoolean a = null;
    public static final AtomicBoolean b = null;

    static {
        a = new AtomicBoolean(false);
        b = new AtomicBoolean(false);
    }

    public static void a() {
        int r6 = AppDatabase.y().j().w().u();
        App.b().getClass();
        int r8 = 0;
        if (App.c().getInt("album_artist_backfilled_version", 0) == r6) goto L102;
        App.b().getClass();
        if (App.c().getInt("album_artist_backfill_attempts_version", 0) == r6) goto L9;
        App.b().getClass();
        SharedPreferences r0 = App.c();
        r0.getClass();
        SharedPreferences.Editor r1 = r0.edit();
        r1.putInt("album_artist_backfill_attempts", 0);
        r1.apply();
        App.b().getClass();
        SharedPreferences r2 = App.c();
        r2.getClass();
        SharedPreferences.Editor r3 = r2.edit();
        r3.putInt("album_artist_backfill_attempts_version", r6);
        r3.apply();
    L9:
        if (ud3.y() == null) goto L11;
    L16:
        ss0 r9 = AppDatabase.y().w();
        s24 r4 = (s24) r9.n;
        s24 r11 = (s24) r9.n;
        int r12 = ((Integer) xl.E(r4, true, false, new k2(16, (byte) 0))).intValue();
        if (r12 == 0) goto L103;
        List r16 = (List) xl.E(r11, true, false, new k2(14, (byte) 0));
        AtomicBoolean r15 = b;
        if (r15.compareAndSet(false, true) == false) goto L104;
        pn4 r14 = App.f(false);
        ArrayList r13 = new ArrayList();
        Iterator r18 = r16.iterator();     // Catch: Throwable -> L84
        int r19 = 0;
        int r20 = 0;
    L92:
    L60:
        th = th;
        r8 = r20;
    L86:
        StringBuilder r5 = f34.j(c(r9, r13) + r8, "Filled the album artist on ", " of ");
        r5.append(r16.size());
        r5.append(" albums");
        Log.d("AlbumArtistBackfill", r5.toString());
        throw th;
    L26:
        if (r18.hasNext() == false) goto L70;
        String r10 = (String) r18.next();     // Catch: Throwable -> L60
        if (ud3.y() == null) goto L30;
    L35:
        boolean r7 = true;
    L36:
        if (r7 == false) goto L37;
        AlbumWithSongsID3 r17 = b(r14, r10);     // Catch: Throwable -> L60 Exception -> L64
    L40:
        if (r17 != null) goto L42;
    L41:
        int r23 = r6;
        pn4 r22 = r14;
    L62:
        r14 = r22;
        r6 = r23;
        r19 = 0;
        goto L92
    L42:
        String r110 = r17.getDisplayArtist();     // Catch: Throwable -> L60
        if (r110 != null) goto L45;
    L47:
        r110 = r17.getArtist();     // Catch: Throwable -> L60
    L46:
        String r21 = r110;
        if (r21 == null) goto L41;
        if (r21.trim().isEmpty() == true) goto L41;
        r22 = r14;
        String r111 = r17.getName();     // Catch: Throwable -> L60
        if (r111 != null) goto L55;
    L56:
        r23 = r6;
        Log.w("AlbumArtistBackfill", "Skipped album " + r10 + ": the server answered without a name");     // Catch: Throwable -> L60
        goto L62
    L55:
        if (r111.trim().isEmpty() == true) goto L56;
        r23 = r6;
        r13.add(new w6(r10, r111, r21));     // Catch: Throwable -> L60
        if (r13.size() < 50) goto L62;
        r20 = r20 + c(r9, r13);     // Catch: Throwable -> L60
        goto L62
    L45:
        if (r110.trim().isEmpty() == true) goto L47;
    L64:
        e = move-exception;
        int r24 = r6;
        pn4 r25 = r14;
        int r26 = r19 + 1;     // Catch: Throwable -> L60
        if (r26 >= 3) goto L68;
        Log.w("AlbumArtistBackfill", "Skipped album " + r10, e);     // Catch: Throwable -> L60
        r19 = r26;
        r14 = r25;
        r6 = r24;
        goto L92
    L68:
        Log.w("AlbumArtistBackfill", "Stopped the backfill, " + r26 + " failures in a row", e);     // Catch: Throwable -> L60
    L38:
        boolean r27 = true;
    L71:
        StringBuilder r28 = f34.j(c(r9, r13) + r20, "Filled the album artist on ", " of ");
        r28.append(r16.size());
        r28.append(" albums");
        Log.d("AlbumArtistBackfill", r28.toString());
        if (r27 == false) goto L76;
        r15.set(false);
        return;
    L76:
        if (((Integer) xl.E(r11, true, false, new k2(16, (byte) 0))).intValue() == r12) goto L78;
    L79:
        App.b().getClass();
        int r29 = App.c().getInt("album_artist_backfill_attempts", 0) + 1;
        App.b().getClass();
        SharedPreferences r30 = App.c();
        r30.getClass();
        SharedPreferences.Editor r31 = r30.edit();
        r31.putInt("album_artist_backfill_attempts", r29);
        r31.apply();
        if (r29 >= 3) goto L82;
        return;
    L82:
        App.b().getClass();
        SharedPreferences r32 = App.c();
        r32.getClass();
        SharedPreferences.Editor r33 = r32.edit();
        r33.putInt("album_artist_backfilled_version", r24);
        r33.apply();
        return;
    L78:
        if (((List) xl.E(r11, true, false, new k2(14, (byte) 0))).isEmpty() == true) goto L82;
    L37:
        r24 = r6;
        goto L38
    L30:
        if (ud3.J() != null) goto L32;
    L34:
        r7 = false;
        goto L36
    L32:
        if (ud3.B() == null) goto L34;
    L70:
        r24 = r6;
        r27 = false;
    L84:
        th = th;
        goto L86
    L104:
        return;
    L103:
        return;
    L11:
        if (ud3.J() != null) goto L13;
        return;
    L13:
        if (ud3.B() != null) goto L16;
        return;
    }

    public static AlbumWithSongsID3 b(pn4 r4, String r5) {
        Response r6 = r4.c().e(r5).execute();
        if (r6.isSuccessful() == true) goto L5;
        StringBuilder r7 = xa3.j("getAlbum for ", r5, " returned HTTP ");
        r7.append(r6.code());
        throw new IOException(r7.toString());
    L5:
        if (r6.body() == null) goto L28;
        SubsonicResponse r8 = ((ApiResponse) r6.body()).getSubsonicResponse();
        if (r8 != null) goto L9;
        mj0.i(xa3.h("getAlbum for ", r5, " returned no subsonic response"));
        return null;
    L9:
        if (ResponseStatus.FAILED.equals(r8.getStatus()) == false) goto L21;
        Error r9 = r8.getError();
        if (r9 != null) goto L13;
    L19:
        mj0.i(xa3.h("getAlbum for ", r5, " failed without an error code"));
        return null;
    L13:
        if (r9.getCode() == null) goto L19;
        if (r9.getCode().intValue() != 70) goto L17;
        return null;
    L17:
        StringBuilder r10 = xa3.j("getAlbum for ", r5, " failed with ");
        r10.append(r9.getCode());
        r10.append(" ");
        r10.append(r9.getMessage());
        throw new IOException(r10.toString());
    L21:
        AlbumWithSongsID3 r11 = r8.getAlbum();
        if (r11 == null) goto L24;
        return r11;
    L24:
        mj0.i(xa3.h("getAlbum for ", r5, " succeeded without an album"));
        return null;
    L28:
        mj0.i(xa3.h("getAlbum for ", r5, " returned an empty body"));
        return null;
    }

    public static int c(ss0 r4, ArrayList r5) {
        int r1 = 0;
        if (r5.isEmpty() == false) goto L5;
        return 0;
    L5:
        int[] r0 = {0};
        AppDatabase.y().s(new v6(r5, r4, r0, r1));
        r5.clear();
        return r0[0];
    }
}
