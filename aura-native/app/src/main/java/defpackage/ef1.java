package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ef1 extends LinkedHashMap {
    public ef1(int a0, float a1, boolean a2) {
        super(a0, a1, a2);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
