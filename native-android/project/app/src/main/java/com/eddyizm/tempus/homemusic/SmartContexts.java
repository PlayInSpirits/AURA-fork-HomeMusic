package com.eddyizm.tempus.homemusic;

import defpackage.h12;
import defpackage.kk1;
import defpackage.qm4;
import defpackage.vr1;
import defpackage.xm4;
import defpackage.ya4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SmartContexts {
    public static final int $stable = 0;
    public static final SmartContexts INSTANCE = new SmartContexts();
    public static final String LIKED = "liked";

    private SmartContexts() {
    }

    public final String dominant(List<String> list) {
        Object next;
        list.getClass();
        Object obj = null;
        if (!list.isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = vr1.m(new kk1() { // from class: com.eddyizm.tempus.homemusic.SmartContexts$dominant$$inlined$groupingBy$1
                @Override // defpackage.kk1
                public String keyOf(String str) {
                    return str;
                }

                @Override // defpackage.kk1
                public Iterator<String> sourceIterator() {
                    return arrayList.iterator();
                }
            }).entrySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                Object key = entry.getKey();
                String str = (String) key;
                if (((Number) entry.getValue()).intValue() * 2 > list.size() && INSTANCE.offered(str)) {
                    obj = key;
                }
                return (String) obj;
            }
        }
        return null;
    }

    public final String hubId(String str) {
        str.getClass();
        return qm4.z0(str, "hub:");
    }

    public final String mediaId(String str) {
        str.getClass();
        return qm4.n0(str, ':') ? "hub:".concat(str) : str;
    }

    public final boolean offered(String str) {
        int length;
        if (h12.c(str, LIKED)) {
            return true;
        }
        if (str != null && xm4.k0(str, "playlist:", false) && 10 <= (length = str.length()) && length < 74) {
            for (int i = 0; i < str.length(); i++) {
                if (!ya4.y(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final String recommendation(String str) {
        str.getClass();
        return "smart:".concat(str);
    }
}
