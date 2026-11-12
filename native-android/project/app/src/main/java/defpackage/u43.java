package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u43 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(t43 t43Var) {
        String strN = bu.n(t43Var.getClass());
        if (strN.length() <= 0) {
            kf2.n("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        t43 t43Var2 = (t43) linkedHashMap.get(strN);
        if (h12.c(t43Var2, t43Var)) {
            return;
        }
        if (t43Var2 != null && t43Var2.b) {
            nz2.o("Navigator ", t43Var, " is replacing an already attached ", t43Var2);
        } else if (t43Var.b) {
            nz2.z(t43Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final t43 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            kf2.n("navigator name cannot be an empty string");
            return null;
        }
        t43 t43Var = (t43) this.a.get(str);
        if (t43Var != null) {
            return t43Var;
        }
        kf2.o(xa3.h("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
