package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh4 extends w0 {
    public int x;
    public int y;
    public boolean z;

    public bh4(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.y = 1;
        int i2 = 0;
        this.z = false;
        long j = 0;
        while (true) {
            int iQ = q();
            if (iQ == -1) {
                mj0.i("Premature end of stream reading size");
                throw null;
            }
            int i3 = i2 + 1;
            j |= (long) ((iQ & 127) << (i2 * 7));
            if ((iQ & 128) == 0) {
                this.x = (int) j;
                return;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j;
        long jK;
        String str;
        if (i2 == 0) {
            return 0;
        }
        if (this.z) {
            return -1;
        }
        int iW = xa3.w(this.y);
        if (iW != 0) {
            if (iW == 1) {
                int iN = n(bArr, i, i2);
                if (this.t <= 0) {
                    this.y = 1;
                }
                return iN > 0 ? iN : read(bArr, i, i2);
            }
            if (iW == 2) {
                int iF = f(bArr, i, i2);
                if (this.t <= 0) {
                    this.y = 1;
                }
                return iF > 0 ? iF : read(bArr, i, i2);
            }
            int i4 = this.y;
            if (i4 == 1) {
                str = "NO_BLOCK";
            } else if (i4 != 2) {
                str = i4 != 3 ? "null" : "IN_BACK_REFERENCE";
            } else {
                str = "IN_LITERAL";
            }
            mj0.i("Unknown stream state ".concat(str));
            return 0;
        }
        if (this.x == 0) {
            this.z = true;
        } else {
            int iQ = q();
            if (iQ == -1) {
                mj0.i("Premature end of stream reading block start");
                return 0;
            }
            int i5 = iQ & 3;
            hg3 hg3Var = this.w;
            if (i5 == 0) {
                int iQ2 = iQ >> 2;
                switch (iQ2) {
                    case 60:
                        iQ2 = q();
                        if (iQ2 == -1) {
                            mj0.i("Premature end of stream reading literal length");
                            return 0;
                        }
                        i3 = iQ2 + 1;
                        if (i3 < 0) {
                            mj0.i("Illegal block with a negative literal size found");
                            return 0;
                        }
                        this.x -= i3;
                        j = i3;
                        if (j < 0) {
                            kf2.n("length must not be negative");
                            return 0;
                        }
                        this.t = j;
                        this.y = 2;
                        break;
                        break;
                    case 61:
                        jK = gh0.k(hg3Var, 2);
                        iQ2 = (int) jK;
                        i3 = iQ2 + 1;
                        if (i3 < 0) {
                            mj0.i("Illegal block with a negative literal size found");
                            return 0;
                        }
                        this.x -= i3;
                        j = i3;
                        if (j < 0) {
                            kf2.n("length must not be negative");
                            return 0;
                        }
                        this.t = j;
                        this.y = 2;
                        break;
                        break;
                    case 62:
                        jK = gh0.k(hg3Var, 3);
                        iQ2 = (int) jK;
                        i3 = iQ2 + 1;
                        if (i3 < 0) {
                            mj0.i("Illegal block with a negative literal size found");
                            return 0;
                        }
                        this.x -= i3;
                        j = i3;
                        if (j < 0) {
                            kf2.n("length must not be negative");
                            return 0;
                        }
                        this.t = j;
                        this.y = 2;
                        break;
                        break;
                    case 63:
                        jK = gh0.k(hg3Var, 4);
                        iQ2 = (int) jK;
                        i3 = iQ2 + 1;
                        if (i3 < 0) {
                            mj0.i("Illegal block with a negative literal size found");
                            return 0;
                        }
                        this.x -= i3;
                        j = i3;
                        if (j < 0) {
                            kf2.n("length must not be negative");
                            return 0;
                        }
                        this.t = j;
                        this.y = 2;
                        break;
                        break;
                    default:
                        i3 = iQ2 + 1;
                        if (i3 < 0) {
                            mj0.i("Illegal block with a negative literal size found");
                            return 0;
                        }
                        this.x -= i3;
                        j = i3;
                        if (j < 0) {
                            kf2.n("length must not be negative");
                            return 0;
                        }
                        this.t = j;
                        this.y = 2;
                        break;
                        break;
                }
            } else if (i5 == 1) {
                int i6 = ((iQ >> 2) & 7) + 4;
                if (i6 < 0) {
                    mj0.i("Illegal block with a negative match length found");
                    return 0;
                }
                this.x -= i6;
                int i7 = (iQ & 224) << 3;
                int iQ3 = q();
                if (iQ3 == -1) {
                    mj0.i("Premature end of stream reading back-reference length");
                    return 0;
                }
                try {
                    s(i7 | iQ3, i6);
                    this.y = 3;
                } catch (IllegalArgumentException e) {
                    throw new IOException("Illegal block with bad offset found", e);
                }
            } else if (i5 == 2) {
                int i8 = (iQ >> 2) + 1;
                if (i8 < 0) {
                    mj0.i("Illegal block with a negative match length found");
                    return 0;
                }
                this.x -= i8;
                try {
                    s((int) gh0.k(hg3Var, 2), i8);
                    this.y = 3;
                } catch (IllegalArgumentException e2) {
                    throw new IOException("Illegal block with bad offset found", e2);
                }
            } else if (i5 == 3) {
                int i9 = (iQ >> 2) + 1;
                if (i9 < 0) {
                    mj0.i("Illegal block with a negative match length found");
                    return 0;
                }
                this.x -= i9;
                try {
                    s(((int) gh0.k(hg3Var, 4)) & Integer.MAX_VALUE, i9);
                    this.y = 3;
                } catch (IllegalArgumentException e3) {
                    throw new IOException("Illegal block with bad offset found", e3);
                }
            }
        }
        return read(bArr, i, i2);
    }
}
