package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uv {
    public final /* synthetic */ int n;
    public int o;

    public /* synthetic */ uv(int i, int i2) {
        this.n = i2;
        this.o = i;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = h12.j(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void a(int i) {
        this.o = i | this.o;
    }

    public boolean d(int i) {
        return (this.o & i) == i;
    }

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public void j(we1 we1Var) {
    }

    public abstract void l(we1 we1Var);

    public abstract void o(we1 we1Var, int i, int i2);

    public abstract void p(we1 we1Var);

    public abstract void q(we1 we1Var, int i, int i2);

    public String toString() {
        switch (this.n) {
            case 2:
                return c(this.o);
            default:
                return super.toString();
        }
    }
}
