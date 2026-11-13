package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fp4 extends gx2 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public fp4(Object obj, uo uoVar, PointerInputEventHandler pointerInputEventHandler, int i) {
        uoVar = (i & 2) != 0 ? null : uoVar;
        this.a = obj;
        this.b = uoVar;
        this.c = pointerInputEventHandler;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new ip4(this.a, this.b, this.c);
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        ip4 ip4Var = (ip4) cx2Var;
        Object obj = ip4Var.B;
        Object obj2 = this.a;
        boolean z = !h12.c(obj, obj2);
        ip4Var.B = obj2;
        Object obj3 = ip4Var.C;
        Object obj4 = this.b;
        if (!h12.c(obj3, obj4)) {
            z = true;
        }
        ip4Var.C = obj4;
        Class<?> cls = ip4Var.D.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            ip4Var.r0();
        }
        ip4Var.D = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp4)) {
            return false;
        }
        fp4 fp4Var = (fp4) obj;
        return this.a.equals(fp4Var.a) && h12.c(this.b, fp4Var.b) && this.c == fp4Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
