package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import defpackage.be3;
import defpackage.cj0;
import defpackage.dj0;
import defpackage.f35;
import defpackage.rr2;
import defpackage.tb1;
import defpackage.ve4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioDecoder extends ve4 {
    public static final byte[] w = {102, 76, 97, 67};
    public final String o;
    public final byte[] p;
    public final int q;
    public int r;
    public long s;
    public boolean t;
    public volatile int u;
    public volatile int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public FfmpegAudioDecoder(int i, tb1 tb1Var, boolean z) throws FfmpegDecoderException {
        byte[] bArr;
        int i2;
        byte[] bArr2;
        super(new cj0[16], new SimpleDecoderOutputBuffer[16]);
        int i3 = 16;
        if (!FfmpegLibrary.d()) {
            throw new FfmpegDecoderException("Failed to load decoder native libraries.");
        }
        String str = tb1Var.n;
        str.getClass();
        String strA = FfmpegLibrary.a(str);
        strA.getClass();
        this.o = strA;
        List list = tb1Var.q;
        byte b = -1;
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    b = 0;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b = 1;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    b = 2;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    b = 3;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b = 4;
                }
                break;
        }
        byte[] bArrArray = null;
        switch (b) {
            case 0:
                byte[] bArr3 = (byte[]) list.get(0);
                byte[] bArr4 = (byte[]) list.get(1);
                byte[] bArr5 = new byte[bArr3.length + bArr4.length + 6];
                bArr5[0] = (byte) (bArr3.length >> 8);
                bArr5[1] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr5, 2, bArr3.length);
                bArr5[bArr3.length + 2] = 0;
                bArr5[bArr3.length + 3] = 0;
                bArr5[bArr3.length + 4] = (byte) (bArr4.length >> 8);
                bArr5[bArr3.length + 5] = (byte) (bArr4.length & 255);
                System.arraycopy(bArr4, 0, bArr5, bArr3.length + 6, bArr4.length);
                bArr = bArr5;
                break;
            case 1:
            case 4:
                bArrArray = (byte[]) list.get(0);
                bArr = bArrArray;
                break;
            case 2:
                byte[] bArr6 = (byte[]) list.get(0);
                int length = bArr6.length + 12;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                byteBufferAllocate.putInt(length);
                byteBufferAllocate.putInt(1634492771);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.put(bArr6, 0, bArr6.length);
                bArrArray = byteBufferAllocate.array();
                bArr = bArrArray;
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        bArr = bArrArray;
                    } else {
                        byte[] bArr7 = (byte[]) list.get(i4);
                        if (bArr7.length < 4) {
                            i2 = 0;
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= 4) {
                                    i2 = 4;
                                } else if (bArr7[i5] != w[i5]) {
                                    i2 = 0;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        if (bArr7.length - i2 == 34) {
                            bArr2 = new byte[34];
                            System.arraycopy(bArr7, i2, bArr2, 0, 34);
                        } else {
                            int i6 = i2 + 4;
                            if (bArr7.length >= i6) {
                                int i7 = bArr7[i2] & 127;
                                int i8 = ((bArr7[i2 + 2] & 255) << 8) | ((bArr7[i2 + 1] & 255) << i3) | (bArr7[i2 + 3] & 255);
                                if (i7 == 0 && i8 == 34 && bArr7.length >= i2 + 38) {
                                    bArr2 = new byte[34];
                                    System.arraycopy(bArr7, i6, bArr2, 0, 34);
                                } else {
                                    bArr2 = null;
                                }
                            } else {
                                bArr2 = null;
                            }
                        }
                        if (bArr2 != null) {
                            bArr = bArr2;
                        } else {
                            i4++;
                            i3 = 16;
                        }
                    }
                    break;
                }
                break;
            default:
                bArr = bArrArray;
                break;
        }
        this.p = bArr;
        this.q = z ? 4 : 2;
        this.r = z ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(this.o, bArr, z, tb1Var.G, tb1Var.F);
        this.s = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        int i9 = this.g;
        cj0[] cj0VarArr = this.e;
        rr2.w(i9 == cj0VarArr.length);
        for (cj0 cj0Var : cj0VarArr) {
            cj0Var.t(i);
        }
    }

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.r = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.t;
        byteBuffer.getClass();
        rr2.l(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        simpleDecoderOutputBuffer.t = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // defpackage.ve4, defpackage.zi0
    public final void a() {
        super.a();
        ffmpegRelease(this.s);
        this.s = 0L;
    }

    @Override // defpackage.ve4
    public final cj0 g() {
        return new cj0(2, FfmpegLibrary.b());
    }

    @Override // defpackage.ve4
    public final dj0 h() {
        return new SimpleDecoderOutputBuffer(new a(this));
    }

    @Override // defpackage.ve4
    public final DecoderException i(Throwable th) {
        return new FfmpegDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.ve4
    public final DecoderException j(cj0 cj0Var, dj0 dj0Var, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) dj0Var;
        if (z) {
            long jFfmpegReset = ffmpegReset(this.s, this.p);
            this.s = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = cj0Var.r;
        String str = f35.a;
        int iLimit = byteBuffer.limit();
        long j = cj0Var.t;
        int i = this.r;
        simpleDecoderOutputBuffer.p = j;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.t;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i) {
            simpleDecoderOutputBuffer.t = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.t.position(0);
        simpleDecoderOutputBuffer.t.limit(i);
        int iFfmpegDecode = ffmpegDecode(this.s, byteBuffer, iLimit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.t, this.r);
        if (iFfmpegDecode == -2) {
            return new FfmpegDecoderException("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.r = true;
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.r = true;
            return null;
        }
        if (!this.t) {
            this.u = ffmpegGetChannelCount(this.s);
            this.v = ffmpegGetSampleRate(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                this.p.getClass();
                be3 be3Var = new be3(this.p);
                be3Var.N(this.p.length - 4);
                this.v = be3Var.E();
            }
            this.t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.t;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(iFfmpegDecode);
        return null;
    }

    public final String o() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.o;
    }
}
