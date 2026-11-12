package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 extends q42 implements if1 {
    public static final k5 A;
    public static final k5 B;
    public static final k5 C;
    public static final k5 o;
    public static final k5 p;
    public static final k5 q;
    public static final k5 r;
    public static final k5 s;
    public static final k5 t;
    public static final k5 u;
    public static final k5 v;
    public static final k5 w;
    public static final k5 x;
    public static final k5 y;
    public static final k5 z;
    public final /* synthetic */ int n;

    static {
        int i = 1;
        o = new k5(i, 0);
        p = new k5(i, 1);
        q = new k5(i, 2);
        r = new k5(i, 3);
        s = new k5(i, 4);
        t = new k5(i, 5);
        u = new k5(i, 6);
        v = new k5(i, 7);
        w = new k5(i, 8);
        x = new k5(i, 9);
        y = new k5(i, 10);
        z = new k5(i, 11);
        A = new k5(i, 12);
        B = new k5(i, 13);
        C = new k5(i, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(int i, int i2) {
        super(i);
        this.n = i2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbS = b11.s(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sbS.append(value);
                return sbS.toString();
            case 2:
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                sv0.l((sv0) obj, x40.f, 0L, 126);
                return j15Var;
            case 4:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 5:
                r23 r23Var = (r23) obj;
                r23Var.getClass();
                t23 t23Var = r23Var.o;
                if (t23Var == null || t23Var.y != r23Var.u) {
                    return null;
                }
                return t23Var;
            case 6:
                r23 r23Var2 = (r23) obj;
                r23Var2.getClass();
                t23 t23Var2 = r23Var2.o;
                if (t23Var2 == null || t23Var2.y != r23Var2.u) {
                    return null;
                }
                return t23Var2;
            case 7:
                r23 r23Var3 = (r23) obj;
                r23Var3.getClass();
                return Integer.valueOf(r23Var3.u);
            case 8:
                Context context3 = (Context) obj;
                context3.getClass();
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 9:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 10:
                r23 r23Var4 = (r23) obj;
                r23Var4.getClass();
                return r23Var4.o;
            case 11:
                r23 r23Var5 = (r23) obj;
                r23Var5.getClass();
                if (!(r23Var5 instanceof t23)) {
                    return null;
                }
                t23 t23Var3 = (t23) r23Var5;
                return t23Var3.h(t23Var3.y, t23Var3, null, false);
            case 12:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 13:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (v23) ((WeakReference) tag).get();
                }
                if (tag instanceof v23) {
                    return (v23) tag;
                }
                return null;
            default:
                jb0 jb0Var = (jb0) obj;
                jb0Var.getClass();
                return jb0Var.getClass().getSimpleName();
        }
    }
}
