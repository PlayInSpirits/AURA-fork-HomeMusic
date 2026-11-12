package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx3 extends bz4 {
    public final LinkedHashMap a;

    public qx3(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        if (l32Var.e0() == 9) {
            l32Var.a0();
            return null;
        }
        Object objC = c();
        try {
            l32Var.f();
            while (l32Var.J()) {
                px3 px3Var = (px3) this.a.get(l32Var.Y());
                if (px3Var == null || !px3Var.e) {
                    l32Var.k0();
                } else {
                    e(objC, l32Var, px3Var);
                }
            }
            l32Var.s();
            return d(objC);
        } catch (IllegalAccessException e) {
            hw hwVar = ox3.a;
            nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        if (obj == null) {
            q32Var.F();
            return;
        }
        q32Var.j();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((px3) it.next()).a(q32Var, obj);
            }
            q32Var.s();
        } catch (IllegalAccessException e) {
            hw hwVar = ox3.a;
            nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, l32 l32Var, px3 px3Var);
}
