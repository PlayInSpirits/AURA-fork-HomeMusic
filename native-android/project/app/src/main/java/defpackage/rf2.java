package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.media3.database.DatabaseIOException;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.interfaces.SystemCallback;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.IndexID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf2 implements Callback, y34, bi0, fn1, SystemCallback {
    public static final String[] p = null;
    public Object n;
    public Object o;

    static {
        p = new String[]{"name", "length", "last_touch_timestamp"};
    }

    public rf2(int r2) {
        switch(r2) {
            case 8: goto L9;
            case 16: goto L7;
            case 19: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new m45(0);
        this.o = new m45(0);
        return;
    L5:
        this.n = new ArrayList();
        this.o = new HashMap();
        return;
    L7:
        this.n = new w03();
        this.o = new w03();
        return;
    L9:
        ByteArrayOutputStream r3 = new ByteArrayOutputStream(512);
        this.n = r3;
        this.o = new DataOutputStream(r3);
    }

    public void a(bj0 r4) {
        monitor-enter(r4);
        monitor-exit(r4);
        Handler r0 = (Handler) this.n;
        if (r0 == null) goto L8;
        r0.post(new n55(this, r4, 1));
        return;
    }

    @Override // defpackage.y34
    public x34 b(String r8) {
        r8.getClass();
        p24 r0 = (p24) this.o;
        if (r8.equals(":memory:") == true) goto L5;
        r8 = r0.c.a.getDatabasePath(r8).getAbsolutePath();
        r8.getClass();
    L5:
        boolean r4 = true;
        if (r0.a == false) goto L8;
    L12:
        boolean r1 = false;
    L13:
        v21 r2 = new v21(r8, r1);
        ReentrantLock r3 = r2.a;
        r3.lock();
        wo0 r5 = r2.b;
        if (r5 == null) goto L69;
        r5.D();     // Catch: Throwable -> L17
    L17:
        th = th;
        r4 = false;
    L72:
        if (r4 == false) goto L64;
        throw th;     // Catch: Throwable -> L61
    L64:
        throw new IllegalStateException("Unable to open database '" + r8 + "'. Was a proper path / name used in Room's database builder?", th);     // Catch: Throwable -> L61
    L61:
        th = move-exception;
        r3.unlock();
        throw th;
    L69:
    L58:
        th = th;
    L47:
        th = move-exception;
        if (r5 == null) goto L57;
        FileChannel r6 = (FileChannel) r5.o;     // Catch: Throwable -> L58
        if (r6 == null) goto L57;
        r6.close();     // Catch: Throwable -> L54
        r5.o = null;     // Catch: Throwable -> L58
        goto L57
    L54:
        th = move-exception;
        r5.o = null;     // Catch: Throwable -> L58
        throw th;     // Catch: Throwable -> L58
    L57:
        throw th;     // Catch: Throwable -> L58
    L21:
        if (r0.b == true) goto L46;
        x34 r7 = ((y34) this.n).b(r8);     // Catch: Throwable -> L47
        if (r0.a == true) goto L30;
        r0.b = true;     // Catch: Throwable -> L26
        p24.a(r0, r7);     // Catch: Throwable -> L26
        r0.b = false;     // Catch: Throwable -> L47
    L34:
        if (r5 == null) goto L43;
        FileChannel r9 = (FileChannel) r5.o;     // Catch: Throwable -> L58
        if (r9 == null) goto L43;
        r9.close();     // Catch: Throwable -> L40
        r5.o = null;     // Catch: Throwable -> L58
        goto L43
    L40:
        th = move-exception;
        r5.o = null;     // Catch: Throwable -> L58
        throw th;     // Catch: Throwable -> L58
    L43:
        r3.unlock();
        return r7;
    L26:
        th = move-exception;
        r0.b = false;     // Catch: Throwable -> L47
        throw th;     // Catch: Throwable -> L47
    L30:
        if (r0.c.g != r24.p) goto L32;
        h12.n(r7, "PRAGMA synchronous = NORMAL");     // Catch: Throwable -> L47
    L33:
        p24.b(r7);     // Catch: Throwable -> L47
        r0.d.s(r7);     // Catch: Throwable -> L47
        goto L34
    L32:
        h12.n(r7, "PRAGMA synchronous = FULL");     // Catch: Throwable -> L47
        goto L33
    L46:
        throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");     // Catch: Throwable -> L47
    L8:
        if (r0.b == true) goto L12;
        if (r8.equals(":memory:") == true) goto L12;
        r1 = true;
        goto L13
    }

    public HashMap c() {
        ((String) this.o).getClass();     // Catch: SQLException -> L19
        Cursor r9 = ((tk4) this.n).getReadableDatabase().query((String) this.o, p, null, null, null, null, null);     // Catch: SQLException -> L19
        HashMap r0 = new HashMap(r9.getCount());     // Catch: Throwable -> L8
    L5:
        if (r9.moveToNext() == false) goto L10;
        String r1 = r9.getString(0);     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        r0.put(r1, new nx(r9.getLong(1), r9.getLong(2)));     // Catch: Throwable -> L8
    L10:
        r9.close();     // Catch: SQLException -> L19
        return r0;
    L8:
        th = move-exception;
        if (r9 == null) goto L29;
        r9.close();     // Catch: Throwable -> L15
    L30:
        throw th;     // Catch: SQLException -> L19
    L15:
        th = move-exception;
        th.addSuppressed(th);     // Catch: SQLException -> L19
        throw th;     // Catch: SQLException -> L19
    L29:
        throw th;     // Catch: SQLException -> L19
    L19:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public synchronized List d(String r3) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (((ArrayList) this.n).contains(r3) == true) goto L8;
        ((ArrayList) this.n).add(r3);     // Catch: Throwable -> L6
    L8:
        List r0 = (List) ((HashMap) this.o).get(r3);     // Catch: Throwable -> L6
        if (r0 != null) goto L11;
        r0 = new ArrayList();     // Catch: Throwable -> L6
        ((HashMap) this.o).put(r3, r0);     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
        return r0;
    }

    @Override // defpackage.fn1
    public ce3 e(cn1 r3, ym1 r4) {
        boolean r1 = false;
        return new qr2(((fn1) this.n).e(r3, r4), (List) this.o, r1, 9);
    }

    public synchronized ArrayList f(Class r9, Class r10) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L22
        ArrayList r1 = (ArrayList) this.n;     // Catch: Throwable -> L22
        int r2 = r1.size();     // Catch: Throwable -> L22
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L24;
        Object r5 = r1.get(r4);     // Catch: Throwable -> L22
        r4 = r4 + 1;     // Catch: Throwable -> L22
        List r6 = (List) ((HashMap) this.o).get((String) r5);     // Catch: Throwable -> L22
        if (r6 == null) goto L4;
        Iterator r7 = r6.iterator();     // Catch: Throwable -> L22
    L10:
        if (r7.hasNext() == false) goto L4;
        u04 r8 = (u04) r7.next();     // Catch: Throwable -> L22
        if (r8.a.isAssignableFrom(r9) == true) goto L14;
    L16:
        boolean r11 = false;
    L17:
        if (r11 == false) goto L10;
        if (r0.contains(r8.b) == true) goto L10;
        r0.add(r8.b);     // Catch: Throwable -> L22
        goto L10
    L14:
        if (r10.isAssignableFrom(r8.b) == false) goto L16;
        r11 = true;
        goto L17
    L24:
        monitor-exit(this);
        return r0;
    L22:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.fn1
    public ce3 g() {
        boolean r3 = false;
        return new qr2(((fn1) this.n).g(), (List) this.o, r3, 9);
    }

    public void h(long r6) {
        tk4 r0 = (tk4) this.n;
        String r7 = Long.toHexString(r6);     // Catch: SQLException -> L13
        this.o = "ExoPlayerCacheFileMetadata" + r7;     // Catch: SQLException -> L13
        if (r45.a(r0.getReadableDatabase(), 2, r7) == 1) goto L12;
        SQLiteDatabase r8 = r0.getWritableDatabase();     // Catch: SQLException -> L13
        r8.beginTransactionNonExclusive();     // Catch: SQLException -> L13
        r45.b(r8, 2, r7, 1);     // Catch: Throwable -> L9
        r8.execSQL("DROP TABLE IF EXISTS " + ((String) this.o));     // Catch: Throwable -> L9
        r8.execSQL("CREATE TABLE " + ((String) this.o) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");     // Catch: Throwable -> L9
        r8.setTransactionSuccessful();     // Catch: Throwable -> L9
        r8.endTransaction();     // Catch: SQLException -> L13
        return;
    L9:
        th = move-exception;
        r8.endTransaction();     // Catch: SQLException -> L13
        throw th;     // Catch: SQLException -> L13
    L12:
        return;
    L13:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public void i(Set r5) {
        ((String) this.o).getClass();
        SQLiteDatabase r0 = ((tk4) this.n).getWritableDatabase();     // Catch: SQLException -> L15
        r0.beginTransactionNonExclusive();     // Catch: SQLException -> L15
        Iterator r6 = r5.iterator();     // Catch: Throwable -> L8
    L6:
        if (r6.hasNext() == false) goto L10;
        String r1 = (String) r6.next();     // Catch: Throwable -> L8
        r0.delete((String) this.o, "name = ?", new String[]{r1});     // Catch: Throwable -> L8
        goto L6
    L10:
        r0.setTransactionSuccessful();     // Catch: Throwable -> L8
        r0.endTransaction();     // Catch: SQLException -> L15
        return;
    L8:
        th = move-exception;
        r0.endTransaction();     // Catch: SQLException -> L15
        throw th;     // Catch: SQLException -> L15
    L15:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public void j(Object r5) {
        Handler r0 = (Handler) this.n;
        if (r0 == null) goto L6;
        r0.post(new sn1(this, r5, SystemClock.elapsedRealtime()));
        return;
    }

    public void k(long r4, long r6, String r8) {
        ((String) this.o).getClass();
        SQLiteDatabase r0 = ((tk4) this.n).getWritableDatabase();     // Catch: SQLException -> L5
        ContentValues r1 = new ContentValues();     // Catch: SQLException -> L5
        r1.put("name", r8);     // Catch: SQLException -> L5
        r1.put("length", Long.valueOf(r4));     // Catch: SQLException -> L5
        r1.put("last_touch_timestamp", Long.valueOf(r6));     // Catch: SQLException -> L5
        r0.replaceOrThrow((String) this.o, null, r1);     // Catch: SQLException -> L5
        return;
    L5:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    public void l(int r3, int r4, int r5, int r6) {
        CardView r2 = (CardView) this.o;
        r2.q.set(r3, r4, r5, r6);
        Rect r0 = r2.p;
        CardView.a(r2, r3 + r0.left, r4 + r0.top, r5 + r0.right, r6 + r0.bottom);
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new zj0((Context) this.n, ((bi0) this.o).m());
    }

    public void n(boolean r5, boolean r6) {
        Context r0 = (Context) this.n;
        boolean r1 = false;
        if (r5 == true) goto L5;
    L15:
        WifiManager.WifiLock r4 = (WifiManager.WifiLock) this.o;
        if (r4 != null) goto L18;
        return;
    L18:
        if (r5 == false) goto L21;
        if (r6 == false) goto L21;
        r1 = true;
    L21:
        if (r1 == false) goto L24;
        r4.acquire();
        return;
    L24:
        r4.release();
        return;
    L5:
        if (((WifiManager.WifiLock) this.o) != null) goto L15;
        if (r0.checkSelfPermission("android.permission.WAKE_LOCK") == 0) goto L10;
        l93.q0("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
        return;
    L10:
        WifiManager r2 = (WifiManager) r0.getApplicationContext().getSystemService("wifi");
        if (r2 != null) goto L14;
        l93.q0("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
        return;
    L14:
        WifiManager.WifiLock r3 = r2.createWifiLock(3, "ExoPlayer:WifiLockManager");
        this.o = r3;
        r3.setReferenceCounted(false);
        goto L15
    }

    public void o(s55 r4) {
        Handler r0 = (Handler) this.n;
        if (r0 == null) goto L6;
        r0.post(new ur2(27, this, r4));
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onError(Exception r5) {
        r5.getClass();
        fo1 r4 = (fo1) this.n;
        String r0 = r5.getMessage();
        if (r0 != null) goto L6;
        r0 = "";
    L6:
        if (xm4.k0(r0, "40", false) == false) goto L8;
    L13:
        String r6 = r4.v(R.string.homemusic_login_wrong, new Object[0]);
    L14:
        fo1.a(r4, r6);
        return;
    L8:
        if (xm4.k0(r0, "41", false) == true) goto L13;
        r6 = r5.getMessage();
        if (r6 != null) goto L14;
        r6 = r4.v(R.string.homemusic_login_wrong, new Object[0]);
        goto L14
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        ((k03) this.n).k(ya4.E((List) this.o, kb4.h(null)));
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onNetworkFailure(Exception r2) {
        r2.getClass();
        fo1 r1 = (fo1) this.n;
        fo1.a(r1, r1.v(R.string.homemusic_login_no_network, new Object[0]));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r3, Response r4) {
        if (r4.isSuccessful() == true) goto L5;
    L16:
        ArrayList r5 = null;
    L17:
        ((k03) this.n).k(ya4.E((List) this.o, kb4.h(r5)));
        return;
    L5:
        if (r4.body() == null) goto L16;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getArtists() == null) goto L16;
        r5 = new ArrayList();
        List<IndexID3> r6 = ((ApiResponse) r4.body()).getSubsonicResponse().getArtists().getIndices();
        if (r6 == null) goto L17;
        Iterator<IndexID3> r7 = r6.iterator();
    L12:
        if (r7.hasNext() == false) goto L17;
        IndexID3 r0 = r7.next();
        if (r0.getArtists() == null) goto L12;
        r5.addAll(r0.getArtists());
        goto L12
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onSuccess(String r2, String r3, String r4) {
        new Thread(new oa4(AppDatabase.y().G(), (Server) this.o, 1)).start();
        new mm3().h();
        fo1 r1 = (fo1) this.n;
        if (r1.c() == false) goto L13;
        r1.r(false);
        nc1 r5 = ((LoginFragment) r1.b).l();
        if ((r5 instanceof MainActivity) == false) goto L8;
        MainActivity r6 = (MainActivity) r5;
    L9:
        if (r6 == null) goto L12;
        r6.v();
        return;
    L12:
        return;
    L8:
        r6 = null;
        goto L9
    }

    public /* synthetic */ rf2(Object r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public rf2(String r1, vr1 r2, pa r3) {
        this.o = r1;
        this.n = r2;
    }

    public /* synthetic */ rf2(Object r1) {
        this.n = r1;
    }

    public rf2(p24 r1, y34 r2) {
        r2.getClass();
        this.o = r1;
        this.n = r2;
    }

    public rf2(Context r3) {
        this(r3, new bl0(0));
    }

    public rf2(Context r1, bi0 r2) {
        this.n = r1.getApplicationContext();
        r2.getClass();
        this.o = r2;
    }

    public rf2(Handler r1, o55 r2) {
        if (r2 == null) goto L5;
        r1.getClass();
    L6:
        this.n = r1;
        this.o = r2;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public rf2(ee1 r1, kc1 r2, FrameLayout r3) {
        this.n = r2;
        this.o = r3;
    }
}
