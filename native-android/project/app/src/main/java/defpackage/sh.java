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

    public sh(View view, String str) {
        this.n = view;
        this.o = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.p != null) {
            break;
        }
        View view2 = this.n;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.o;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbJ = xa3.j("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbJ.append(view2.getClass());
                sbJ.append(str);
                throw new IllegalStateException(sbJ.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.p = method;
                    this.q = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.p.invoke(this.q, view);
        } catch (IllegalAccessException e) {
            mj0.j("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            mj0.j("Could not execute method for android:onClick", e2);
        }
    }
}
