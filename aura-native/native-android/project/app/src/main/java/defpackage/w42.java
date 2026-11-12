package defpackage;

import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w42 {
    public static final w42 a = new w42();
    public static final ArrayDeque b = new ArrayDeque();

    public final synchronized void a(String str, Exception exc) {
        String str2;
        try {
            String strD0 = fa4.d0(fa4.e0(fa4.c0(new or1(28), exc), 6), " -> ", new or1(29), 30);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (strD0.length() == 0) {
                str2 = "";
            } else {
                str2 = " [" + strD0 + "]";
            }
            String str3 = jCurrentTimeMillis + " " + str + str2;
            ArrayDeque arrayDeque = b;
            if (arrayDeque.size() == 200) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(str3);
            Log.d("TempusLAN", str3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
