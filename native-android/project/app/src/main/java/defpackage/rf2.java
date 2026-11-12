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
import com.eddyizm.tempus.homemusic.WaveRetry;
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
    public static final String[] p = {"name", "length", "last_touch_timestamp"};
    public Object n;
    public Object o;

    public rf2(int i) {
        switch (i) {
            case 8:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.n = byteArrayOutputStream;
                this.o = new DataOutputStream(byteArrayOutputStream);
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                this.n = new w03();
                this.o = new w03();
                break;
            case 19:
                this.n = new ArrayList();
                this.o = new HashMap();
                break;
            default:
                this.n = new m45(0);
                this.o = new m45(0);
                break;
        }
    }

    public void a(bj0 bj0Var) {
        synchronized (bj0Var) {
        }
        Handler handler = (Handler) this.n;
        if (handler != null) {
            handler.post(new n55(this, bj0Var, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:72:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:72:0x00b4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b9, please report this as an issue */
    @Override // defpackage.y34
    public x34 b(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        p24 p24Var = (p24) this.o;
        if (!str.equals(":memory:")) {
            str = p24Var.c.a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        v21 v21Var = new v21(str, (p24Var.a || p24Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = v21Var.a;
        reentrantLock.lock();
        wo0 wo0Var = v21Var.b;
        if (wo0Var != null) {
            try {
                wo0Var.D();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        try {
            try {
                if (p24Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                x34 x34VarB = ((y34) this.n).b(str);
                if (p24Var.a) {
                    if (p24Var.c.g == r24.p) {
                        h12.n(x34VarB, "PRAGMA synchronous = NORMAL");
                    } else {
                        h12.n(x34VarB, "PRAGMA synchronous = FULL");
                    }
                    p24.b(x34VarB);
                    p24Var.d.s(x34VarB);
                } else {
                    try {
                        p24Var.b = true;
                        p24.a(p24Var, x34VarB);
                        p24Var.b = false;
                    } catch (Throwable th3) {
                        p24Var.b = false;
                        throw th3;
                    }
                }
                if (wo0Var != null && (fileChannel2 = (FileChannel) wo0Var.o) != null) {
                    try {
                        fileChannel2.close();
                        wo0Var.o = null;
                    } catch (Throwable th4) {
                        wo0Var.o = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return x34VarB;
            } catch (Throwable th5) {
                th = th5;
                if (z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th6) {
            if (wo0Var != null && (fileChannel = (FileChannel) wo0Var.o) != null) {
                try {
                    fileChannel.close();
                } finally {
                    wo0Var.o = null;
                }
            }
            throw th6;
        }
    }

    public HashMap c() throws DatabaseIOException {
        try {
            ((String) this.o).getClass();
            Cursor cursorQuery = ((tk4) this.n).getReadableDatabase().query((String) this.o, p, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new nx(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
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
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public synchronized List d(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.n).contains(str)) {
                ((ArrayList) this.n).add(str);
            }
            arrayList = (List) ((HashMap) this.o).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.o).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // defpackage.fn1
    public ce3 e(cn1 cn1Var, ym1 ym1Var) {
        return new qr2(((fn1) this.n).e(cn1Var, ym1Var), (List) this.o, false, 9);
    }

    public synchronized ArrayList f(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.n;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<u04> list = (List) ((HashMap) this.o).get((String) obj);
            if (list != null) {
                for (u04 u04Var : list) {
                    if ((u04Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(u04Var.b)) && !arrayList.contains(u04Var.b)) {
                        arrayList.add(u04Var.b);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.fn1
    public ce3 g() {
        return new qr2(((fn1) this.n).g(), (List) this.o, false, 9);
    }

    public void h(long j) throws DatabaseIOException {
        tk4 tk4Var = (tk4) this.n;
        try {
            String hexString = Long.toHexString(j);
            this.o = "ExoPlayerCacheFileMetadata" + hexString;
            if (r45.a(tk4Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = tk4Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    r45.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.o));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.o) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void i(Set set) throws DatabaseIOException {
        ((String) this.o).getClass();
        try {
            SQLiteDatabase writableDatabase = ((tk4) this.n).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.o, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void j(Object obj) {
        Handler handler = (Handler) this.n;
        if (handler != null) {
            handler.post(new sn1(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public void k(long j, long j2, String str) throws DatabaseIOException {
        ((String) this.o).getClass();
        try {
            SQLiteDatabase writableDatabase = ((tk4) this.n).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.o, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void l(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.o;
        cardView.q.set(i, i2, i3, i4);
        Rect rect = cardView.p;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new zj0((Context) this.n, ((bi0) this.o).m());
    }

    public void n(boolean z, boolean z2) {
        Context context = (Context) this.n;
        boolean z3 = false;
        if (z && ((WifiManager.WifiLock) this.o) == null) {
            if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                l93.q0("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                return;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                l93.q0("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.o = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.o;
        if (wifiLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void o(s55 s55Var) {
        Handler handler = (Handler) this.n;
        if (handler != null) {
            handler.post(new ur2(27, this, s55Var));
        }
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onError(Exception exc) {
        String strV;
        exc.getClass();
        fo1 fo1Var = (fo1) this.n;
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        if (xm4.k0(message, "40", false) || xm4.k0(message, "41", false)) {
            strV = fo1Var.v(R.string.homemusic_login_wrong, new Object[0]);
        } else {
            strV = exc.getMessage();
            if (strV == null) {
                strV = fo1Var.v(R.string.homemusic_login_wrong, new Object[0]);
            }
        }
        fo1.a(fo1Var, strV);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((k03) this.n).k(ya4.E((List) this.o, kb4.h(null)));
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onNetworkFailure(Exception exc) {
        exc.getClass();
        fo1 fo1Var = (fo1) this.n;
        fo1.a(fo1Var, fo1Var.v(R.string.homemusic_login_no_network, new Object[0]));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        ArrayList arrayList;
        if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getArtists() == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            List<IndexID3> indices = ((ApiResponse) response.body()).getSubsonicResponse().getArtists().getIndices();
            if (indices != null) {
                for (IndexID3 indexID3 : indices) {
                    if (indexID3.getArtists() != null) {
                        arrayList.addAll(indexID3.getArtists());
                    }
                }
            }
        }
        ((k03) this.n).k(ya4.E((List) this.o, kb4.h(arrayList)));
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onSuccess(String str, String str2, String str3) {
        new Thread(new oa4(AppDatabase.y().G(), (Server) this.o, 1)).start();
        new mm3().h();
        fo1 fo1Var = (fo1) this.n;
        if (fo1Var.c()) {
            fo1Var.r(false);
            nc1 nc1VarE = ((LoginFragment) fo1Var.b).e();
            MainActivity mainActivity = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
            if (mainActivity != null) {
                mainActivity.v();
            }
        }
    }

    public /* synthetic */ rf2(Object obj, Object obj2) {
        this.n = obj;
        this.o = obj2;
    }

    public rf2(String str, vr1 vr1Var, pa paVar) {
        this.o = str;
        this.n = vr1Var;
    }

    public /* synthetic */ rf2(Object obj) {
        this.n = obj;
    }

    public rf2(p24 p24Var, y34 y34Var) {
        y34Var.getClass();
        this.o = p24Var;
        this.n = y34Var;
    }

    public rf2(Context context) {
        this(context, (bi0) new bl0(0));
    }

    public rf2(Context context, bi0 bi0Var) {
        this.n = context.getApplicationContext();
        bi0Var.getClass();
        this.o = bi0Var;
    }

    public rf2(Handler handler, o55 o55Var) {
        if (o55Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.n = handler;
        this.o = o55Var;
    }

    public rf2(ee1 ee1Var, kc1 kc1Var, FrameLayout frameLayout) {
        this.n = kc1Var;
        this.o = frameLayout;
    }
}
