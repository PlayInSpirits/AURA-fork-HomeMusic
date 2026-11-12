package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nh0 {
    public final LinkedHashMap a;

    public nh0(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(HashMap map) {
        Object[] objArr;
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                i30 i30VarA = kx3.a(value.getClass());
                if (i30VarA.equals(kx3.a(Boolean.TYPE)) ? true : i30VarA.equals(kx3.a(Byte.TYPE)) ? true : i30VarA.equals(kx3.a(Integer.TYPE)) ? true : i30VarA.equals(kx3.a(Long.TYPE)) ? true : i30VarA.equals(kx3.a(Float.TYPE)) ? true : i30VarA.equals(kx3.a(Double.TYPE)) ? true : i30VarA.equals(kx3.a(String.class)) ? true : i30VarA.equals(kx3.a(Boolean[].class)) ? true : i30VarA.equals(kx3.a(Byte[].class)) ? true : i30VarA.equals(kx3.a(Integer[].class)) ? true : i30VarA.equals(kx3.a(Long[].class)) ? true : i30VarA.equals(kx3.a(Float[].class)) ? true : i30VarA.equals(kx3.a(Double[].class)) ? true : i30VarA.equals(kx3.a(String[].class))) {
                    continue;
                } else {
                    int i = 0;
                    if (i30VarA.equals(kx3.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = ki0.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (i30VarA.equals(kx3.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = ki0.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (i30VarA.equals(kx3.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = ki0.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (i30VarA.equals(kx3.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = ki0.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (i30VarA.equals(kx3.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = ki0.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!i30VarA.equals(kx3.a(double[].class))) {
                            tb4.h("Key ", str, " has invalid type ", i30VarA);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = ki0.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public gl4 b(rc5 rc5Var) {
        rc5Var.getClass();
        return (gl4) this.a.remove(rc5Var);
    }

    public List c(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (h12.c(((rc5) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((rc5) it.next());
        }
        return q40.Q0(linkedHashMap.values());
    }

    public gl4 d(rc5 rc5Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object gl4Var = linkedHashMap.get(rc5Var);
        if (gl4Var == null) {
            gl4Var = new gl4(rc5Var);
            linkedHashMap.put(rc5Var, gl4Var);
        }
        return (gl4) gl4Var;
    }
}
