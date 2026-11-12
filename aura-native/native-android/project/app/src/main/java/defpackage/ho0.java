package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 extends ve4 implements rn4 {
    public final zn4 o;

    public ho0(String str, zn4 zn4Var) {
        super(new vn4[2], new wn4[2]);
        int i = this.g;
        cj0[] cj0VarArr = this.e;
        rr2.w(i == cj0VarArr.length);
        for (cj0 cj0Var : cj0VarArr) {
            cj0Var.t(1024);
        }
        this.o = zn4Var;
    }

    @Override // defpackage.rn4
    public final void c(long j) {
    }

    @Override // defpackage.ve4
    public final cj0 g() {
        return new vn4();
    }

    @Override // defpackage.ve4
    public final dj0 h() {
        return new xe4(this);
    }

    @Override // defpackage.ve4
    public final DecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.ve4
    public final DecoderException j(cj0 cj0Var, dj0 dj0Var, boolean z) {
        vn4 vn4Var = (vn4) cj0Var;
        wn4 wn4Var = (wn4) dj0Var;
        try {
            ByteBuffer byteBuffer = vn4Var.r;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            zn4 zn4Var = this.o;
            if (z) {
                zn4Var.reset();
            }
            qn4 qn4VarB = zn4Var.b(bArrArray, 0, iLimit);
            long j = vn4Var.t;
            long j2 = vn4Var.x;
            wn4Var.p = j;
            wn4Var.s = qn4VarB;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            wn4Var.t = j;
            wn4Var.r = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
