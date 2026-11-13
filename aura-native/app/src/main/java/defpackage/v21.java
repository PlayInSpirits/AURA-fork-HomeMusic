package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v21 {
    public static final om0 c = new om0(28);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final wo0 b;

    public v21(String str, boolean z) {
        ReentrantLock reentrantLock;
        wo0 wo0Var;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            wo0Var = new wo0();
            wo0Var.n = str.concat(".lck");
        } else {
            wo0Var = null;
        }
        this.b = wo0Var;
    }
}
