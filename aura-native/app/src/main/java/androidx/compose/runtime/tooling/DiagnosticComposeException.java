package androidx.compose.runtime.tooling;

import defpackage.c80;
import defpackage.d80;
import defpackage.f34;
import defpackage.gb;
import defpackage.qb2;
import defpackage.tg2;
import defpackage.ti;
import defpackage.v40;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public final c80 n;

    public DiagnosticComposeException(c80 c80Var) {
        this.n = c80Var;
        if (c80Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c80Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            d80 d80Var = (d80) list.get(i);
            if (ti.l0(iArr, d80Var.a) < 0) {
                if (d80Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((d80) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        v40.r0(arrayList);
                    }
                } else {
                    arrayList.add(d80Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", f34.f(((d80) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        c80 c80Var = this.n;
        if (!c80Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        qb2 r = gb.r();
        List list = c80Var.a;
        list.getClass();
        tg2 tg2Var = new tg2(list);
        int a = tg2Var.a();
        for (int i = 0; i < a; i++) {
            ((d80) tg2Var.get(i)).getClass();
        }
        qb2 f = gb.f(r);
        f.getClass();
        tg2 tg2Var2 = new tg2(f);
        int a2 = tg2Var2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            String str = (String) tg2Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
