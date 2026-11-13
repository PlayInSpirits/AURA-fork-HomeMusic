package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sw2 {
    public sw2() {
        super();
    }

    public static final ArrayDeque b = new ArrayDeque(0);
    public Object a;

    public static sw2 a(Object obj) {
        sw2 sw2Var;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            sw2Var = (sw2) arrayDeque.poll();
        }
        if (sw2Var == null) {
            sw2Var = new sw2();
        }
        sw2Var.a = obj;
        return sw2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sw2) && this.a.equals(((sw2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
