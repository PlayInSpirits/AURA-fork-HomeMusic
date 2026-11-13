package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tc implements f42 {
    public final int b;
    public final f42 c;

    public tc(int i, f42 f42Var) {
        this.b = i;
        this.c = f42Var;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (!(obj instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj;
        return this.b == tcVar.b && this.c.equals(tcVar.c);
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return e35.F(this.b, this.c);
    }
}
