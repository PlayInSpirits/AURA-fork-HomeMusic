package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.database.DatabaseIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 extends Handler {
    public final HandlerThread a;
    public final fk0 b;
    public final z05 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public it0(HandlerThread handlerThread, fk0 fk0Var, z05 z05Var, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = fk0Var;
        this.c = z05Var;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static ns0 a(ns0 ns0Var, int i, int i2) {
        return new ns0(ns0Var.a, i, ns0Var.c, System.currentTimeMillis(), ns0Var.e, i2, 0, ns0Var.h);
    }

    public final ns0 b(String str, boolean z) {
        int iC = c(str);
        if (iC != -1) {
            return (ns0) this.e.get(iC);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.d(str);
        } catch (IOException e) {
            l93.G("DownloadManager", "Failed to load download: " + str, e);
            return null;
        }
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((ns0) arrayList.get(i)).a.n.equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final void d(ns0 ns0Var) {
        int i = ns0Var.b;
        rr2.w((i == 3 || i == 4) ? false : true);
        int iC = c(ns0Var.a.n);
        int i2 = 11;
        ArrayList arrayList = this.e;
        if (iC == -1) {
            arrayList.add(ns0Var);
            Collections.sort(arrayList, new n7(i2));
        } else {
            boolean z = ns0Var.c != ((ns0) arrayList.get(iC)).c;
            arrayList.set(iC, ns0Var);
            if (z) {
                Collections.sort(arrayList, new n7(i2));
            }
        }
        try {
            this.b.j(ns0Var);
        } catch (IOException e) {
            l93.G("DownloadManager", "Failed to update index.", e);
        }
        this.d.obtainMessage(3, new ht0(ns0Var, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final ns0 e(ns0 ns0Var, int i, int i2) {
        rr2.w((i == 3 || i == 4) ? false : true);
        ns0 ns0VarA = a(ns0Var, i, i2);
        d(ns0VarA);
        return ns0VarA;
    }

    public final void f(ns0 ns0Var, int i) {
        if (i == 0) {
            if (ns0Var.b == 1) {
                e(ns0Var, 0, 0);
            }
        } else if (i != ns0Var.f) {
            int i2 = ns0Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new ns0(ns0Var.a, i2, ns0Var.c, System.currentTimeMillis(), ns0Var.e, i, 0, ns0Var.h));
        }
    }

    public final void g() {
        kt0 kt0Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            ns0 ns0Var = (ns0) arrayList.get(i);
            tt0 tt0Var = ns0Var.a;
            String str = tt0Var.n;
            HashMap map = this.f;
            kt0 kt0Var2 = (kt0) map.get(str);
            int i3 = ns0Var.b;
            z05 z05Var = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        kt0Var2.getClass();
                        rr2.w(!kt0Var2.q);
                        if (this.h || this.g != 0 || i2 >= this.i) {
                            e(ns0Var, 0, 0);
                            kt0Var2.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            tb4.a();
                            return;
                        }
                        if (kt0Var2 != null) {
                            if (!kt0Var2.q) {
                                kt0Var2.a(false);
                            }
                        } else if (!this.l) {
                            kt0 kt0Var3 = new kt0(ns0Var.a, z05Var.d(tt0Var), ns0Var.h, true, this.j, this);
                            map.put(tt0Var.n, kt0Var3);
                            this.l = true;
                            kt0Var3.start();
                        }
                    }
                } else if (kt0Var2 != null) {
                    rr2.w(!kt0Var2.q);
                    kt0Var2.a(false);
                }
            } else if (kt0Var2 != null) {
                rr2.w(!kt0Var2.q);
                kt0Var2.a(false);
            } else {
                if (this.h || this.g != 0 || this.k >= this.i) {
                    kt0Var = null;
                } else {
                    ns0 ns0VarE = e(ns0Var, 2, 0);
                    tt0 tt0Var2 = ns0VarE.a;
                    kt0Var = new kt0(ns0VarE.a, z05Var.d(tt0Var2), ns0VarE.h, false, this.j, this);
                    map.put(tt0Var2.n, kt0Var);
                    int i4 = this.k;
                    this.k = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(12, 5000L);
                    }
                    kt0Var.start();
                }
                kt0Var2 = kt0Var;
            }
            if (kt0Var2 != null && !kt0Var2.q) {
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0226 A[LOOP:3: B:107:0x0220->B:109:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x023d A[LOOP:4: B:111:0x0237->B:113:0x023d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x026d A[LOOP:5: B:120:0x0267->B:122:0x026d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4 = 7;
        ek0 ek0VarG = null;
        i = 0;
        int i5 = 0;
        switch (message.what) {
            case 1:
                int i6 = message.arg1;
                fk0 fk0Var = this.b;
                ArrayList arrayList3 = this.e;
                this.g = i6;
                try {
                    fk0Var.l();
                    ek0VarG = fk0Var.g(0, 1, 2, 5, 7);
                    while (true) {
                        Cursor cursor = ek0VarG.n;
                        if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                            this.d.obtainMessage(1, new ArrayList(arrayList3)).sendToTarget();
                            g();
                            i5 = 1;
                            this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                            return;
                        }
                        arrayList3.add(fk0.e(ek0VarG.n));
                    }
                } catch (IOException e) {
                    l93.G("DownloadManager", "Failed to load index.", e);
                    arrayList3.clear();
                } finally {
                    f35.h(ek0VarG);
                }
                break;
            case 2:
                this.h = message.arg1 != 0;
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                this.g = message.arg1;
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 4:
                String str = (String) message.obj;
                int i7 = message.arg1;
                fk0 fk0Var2 = this.b;
                ArrayList arrayList4 = this.e;
                if (str != null) {
                    ns0 ns0VarB = b(str, false);
                    if (ns0VarB != null) {
                        f(ns0VarB, i7);
                    } else {
                        try {
                            fk0Var2.n(i7, str);
                        } catch (IOException e2) {
                            l93.G("DownloadManager", "Failed to set manual stop reason: ".concat(str), e2);
                        }
                    }
                    break;
                } else {
                    for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                        f((ns0) arrayList4.get(i8), i7);
                    }
                    try {
                        fk0Var2.b();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i7));
                            fk0Var2.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, fk0.e, null);
                        } catch (SQLException e3) {
                            throw new DatabaseIOException(e3);
                        }
                    } catch (IOException e4) {
                        l93.G("DownloadManager", "Failed to set manual stop reason", e4);
                    }
                    break;
                }
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 5:
                this.i = message.arg1;
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 6:
                this.j = message.arg1;
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 7:
                tt0 tt0Var = (tt0) message.obj;
                int i9 = message.arg1;
                ns0 ns0VarB2 = b(tt0Var.n, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (ns0VarB2 != null) {
                    int i10 = ns0VarB2.b;
                    long j = (i10 == 5 || i10 == 3 || i10 == 4) ? jCurrentTimeMillis : ns0VarB2.c;
                    if (i10 != 5 && i10 != 7) {
                        i4 = i9 != 0 ? 1 : 0;
                    }
                    tt0 tt0Var2 = ns0VarB2.a;
                    String str2 = tt0Var2.n;
                    String str3 = tt0Var.n;
                    List list = tt0Var.q;
                    rr2.l(str2.equals(str3));
                    List list2 = tt0Var2.q;
                    if (list2.isEmpty() || list.isEmpty()) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = new ArrayList(list2);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            fm4 fm4Var = (fm4) list.get(i11);
                            if (!arrayList.contains(fm4Var)) {
                                arrayList.add(fm4Var);
                            }
                        }
                    }
                    d(new ns0(new tt0(tt0Var2.n, tt0Var.o, tt0Var.p, arrayList, tt0Var.r, tt0Var.s, tt0Var.t, tt0Var.u, tt0Var.v), i4, j, jCurrentTimeMillis, i9));
                } else {
                    d(new ns0(tt0Var, i9 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i9));
                }
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 8:
                String str4 = (String) message.obj;
                ns0 ns0VarB3 = b(str4, true);
                if (ns0VarB3 == null) {
                    l93.F("DownloadManager", "Failed to remove nonexistent download: " + str4);
                } else {
                    e(ns0VarB3, 5, 0);
                    g();
                }
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 9:
                fk0 fk0Var3 = this.b;
                ArrayList arrayList5 = this.e;
                ArrayList arrayList6 = new ArrayList();
                try {
                    ek0 ek0VarG2 = fk0Var3.g(3, 4);
                    while (true) {
                        try {
                            Cursor cursor2 = ek0VarG2.n;
                            try {
                                if (!cursor2.moveToPosition(cursor2.getPosition() + 1)) {
                                    ek0VarG2.close();
                                    for (i = 0; i < arrayList5.size(); i++) {
                                        arrayList5.set(i, a((ns0) arrayList5.get(i), 5, 0));
                                    }
                                    for (i2 = 0; i2 < arrayList6.size(); i2++) {
                                        arrayList5.add(a((ns0) arrayList6.get(i2), 5, 0));
                                    }
                                    Collections.sort(arrayList5, new n7(11));
                                    fk0Var3.m();
                                    arrayList2 = new ArrayList(arrayList5);
                                    for (i3 = 0; i3 < arrayList5.size(); i3++) {
                                        this.d.obtainMessage(3, new ht0((ns0) arrayList5.get(i3), false, arrayList2, null)).sendToTarget();
                                    }
                                    g();
                                    i5 = 1;
                                    this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                                    return;
                                }
                                arrayList6.add(fk0.e(ek0VarG2.n));
                                fk0Var3.m();
                                break;
                            } catch (IOException e5) {
                                l93.G("DownloadManager", "Failed to update index.", e5);
                            }
                            while (i < arrayList5.size()) {
                                arrayList5.set(i, a((ns0) arrayList5.get(i), 5, 0));
                            }
                            while (i2 < arrayList6.size()) {
                                arrayList5.add(a((ns0) arrayList6.get(i2), 5, 0));
                            }
                            Collections.sort(arrayList5, new n7(11));
                            arrayList2 = new ArrayList(arrayList5);
                            while (i3 < arrayList5.size()) {
                                this.d.obtainMessage(3, new ht0((ns0) arrayList5.get(i3), false, arrayList2, null)).sendToTarget();
                            }
                            g();
                            i5 = 1;
                            this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                            return;
                        } catch (Throwable th) {
                            try {
                                ek0VarG2.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                        l93.F("DownloadManager", "Failed to load downloads.");
                    }
                } catch (IOException unused) {
                    l93.F("DownloadManager", "Failed to load downloads.");
                }
                break;
            case 10:
                kt0 kt0Var = (kt0) message.obj;
                String str5 = kt0Var.n.n;
                this.f.remove(str5);
                boolean z = kt0Var.q;
                if (z) {
                    this.l = false;
                } else {
                    int i12 = this.k - 1;
                    this.k = i12;
                    if (i12 == 0) {
                        removeMessages(12);
                    }
                }
                if (!kt0Var.t) {
                    Exception exc = kt0Var.u;
                    if (exc != null) {
                        l93.G("DownloadManager", "Task failed: " + kt0Var.n + ", " + z, exc);
                    }
                    ns0 ns0VarB4 = b(str5, false);
                    ns0VarB4.getClass();
                    int i13 = ns0VarB4.b;
                    if (i13 == 2) {
                        rr2.w(!z);
                        ArrayList arrayList7 = this.e;
                        ns0 ns0Var = new ns0(ns0VarB4.a, exc == null ? 3 : 4, ns0VarB4.c, System.currentTimeMillis(), ns0VarB4.e, ns0VarB4.f, exc == null ? 0 : 1, ns0VarB4.h);
                        arrayList7.remove(c(ns0Var.a.n));
                        try {
                            this.b.j(ns0Var);
                        } catch (IOException e6) {
                            l93.G("DownloadManager", "Failed to update index.", e6);
                        }
                        this.d.obtainMessage(3, new ht0(ns0Var, false, new ArrayList(arrayList7), exc)).sendToTarget();
                    } else {
                        if (i13 != 5 && i13 != 7) {
                            tb4.a();
                            return;
                        }
                        rr2.w(z);
                        ArrayList arrayList8 = this.e;
                        int i14 = ns0VarB4.b;
                        tt0 tt0Var3 = ns0VarB4.a;
                        if (i14 == 7) {
                            int i15 = ns0VarB4.f;
                            e(ns0VarB4, i15 == 0 ? 0 : 1, i15);
                            g();
                        } else {
                            arrayList8.remove(c(tt0Var3.n));
                            try {
                                fk0 fk0Var4 = this.b;
                                String str6 = tt0Var3.n;
                                fk0Var4.b();
                                try {
                                    fk0Var4.b.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str6});
                                } catch (SQLiteException e7) {
                                    throw new DatabaseIOException(e7);
                                }
                            } catch (IOException unused2) {
                                l93.F("DownloadManager", "Failed to remove from database");
                            }
                            this.d.obtainMessage(3, new ht0(ns0VarB4, true, new ArrayList(arrayList8), null)).sendToTarget();
                        }
                    }
                    g();
                    break;
                } else {
                    g();
                }
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 11:
                kt0 kt0Var2 = (kt0) message.obj;
                int i16 = message.arg1;
                int i17 = message.arg2;
                String str7 = f35.a;
                long j2 = ((((long) i16) & 4294967295L) << 32) | (4294967295L & ((long) i17));
                ns0 ns0VarB5 = b(kt0Var2.n.n, false);
                ns0VarB5.getClass();
                if (j2 == ns0VarB5.e || j2 == -1) {
                    return;
                }
                d(new ns0(ns0VarB5.a, ns0VarB5.b, ns0VarB5.c, System.currentTimeMillis(), j2, ns0VarB5.f, ns0VarB5.g, ns0VarB5.h));
                return;
            case 12:
                ArrayList arrayList9 = this.e;
                for (int i18 = 0; i18 < arrayList9.size(); i18++) {
                    ns0 ns0Var2 = (ns0) arrayList9.get(i18);
                    if (ns0Var2.b == 2) {
                        try {
                            this.b.j(ns0Var2);
                        } catch (IOException e8) {
                            l93.G("DownloadManager", "Failed to update index.", e8);
                        }
                    }
                }
                sendEmptyMessageDelayed(12, 5000L);
                return;
            case 13:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((kt0) it.next()).a(true);
                }
                try {
                    this.b.l();
                    break;
                } catch (IOException e9) {
                    l93.G("DownloadManager", "Failed to update index.", e9);
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                tb4.a();
                return;
        }
    }
}
