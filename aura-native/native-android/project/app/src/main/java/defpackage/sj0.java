package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sj0 {
    public long a;
    public long b;
    public Serializable c;

    public sj0(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public synchronized Object a(Object obj) {
        of2 of2Var;
        of2Var = (of2) ((LinkedHashMap) this.c).get(obj);
        return of2Var != null ? of2Var.a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j = iB;
        if (j >= this.a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        of2 of2Var = (of2) ((LinkedHashMap) this.c).put(obj, obj2 == null ? null : new of2(iB, obj2));
        if (of2Var != null) {
            this.b -= (long) of2Var.b;
            if (!of2Var.a.equals(obj2)) {
                c(obj, of2Var.a);
            }
        }
        f(this.a);
        return of2Var != null ? of2Var.a : null;
    }

    public void e(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L && tj0.c0.get() <= 0) {
            this.a = 200 + jElapsedRealtime;
        }
        long j = this.a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void f(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            of2 of2Var = (of2) entry.getValue();
            this.b -= (long) of2Var.b;
            Object key = entry.getKey();
            it.remove();
            c(key, of2Var.a);
        }
    }

    public sj0() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
