package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class an {
    public static final Object r = new Object();
    public static ScheduledExecutorService s;
    public static int t;
    public final AudioTrack a;
    public final em b;
    public final zh0 c;
    public bq4 d;
    public final en e;
    public final boolean f;
    public final int g;
    public final jv3 h;
    public final tc2 i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;

    public an(AudioTrack audioTrack, em emVar, zh0 zh0Var, vp4 vp4Var) {
        this.a = audioTrack;
        this.b = emVar;
        this.c = zh0Var;
        tc2 tc2Var = new tc2(Thread.currentThread());
        this.i = tc2Var;
        tc2Var.i = false;
        boolean zL = f35.L(emVar.a);
        this.f = zL;
        if (zL) {
            this.g = f35.t(emVar.a) * Integer.bitCount(emVar.c);
        } else {
            this.g = -1;
        }
        this.e = new en(new d34(8, this), vp4Var, audioTrack, emVar.a, this.g, emVar.f);
        if (zh0Var != null) {
            this.d = new bq4(audioTrack, zh0Var);
        }
        jv3 jv3Var = null;
        if (c()) {
            jv3 jv3Var2 = new jv3();
            jv3Var2.p = this;
            Handler handlerP = f35.p(null);
            jv3Var2.n = handlerP;
            zm zmVar = new zm(jv3Var2);
            jv3Var2.o = zmVar;
            this.a.registerStreamEventCallback(new ym(handlerP, 0), zmVar);
            jv3Var = jv3Var2;
        }
        this.h = jv3Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:112:0x031d  */
    /* JADX WARN: Code duplicated, block: B:115:0x032a  */
    /* JADX WARN: Code duplicated, block: B:116:0x032c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0334  */
    /* JADX WARN: Code duplicated, block: B:124:0x0342  */
    /* JADX WARN: Code duplicated, block: B:126:0x035b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0377  */
    /* JADX WARN: Code duplicated, block: B:132:0x037a  */
    public final long a() {
        long j;
        long j2;
        boolean z;
        long jNanoTime;
        boolean z2;
        en enVar;
        long jB;
        int playState;
        long j3;
        long j4;
        long jA;
        long j5;
        int i;
        boolean z3;
        AudioTimestamp audioTimestamp;
        float f;
        um umVar;
        int i2;
        long j6;
        Method method;
        long j7;
        Method method2;
        en enVar2 = this.e;
        vp4 vp4Var = enVar2.b;
        vm vmVar = enVar2.h;
        AudioTrack audioTrack = enVar2.d;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = enVar2.c;
            vp4Var.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - enVar2.l >= 30000) {
                j = 1000;
                long jY = f35.Y(enVar2.e, enVar2.a());
                if (jY != 0) {
                    jArr[enVar2.s] = f35.E(jY, enVar2.i) - jNanoTime2;
                    enVar2.s = (enVar2.s + 1) % 10;
                    int i3 = enVar2.t;
                    if (i3 < 10) {
                        enVar2.t = i3 + 1;
                    }
                    enVar2.l = jNanoTime2;
                    enVar2.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = enVar2.t;
                        if (i4 >= i5) {
                            break;
                        }
                        int i6 = i4;
                        enVar2.k = (jArr[i6] / ((long) i5)) + enVar2.k;
                        i4 = i6 + 1;
                    }
                }
            } else {
                j = 1000;
            }
            long j8 = enVar2.n;
            if (enVar2.g && (method = enVar2.m) != null && jNanoTime2 - enVar2.o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = f35.a;
                    j7 = jNanoTime2;
                    try {
                        long jIntValue = (((long) num.intValue()) * j) - enVar2.f;
                        enVar2.n = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        enVar2.n = jMax;
                        if (jMax > 10000000) {
                            l93.q0("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                            enVar2.n = 0L;
                        }
                    } catch (Exception unused) {
                        method2 = null;
                        enVar2.m = method2;
                    }
                } catch (Exception unused2) {
                    j7 = jNanoTime2;
                    method2 = null;
                }
                jNanoTime2 = j7;
                enVar2.o = jNanoTime2;
            }
            boolean z4 = j8 != enVar2.n;
            float f2 = enVar2.i;
            long jB2 = enVar2.b(jNanoTime2);
            um umVar2 = vmVar.a;
            um umVar3 = vmVar.a;
            j2 = 0;
            int i7 = vmVar.b;
            if (z4 || jNanoTime2 - vmVar.g >= vmVar.f) {
                vmVar.g = jNanoTime2;
                AudioTrack audioTrack2 = umVar2.a;
                AudioTimestamp audioTimestamp2 = umVar2.b;
                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j9 = audioTimestamp2.framePosition;
                    long j10 = umVar2.d;
                    if (j10 > j9) {
                        if (umVar2.f) {
                            umVar2.g += j10;
                            umVar2.f = false;
                        } else {
                            umVar2.c++;
                        }
                    }
                    umVar2.d = j9;
                    umVar2.e = j9 + umVar2.g + (umVar2.c << 32);
                }
                if (timestamp) {
                    d34 d34Var = vmVar.c;
                    long j11 = audioTimestamp2.nanoTime / j;
                    audioTrack = audioTrack;
                    umVar = umVar3;
                    long jA2 = f35.A(jNanoTime2 - (umVar3.b.nanoTime / j), f2) + f35.Y(i7, umVar3.e);
                    if (Math.abs(j11 - jNanoTime2) > 5000000) {
                        long j12 = umVar2.e;
                        d34Var.getClass();
                        l93.q0("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j12 + ", " + j11 + ", " + jNanoTime2 + ", " + jB2 + ", " + ((an) d34Var.o).b());
                        i2 = 4;
                        vmVar.a(4);
                        z3 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                    } else if (Math.abs(jA2 - jB2) > 5000000) {
                        z3 = timestamp;
                        long j13 = umVar2.e;
                        d34Var.getClass();
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                        l93.q0("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j11 + ", " + jNanoTime2 + ", " + jB2 + ", " + ((an) d34Var.o).b());
                        i2 = 4;
                        vmVar.a(4);
                    } else {
                        z3 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                        i2 = 4;
                        if (vmVar.d == 4) {
                            vmVar.a(0);
                        }
                    }
                } else {
                    z3 = timestamp;
                    audioTimestamp = audioTimestamp2;
                    f = f2;
                    audioTrack = r9;
                    umVar = umVar3;
                    i2 = 4;
                }
                int i8 = vmVar.d;
                if (i8 == 0) {
                    long j14 = jNanoTime2;
                    AudioTimestamp audioTimestamp3 = audioTimestamp;
                    z = false;
                    if (z3) {
                        long j15 = audioTimestamp3.nanoTime;
                        if (j15 / j >= vmVar.e) {
                            vmVar.h = umVar2.e;
                            vmVar.i = j15 / j;
                            vmVar.a(1);
                        }
                    } else if (j14 - vmVar.e > 500000) {
                        vmVar.a(3);
                    }
                } else if (i8 == 1) {
                    um umVar4 = umVar;
                    if (z3) {
                        long j16 = umVar2.e;
                        long j17 = vmVar.h;
                        if (j16 <= j17) {
                            j6 = jNanoTime2;
                        } else {
                            float f3 = f;
                            j6 = jNanoTime2;
                            if (Math.abs((f35.A(j6 - (umVar4.b.nanoTime / j), f3) + f35.Y(i7, umVar4.e)) - (f35.A(jNanoTime2 - vmVar.i, f3) + f35.Y(i7, j17))) < j) {
                                vmVar.a(2);
                            }
                        }
                        if (j6 - vmVar.e > 2000000) {
                            vmVar.a(3);
                        } else {
                            vmVar.h = umVar2.e;
                            vmVar.i = audioTimestamp.nanoTime / j;
                        }
                    } else {
                        z = false;
                        vmVar.a(0);
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != i2) {
                            tb4.a();
                            return 0L;
                        }
                    } else if (z3) {
                        z = false;
                        vmVar.a(0);
                    }
                } else if (!z3) {
                    vmVar.a(0);
                }
                vp4Var.getClass();
                jNanoTime = System.nanoTime() / j;
                if (vmVar.d == 2) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    enVar = enVar2;
                    float f4 = enVar.i;
                    um umVar5 = vmVar.a;
                    jB = f35.A(jNanoTime - (umVar5.b.nanoTime / j), f4) + f35.Y(vmVar.b, umVar5.e);
                } else {
                    enVar = enVar2;
                    jB = enVar.b(jNanoTime);
                }
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (z2 || ((i = vmVar.d) != 0 && i != 1)) {
                        enVar.d(jB);
                    }
                    j3 = enVar.z;
                    if (j3 != -9223372036854775807L) {
                        j4 = jB - enVar.y;
                        jA = f35.A(jNanoTime - j3, enVar.i);
                        j5 = enVar.y + jA;
                        long jAbs = Math.abs(j5 - jB);
                        if (j4 != j2 && jAbs < 1000000) {
                            long j18 = (jA * 10) / 100;
                            jB = f35.k(jB, j5 - j18, j5 + j18);
                        }
                    }
                    enVar.z = jNanoTime;
                    enVar.y = jB;
                } else if (playState == 1) {
                    enVar.d(jB);
                }
                return jB;
            }
            enVar2 = enVar2;
            vp4Var = vp4Var;
            audioTrack = audioTrack;
            z = false;
            vp4Var.getClass();
            jNanoTime = System.nanoTime() / j;
            if (vmVar.d == 2) {
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                enVar = enVar2;
                float f5 = enVar.i;
                um umVar6 = vmVar.a;
                jB = f35.A(jNanoTime - (umVar6.b.nanoTime / j), f5) + f35.Y(vmVar.b, umVar6.e);
            } else {
                enVar = enVar2;
                jB = enVar.b(jNanoTime);
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (z2) {
                    enVar.d(jB);
                } else {
                    enVar.d(jB);
                }
                j3 = enVar.z;
                if (j3 != -9223372036854775807L) {
                    j4 = jB - enVar.y;
                    jA = f35.A(jNanoTime - j3, enVar.i);
                    j5 = enVar.y + jA;
                    long jAbs2 = Math.abs(j5 - jB);
                    if (j4 != j2) {
                        long j19 = (jA * 10) / 100;
                        jB = f35.k(jB, j5 - j19, j5 + j19);
                    }
                }
                enVar.z = jNanoTime;
                enVar.y = jB;
            } else if (playState == 1) {
                enVar.d(jB);
            }
            return jB;
        }
        j = 1000;
        j2 = 0;
        z = false;
        vp4Var.getClass();
        jNanoTime = System.nanoTime() / j;
        if (vmVar.d == 2) {
            z2 = true;
        } else {
            z2 = z;
        }
        if (z2) {
            enVar = enVar2;
            float f6 = enVar.i;
            um umVar7 = vmVar.a;
            jB = f35.A(jNanoTime - (umVar7.b.nanoTime / j), f6) + f35.Y(vmVar.b, umVar7.e);
        } else {
            enVar = enVar2;
            jB = enVar.b(jNanoTime);
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z2) {
                enVar.d(jB);
            } else {
                enVar.d(jB);
            }
            j3 = enVar.z;
            if (j3 != -9223372036854775807L) {
                j4 = jB - enVar.y;
                jA = f35.A(jNanoTime - j3, enVar.i);
                j5 = enVar.y + jA;
                long jAbs3 = Math.abs(j5 - jB);
                if (j4 != j2) {
                    long j110 = (jA * 10) / 100;
                    jB = f35.k(jB, j5 - j110, j5 + j110);
                }
            }
            enVar.z = jNanoTime;
            enVar.y = jB;
        } else if (playState == 1) {
            enVar.d(jB);
        }
        return jB;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = f35.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    public final boolean d(int i, long j, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z;
        zh0 zh0Var;
        dn dnVar;
        ql qlVar;
        em emVar = this.b;
        boolean z2 = this.f;
        if (!z2 && this.p == 0) {
            this.p = tj0.k(emVar.a, byteBuffer);
        }
        b();
        AudioTrack audioTrack = this.a;
        int underrunCount = audioTrack.getUnderrunCount();
        boolean z3 = underrunCount > this.q;
        this.q = underrunCount;
        if (z3) {
            this.i.f(-1, new kf2(5));
        }
        int iRemaining = byteBuffer.remaining();
        if (emVar.d) {
            if (j == Long.MIN_VALUE) {
                j = this.m;
            } else {
                this.m = j;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, 1000 * j);
            } else {
                if (this.n == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.n = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.n.putInt(1431633921);
                }
                if (this.o == 0) {
                    this.n.putInt(4, iRemaining2);
                    this.n.putLong(8, j * 1000);
                    this.n.position(0);
                    this.o = iRemaining2;
                }
                int iRemaining3 = this.n.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.o = 0;
                    } else {
                        this.o -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.n, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.o = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.o = 0;
                        } else {
                            this.o -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.k += (long) iWrite;
                return z;
            }
            if (z) {
                this.l = (((long) this.p) * ((long) i)) + this.l;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (zh0Var = this.c) != null && (qlVar = (dnVar = (dn) zh0Var.o).h) != null) {
            nl nlVar = nl.c;
            dnVar.g = nlVar;
            qlVar.a(nlVar);
        }
        throw new AudioOutput$WriteException(iWrite, z);
    }
}
