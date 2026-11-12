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
    public static final String e = null;
    public static final String[] f = null;
    public final String a;
    public final tk4 b;
    public final Object c;
    public boolean d;

    static {
        e = h(new int[]{3, 4});
        f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public fk0(tk4 r1) {
        this.b = r1;
        this.a = "ExoPlayerDownloads";
        this.c = new Object();
    }

    public static ArrayList a(String r10) {
        ArrayList r0 = new ArrayList();
        if (TextUtils.isEmpty(r10) == true) goto L12;
        String r1 = f35.a;
        String[] r11 = r10.split(",", -1);
        int r2 = r11.length;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        String[] r5 = r11[r4].split("\\.", -1);
        if (r5.length != 3) goto L10;
        boolean r6 = true;
    L11:
        rr2.w(r6);
        r0.add(new fm4(Integer.parseInt(r5[0]), Integer.parseInt(r5[1]), Integer.parseInt(r5[2])));
        r4 = r4 + 1;
        goto L6
    L10:
        r6 = false;
    L12:
        return r0;
    }

    public static ns0 e(Cursor r23) {
        byte[] r1 = r23.getBlob(14);
        int r2 = 0;
        String r4 = r23.getString(0);
        r4.getClass();
        String r3 = r23.getString(2);
        r3.getClass();
        Uri r5 = Uri.parse(r3);
        String r6 = lw2.m(r23.getString(1));
        ArrayList r7 = a(r23.getString(3));
        if (r1.length <= 0) goto L5;
    L4:
        byte[] r8 = r1;
        tt0 r9 = new tt0(r4, r5, r6, r7, r8, r23.getString(4), r23.getBlob(5), null, null);
        mt0 r10 = new mt0();
        r10.a = r23.getLong(13);
        r10.b = r23.getFloat(12);
        int r13 = r23.getInt(6);
        if (r13 != 4) goto L9;
        r2 = r23.getInt(11);
    L9:
        long r14 = r23.getLong(7);
        long r16 = r23.getLong(8);
        long r18 = r23.getLong(9);
        int r20 = r23.getInt(10);
        return new ns0(r9, r13, r14, r16, r18, r20, r2, r10);
    L5:
        r1 = null;
        goto L4
    }

    public static ns0 f(Cursor r25) {
        int r1 = 0;
        String r3 = r25.getString(0);
        r3.getClass();
        String r2 = r25.getString(2);
        r2.getClass();
        Uri r4 = Uri.parse(r2);
        String r5 = r25.getString(1);
        if ("dash".equals(r5) == false) goto L6;
        String r6 = "application/dash+xml";
    L12:
        tt0 r7 = new tt0(r3, r4, lw2.m(r6), a(r25.getString(3)), null, r25.getString(4), r25.getBlob(5), null, null);
        mt0 r8 = new mt0();
        r8.a = r25.getLong(13);
        r8.b = r25.getFloat(12);
        int r15 = r25.getInt(6);
        if (r15 != 4) goto L15;
        r1 = r25.getInt(11);
    L15:
        long r16 = r25.getLong(7);
        long r18 = r25.getLong(8);
        long r20 = r25.getLong(9);
        int r22 = r25.getInt(10);
        return new ns0(r7, r15, r16, r18, r20, r22, r1, r8);
    L6:
        if ("hls".equals(r5) == false) goto L9;
        r6 = "application/x-mpegURL";
        goto L12
    L9:
        if ("ss".equals(r5) == false) goto L11;
        r6 = "application/vnd.ms-sstr+xml";
        goto L12
    L11:
        r6 = "video/x-unknown";
        goto L12
    }

    public static String h(int... r3) {
        if (r3.length != 0) goto L6;
        return "1";
    L6:
        StringBuilder r0 = new StringBuilder("state IN (");
        int r1 = 0;
    L8:
        if (r1 >= r3.length) goto L12;
        if (r1 <= 0) goto L11;
        r0.append(',');
    L11:
        r0.append(r3[r1]);
        r1 = r1 + 1;
        goto L8
    L12:
        r0.append(')');
        return r0.toString();
    }

    public static ArrayList i(SQLiteDatabase r17) {
        ArrayList r0 = new ArrayList();
        if (f35.f0(r17, "ExoPlayerDownloads") == true) goto L5;
        return r0;
    L5:
        Cursor r1 = r17.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
    L22:
    L10:
        th = move-exception;
        if (r1 == null) goto L26;
        r1.close();     // Catch: Throwable -> L17
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L26:
        throw th;
    L7:
        if (r1.moveToNext() == false) goto L12;
        r0.add(f(r1));     // Catch: Throwable -> L10
        goto L22
    L12:
        r1.close();
        return r0;
    }

    public final void b() {
        Object r0 = this.c;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.d == false) goto L37;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L37:
        int r3 = 0;
        int r1 = r45.a(this.b.getReadableDatabase(), 0, "");     // Catch: Throwable -> L8 SQLException -> L24
        if (r1 == 3) goto L28;
        SQLiteDatabase r4 = this.b.getWritableDatabase();     // Catch: Throwable -> L8 SQLException -> L24
        r4.beginTransactionNonExclusive();     // Catch: Throwable -> L8 SQLException -> L24
        r45.b(r4, 0, "", 3);     // Catch: Throwable -> L16
        if (r1 != 2) goto L18;
        ArrayList r2 = i(r4);     // Catch: Throwable -> L16
    L19:
        r4.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");     // Catch: Throwable -> L16
        r4.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");     // Catch: Throwable -> L16
        int r5 = r2.size();     // Catch: Throwable -> L16
    L20:
        if (r3 >= r5) goto L22;
        Object r6 = r2.get(r3);     // Catch: Throwable -> L16
        r3 = r3 + 1;     // Catch: Throwable -> L16
        k((ns0) r6, r4);     // Catch: Throwable -> L16
        goto L20
    L22:
        r4.setTransactionSuccessful();     // Catch: Throwable -> L16
        r4.endTransaction();     // Catch: Throwable -> L8 SQLException -> L24
        goto L28
    L18:
        r2 = new ArrayList();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r4.endTransaction();     // Catch: Throwable -> L8 SQLException -> L24
        throw th;     // Catch: Throwable -> L8 SQLException -> L24
    L28:
        this.d = true;     // Catch: Throwable -> L8 SQLException -> L24
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L24:
        e = move-exception;
        throw new DatabaseIOException(e);     // Catch: Throwable -> L8
    }

    public final Cursor c(String r9, String[] r10) {
        return this.b.getReadableDatabase().query(this.a, f, r9, r10, null, null, "start_time_ms ASC");
    L4:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public final ns0 d(String r2) {
        b();
        Cursor r1 = c("id = ?", new String[]{r2});     // Catch: SQLiteException -> L19
    L12:
        th = move-exception;
        if (r1 != null) goto L25;
    L18:
        throw th;     // Catch: SQLiteException -> L19
    L25:
        r1.close();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        th.addSuppressed(th);     // Catch: SQLiteException -> L19
        goto L18
    L5:
        if (r1.getCount() == 0) goto L7;
        r1.moveToNext();     // Catch: Throwable -> L12
        ns0 r3 = e(r1);     // Catch: Throwable -> L12
        r1.close();     // Catch: SQLiteException -> L19
        return r3;
    L7:
        r1.close();     // Catch: SQLiteException -> L19
        return null;
    L19:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public final ek0 g(int... r2) {
        b();
        return new ek0(c(h(r2), null));
    }

    public final void j(ns0 r2) {
        b();
        k(r2, this.b.getWritableDatabase());     // Catch: SQLiteException -> L5
        return;
    L5:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public final void k(ns0 r9, SQLiteDatabase r10) {
        byte[] r0 = r9.a.r;
        if (r0 != null) goto L5;
        r0 = f35.b;
    L5:
        ContentValues r1 = new ContentValues();
        r1.put("id", r9.a.n);
        r1.put("mime_type", r9.a.p);
        r1.put("uri", r9.a.o.toString());
        List r2 = r9.a.q;
        StringBuilder r3 = new StringBuilder();
        int r4 = 0;
    L7:
        if (r4 >= r2.size()) goto L10;
        fm4 r5 = (fm4) r2.get(r4);
        r3.append(r5.n);
        r3.append('.');
        r3.append(r5.o);
        r3.append('.');
        r3.append(r5.p);
        r3.append(',');
        r4 = r4 + 1;
        goto L7
    L10:
        if (r3.length() <= 0) goto L12;
        r3.setLength(r3.length() - 1);
    L12:
        r1.put("stream_keys", r3.toString());
        r1.put("custom_cache_key", r9.a.s);
        r1.put("data", r9.a.t);
        r1.put("state", Integer.valueOf(r9.b));
        r1.put("start_time_ms", Long.valueOf(r9.c));
        r1.put("update_time_ms", Long.valueOf(r9.d));
        r1.put("content_length", Long.valueOf(r9.e));
        r1.put("stop_reason", Integer.valueOf(r9.f));
        r1.put("failure_reason", Integer.valueOf(r9.g));
        r1.put("percent_downloaded", Float.valueOf(r9.h.b));
        r1.put("bytes_downloaded", Long.valueOf(r9.h.a));
        r1.put("key_set_id", r0);
        r10.replaceOrThrow(this.a, null, r1);
    }

    public final void l() {
        b();
        ContentValues r0 = new ContentValues();     // Catch: SQLException -> L5
        r0.put("state", 0);     // Catch: SQLException -> L5
        this.b.getWritableDatabase().update("ExoPlayerDownloads", r0, "state = 2", null);     // Catch: SQLException -> L5
        return;
    L5:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public final void m() {
        b();
        ContentValues r0 = new ContentValues();     // Catch: SQLException -> L5
        r0.put("state", 5);     // Catch: SQLException -> L5
        r0.put("failure_reason", 0);     // Catch: SQLException -> L5
        this.b.getWritableDatabase().update("ExoPlayerDownloads", r0, null, null);     // Catch: SQLException -> L5
        return;
    L5:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public final void n(int r5, String r6) {
        b();
        ContentValues r1 = new ContentValues();     // Catch: SQLException -> L5
        r1.put("stop_reason", Integer.valueOf(r5));     // Catch: SQLException -> L5
        this.b.getWritableDatabase().update("ExoPlayerDownloads", r1, e + " AND id = ?", new String[]{r6});     // Catch: SQLException -> L5
        return;
    L5:
        e = move-exception;
        throw new DatabaseIOException(e);
    }
}
