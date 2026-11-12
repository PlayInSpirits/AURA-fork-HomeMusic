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
    public final gm a(gm gmVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i = gmVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return gm.e;
        }
        int i2 = gmVar.b;
        if (!f35.L(i)) {
            throw new AudioProcessor$UnhandledAudioFormatException(gmVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", gmVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new gm(gmVar.a, iArr.length, i) : gm.e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    @Override // defpackage.im
    public final void e(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iT = (f35.t(this.b.c) * i5) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iT));
                } else if (i6 == 3) {
                    byteBufferL.put(byteBuffer.get(iT));
                } else if (i6 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iT));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iT;
                    } else {
                        i = iT + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iT + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iT += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iT) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rr2.o(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    rr2.l(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b3).put(b4).put((byte) i4);
                } else {
                    if (i6 != 22) {
                        if (i6 == 268435456) {
                            byteBufferL.putShort(byteBuffer.getShort(iT));
                        } else if (i6 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iT;
                            } else {
                                i = iT + 2;
                            }
                            byte b5 = byteBuffer.get(i);
                            byte b6 = byteBuffer.get(iT + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iT += 2;
                            }
                            i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iT) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            rr2.o(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                            rr2.l(byteBufferL.remaining() >= 3);
                            if (byteBufferL.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b7 = (byte) i3;
                            byte b8 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferL.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferL.put(b7).put(b8).put((byte) i4);
                        } else if (i6 != 1610612736) {
                            zr2.c(this.b.c, "Unexpected encoding: ");
                            return;
                        }
                    }
                    byteBufferL.putInt(byteBuffer.getInt(iT));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
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
