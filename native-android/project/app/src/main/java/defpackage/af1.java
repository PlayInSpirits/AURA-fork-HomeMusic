package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 extends SQLiteOpenHelper {
    public static final /* synthetic */ int u = 0;
    public final Context n;
    public final d34 o;
    public final uv p;
    public final boolean q;
    public boolean r;
    public final mq3 s;
    public boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af1(Context context, String str, final d34 d34Var, final uv uvVar, boolean z) {
        String string;
        super(context, str, null, uvVar.o, new DatabaseErrorHandler() { // from class: xe1
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = af1.u;
                sQLiteDatabase.getClass();
                d34 d34Var2 = d34Var;
                we1 we1Var = (we1) d34Var2.o;
                if (we1Var == null || !we1Var.n.equals(sQLiteDatabase)) {
                    we1Var = new we1(sQLiteDatabase);
                    d34Var2.o = we1Var;
                }
                SQLiteDatabase sQLiteDatabase2 = we1Var.n;
                uvVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + we1Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        uv.b(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                uv.b((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                uv.b(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    we1Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        context.getClass();
        uvVar.getClass();
        this.n = context;
        this.o = d34Var;
        this.p = uvVar;
        this.q = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.s = new mq3(string, context.getCacheDir(), false);
    }

    public final we1 b(boolean z) {
        mq3 mq3Var = this.s;
        try {
            mq3Var.a((this.t || getDatabaseName() == null) ? false : true);
            this.r = false;
            SQLiteDatabase sQLiteDatabaseJ = j(z);
            if (!this.r) {
                return f(sQLiteDatabaseJ);
            }
            close();
            return b(z);
        } finally {
            mq3Var.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        mq3 mq3Var = this.s;
        try {
            mq3Var.a(mq3Var.a);
            super.close();
            this.o.o = null;
            this.t = false;
        } finally {
            mq3Var.b();
        }
    }

    public final we1 f(SQLiteDatabase sQLiteDatabase) {
        d34 d34Var = this.o;
        d34Var.getClass();
        we1 we1Var = (we1) d34Var.o;
        if (we1Var != null && we1Var.n.equals(sQLiteDatabase)) {
            return we1Var;
        }
        we1 we1Var2 = new we1(sQLiteDatabase);
        d34Var.o = we1Var2;
        return we1Var2;
    }

    public final SQLiteDatabase j(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.t;
        Context context = this.n;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof ye1) {
                    ye1 ye1Var = (ye1) th;
                    int iOrdinal = ye1Var.n.ordinal();
                    th = ye1Var.o;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        er1.n();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.q) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (ye1 e) {
                    throw e.o;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.r;
        uv uvVar = this.p;
        if (!z && uvVar.o != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            uvVar.j(f(sQLiteDatabase));
        } catch (Throwable th) {
            throw new ye1(ze1.n, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.p.l(f(sQLiteDatabase));
        } catch (Throwable th) {
            throw new ye1(ze1.o, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.r = true;
        try {
            this.p.o(f(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ye1(ze1.q, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.r) {
            try {
                this.p.p(f(sQLiteDatabase));
            } catch (Throwable th) {
                throw new ye1(ze1.r, th);
            }
        }
        this.t = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.r = true;
        try {
            this.p.q(f(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ye1(ze1.p, th);
        }
    }
}
