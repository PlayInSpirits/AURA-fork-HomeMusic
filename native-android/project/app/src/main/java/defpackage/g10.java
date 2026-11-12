package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g10 extends fp {
    public int[] i;
    public int[] j;

    @Override // defpackage.fp
    public final gm a(gm r8) {
        int r0 = r8.c;
        int[] r7 = this.i;
        if (r7 == null) goto L5;
        int r1 = r8.b;
        if (f35.L(r0) == false) goto L29;
        if (r1 == r7.length) goto L11;
        boolean r2 = true;
    L12:
        int r5 = 0;
    L14:
        if (r5 >= r7.length) goto L23;
        int r6 = r7[r5];
        if (r6 >= r1) goto L22;
        if (r6 == r5) goto L19;
        boolean r9 = true;
    L20:
        r2 = r2 | r9;
        r5 = r5 + 1;
        goto L14
    L19:
        r9 = false;
        goto L20
    L22:
        throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(r7) + ") trying to access non-existent input channel.", r8);
    L23:
        if (r2 == false) goto L27;
        return new gm(r8.a, r7.length, r0);
    L27:
        return gm.e;
    L11:
        r2 = false;
        goto L12
    L29:
        throw new AudioProcessor$UnhandledAudioFormatException(r8);
    L5:
        return gm.e;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r18) {
        int[] r2 = this.j;
        r2.getClass();
        int r3 = r18.position();
        int r4 = r18.limit();
        ByteBuffer r5 = l(((r4 - r3) / this.b.d) * this.c.d);
    L3:
        if (r3 >= r4) goto L60;
        int r6 = r2.length;
        int r8 = 0;
    L5:
        if (r8 >= r6) goto L59;
        int r10 = (f35.t(this.b.c) * r2[r8]) + r3;
        int r9 = this.b.c;
        if (r9 != 2) goto L9;
    L57:
        r5.putShort(r18.getShort(r10));
    L58:
        r8 = r8 + 1;
        goto L5
    L9:
        if (r9 != 3) goto L11;
        r5.put(r18.get(r10));
        goto L58
    L11:
        if (r9 != 4) goto L13;
        r5.putFloat(r18.getFloat(r10));
        goto L58
    L13:
        if (r9 != 21) goto L15;
    L26:
        ByteOrder r11 = r18.order();
        ByteOrder r12 = ByteOrder.BIG_ENDIAN;
        if (r11 != r12) goto L29;
        int r13 = r10;
    L30:
        byte r14 = r18.get(r13);
        byte r15 = r18.get(r10 + 1);
        if (r18.order() != r12) goto L33;
        r10 = r10 + 2;
    L33:
        int r16 = ((((r14 << 24) & (-16777216)) | ((r15 << 16) & 16711680)) | ((r18.get(r10) << 8) & 65280)) >> 8;
        boolean r17 = true;
        if ((r16 & (-16777216)) != 0) goto L36;
    L39:
        boolean r7 = true;
    L40:
        rr2.o(r7, "Value out of range of 24-bit integer: %s", Integer.toHexString(r16));
        if (r5.remaining() >= 3) goto L44;
        r17 = false;
    L44:
        rr2.l(r17);
        if (r5.order() != r12) goto L48;
        int r19 = (r16 & 16711680) >> 16;
    L47:
        byte r20 = (byte) r19;
        byte r110 = (byte) ((r16 & 65280) >> 8);
        if (r5.order() != r12) goto L53;
        int r21 = r16 & 255;
    L54:
        r5.put(r20).put(r110).put((byte) r21);
        goto L58
    L53:
        r21 = (r16 & 16711680) >> 16;
        goto L54
    L48:
        r19 = r16 & 255;
        goto L47
    L36:
        if ((r16 & (-8388608)) == (-8388608)) goto L39;
        r7 = false;
        goto L40
    L29:
        r13 = r10 + 2;
        goto L30
    L15:
        if (r9 != 22) goto L17;
    L25:
        r5.putInt(r18.getInt(r10));
        goto L58
    L17:
        if (r9 == 268435456) goto L57;
        if (r9 == 1342177280) goto L26;
        if (r9 == 1610612736) goto L25;
        zr2.c(this.b.c, "Unexpected encoding: ");
        return;
    L59:
        r3 = r3 + this.b.d;
        goto L3
    L60:
        r18.position(r4);
        r5.flip();
    }

    @Override // defpackage.fp
    public final void i() {
        this.j = this.i;
    }

    @Override // defpackage.fp
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
