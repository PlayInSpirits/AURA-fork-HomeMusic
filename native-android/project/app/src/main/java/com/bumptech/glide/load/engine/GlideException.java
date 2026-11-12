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
    public static final StackTraceElement[] s = null;
    public final List n;
    public f42 o;
    public int p;
    public Class q;
    public final String r;

    static {
        s = new StackTraceElement[0];
    }

    public GlideException(String r1, List r2) {
        this.r = r1;
        setStackTrace(s);
        this.n = r2;
    }

    public static void a(Throwable r1, ArrayList r2) {
        if ((r1 instanceof GlideException) == false) goto L9;
        Iterator r3 = ((GlideException) r1).n.iterator();
    L6:
        if (r3.hasNext() == false) goto L8;
        a((Throwable) r3.next(), r2);
        goto L6
    L8:
        return;
    L9:
        r2.add(r1);
    }

    public static void b(List r4, ji1 r5) {
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        r5.append("Cause (");
        int r2 = r1 + 1;
        r5.append(String.valueOf(r2));
        r5.append(" of ");
        r5.append(String.valueOf(r0));
        r5.append("): ");
        Throwable r3 = (Throwable) r4.get(r1);
        if ((r3 instanceof GlideException) == false) goto L7;
        ((GlideException) r3).e(r5);
    L8:
        r1 = r2;
        goto L3
    L7:
        c(r3, r5);
        goto L8
    }

    public static void c(Throwable r1, Appendable r2) {
        r2.append(r1.getClass().toString()).append(": ").append(r1.getMessage()).append('\n');     // Catch: IOException -> L4
        return;
    L4:
        er1.m(r1);
    }

    public final void d() {
        ArrayList r0 = new ArrayList();
        a(this, r0);
        int r5 = r0.size();
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L5;
        StringBuilder r2 = new StringBuilder("Root cause (");
        int r3 = r1 + 1;
        r2.append(r3);
        r2.append(" of ");
        r2.append(r5);
        r2.append(")");
        Log.i("Glide", r2.toString(), (Throwable) r0.get(r1));
        r1 = r3;
        goto L3
    }

    public final void e(Appendable r2) {
        c(this, r2);
        b(this.n, new ji1(r2));     // Catch: IOException -> L5
        return;
    L5:
        e = move-exception;
        er1.m(e);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder r0 = new StringBuilder(71);
        r0.append(this.r);
        String r2 = "";
        if (this.q == null) goto L5;
        String r1 = ", " + this.q;
    L6:
        r0.append(r1);
        int r3 = this.p;
        if (r3 == 0) goto L9;
        String r4 = ", ".concat(xa3.x(r3));
    L10:
        r0.append(r4);
        if (this.o == null) goto L13;
        r2 = ", " + this.o;
    L13:
        r0.append(r2);
        ArrayList r5 = new ArrayList();
        a(this, r5);
        if (r5.isEmpty() == false) goto L18;
        return r0.toString();
    L18:
        if (r5.size() != 1) goto L20;
        r0.append("\nThere was 1 root cause:");
    L21:
        int r6 = r5.size();
        int r7 = 0;
    L22:
        if (r7 >= r6) goto L24;
        Object r8 = r5.get(r7);
        r7 = r7 + 1;
        Throwable r9 = (Throwable) r8;
        r0.append('\n');
        r0.append(r9.getClass().getName());
        r0.append('(');
        r0.append(r9.getMessage());
        r0.append(')');
        goto L22
    L24:
        r0.append("\n call GlideException#logRootCauses(String) for more detail");
        return r0.toString();
    L20:
        r0.append("\nThere were ");
        r0.append(r5.size());
        r0.append(" root causes:");
        goto L21
    L9:
        r4 = "";
        goto L10
    L5:
        r1 = "";
        goto L6
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream r1) {
        e(r1);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter r1) {
        e(r1);
    }

    public GlideException(String r2) {
        this(r2, Collections.EMPTY_LIST);
    }
}
