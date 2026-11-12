package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gt extends w0 {
    public int x;
    public int y;

    public gt(InputStream inputStream) {
        super(inputStream, 65536);
        this.y = 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j;
        int iQ;
        long j2;
        int iQ2;
        String str;
        if (i2 == 0) {
            return 0;
        }
        int iW = xa3.w(this.y);
        if (iW == 0) {
            j = 0;
            int iQ3 = q();
            if (iQ3 == -1) {
                mj0.i("Premature end of stream while looking for next block");
                return 0;
            }
            this.x = iQ3 & 15;
            long j3 = (iQ3 & 240) >> 4;
            if (j3 == 15) {
                long j4 = 0;
                do {
                    iQ = q();
                    if (iQ == -1) {
                        mj0.i("Premature end of stream while parsing length");
                        return 0;
                    }
                    j4 += (long) iQ;
                } while (iQ == 255);
                j3 += j4;
            }
            if (j3 < 0) {
                mj0.i("Illegal block with a negative literal size found");
                return 0;
            }
            if (j3 < 0) {
                kf2.n("length must not be negative");
                return 0;
            }
            this.t = j3;
            this.y = 2;
        } else {
            if (iW != 1) {
                if (iW == 2) {
                    try {
                        int iK = (int) gh0.k(this.w, 2);
                        int i3 = this.x;
                        long j5 = i3;
                        if (i3 == 15) {
                            long j6 = 0;
                            do {
                                iQ2 = q();
                                if (iQ2 == -1) {
                                    mj0.i("Premature end of stream while parsing length");
                                    return 0;
                                }
                                j2 = 0;
                                j6 += (long) iQ2;
                            } while (iQ2 == 255);
                            j5 += j6;
                        } else {
                            j2 = 0;
                        }
                        if (j5 < j2) {
                            mj0.i("Illegal block with a negative match length found");
                            return 0;
                        }
                        try {
                            s(iK, j5 + 4);
                            this.y = 4;
                        } catch (IllegalArgumentException e) {
                            throw new IOException("Illegal block with bad offset found", e);
                        }
                    } catch (IOException e2) {
                        if (this.x != 0) {
                            throw e2;
                        }
                        this.y = 5;
                        return -1;
                    }
                } else {
                    if (iW != 3) {
                        if (iW == 4) {
                            return -1;
                        }
                        int i4 = this.y;
                        if (i4 == 1) {
                            str = "NO_BLOCK";
                        } else if (i4 == 2) {
                            str = "IN_LITERAL";
                        } else if (i4 == 3) {
                            str = "LOOKING_FOR_BACK_REFERENCE";
                        } else if (i4 != 4) {
                            str = i4 != 5 ? "null" : "EOF";
                        } else {
                            str = "IN_BACK_REFERENCE";
                        }
                        mj0.i("Unknown stream state ".concat(str));
                        return 0;
                    }
                    j2 = 0;
                }
                int iF = f(bArr, i, i2);
                if (this.t <= j2) {
                    this.y = 1;
                }
                return iF > 0 ? iF : read(bArr, i, i2);
            }
            j = 0;
        }
        int iN = n(bArr, i, i2);
        if (this.t <= j) {
            this.y = 3;
        }
        return iN > 0 ? iN : read(bArr, i, i2);
    }
}
