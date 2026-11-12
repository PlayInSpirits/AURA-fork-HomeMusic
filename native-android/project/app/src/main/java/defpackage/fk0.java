package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.database.DatabaseIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 {
    public static final String e = h(3, 4);
    public static final String[] f = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final tk4 b;
    public boolean d;
    public final String a = "ExoPlayerDownloads";
    public final Object c = new Object();

    public fk0(tk4 tk4Var) {
        this.b = tk4Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String str2 = f35.a;
            for (String str3 : str.split(",", -1)) {
                String[] strArrSplit = str3.split("\\.", -1);
                rr2.w(strArrSplit.length == 3);
                arrayList.add(new fm4(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public static ns0 e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String strM = lw2.m(cursor.getString(1));
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        tt0 tt0Var = new tt0(string, uri, strM, arrayListA, blob, cursor.getString(4), cursor.getBlob(5), null, null);
        mt0 mt0Var = new mt0();
        mt0Var.a = cursor.getLong(13);
        mt0Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new ns0(tt0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, mt0Var);
    }

    public static ns0 f(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        tt0 tt0Var = new tt0(string, uri, lw2.m(str), a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5), null, null);
        mt0 mt0Var = new mt0();
        mt0Var.a = cursor.getLong(13);
        mt0Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new ns0(tt0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, mt0Var);
    }

    public static String h(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList i(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!f35.f0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(f(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            try {
                int i = 0;
                int iA = r45.a(this.b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        r45.b(writableDatabase, 0, "", 3);
                        ArrayList arrayListI = iA == 2 ? i(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        int size = arrayListI.size();
                        while (i < size) {
                            Object obj = arrayListI.get(i);
                            i++;
                            k((ns0) obj, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) throws DatabaseIOException {
        try {
            return this.b.getReadableDatabase().query(this.a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final ns0 d(String str) throws DatabaseIOException {
        b();
        try {
            Cursor cursorC = c("id = ?", new String[]{str});
            try {
                if (cursorC.getCount() == 0) {
                    cursorC.close();
                    return null;
                }
                cursorC.moveToNext();
                ns0 ns0VarE = e(cursorC);
                cursorC.close();
                return ns0VarE;
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
        throw new DatabaseIOException(e2);
    }

    public final ek0 g(int... iArr) {
        b();
        return new ek0(c(h(iArr), null));
    }

    public final void j(ns0 ns0Var) {
        b();
        try {
            k(ns0Var, this.b.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void k(ns0 ns0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = ns0Var.a.r;
        if (bArr == null) {
            bArr = f35.b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", ns0Var.a.n);
        contentValues.put("mime_type", ns0Var.a.p);
        contentValues.put("uri", ns0Var.a.o.toString());
        List list = ns0Var.a.q;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            fm4 fm4Var = (fm4) list.get(i);
            sb.append(fm4Var.n);
            sb.append('.');
            sb.append(fm4Var.o);
            sb.append('.');
            sb.append(fm4Var.p);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", ns0Var.a.s);
        contentValues.put("data", ns0Var.a.t);
        contentValues.put("state", Integer.valueOf(ns0Var.b));
        contentValues.put("start_time_ms", Long.valueOf(ns0Var.c));
        contentValues.put("update_time_ms", Long.valueOf(ns0Var.d));
        contentValues.put("content_length", Long.valueOf(ns0Var.e));
        contentValues.put("stop_reason", Integer.valueOf(ns0Var.f));
        contentValues.put("failure_reason", Integer.valueOf(ns0Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(ns0Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(ns0Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void m() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void n(int i, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, e + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
