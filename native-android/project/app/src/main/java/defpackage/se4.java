package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class se4 {
    public static final HashSet k = new HashSet();
    public final File a;
    public final mx b;
    public final ml3 c;
    public final rf2 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public Cache$CacheException j;

    public se4(File file, mx mxVar, tk4 tk4Var) {
        boolean zAdd;
        ml3 ml3Var = new ml3(tk4Var, file);
        rf2 rf2Var = tk4Var != null ? new rf2(tk4Var) : null;
        synchronized (se4.class) {
            zAdd = k.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            er1.o(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.a = file;
        this.b = mxVar;
        this.c = ml3Var;
        this.d = rf2Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = mxVar.e();
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new re4(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(se4 se4Var) {
        long j;
        rf2 rf2Var = se4Var.d;
        ml3 ml3Var = se4Var.c;
        File file = se4Var.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                se4Var.j = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            l93.F("SimpleCache", str);
            se4Var.j = new Cache$CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    l93.F("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        se4Var.h = j;
        if (j == -1) {
            try {
                se4Var.h = f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                l93.G("SimpleCache", str2, e2);
                se4Var.j = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            ml3Var.q(se4Var.h);
            if (rf2Var != null) {
                rf2Var.h(se4Var.h);
                HashMap mapC = rf2Var.c();
                se4Var.k(file, true, fileArrListFiles, mapC);
                rf2Var.i(mapC.keySet());
            } else {
                se4Var.k(file, true, fileArrListFiles, null);
            }
            o15 it = jx1.k(((HashMap) ml3Var.a).keySet()).iterator();
            while (it.hasNext()) {
                ml3Var.s((String) it.next());
            }
            try {
                ml3Var.u();
            } catch (IOException e3) {
                l93.G("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            l93.G("SimpleCache", str3, e4);
            se4Var.j = new Cache$CacheException(str3, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        l93.F("SimpleCache", str);
        throw new Cache$CacheException(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        tb4.d(file2, "Failed to create UID file: ");
        return 0L;
    }

    public final void b(te4 te4Var) {
        String str = te4Var.n;
        this.c.m(str).c.add(te4Var);
        this.i += te4Var.p;
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mx) arrayList.get(size)).b(this, te4Var);
            }
        }
        this.b.b(this, te4Var);
    }

    public final synchronized void c(String str, xc5 xc5Var) {
        d();
        ml3 ml3Var = this.c;
        wx wxVarM = ml3Var.m(str);
        yj0 yj0Var = wxVarM.e;
        yj0 yj0VarB = yj0Var.b(xc5Var);
        wxVarM.e = yj0VarB;
        if (!yj0VarB.equals(yj0Var)) {
            ((xx) ml3Var.e).e(wxVarM);
        }
        try {
            this.c.u();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.j;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long g(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        j3 = 0;
        while (j < j5) {
            long jH = h(j, j5 - j, str);
            if (jH > 0) {
                j3 += jH;
            } else {
                jH = -jH;
            }
            j += jH;
        }
        return j3;
    }

    public final synchronized long h(long j, long j2, String str) {
        wx wxVarL;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        wxVarL = this.c.l(str);
        return wxVarL != null ? wxVarL.a(j, j2) : -j2;
    }

    public final synchronized yj0 i(String str) {
        wx wxVarL;
        wxVarL = this.c.l(str);
        return wxVarL != null ? wxVarL.e : yj0.c;
    }

    public final synchronized boolean j(String str, long j) {
        wx wxVarL;
        wxVarL = this.c.l(str);
        return wxVarL != null && wxVarL.a(0L, j) >= j;
    }

    public final void k(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                k(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                nx nxVar = map != null ? (nx) map.remove(name) : null;
                if (nxVar != null) {
                    j = nxVar.a;
                    j2 = nxVar.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                te4 te4VarB = te4.b(file2, j, j2, this.c);
                if (te4VarB != null) {
                    b(te4VarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void l(te4 te4Var) {
        wx wxVarL = this.c.l(te4Var.n);
        wxVarL.getClass();
        long j = te4Var.o;
        ArrayList arrayList = wxVarL.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((vx) arrayList.get(i)).a == j) {
                arrayList.remove(i);
                this.c.s(wxVarL.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final synchronized void m(String str) {
        wx wxVarL;
        synchronized (this) {
            try {
                wxVarL = this.c.l(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((wxVarL == null || wxVarL.c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) wxVarL.c)).iterator();
        while (it.hasNext()) {
            n((te4) it.next());
        }
    }

    public final void n(te4 te4Var) {
        String str = te4Var.n;
        File file = te4Var.r;
        ml3 ml3Var = this.c;
        wx wxVarL = ml3Var.l(str);
        if (wxVarL == null || !wxVarL.c.remove(te4Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        this.i -= te4Var.p;
        rf2 rf2Var = this.d;
        if (rf2Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) rf2Var.o).getClass();
                try {
                    ((tk4) rf2Var.n).getWritableDatabase().delete((String) rf2Var.o, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                xa3.s("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        ml3Var.s(wxVarL.b);
        ArrayList arrayList = (ArrayList) this.e.get(te4Var.n);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mx) arrayList.get(size)).d(te4Var);
            }
        }
        this.b.d(te4Var);
    }

    public final void o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            for (te4 te4Var : ((wx) it.next()).c) {
                File file = te4Var.r;
                file.getClass();
                if (file.length() != te4Var.p) {
                    arrayList.add(te4Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            n((te4) arrayList.get(i));
        }
    }

    public final synchronized te4 p(long j, long j2, String str) {
        long j3;
        te4 te4VarB;
        d();
        wx wxVarL = this.c.l(str);
        if (wxVarL != null) {
            j3 = j;
            while (true) {
                te4VarB = wxVarL.b(j3, j2);
                if (!te4VarB.q) {
                    break;
                }
                File file = te4VarB.r;
                file.getClass();
                if (file.length() == te4VarB.p) {
                    break;
                }
                o();
            }
        } else {
            j3 = j;
            te4VarB = new te4(str, j3, j2, -9223372036854775807L, null);
        }
        if (te4VarB.q) {
            return q(str, te4VarB);
        }
        wx wxVarM = this.c.m(str);
        long j4 = te4VarB.p;
        ArrayList arrayList = wxVarM.d;
        for (int i = 0; i < arrayList.size(); i++) {
            vx vxVar = (vx) arrayList.get(i);
            long j5 = vxVar.a;
            if (j5 <= j3) {
                long j6 = vxVar.b;
                if (j6 == -1 || j5 + j6 > j3) {
                    return null;
                }
            } else {
                if (j4 == -1 || j3 + j4 > j5) {
                    return null;
                }
            }
        }
        arrayList.add(new vx(j3, j4));
        return te4VarB;
    }

    public final te4 q(String str, te4 te4Var) {
        boolean z;
        File file;
        File file2 = te4Var.r;
        if (!this.g) {
            return te4Var;
        }
        file2.getClass();
        String name = file2.getName();
        long j = te4Var.p;
        long jCurrentTimeMillis = System.currentTimeMillis();
        rf2 rf2Var = this.d;
        if (rf2Var != null) {
            try {
                rf2Var.k(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                l93.q0("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        wx wxVarL = this.c.l(str);
        wxVarL.getClass();
        TreeSet treeSet = wxVarL.c;
        rr2.w(treeSet.remove(te4Var));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = te4.c(parentFile, wxVarL.a, te4Var.o, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                l93.q0("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        rr2.w(te4Var.q);
        te4 te4Var2 = new te4(te4Var.n, te4Var.o, te4Var.p, jCurrentTimeMillis, file);
        treeSet.add(te4Var2);
        ArrayList arrayList = (ArrayList) this.e.get(te4Var.n);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mx) arrayList.get(size)).c(this, te4Var, te4Var2);
            }
        }
        this.b.c(this, te4Var, te4Var2);
        return te4Var2;
    }
}
