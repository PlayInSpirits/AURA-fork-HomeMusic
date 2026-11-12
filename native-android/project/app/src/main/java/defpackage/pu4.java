package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pu4 extends fp {
    @Override // defpackage.fp
    public final gm a(gm r3) {
        int r2 = r3.c;
        if (r2 == 3) goto L20;
        if (r2 == 2) goto L20;
        if (r2 == 268435456) goto L20;
        if (r2 == 21) goto L20;
        if (r2 == 1342177280) goto L20;
        if (r2 == 22) goto L20;
        if (r2 == 1610612736) goto L20;
        if (r2 == 4) goto L20;
        throw new AudioProcessor$UnhandledAudioFormatException(r3);
    L20:
        if (r2 == 2) goto L24;
        return new gm(r3.a, r3.b, 2);
    L24:
        return gm.e;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r12) {
        int r0 = r12.position();
        int r1 = r12.limit();
        int r2 = r1 - r0;
        int r3 = this.b.c;
        if (r3 == 3) goto L14;
        if (r3 == 4) goto L15;
        if (r3 == 21) goto L13;
        if (r3 == 22) goto L15;
        if (r3 == 268435456) goto L16;
        if (r3 == 1342177280) goto L13;
        if (r3 == 1610612736) goto L15;
        tb4.a();
        return;
    L16:
        ByteBuffer r4 = l(r2);
        int r11 = this.b.c;
        if (r11 == 3) goto L38;
        if (r11 == 4) goto L36;
        if (r11 == 21) goto L34;
        if (r11 == 22) goto L32;
        if (r11 == 268435456) goto L30;
        if (r11 == 1342177280) goto L28;
        if (r11 != 1610612736) goto L26;
    L24:
        if (r0 >= r1) goto L40;
        r4.put(r12.get(r0 + 1));
        r4.put(r12.get(r0));
        r0 = r0 + 4;
    L40:
        r12.position(r12.limit());
        r4.flip();
        return;
    L26:
        tb4.a();
        return;
    L28:
        if (r0 >= r1) goto L40;
        r4.put(r12.get(r0 + 1));
        r4.put(r12.get(r0));
        r0 = r0 + 3;
    L30:
        if (r0 >= r1) goto L40;
        r4.put(r12.get(r0 + 1));
        r4.put(r12.get(r0));
        r0 = r0 + 2;
    L32:
        if (r0 >= r1) goto L40;
        r4.put(r12.get(r0 + 2));
        r4.put(r12.get(r0 + 3));
        r0 = r0 + 4;
    L34:
        if (r0 >= r1) goto L40;
        r4.put(r12.get(r0 + 1));
        r4.put(r12.get(r0 + 2));
        r0 = r0 + 3;
    L36:
        if (r0 >= r1) goto L40;
        short r13 = (short) (f35.i(r12.getFloat(r0), -1.0f, 1.0f) * 32767.0f);
        r4.put((byte) (r13 & 255));
        r4.put((byte) ((r13 >> 8) & 255));
        r0 = r0 + 4;
    L38:
        if (r0 >= r1) goto L40;
        r4.put((byte) 0);
        r4.put((byte) ((r12.get(r0) & 255) - 128));
        r0 = r0 + 1;
    L13:
        r2 = r2 / 3;
    L15:
        r2 = r2 / 2;
    L14:
        r2 = r2 * 2;
        goto L16
    }
}
