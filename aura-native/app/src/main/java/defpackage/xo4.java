package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xo4 extends zo4 {
    public xo4(defpackage.we1 a0, java.lang.String a1) {
        super(a0, a1);
    }

    public int[] q;
    public long[] r;
    public double[] s;
    public String[] t;
    public byte[][] u;
    public Cursor v;

    public static void n(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            h12.P(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.z34
    public final String D(int i) {
        b();
        Cursor q = q();
        n(q, i);
        String string = q.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.z34
    public final boolean O() {
        b();
        j();
        Cursor cursor = this.v;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        kf2.o("Required value was null.");
        return false;
    }

    @Override // defpackage.z34
    public final void c(int i, long j) {
        b();
        f(1, i);
        this.q[i] = 1;
        this.r[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.p) {
            b();
            this.q = new int[0];
            this.r = new long[0];
            this.s = new double[0];
            this.t = new String[0];
            this.u = new byte[0][];
            reset();
        }
        this.p = true;
    }

    @Override // defpackage.z34
    public final void d(double d, int i) {
        b();
        f(2, i);
        this.q[i] = 2;
        this.s[i] = d;
    }

    @Override // defpackage.z34
    public final void e(int i) {
        b();
        f(5, i);
        this.q[i] = 5;
    }

    public final void f(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.q;
        if (iArr.length < i3) {
            this.q = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.r;
            if (jArr.length < i3) {
                this.r = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.s;
            if (dArr.length < i3) {
                this.s = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.t;
            if (strArr.length < i3) {
                this.t = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.u;
        if (bArr.length < i3) {
            this.u = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.z34
    public final int getColumnCount() {
        b();
        j();
        Cursor cursor = this.v;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.z34
    public final String getColumnName(int i) {
        b();
        j();
        Cursor cursor = this.v;
        if (cursor == null) {
            kf2.o("Required value was null.");
            return null;
        }
        n(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.z34
    public final double getDouble(int i) {
        b();
        Cursor q = q();
        n(q, i);
        return q.getDouble(i);
    }

    @Override // defpackage.z34
    public final long getLong(int i) {
        b();
        Cursor q = q();
        n(q, i);
        return q.getLong(i);
    }

    @Override // defpackage.z34
    public final boolean isNull(int i) {
        b();
        Cursor q = q();
        n(q, i);
        return q.isNull(i);
    }

    public final void j() {
        if (this.v == null) {
            this.v = this.n.F(new rm2(22, this));
        }
    }

    public final Cursor q() {
        Cursor cursor = this.v;
        if (cursor != null) {
            return cursor;
        }
        h12.P(21, "no row");
        throw null;
    }

    @Override // defpackage.z34
    public final void r(int i, String str) {
        str.getClass();
        b();
        f(3, i);
        this.q[i] = 3;
        this.t[i] = str;
    }

    @Override // defpackage.z34
    public final void reset() {
        b();
        Cursor cursor = this.v;
        if (cursor != null) {
            cursor.close();
        }
        this.v = null;
    }
}
