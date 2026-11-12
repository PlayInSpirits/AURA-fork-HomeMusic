package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ou4 extends fp {
    public static final int i = 0;

    static {
        i = Float.floatToIntBits(Float.NaN);
    }

    public static void m(int r4, ByteBuffer r5) {
        int r6 = Float.floatToIntBits((float) (((double) r4) * 4.656612875245797E-10d));
        if (r6 != i) goto L5;
        r6 = Float.floatToIntBits(0.0f);
    L5:
        r5.putInt(r6);
    }

    @Override // defpackage.fp
    public final gm a(gm r3) {
        int r2 = r3.c;
        if (r2 != 21) goto L5;
    L17:
        if (r2 == 4) goto L21;
        return new gm(r3.a, r3.b, 4);
    L21:
        return gm.e;
    L5:
        if (r2 == 1342177280) goto L17;
        if (r2 == 22) goto L17;
        if (r2 == 1610612736) goto L17;
        if (r2 == 4) goto L17;
        if (r2 == 2) goto L17;
        throw new AudioProcessor$UnhandledAudioFormatException(r3);
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r6) {
        int r0 = r6.position();
        int r1 = r6.limit();
        int r2 = r1 - r0;
        int r3 = this.b.c;
        if (r3 != 2) goto L5;
        ByteBuffer r5 = l(r2 * 2);
    L27:
        if (r0 >= r1) goto L29;
        m(((r6.get(r0) & 255) << 16) | ((r6.get(r0 + 1) & 255) << 24), r5);
        r0 = r0 + 2;
    L29:
        r6.position(r6.limit());
        r5.flip();
        return;
    L5:
        if (r3 != 1342177280) goto L7;
        r5 = l((r2 / 3) * 4);
    L24:
        if (r0 >= r1) goto L29;
        m((((r6.get(r0 + 2) & 255) << 8) | ((r6.get(r0 + 1) & 255) << 16)) | ((r6.get(r0) & 255) << 24), r5);
        r0 = r0 + 3;
        goto L24
    L7:
        if (r3 != 1610612736) goto L9;
        r5 = l(r2);
    L21:
        if (r0 >= r1) goto L29;
        m((((r6.get(r0 + 3) & 255) | ((r6.get(r0 + 2) & 255) << 8)) | ((r6.get(r0 + 1) & 255) << 16)) | ((r6.get(r0) & 255) << 24), r5);
        r0 = r0 + 4;
        goto L21
    L9:
        if (r3 != 21) goto L11;
        r5 = l((r2 / 3) * 4);
    L18:
        if (r0 >= r1) goto L29;
        m((((r6.get(r0) & 255) << 8) | ((r6.get(r0 + 1) & 255) << 16)) | ((r6.get(r0 + 2) & 255) << 24), r5);
        r0 = r0 + 3;
        goto L18
    L11:
        if (r3 != 22) goto L15;
        r5 = l(r2);
    L13:
        if (r0 >= r1) goto L29;
        m((((r6.get(r0) & 255) | ((r6.get(r0 + 1) & 255) << 8)) | ((r6.get(r0 + 2) & 255) << 16)) | ((r6.get(r0 + 3) & 255) << 24), r5);
        r0 = r0 + 4;
        goto L13
    L15:
        tb4.a();
    }
}
