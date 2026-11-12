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
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x021b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0246 A[ORIG_RETURN, RETURN] */
    public static void a() throws Throwable {
        int i;
        boolean z;
        int i2;
        pn4 pn4Var;
        int i3;
        int iU = AppDatabase.y().j().w().u();
        App.b().getClass();
        int i4 = 0;
        if (App.c().getInt("album_artist_backfilled_version", 0) == iU) {
            return;
        }
        App.b().getClass();
        if (App.c().getInt("album_artist_backfill_attempts_version", 0) != iU) {
            App.b().getClass();
            SharedPreferences sharedPreferencesC = App.c();
            sharedPreferencesC.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
            editorEdit.putInt("album_artist_backfill_attempts", 0);
            editorEdit.apply();
            App.b().getClass();
            SharedPreferences sharedPreferencesC2 = App.c();
            sharedPreferencesC2.getClass();
            SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
            editorEdit2.putInt("album_artist_backfill_attempts_version", iU);
            editorEdit2.apply();
        }
        if (ud3.y() == null && (ud3.J() == null || ud3.B() == null)) {
            return;
        }
        ss0 ss0VarW = AppDatabase.y().w();
        s24 s24Var = (s24) ss0VarW.n;
        s24 s24Var2 = (s24) ss0VarW.n;
        int iIntValue = ((Integer) xl.E(s24Var, true, false, new k2(16, (byte) 0))).intValue();
        if (iIntValue == 0) {
            return;
        }
        List list = (List) xl.E(s24Var2, true, false, new k2(14, (byte) 0));
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        pn4 pn4VarF = App.f(false);
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            int i5 = 0;
            int iC = 0;
            while (true) {
                try {
                    if (!it.hasNext()) {
                        i = iU;
                        z = false;
                        break;
                    }
                    String str = (String) it.next();
                    if ((ud3.y() == null && (ud3.J() == null || ud3.B() == null)) ? false : true) {
                        try {
                            AlbumWithSongsID3 albumWithSongsID3B = b(pn4VarF, str);
                            if (albumWithSongsID3B != null) {
                                String displayArtist = albumWithSongsID3B.getDisplayArtist();
                                if (displayArtist == null || displayArtist.trim().isEmpty()) {
                                    displayArtist = albumWithSongsID3B.getArtist();
                                }
                                String str2 = displayArtist;
                                if (str2 == null || str2.trim().isEmpty()) {
                                    i3 = iU;
                                    pn4Var = pn4VarF;
                                } else {
                                    pn4Var = pn4VarF;
                                    String name = albumWithSongsID3B.getName();
                                    if (name == null || name.trim().isEmpty()) {
                                        i3 = iU;
                                        Log.w("AlbumArtistBackfill", "Skipped album " + str + ": the server answered without a name");
                                    } else {
                                        i3 = iU;
                                        arrayList.add(new w6(str, name, str2));
                                        if (arrayList.size() >= 50) {
                                            iC += c(ss0VarW, arrayList);
                                        }
                                    }
                                }
                            } else {
                                i3 = iU;
                                pn4Var = pn4VarF;
                            }
                            pn4VarF = pn4Var;
                            iU = i3;
                            i5 = 0;
                        } catch (Exception e) {
                            i = iU;
                            pn4 pn4Var2 = pn4VarF;
                            int i6 = i5 + 1;
                            if (i6 >= 3) {
                                Log.w("AlbumArtistBackfill", "Stopped the backfill, " + i6 + " failures in a row", e);
                                z = true;
                                StringBuilder sbJ = f34.j(c(ss0VarW, arrayList) + iC, "Filled the album artist on ", " of ");
                                sbJ.append(list.size());
                                sbJ.append(" albums");
                                Log.d("AlbumArtistBackfill", sbJ.toString());
                                if (z) {
                                    atomicBoolean.set(false);
                                    return;
                                }
                                if (((Integer) xl.E(s24Var2, true, false, new k2(16, (byte) 0))).intValue() == iIntValue) {
                                    App.b().getClass();
                                    i2 = App.c().getInt("album_artist_backfill_attempts", 0) + 1;
                                    App.b().getClass();
                                    SharedPreferences sharedPreferencesC3 = App.c();
                                    sharedPreferencesC3.getClass();
                                    SharedPreferences.Editor editorEdit3 = sharedPreferencesC3.edit();
                                    editorEdit3.putInt("album_artist_backfill_attempts", i2);
                                    editorEdit3.apply();
                                    if (i2 < 3) {
                                        return;
                                    }
                                } else {
                                    App.b().getClass();
                                    i2 = App.c().getInt("album_artist_backfill_attempts", 0) + 1;
                                    App.b().getClass();
                                    SharedPreferences sharedPreferencesC4 = App.c();
                                    sharedPreferencesC4.getClass();
                                    SharedPreferences.Editor editorEdit4 = sharedPreferencesC4.edit();
                                    editorEdit4.putInt("album_artist_backfill_attempts", i2);
                                    editorEdit4.apply();
                                    if (i2 < 3) {
                                        return;
                                    }
                                }
                                App.b().getClass();
                                SharedPreferences sharedPreferencesC5 = App.c();
                                sharedPreferencesC5.getClass();
                                SharedPreferences.Editor editorEdit5 = sharedPreferencesC5.edit();
                                editorEdit5.putInt("album_artist_backfilled_version", i);
                                editorEdit5.apply();
                            }
                            Log.w("AlbumArtistBackfill", "Skipped album " + str, e);
                            i5 = i6;
                            pn4VarF = pn4Var2;
                            iU = i;
                        }
                    } else {
                        i = iU;
                    }
                    z = true;
                    break;
                } catch (Throwable th) {
                    th = th;
                    i4 = iC;
                    StringBuilder sbJ2 = f34.j(c(ss0VarW, arrayList) + i4, "Filled the album artist on ", " of ");
                    sbJ2.append(list.size());
                    sbJ2.append(" albums");
                    Log.d("AlbumArtistBackfill", sbJ2.toString());
                    throw th;
                }
            }
            StringBuilder sbJ3 = f34.j(c(ss0VarW, arrayList) + iC, "Filled the album artist on ", " of ");
            sbJ3.append(list.size());
            sbJ3.append(" albums");
            Log.d("AlbumArtistBackfill", sbJ3.toString());
            if (z) {
                atomicBoolean.set(false);
                return;
            }
            if (((Integer) xl.E(s24Var2, true, false, new k2(16, (byte) 0))).intValue() == iIntValue || !((List) xl.E(s24Var2, true, false, new k2(14, (byte) 0))).isEmpty()) {
                App.b().getClass();
                i2 = App.c().getInt("album_artist_backfill_attempts", 0) + 1;
                App.b().getClass();
                SharedPreferences sharedPreferencesC6 = App.c();
                sharedPreferencesC6.getClass();
                SharedPreferences.Editor editorEdit6 = sharedPreferencesC6.edit();
                editorEdit6.putInt("album_artist_backfill_attempts", i2);
                editorEdit6.apply();
                if (i2 < 3) {
                    return;
                }
            }
            App.b().getClass();
            SharedPreferences sharedPreferencesC7 = App.c();
            sharedPreferencesC7.getClass();
            SharedPreferences.Editor editorEdit7 = sharedPreferencesC7.edit();
            editorEdit7.putInt("album_artist_backfilled_version", i);
            editorEdit7.apply();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static AlbumWithSongsID3 b(pn4 pn4Var, String str) throws IOException {
        Response responseExecute = pn4Var.c().e(str).execute();
        if (!responseExecute.isSuccessful()) {
            StringBuilder sbJ = xa3.j("getAlbum for ", str, " returned HTTP ");
            sbJ.append(responseExecute.code());
            throw new IOException(sbJ.toString());
        }
        if (responseExecute.body() == null) {
            mj0.i(xa3.h("getAlbum for ", str, " returned an empty body"));
            return null;
        }
        SubsonicResponse subsonicResponse = ((ApiResponse) responseExecute.body()).getSubsonicResponse();
        if (subsonicResponse == null) {
            mj0.i(xa3.h("getAlbum for ", str, " returned no subsonic response"));
            return null;
        }
        if (!ResponseStatus.FAILED.equals(subsonicResponse.getStatus())) {
            AlbumWithSongsID3 album = subsonicResponse.getAlbum();
            if (album != null) {
                return album;
            }
            mj0.i(xa3.h("getAlbum for ", str, " succeeded without an album"));
            return null;
        }
        Error error = subsonicResponse.getError();
        if (error == null || error.getCode() == null) {
            mj0.i(xa3.h("getAlbum for ", str, " failed without an error code"));
            return null;
        }
        if (error.getCode().intValue() == 70) {
            return null;
        }
        StringBuilder sbJ2 = xa3.j("getAlbum for ", str, " failed with ");
        sbJ2.append(error.getCode());
        sbJ2.append(" ");
        sbJ2.append(error.getMessage());
        throw new IOException(sbJ2.toString());
    }

    public static int c(ss0 ss0Var, ArrayList arrayList) {
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int[] iArr = {0};
        AppDatabase.y().s(new v6(arrayList, ss0Var, iArr, i));
        arrayList.clear();
        return iArr[0];
    }
}
