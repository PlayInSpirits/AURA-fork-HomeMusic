package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 extends ve4 implements rn4 {
    public final zn4 o;

    public ho0(String r5, zn4 r6) {
        super(new vn4[2], new wn4[2]);
        int r7 = this.g;
        cj0[] r0 = this.e;
        int r2 = 0;
        if (r7 != r0.length) goto L5;
        boolean r8 = true;
    L6:
        rr2.w(r8);
        int r9 = r0.length;
    L7:
        if (r2 >= r9) goto L9;
        r0[r2].t(1024);
        r2 = r2 + 1;
        goto L7
    L9:
        this.o = r6;
        return;
    L5:
        r8 = false;
        goto L6
    }

    @Override // defpackage.rn4
    public final void c(long r1) {
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
    public final DecoderException i(Throwable r2) {
        return new SubtitleDecoderException("Unexpected decode error", r2);
    }

    @Override // defpackage.ve4
    public final DecoderException j(cj0 r5, dj0 r6, boolean r7) {
        vn4 r8 = (vn4) r5;
        wn4 r9 = (wn4) r6;
        ByteBuffer r0 = r8.r;     // Catch: SubtitleDecoderException -> L13
        r0.getClass();     // Catch: SubtitleDecoderException -> L13
        byte[] r1 = r0.array();     // Catch: SubtitleDecoderException -> L13
        int r2 = r0.limit();     // Catch: SubtitleDecoderException -> L13
        zn4 r4 = this.o;     // Catch: SubtitleDecoderException -> L13
        if (r7 == false) goto L6;
        r4.reset();     // Catch: SubtitleDecoderException -> L13
    L6:
        qn4 r10 = r4.b(r1, 0, r2);     // Catch: SubtitleDecoderException -> L13
        long r3 = r8.t;     // Catch: SubtitleDecoderException -> L13
        long r11 = r8.x;     // Catch: SubtitleDecoderException -> L13
        r9.p = r3;     // Catch: SubtitleDecoderException -> L13
        r9.s = r10;     // Catch: SubtitleDecoderException -> L13
        if (r11 == Long.MAX_VALUE) goto L10;
        r3 = r11;
    L10:
        r9.t = r3;     // Catch: SubtitleDecoderException -> L13
        r9.r = false;     // Catch: SubtitleDecoderException -> L13
        return null;
    L13:
        e = move-exception;
        return e;
    }
}
