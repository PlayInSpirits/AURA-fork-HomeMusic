package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sh implements View.OnClickListener {
    public final View n;
    public final String o;
    public Method p;
    public Context q;

    public sh(View r1, String r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r6) {
        if (this.p != null) goto L34;
        View r0 = this.n;
        Context r1 = r0.getContext();
    L5:
        String r2 = this.o;
        if (r1 == null) goto L17;
        if (r1.isRestricted() == true) goto L14;
        Method r3 = r1.getClass().getMethod(r2, new Class[]{View.class});     // Catch: NoSuchMethodException -> L31
        if (r3 == null) goto L14;
        this.p = r3;     // Catch: NoSuchMethodException -> L31
        this.q = r1;     // Catch: NoSuchMethodException -> L31
    L14:
        if ((r1 instanceof ContextWrapper) == true) goto L15;
        r1 = null;
        goto L5
    L15:
        r1 = ((ContextWrapper) r1).getBaseContext();
        goto L5
    L17:
        int r5 = r0.getId();
        if (r5 != (-1)) goto L20;
        String r7 = "";
    L21:
        StringBuilder r4 = xa3.j("Could not find method ", r2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
        r4.append(r0.getClass());
        r4.append(r7);
        throw new IllegalStateException(r4.toString());
    L20:
        r7 = " with id '" + r0.getContext().getResources().getResourceEntryName(r5) + "'";
    L34:
        this.p.invoke(this.q, new Object[]{r6});     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L28
        return;
    L28:
        e = move-exception;
        mj0.j("Could not execute non-public method for android:onClick", e);
        return;
    L25:
        e = move-exception;
        mj0.j("Could not execute method for android:onClick", e);
    }
}
