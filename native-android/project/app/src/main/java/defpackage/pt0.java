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
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static Child a(pn4 pn4Var, String str) throws IOException {
        Response responseExecute = pn4Var.c().m(str).execute();
        if (!responseExecute.isSuccessful()) {
            StringBuilder sbJ = xa3.j("getSong for ", str, " returned HTTP ");
            sbJ.append(responseExecute.code());
            throw new IOException(sbJ.toString());
        }
        if (responseExecute.body() == null) {
            mj0.i(xa3.h("getSong for ", str, " returned an empty body"));
            return null;
        }
        SubsonicResponse subsonicResponse = ((ApiResponse) responseExecute.body()).getSubsonicResponse();
        if (subsonicResponse == null) {
            mj0.i(xa3.h("getSong for ", str, " returned no subsonic response"));
            return null;
        }
        if (!ResponseStatus.FAILED.equals(subsonicResponse.getStatus())) {
            Child song = subsonicResponse.getSong();
            if (song != null) {
                return song;
            }
            mj0.i(xa3.h("getSong for ", str, " succeeded without a song"));
            return null;
        }
        Error error = subsonicResponse.getError();
        if (error == null || error.getCode() == null) {
            mj0.i(xa3.h("getSong for ", str, " failed without an error code"));
            return null;
        }
        if (error.getCode().intValue() == 70) {
            return null;
        }
        StringBuilder sbJ2 = xa3.j("getSong for ", str, " failed with ");
        sbJ2.append(error.getCode());
        sbJ2.append(" ");
        sbJ2.append(error.getMessage());
        throw new IOException(sbJ2.toString());
    }

    public static int b(Context context, ss0 ss0Var, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Download download = (Download) obj;
                if (((Download) xl.E((s24) ss0Var.n, true, false, new rs0(ss0Var, download.getId()))) == null) {
                    eu0 eu0VarW = au0.w(context);
                    String id = download.getId();
                    eu0VarW.getClass();
                    if (eu0.d(id)) {
                        arrayList2.add(download);
                    }
                }
            }
            arrayList.clear();
            if (!arrayList2.isEmpty()) {
                xl.E((s24) ss0Var.n, false, true, new o(7, ss0Var, arrayList2));
                return arrayList2.size();
            }
        }
        return 0;
    }

    public static boolean c() {
        if (ud3.y() == null) {
            return (ud3.J() == null || ud3.B() == null) ? false : true;
        }
        return true;
    }

    public static void d(int i) {
        App.b().getClass();
        App.c().edit().putInt("download_database_repaired_version", i).apply();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119 A[Catch: all -> 0x0135, TRY_ENTER, TryCatch #3 {all -> 0x0135, blocks: (B:49:0x0105, B:50:0x0111, B:52:0x0119, B:55:0x0139, B:57:0x0147, B:59:0x016f, B:63:0x0199, B:65:0x01a4, B:62:0x018a, B:67:0x01ab, B:69:0x01b4, B:70:0x01d1), top: B:95:0x0105, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0139 A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:49:0x0105, B:50:0x0111, B:52:0x0119, B:55:0x0139, B:57:0x0147, B:59:0x016f, B:63:0x0199, B:65:0x01a4, B:62:0x018a, B:67:0x01ab, B:69:0x01b4, B:70:0x01d1), top: B:95:0x0105, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0147 A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:49:0x0105, B:50:0x0111, B:52:0x0119, B:55:0x0139, B:57:0x0147, B:59:0x016f, B:63:0x0199, B:65:0x01a4, B:62:0x018a, B:67:0x01ab, B:69:0x01b4, B:70:0x01d1), top: B:95:0x0105, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016f A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:49:0x0105, B:50:0x0111, B:52:0x0119, B:55:0x0139, B:57:0x0147, B:59:0x016f, B:63:0x0199, B:65:0x01a4, B:62:0x018a, B:67:0x01ab, B:69:0x01b4, B:70:0x01d1), top: B:95:0x0105, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:62:0x018a A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:49:0x0105, B:50:0x0111, B:52:0x0119, B:55:0x0139, B:57:0x0147, B:59:0x016f, B:63:0x0199, B:65:0x01a4, B:62:0x018a, B:67:0x01ab, B:69:0x01b4, B:70:0x01d1), top: B:95:0x0105, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4 A[Catch: all -> 0x0135, TryCatch #3 {all -> 0x0135, blocks: (B:49:0x0105, B:50:0x0111, B:52:0x0119, B:55:0x0139, B:57:0x0147, B:59:0x016f, B:63:0x0199, B:65:0x01a4, B:62:0x018a, B:67:0x01ab, B:69:0x01b4, B:70:0x01d1), top: B:95:0x0105, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0224  */
    /* JADX WARN: Code duplicated, block: B:79:0x0228  */
    /* JADX WARN: Code duplicated, block: B:81:0x0255  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0119, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0147, please report this as an issue */
    public static void e(Context context) throws Throwable {
        lt0 lt0Var;
        ss0 ss0VarW;
        ArrayList arrayList;
        int size;
        int i;
        int i2;
        boolean z;
        pn4 pn4VarF;
        ArrayList arrayList2;
        int i3;
        int size2;
        int i4;
        int iB;
        int i5;
        boolean z2;
        int iB2;
        int i6;
        ot0 ot0Var;
        Child childA;
        pn4 pn4Var;
        Download download;
        Uri uri;
        ot0 ot0Var2;
        int iU = AppDatabase.y().j().w().u();
        App.b().getClass();
        boolean z3 = false;
        if (App.c().getInt("download_database_repaired_version", 0) != iU && c()) {
            synchronized (au0.class) {
                au0.m(context);
                lt0Var = au0.t;
            }
            fk0 fk0Var = lt0Var.b;
            ArrayList arrayList3 = new ArrayList();
            try {
                ek0 ek0VarG = fk0Var.g(3);
                while (true) {
                    try {
                        Cursor cursor = ek0VarG.n;
                        if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                            break;
                        }
                        ns0 ns0VarE = fk0.e(ek0VarG.n);
                        if (ns0VarE.h.a > 0) {
                            tt0 tt0Var = ns0VarE.a;
                            arrayList3.add(new ot0(tt0Var.n, tt0Var.o.toString()));
                        }
                        if (arrayList3 == null) {
                            return;
                        }
                        ss0VarW = AppDatabase.y().w();
                        arrayList = new ArrayList();
                        size = arrayList3.size();
                        i = 0;
                        while (i < size) {
                            Object obj = arrayList3.get(i);
                            i++;
                            ot0Var2 = (ot0) obj;
                            int i7 = size;
                            int i8 = iU;
                            if (((Download) xl.E((s24) ss0VarW.n, true, false, new rs0(ss0VarW, ot0Var2.a))) == null) {
                                arrayList.add(ot0Var2);
                            }
                            z3 = false;
                            size = i7;
                            iU = i8;
                        }
                        i2 = iU;
                        z = z3;
                        if (arrayList.isEmpty()) {
                            d(i2);
                            return;
                        }
                        pn4VarF = App.f(z);
                        arrayList2 = new ArrayList();
                        try {
                            size2 = arrayList.size();
                            i4 = 0;
                            iB = 0;
                            i5 = 0;
                            z2 = false;
                            while (i4 < size2) {
                                try {
                                    i4++;
                                    size2 = size2;
                                    ot0Var = (ot0) arrayList.get(i4);
                                    try {
                                        childA = a(pn4VarF, ot0Var.a);
                                        if (childA == null) {
                                            Log.d("DownloadRepair", "Skipped " + ot0Var.a + ": the server no longer has it");
                                            pn4Var = pn4VarF;
                                        } else {
                                            pn4Var = pn4VarF;
                                            if (ot0Var.a.equals(childA.getId())) {
                                                download = new Download(childA);
                                                download.setDownloadState(1);
                                                download.setDownloadUri(ot0Var.b);
                                                uri = Uri.parse(ot0Var.b);
                                                if (uri.isOpaque()) {
                                                    e03.a(download, uri.getQueryParameter("format"), uri.getQueryParameter("maxBitRate"));
                                                }
                                                arrayList2.add(download);
                                                if (arrayList2.size() >= 50) {
                                                    iB += b(context, ss0VarW, arrayList2);
                                                }
                                            } else {
                                                Log.w("DownloadRepair", "Skipped " + ot0Var.a + ": the server answered with id " + childA.getId());
                                            }
                                        }
                                        pn4VarF = pn4Var;
                                        i5 = 0;
                                    } catch (IOException e) {
                                        pn4 pn4Var2 = pn4VarF;
                                        i5++;
                                        if (i5 >= 3) {
                                            Log.w("DownloadRepair", "Stopped the repair, " + i5 + " failures in a row", e);
                                            StringBuilder sbJ = f34.j(b(context, ss0VarW, arrayList2) + iB, "Restored ", " of ");
                                            sbJ.append(arrayList.size());
                                            sbJ.append(" download rows");
                                            Log.d("DownloadRepair", sbJ.toString());
                                            return;
                                        }
                                        Log.w("DownloadRepair", "Skipped " + ot0Var.a, e);
                                        pn4VarF = pn4Var2;
                                        z2 = true;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    i3 = iB;
                                    StringBuilder sbJ2 = f34.j(b(context, ss0VarW, arrayList2) + i3, "Restored ", " of ");
                                    sbJ2.append(arrayList.size());
                                    sbJ2.append(" download rows");
                                    Log.d("DownloadRepair", sbJ2.toString());
                                    throw th;
                                }
                            }
                            iB2 = b(context, ss0VarW, arrayList2) + iB;
                            StringBuilder sbJ3 = f34.j(iB2, "Restored ", " of ");
                            sbJ3.append(arrayList.size());
                            sbJ3.append(" download rows");
                            Log.d("DownloadRepair", sbJ3.toString());
                            if (z2) {
                                return;
                            }
                            if (iB2 > 0) {
                                d(i2);
                                return;
                            }
                            App.b().getClass();
                            i6 = App.c().getInt("download_repair_attempts", 0) + 1;
                            App.b().getClass();
                            App.c().edit().putInt("download_repair_attempts", i6).apply();
                            if (i6 >= 3) {
                                d(i2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i3 = 0;
                        }
                    } catch (Throwable th3) {
                        try {
                            ek0VarG.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                    Log.w("DownloadRepair", "Failed to read the download index", e);
                    arrayList3 = null;
                }
                ek0VarG.close();
            } catch (Exception e2) {
                Log.w("DownloadRepair", "Failed to read the download index", e2);
                arrayList3 = null;
            }
            if (arrayList3 == null) {
                return;
            }
            ss0VarW = AppDatabase.y().w();
            arrayList = new ArrayList();
            size = arrayList3.size();
            i = 0;
            while (i < size) {
                Object obj2 = arrayList3.get(i);
                i++;
                ot0Var2 = (ot0) obj2;
                int i9 = size;
                int i10 = iU;
                if (((Download) xl.E((s24) ss0VarW.n, true, false, new rs0(ss0VarW, ot0Var2.a))) == null) {
                    arrayList.add(ot0Var2);
                }
                z3 = false;
                size = i9;
                iU = i10;
            }
            i2 = iU;
            z = z3;
            if (arrayList.isEmpty()) {
                d(i2);
                return;
            }
            pn4VarF = App.f(z);
            arrayList2 = new ArrayList();
            size2 = arrayList.size();
            i4 = 0;
            iB = 0;
            i5 = 0;
            z2 = false;
            while (i4 < size2) {
                i4++;
                size2 = size2;
                ot0Var = (ot0) arrayList.get(i4);
                childA = a(pn4VarF, ot0Var.a);
                if (childA == null) {
                    Log.d("DownloadRepair", "Skipped " + ot0Var.a + ": the server no longer has it");
                    pn4Var = pn4VarF;
                } else {
                    pn4Var = pn4VarF;
                    if (ot0Var.a.equals(childA.getId())) {
                        Log.w("DownloadRepair", "Skipped " + ot0Var.a + ": the server answered with id " + childA.getId());
                    } else {
                        download = new Download(childA);
                        download.setDownloadState(1);
                        download.setDownloadUri(ot0Var.b);
                        uri = Uri.parse(ot0Var.b);
                        if (uri.isOpaque()) {
                            e03.a(download, uri.getQueryParameter("format"), uri.getQueryParameter("maxBitRate"));
                        }
                        arrayList2.add(download);
                        if (arrayList2.size() >= 50) {
                            iB += b(context, ss0VarW, arrayList2);
                        }
                    }
                }
                pn4VarF = pn4Var;
                i5 = 0;
            }
            iB2 = b(context, ss0VarW, arrayList2) + iB;
            StringBuilder sbJ4 = f34.j(iB2, "Restored ", " of ");
            sbJ4.append(arrayList.size());
            sbJ4.append(" download rows");
            Log.d("DownloadRepair", sbJ4.toString());
            if (z2) {
                return;
            }
            if (iB2 > 0) {
                d(i2);
                return;
            }
            App.b().getClass();
            i6 = App.c().getInt("download_repair_attempts", 0) + 1;
            App.b().getClass();
            App.c().edit().putInt("download_repair_attempts", i6).apply();
            if (i6 >= 3) {
                d(i2);
            }
        }
    }
}
