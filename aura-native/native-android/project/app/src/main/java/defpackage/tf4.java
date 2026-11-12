package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tf4 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final mf2 a = new mf2(1);
    public final hd5 b = new hd5(10);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strC = c(e35.v(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strC);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iW = e35.w(config) * i * i2;
        mf2 mf2Var = this.a;
        xn3 xn3VarU = (xn3) ((ArrayDeque) mf2Var.a).poll();
        if (xn3VarU == null) {
            xn3VarU = mf2Var.u();
        }
        sf4 sf4Var = (sf4) xn3VarU;
        sf4Var.b = iW;
        sf4Var.c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = rf4.a[config.ordinal()];
            if (i3 == 1) {
                configArr = d;
            } else if (i3 == 2) {
                configArr = f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : h;
            } else {
                configArr = g;
            }
        } else {
            configArr = e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iW));
            if (num != null && num.intValue() <= iW * 8) {
                if (num.intValue() == iW && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                mf2Var.k(sf4Var);
                int iIntValue = num.intValue();
                xn3 xn3VarU2 = (xn3) ((ArrayDeque) mf2Var.a).poll();
                if (xn3VarU2 == null) {
                    xn3VarU2 = mf2Var.u();
                }
                sf4Var = (sf4) xn3VarU2;
                sf4Var.b = iIntValue;
                sf4Var.c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.h(sf4Var);
        if (bitmap != null) {
            a(Integer.valueOf(sf4Var.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iV = e35.v(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        mf2 mf2Var = this.a;
        xn3 xn3VarU = (xn3) ((ArrayDeque) mf2Var.a).poll();
        if (xn3VarU == null) {
            xn3VarU = mf2Var.u();
        }
        sf4 sf4Var = (sf4) xn3VarU;
        sf4Var.b = iV;
        sf4Var.c = config;
        this.b.k(sf4Var, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(sf4Var.b));
        navigableMapD.put(Integer.valueOf(sf4Var.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbI = xa3.i("SizeConfigStrategy{groupedMap=");
        sbI.append(this.b);
        sbI.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbI.append(entry.getKey());
            sbI.append('[');
            sbI.append(entry.getValue());
            sbI.append("], ");
        }
        if (!map.isEmpty()) {
            sbI.replace(sbI.length() - 2, sbI.length(), "");
        }
        sbI.append(")}");
        return sbI.toString();
    }
}
