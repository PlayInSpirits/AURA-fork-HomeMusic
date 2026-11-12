package com.bumptech.glide.load.engine;

import android.util.Log;
import defpackage.er1;
import defpackage.f42;
import defpackage.ji1;
import defpackage.xa3;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] s = new StackTraceElement[0];
    public final List n;
    public f42 o;
    public int p;
    public Class q;
    public final String r;

    public GlideException(String str, List list) {
        this.r = str;
        setStackTrace(s);
        this.n = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((GlideException) th).n.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, ji1 ji1Var) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            ji1Var.append("Cause (");
            int i2 = i + 1;
            ji1Var.append(String.valueOf(i2));
            ji1Var.append(" of ");
            ji1Var.append(String.valueOf(size));
            ji1Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).e(ji1Var);
            } else {
                c(th, ji1Var);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            er1.m(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.n, new ji1(appendable));
        } catch (IOException e) {
            er1.m(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.r);
        String str2 = "";
        if (this.q != null) {
            str = ", " + this.q;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.p;
        sb.append(i != 0 ? ", ".concat(xa3.x(i)) : "");
        if (this.o != null) {
            str2 = ", " + this.o;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }
}
