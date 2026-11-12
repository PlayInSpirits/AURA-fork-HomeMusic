package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p24 {
    public boolean a;
    public boolean b;
    public final li0 c;
    public final qz0 d;
    public final List e;
    public final fa0 f;
    public we1 g;

    public p24(li0 li0Var, qz0 qz0Var) {
        int i;
        ia0 ia0Var;
        r24 r24Var = li0Var.g;
        ro4 ro4Var = li0Var.c;
        String str = li0Var.b;
        this.c = li0Var;
        this.d = qz0Var;
        List list = li0Var.e;
        this.e = list == null ? u01.n : list;
        y34 y34Var = li0Var.t;
        if (y34Var != null) {
            if (str == null) {
                ia0Var = new ia0(new rf2(this, y34Var));
            } else {
                rf2 rf2Var = new rf2(this, y34Var);
                int iOrdinal = r24Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + r24Var + '\'').toString());
                    }
                    i = 4;
                }
                int iOrdinal2 = r24Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + r24Var + '\'').toString());
                }
                ia0Var = new ia0(rf2Var, str, i);
            }
            this.f = ia0Var;
        } else {
            if (ro4Var == null) {
                kf2.n("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = li0Var.a;
            context.getClass();
            this.f = new qo4(new pz1(ro4Var.c(new y10(context, str, new o24(this, qz0Var.a), false, false))));
        }
        boolean z = r24Var == r24.p;
        so4 so4VarC = c();
        if (so4VarC != null) {
            so4VarC.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(p24 p24Var, x34 x34Var) throws Throwable {
        Object s14Var;
        qz0 qz0Var = p24Var.d;
        li0 li0Var = p24Var.c;
        r24 r24Var = li0Var.g;
        r24 r24Var2 = r24.p;
        if (r24Var == r24Var2) {
            h12.n(x34Var, "PRAGMA journal_mode = WAL");
        } else {
            h12.n(x34Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (li0Var.g == r24Var2) {
            h12.n(x34Var, "PRAGMA synchronous = NORMAL");
        } else {
            h12.n(x34Var, "PRAGMA synchronous = FULL");
        }
        b(x34Var);
        z34 z34VarU = x34Var.U("PRAGMA user_version");
        try {
            z34VarU.O();
            int i = (int) z34VarU.getLong(0);
            ud3.e(z34VarU, null);
            int i2 = qz0Var.a;
            if (i != i2) {
                h12.n(x34Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        p24Var.d(x34Var);
                    } else {
                        p24Var.e(x34Var, i, i2);
                    }
                    h12.n(x34Var, "PRAGMA user_version = " + i2);
                    s14Var = j15.a;
                } catch (Throwable th) {
                    s14Var = new s14(th);
                }
                if (!(s14Var instanceof s14)) {
                    h12.n(x34Var, "END TRANSACTION");
                }
                Throwable thA = bb3.a(s14Var);
                if (thA != null) {
                    h12.n(x34Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            p24Var.f(x34Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ud3.e(z34VarU, th2);
                throw th3;
            }
        }
    }

    public static void b(x34 x34Var) {
        z34 z34VarU = x34Var.U("PRAGMA busy_timeout");
        try {
            z34VarU.O();
            long j = z34VarU.getLong(0);
            ud3.e(z34VarU, null);
            if (j < 3000) {
                h12.n(x34Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public final so4 c() {
        fa0 fa0Var = this.f;
        qo4 qo4Var = fa0Var instanceof qo4 ? (qo4) fa0Var : null;
        if (qo4Var != null) {
            return (so4) qo4Var.n.o;
        }
        return null;
    }

    public final void d(x34 x34Var) {
        x34Var.getClass();
        z34 z34VarU = x34Var.U("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (z34VarU.O() && z34VarU.getLong(0) == 0) {
                z = true;
            }
            ud3.e(z34VarU, null);
            qz0 qz0Var = this.d;
            qz0Var.a(x34Var);
            if (!z) {
                u24 u24VarV = qz0Var.v(x34Var);
                if (!u24VarV.a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + u24VarV.b).toString());
                }
            }
            h12.n(x34Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            h12.n(x34Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) qz0Var.b) + "')");
            qz0Var.r(x34Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((m30) it.next()).getClass();
                if (x34Var instanceof po4) {
                    ((po4) x34Var).n.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }

    public final void e(x34 x34Var, int i, int i2) {
        x34Var.getClass();
        li0 li0Var = this.c;
        List listU = si0.u(li0Var.d, i, i2);
        qz0 qz0Var = this.d;
        if (listU != null) {
            qz0Var.u(x34Var);
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                ((jw2) it.next()).b(x34Var);
            }
            u24 u24VarV = qz0Var.v(x34Var);
            if (!u24VarV.a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + u24VarV.b).toString());
            }
            qz0Var.t(x34Var);
            h12.n(x34Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            h12.n(x34Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) qz0Var.b) + "')");
            return;
        }
        if (si0.B(li0Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (li0Var.s) {
            z34 z34VarU = x34Var.U("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                qb2 qb2VarR = gb.r();
                while (z34VarU.O()) {
                    String strD = z34VarU.D(0);
                    if (!xm4.k0(strD, "sqlite_", false) && !strD.equals("android_metadata")) {
                        qb2VarR.add(new kd3(strD, Boolean.valueOf(h12.c(z34VarU.D(1), "view"))));
                    }
                }
                qb2 qb2VarF = gb.f(qb2VarR);
                ud3.e(z34VarU, null);
                ListIterator listIterator = qb2VarF.listIterator(0);
                while (true) {
                    dm1 dm1Var = (dm1) listIterator;
                    if (!dm1Var.hasNext()) {
                        break;
                    }
                    kd3 kd3Var = (kd3) dm1Var.next();
                    String str = (String) kd3Var.n;
                    if (((Boolean) kd3Var.o).booleanValue()) {
                        h12.n(x34Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        h12.n(x34Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ud3.e(z34VarU, th);
                    throw th2;
                }
            }
        } else {
            qz0Var.c(x34Var);
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((m30) it2.next()).getClass();
            if (x34Var instanceof po4) {
                ((po4) x34Var).n.getClass();
            }
        }
        qz0Var.a(x34Var);
    }

    public final void f(x34 x34Var) throws Throwable {
        Object s14Var;
        x34Var.getClass();
        z34 z34VarU = x34Var.U("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = z34VarU.O() && z34VarU.getLong(0) != 0;
            ud3.e(z34VarU, null);
            qz0 qz0Var = this.d;
            if (z) {
                z34 z34VarU2 = x34Var.U("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strD = z34VarU2.O() ? z34VarU2.D(0) : null;
                    ud3.e(z34VarU2, null);
                    if (!((String) qz0Var.b).equals(strD) && !((String) qz0Var.c).equals(strD)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) qz0Var.b) + ", found: " + strD).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ud3.e(z34VarU2, th);
                        throw th2;
                    }
                }
            } else {
                h12.n(x34Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    u24 u24VarV = qz0Var.v(x34Var);
                    if (!u24VarV.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + u24VarV.b).toString());
                    }
                    qz0Var.t(x34Var);
                    h12.n(x34Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    h12.n(x34Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) qz0Var.b) + "')");
                    s14Var = j15.a;
                    if (!(s14Var instanceof s14)) {
                        h12.n(x34Var, "END TRANSACTION");
                    }
                    Throwable thA = bb3.a(s14Var);
                    if (thA != null) {
                        h12.n(x34Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    s14Var = new s14(th3);
                }
            }
            qz0Var.s(x34Var);
            for (m30 m30Var : this.e) {
                m30Var.getClass();
                if (x34Var instanceof po4) {
                    m30Var.a(((po4) x34Var).n);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ud3.e(z34VarU, th4);
                throw th5;
            }
        }
    }

    public p24(li0 li0Var, kl3 kl3Var) {
        r24 r24Var = li0Var.g;
        this.c = li0Var;
        this.d = new n24(-1, "", "");
        List list = li0Var.e;
        u01 u01Var = u01.n;
        this.e = list == null ? u01Var : list;
        ArrayList arrayListF0 = q40.F0(new m30(new kl3(3, this)), list == null ? u01Var : list);
        Context context = li0Var.a;
        String str = li0Var.b;
        ro4 ro4Var = li0Var.c;
        pz1 pz1Var = li0Var.d;
        boolean z = li0Var.f;
        Executor executor = li0Var.h;
        Executor executor2 = li0Var.i;
        Intent intent = li0Var.j;
        boolean z2 = li0Var.k;
        boolean z3 = li0Var.l;
        Set set = li0Var.m;
        String str2 = li0Var.n;
        File file = li0Var.o;
        Callable callable = li0Var.p;
        List list2 = li0Var.q;
        List list3 = li0Var.r;
        boolean z4 = li0Var.s;
        y34 y34Var = li0Var.t;
        ne0 ne0Var = li0Var.u;
        context.getClass();
        pz1Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = new qo4(new pz1((so4) kl3Var.invoke(new li0(context, str, ro4Var, pz1Var, arrayListF0, z, r24Var, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, y34Var, ne0Var))));
        boolean z5 = r24Var == r24.p;
        so4 so4VarC = c();
        if (so4VarC != null) {
            so4VarC.setWriteAheadLoggingEnabled(z5);
        }
    }
}
