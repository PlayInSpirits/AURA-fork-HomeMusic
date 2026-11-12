package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v24 extends uv {
    public li0 p;
    public final List q;
    public final h95 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v24(li0 li0Var, h95 h95Var) {
        super(23, 3);
        li0Var.getClass();
        this.q = li0Var.e;
        this.p = li0Var;
        this.r = h95Var;
    }

    @Override // defpackage.uv
    public final void j(we1 we1Var) {
    }

    @Override // defpackage.uv
    public final void l(we1 we1Var) throws IOException {
        Cursor cursorF = we1Var.F(new vc0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (cursorF.moveToFirst() && cursorF.getInt(0) == 0) {
                z = true;
            }
            cursorF.close();
            h95.a(we1Var);
            if (!z) {
                u24 u24VarB = h95.b(we1Var);
                if (!u24VarB.a) {
                    nz2.x(u24VarB.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = we1Var.n;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List list = this.q;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((m30) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(cursorF, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.uv
    public final void o(we1 we1Var, int i, int i2) throws IOException {
        q(we1Var, i, i2);
    }

    @Override // defpackage.uv
    public final void p(we1 we1Var) throws IOException {
        SQLiteDatabase sQLiteDatabase = we1Var.n;
        Cursor cursorF = we1Var.F(new vc0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            boolean z = cursorF.moveToFirst() && cursorF.getInt(0) != 0;
            cursorF.close();
            if (z) {
                Cursor cursorF2 = we1Var.F(new vc0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorF2.moveToFirst() ? cursorF2.getString(0) : null;
                    cursorF2.close();
                    if (!"86254750241babac4b8d52996a675549".equals(string) && !"1cbd3130fa23b59692c061c594c16cc0".equals(string)) {
                        kf2.o(xa3.g("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", string));
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(cursorF2, th);
                        throw th2;
                    }
                }
            } else {
                u24 u24VarB = h95.b(we1Var);
                if (!u24VarB.a) {
                    nz2.x(u24VarB.b, "Pre-packaged database has an invalid schema: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                }
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.r.n;
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            workDatabase_Impl.p(new po4(we1Var));
            List list = this.q;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((m30) it.next()).a(we1Var);
                }
            }
            this.p = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                q05.h(cursorF, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.uv
    public final void q(we1 we1Var, int i, int i2) throws IOException {
        SQLiteDatabase sQLiteDatabase = we1Var.n;
        li0 li0Var = this.p;
        if (li0Var != null) {
            pz1 pz1Var = li0Var.d;
            pz1Var.getClass();
            List listU = si0.u(pz1Var, i, i2);
            if (listU != null) {
                xl.l(new po4(we1Var));
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    ((jw2) it.next()).b(new po4(we1Var));
                }
                u24 u24VarB = h95.b(we1Var);
                if (!u24VarB.a) {
                    nz2.x(u24VarB.b, "Migration didn't properly handle: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                    return;
                }
            }
        }
        li0 li0Var2 = this.p;
        if (li0Var2 == null || si0.B(li0Var2, i, i2)) {
            kf2.o(b11.n("A migration from ", " to ", i, i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (li0Var2.s) {
            Cursor cursorF = we1Var.F(new vc0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                qb2 qb2VarR = gb.r();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    string.getClass();
                    if (!xm4.k0(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        qb2VarR.add(new kd3(string, Boolean.valueOf(h12.c(cursorF.getString(1), "view"))));
                    }
                }
                qb2 qb2VarF = gb.f(qb2VarR);
                cursorF.close();
                ListIterator listIterator = qb2VarF.listIterator(0);
                while (true) {
                    dm1 dm1Var = (dm1) listIterator;
                    if (!dm1Var.hasNext()) {
                        break;
                    }
                    kd3 kd3Var = (kd3) dm1Var.next();
                    String str = (String) kd3Var.n;
                    if (((Boolean) kd3Var.o).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(cursorF, th);
                    throw th2;
                }
            }
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.q;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((m30) it2.next()).getClass();
            }
        }
        h95.a(we1Var);
    }
}
