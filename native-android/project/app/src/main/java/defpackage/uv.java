package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uv {
    public final /* synthetic */ int n;
    public int o;

    public /* synthetic */ uv(int r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    public static void b(String r7) {
        if (r7.equalsIgnoreCase(":memory:") == true) goto L41;
        int r0 = r7.length() - 1;
        int r3 = 0;
        boolean r4 = false;
    L5:
        if (r3 > r0) goto L21;
        if (r4 == true) goto L8;
        int r5 = r3;
    L10:
        if (h12.j(r7.charAt(r5), 32) > 0) goto L12;
        boolean r6 = true;
    L13:
        if (r4 == false) goto L14;
        if (r6 == false) goto L21;
        r0 = r0 - 1;
        goto L5
    L14:
        if (r6 == false) goto L15;
        r3 = r3 + 1;
        goto L5
    L15:
        r4 = true;
        goto L5
    L12:
        r6 = false;
        goto L13
    L8:
        r5 = r0;
    L21:
        if (r7.subSequence(r3, r0 + 1).toString().length() == 0) goto L42;
        Log.w("SupportSQLite", "deleting the database file: ".concat(r7));
        SQLiteDatabase.deleteDatabase(new File(r7));     // Catch: Exception -> L26
        return;
    L26:
        e = move-exception;
        Log.w("SupportSQLite", "delete failed: ", e);
        return;
    L42:
        return;
    }

    public static String c(int r2) {
        return "" + ((char) ((r2 >> 24) & 255)) + ((char) ((r2 >> 16) & 255)) + ((char) ((r2 >> 8) & 255)) + ((char) (r2 & 255));
    }

    public void a(int r2) {
        this.o = r2 | this.o;
    }

    public boolean d(int r1) {
        if ((this.o & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public void j(we1 r1) {
    }

    public abstract void l(we1 r1);

    public abstract void o(we1 r1, int r2, int r3);

    public abstract void p(we1 r1);

    public abstract void q(we1 r1, int r2, int r3);

    public String toString() {
        switch(this.n) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return c(this.o);
    }

    public /* synthetic */ uv() {
        this.n = 0;
    }
}
