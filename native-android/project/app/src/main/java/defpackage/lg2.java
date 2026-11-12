package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg2 extends wr1 {
    public static Object V(Object obj, HashMap map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int W(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map X(kd3... kd3VarArr) {
        if (kd3VarArr.length <= 0) {
            return v01.n;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W(kd3VarArr.length));
        Y(linkedHashMap, kd3VarArr);
        return linkedHashMap;
    }

    public static final void Y(HashMap map, kd3[] kd3VarArr) {
        for (kd3 kd3Var : kd3VarArr) {
            map.put(kd3Var.n, kd3Var.o);
        }
    }

    public static Map Z(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return v01.n;
        }
        int i = 0;
        if (size == 1) {
            kd3 kd3Var = (kd3) arrayList.get(0);
            kd3Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(kd3Var.n, kd3Var.o);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            kd3 kd3Var2 = (kd3) obj;
            linkedHashMap.put(kd3Var2.n, kd3Var2.o);
        }
        return linkedHashMap;
    }

    public static Map a0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return v01.n;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
