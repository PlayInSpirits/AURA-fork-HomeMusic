package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h05 extends g05 {
    @Override // defpackage.g05
    public final Typeface O(Object r5) {
        Object r2 = Array.newInstance(this.h, 1);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        Array.set(r2, 0, r5);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        return (Typeface) this.n.invoke(null, new Object[]{r2, "sans-serif", -1, -1});
    L5:
        e = move-exception;
        er1.m(e);
        return null;
    }

    @Override // defpackage.g05
    public final Method R(Class r3) {
        Class<?> r4 = Array.newInstance(r3, 1).getClass();
        Class r1 = Integer.TYPE;
        Method r5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r4, String.class, r1, r1});
        r5.setAccessible(true);
        return r5;
    }
}
