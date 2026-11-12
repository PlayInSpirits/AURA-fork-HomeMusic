package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements Closeable {
    public final File n;
    public final File o;
    public final File p;
    public final File q;
    public final long s;
    public BufferedWriter v;
    public int x;
    public long u = 0;
    public final LinkedHashMap w = new LinkedHashMap(0, 0.75f, true);
    public long y = 0;
    public final ThreadPoolExecutor z = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ar0());
    public final zq0 A = new zq0(0, this);
    public final int r = 1;
    public final int t = 1;

    public kr0(File file, long j) {
        this.n = file;
        this.o = new File(file, "journal");
        this.p = new File(file, "journal.tmp");
        this.q = new File(file, "journal.bkp");
        this.s = j;
    }

    public static void M(File file, File file2, boolean z) throws IOException {
        if (z) {
            j(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void b(kr0 kr0Var, ll llVar, boolean z) {
        synchronized (kr0Var) {
            er0 er0Var = (er0) llVar.p;
            if (er0Var.f != llVar) {
                throw new IllegalStateException();
            }
            if (z && !er0Var.e) {
                for (int i = 0; i < kr0Var.t; i++) {
                    if (!((boolean[]) llVar.q)[i]) {
                        llVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!er0Var.d[i].exists()) {
                        llVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < kr0Var.t; i2++) {
                File file = er0Var.d[i2];
                if (!z) {
                    j(file);
                } else if (file.exists()) {
                    File file2 = er0Var.c[i2];
                    file.renameTo(file2);
                    long j = er0Var.b[i2];
                    long length = file2.length();
                    er0Var.b[i2] = length;
                    kr0Var.u = (kr0Var.u - j) + length;
                }
            }
            kr0Var.x++;
            er0Var.f = null;
            if (er0Var.e || z) {
                er0Var.e = true;
                kr0Var.v.append((CharSequence) "CLEAN");
                kr0Var.v.append(' ');
                kr0Var.v.append((CharSequence) er0Var.a);
                kr0Var.v.append((CharSequence) er0Var.a());
                kr0Var.v.append('\n');
                if (z) {
                    kr0Var.y++;
                }
            } else {
                kr0Var.w.remove(er0Var.a);
                kr0Var.v.append((CharSequence) "REMOVE");
                kr0Var.v.append(' ');
                kr0Var.v.append((CharSequence) er0Var.a);
                kr0Var.v.append('\n');
            }
            q(kr0Var.v);
            if (kr0Var.u > kr0Var.s || kr0Var.u()) {
                kr0Var.z.submit(kr0Var.A);
            }
        }
    }

    public static void f(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void j(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void q(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static kr0 v(File file, long j) throws IOException {
        if (j <= 0) {
            kf2.n("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                M(file2, file3, false);
            }
        }
        kr0 kr0Var = new kr0(file, j);
        if (kr0Var.o.exists()) {
            try {
                kr0Var.H();
                kr0Var.F();
                return kr0Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                kr0Var.close();
                d35.a(kr0Var.n);
            }
        }
        file.mkdirs();
        kr0 kr0Var2 = new kr0(file, j);
        kr0Var2.K();
        return kr0Var2;
    }

    public final void F() throws IOException {
        j(this.p);
        Iterator it = this.w.values().iterator();
        while (it.hasNext()) {
            er0 er0Var = (er0) it.next();
            ll llVar = er0Var.f;
            int i = this.t;
            int i2 = 0;
            if (llVar == null) {
                while (i2 < i) {
                    this.u += er0Var.b[i2];
                    i2++;
                }
            } else {
                er0Var.f = null;
                while (i2 < i) {
                    j(er0Var.c[i2]);
                    j(er0Var.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void H() {
        File file = this.o;
        nm4 nm4Var = new nm4(new FileInputStream(file), d35.a);
        try {
            String strB = nm4Var.b();
            String strB2 = nm4Var.b();
            String strB3 = nm4Var.b();
            String strB4 = nm4Var.b();
            String strB5 = nm4Var.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.r).equals(strB3) || !Integer.toString(this.t).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    J(nm4Var.b());
                    i++;
                } catch (EOFException unused) {
                    this.x = i - this.w.size();
                    if (nm4Var.r == -1) {
                        K();
                    } else {
                        this.v = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), d35.a));
                    }
                    try {
                        nm4Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                nm4Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void J(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            mj0.i("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.w;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        er0 er0Var = (er0) linkedHashMap.get(strSubstring);
        if (er0Var == null) {
            er0Var = new er0(this, strSubstring);
            linkedHashMap.put(strSubstring, er0Var);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                er0Var.f = new ll(this, er0Var);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                mj0.i("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        er0Var.e = true;
        er0Var.f = null;
        if (strArrSplit.length != er0Var.g.t) {
            mj0.m(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                er0Var.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                mj0.m(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void K() {
        try {
            BufferedWriter bufferedWriter = this.v;
            if (bufferedWriter != null) {
                f(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.p), d35.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.r));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.t));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (er0 er0Var : this.w.values()) {
                    if (er0Var.f != null) {
                        bufferedWriter2.write("DIRTY " + er0Var.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + er0Var.a + er0Var.a() + '\n');
                    }
                }
                f(bufferedWriter2);
                if (this.o.exists()) {
                    M(this.o, this.q, true);
                }
                M(this.p, this.o, false);
                this.q.delete();
                this.v = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.o, true), d35.a));
            } catch (Throwable th) {
                f(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void R() {
        while (this.u > this.s) {
            String str = (String) ((Map.Entry) this.w.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.v == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    er0 er0Var = (er0) this.w.get(str);
                    if (er0Var != null && er0Var.f == null) {
                        for (int i = 0; i < this.t; i++) {
                            File file = er0Var.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.u;
                            long[] jArr = er0Var.b;
                            this.u = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.x++;
                        this.v.append((CharSequence) "REMOVE");
                        this.v.append(' ');
                        this.v.append((CharSequence) str);
                        this.v.append('\n');
                        this.w.remove(str);
                        if (u()) {
                            this.z.submit(this.A);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.v == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.w.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ll llVar = ((er0) obj).f;
                if (llVar != null) {
                    llVar.a();
                }
            }
            R();
            f(this.v);
            this.v = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ll n(String str) {
        synchronized (this) {
            try {
                if (this.v == null) {
                    throw new IllegalStateException("cache is closed");
                }
                er0 er0Var = (er0) this.w.get(str);
                if (er0Var == null) {
                    er0Var = new er0(this, str);
                    this.w.put(str, er0Var);
                } else if (er0Var.f != null) {
                    return null;
                }
                ll llVar = new ll(this, er0Var);
                er0Var.f = llVar;
                this.v.append((CharSequence) "DIRTY");
                this.v.append(' ');
                this.v.append((CharSequence) str);
                this.v.append('\n');
                q(this.v);
                return llVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized d34 s(String str) {
        if (this.v == null) {
            throw new IllegalStateException("cache is closed");
        }
        er0 er0Var = (er0) this.w.get(str);
        if (er0Var == null) {
            return null;
        }
        if (!er0Var.e) {
            return null;
        }
        for (File file : er0Var.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.x++;
        this.v.append((CharSequence) "READ");
        this.v.append(' ');
        this.v.append((CharSequence) str);
        this.v.append('\n');
        if (u()) {
            this.z.submit(this.A);
        }
        return new d34(22, er0Var.c);
    }

    public final boolean u() {
        int i = this.x;
        return i >= 2000 && i >= this.w.size();
    }
}
