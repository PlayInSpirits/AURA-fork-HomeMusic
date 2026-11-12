package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g64 extends rp {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable u(int i, be3 be3Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(be3Var.u()));
        }
        if (i == 1) {
            return Boolean.valueOf(be3Var.A() == 1);
        }
        if (i == 2) {
            return w(be3Var);
        }
        if (i != 3) {
            if (i == 8) {
                return v(be3Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(be3Var.u()));
                be3Var.O(2);
                return date;
            }
            int iE = be3Var.E();
            ArrayList arrayList = new ArrayList(iE);
            for (int i2 = 0; i2 < iE; i2++) {
                Serializable serializableU = u(be3Var.A(), be3Var);
                if (serializableU != null) {
                    arrayList.add(serializableU);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strW = w(be3Var);
            int iA = be3Var.A();
            if (iA == 9) {
                return map;
            }
            Serializable serializableU2 = u(iA, be3Var);
            if (serializableU2 != null) {
                map.put(strW, serializableU2);
            }
        }
    }

    public static HashMap v(be3 be3Var) {
        int iE = be3Var.E();
        HashMap map = new HashMap(iE);
        for (int i = 0; i < iE; i++) {
            String strW = w(be3Var);
            Serializable serializableU = u(be3Var.A(), be3Var);
            if (serializableU != null) {
                map.put(strW, serializableU);
            }
        }
        return map;
    }

    public static String w(be3 be3Var) {
        int iH = be3Var.H();
        int i = be3Var.b;
        be3Var.O(iH);
        return new String(be3Var.a, i, iH);
    }
}
