package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzho;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn extends mn {
    public static final Parcelable.Creator<kn> CREATOR = new rh5(8);
    public final rj5 n;
    public final rj5 o;
    public final rj5 p;
    public final String[] q;

    public kn(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        ji2.m(bArr);
        rj5 rj5VarI = rj5.i(bArr.length, bArr);
        ji2.m(bArr2);
        rj5 rj5VarI2 = rj5.i(bArr2.length, bArr2);
        ji2.m(bArr3);
        rj5 rj5VarI3 = rj5.i(bArr3.length, bArr3);
        this.n = rj5VarI;
        this.o = rj5VarI2;
        this.p = rj5VarI3;
        ji2.m(strArr);
        this.q = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x014b A[Catch: JSONException -> 0x01ae, zzho -> 0x01b1, TRY_LEAVE, TryCatch #0 {zzho -> 0x01b1, blocks: (B:49:0x0140, B:51:0x014b, B:56:0x0160, B:59:0x017c, B:61:0x0191, B:63:0x0196, B:68:0x01b4, B:69:0x01b9, B:70:0x01ba, B:71:0x01bf, B:76:0x01ca, B:78:0x01d7, B:80:0x01e4, B:81:0x01f8, B:82:0x01fd, B:83:0x01fe, B:84:0x0203, B:91:0x0229, B:92:0x022e), top: B:140:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0204  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    public final JSONObject b() {
        JSONObject jSONObject;
        ak5 ak5Var;
        byte[] bArrC0;
        String[] strArr = this.q;
        try {
            JSONObject jSONObject2 = new JSONObject();
            rj5 rj5Var = this.o;
            if (rj5Var != null) {
                jSONObject2.put("clientDataJSON", ya4.n(rj5Var.j()));
            }
            rj5 rj5Var2 = this.p;
            if (rj5Var2 != null) {
                jSONObject2.put("attestationObject", ya4.n(rj5Var2.j()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            try {
                jSONObject2.put("transports", jSONArray);
                try {
                    try {
                        ak5 ak5Var2 = (ak5) ((yj5) ak5.e(rj5Var2.j()).c(yj5.class)).o.get(new zj5("authData"));
                        if (ak5Var2 != null) {
                            rj5 rj5Var3 = ((wj5) ak5Var2.c(wj5.class)).n;
                            byte[] bArr = rj5Var3.o;
                            ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, rj5Var3.e()).asReadOnlyBuffer();
                            try {
                                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                                if ((byteBufferAsReadOnlyBuffer.get() & 64) != 0) {
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                                    try {
                                        try {
                                            int iPosition = byteBufferAsReadOnlyBuffer.position();
                                            int iH = rj5.h(iPosition, bArr.length, rj5Var3.e());
                                            ck5 ck5Var = new ck5((iH == 0 ? rj5.p : new qj5(bArr, iPosition, iH)).g());
                                            try {
                                                ak5 ak5VarJ = vr1.J(ck5Var);
                                                try {
                                                    ck5Var.close();
                                                } catch (IOException unused) {
                                                }
                                                ji5 ji5Var = ((yj5) ak5VarJ.c(yj5.class)).o;
                                                ak5 ak5Var3 = (ak5) ji5Var.get(new xj5(3L));
                                                ak5 ak5Var4 = (ak5) ji5Var.get(new xj5(1L));
                                                if (ak5Var3 == null || ak5Var4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                try {
                                                    long j = ((xj5) ak5Var3.c(xj5.class)).n;
                                                    long j2 = ((xj5) ak5Var4.c(xj5.class)).n;
                                                    if (j2 == 1) {
                                                        jSONObject = jSONObject2;
                                                        try {
                                                            ak5Var = (ak5) ji5Var.get(new xj5(-1L));
                                                            if (ak5Var != null) {
                                                                throw new IllegalArgumentException("COSE key missing required fields");
                                                            }
                                                            long j3 = ((xj5) ak5Var.c(xj5.class)).n;
                                                            if (j2 != 2 && j3 == 1) {
                                                                ak5 ak5Var5 = (ak5) ji5Var.get(new xj5(-2L));
                                                                ak5 ak5Var6 = (ak5) ji5Var.get(new xj5(-3L));
                                                                if (ak5Var5 == null || ak5Var6 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                rj5 rj5Var4 = ((wj5) ak5Var5.c(wj5.class)).n;
                                                                rj5 rj5Var5 = ((wj5) ak5Var6.c(wj5.class)).n;
                                                                if (rj5Var4.o.length != 32 || rj5Var5.o.length != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrC0 = kb4.c0(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), rj5Var4.j(), rj5Var5.j());
                                                            } else if (j2 == 1 || j3 != 6) {
                                                                bArrC0 = null;
                                                            } else {
                                                                ak5 ak5Var7 = (ak5) ji5Var.get(new xj5(-2L));
                                                                if (ak5Var7 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                rj5 rj5Var6 = ((wj5) ak5Var7.c(wj5.class)).n;
                                                                if (rj5Var6.o.length != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrC0 = kb4.c0(Base64.decode("MCowBQYDK2VwAyEA", 0), rj5Var6.j());
                                                            }
                                                        } catch (zzho e) {
                                                            e = e;
                                                            throw new IllegalArgumentException("COSE key ill-formed", e);
                                                        }
                                                    } else if (j2 == 2) {
                                                        j2 = 2;
                                                        jSONObject = jSONObject2;
                                                        ak5Var = (ak5) ji5Var.get(new xj5(-1L));
                                                        if (ak5Var != null) {
                                                            throw new IllegalArgumentException("COSE key missing required fields");
                                                        }
                                                        long j4 = ((xj5) ak5Var.c(xj5.class)).n;
                                                        if (j2 != 2) {
                                                            if (j2 == 1) {
                                                                bArrC0 = null;
                                                            } else {
                                                                bArrC0 = null;
                                                            }
                                                        } else if (j2 == 1) {
                                                            bArrC0 = null;
                                                        } else {
                                                            bArrC0 = null;
                                                        }
                                                    } else {
                                                        jSONObject = jSONObject2;
                                                        bArrC0 = null;
                                                    }
                                                    JSONObject jSONObject3 = jSONObject;
                                                    jSONObject3.put("authenticatorData", ya4.n(rj5Var3.j()));
                                                    jSONObject3.put("publicKeyAlgorithm", j);
                                                    if (bArrC0 != null) {
                                                        jSONObject3.put("publicKey", Base64.encodeToString(bArrC0, 11));
                                                    }
                                                    return jSONObject3;
                                                } catch (zzho e2) {
                                                    e = e2;
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    try {
                                                        ck5Var.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    try {
                                                        throw th;
                                                    } catch (zzhj e3) {
                                                        e = e3;
                                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                                    }
                                                } catch (zzho e4) {
                                                    e = e4;
                                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                                }
                                            }
                                        } catch (zzho e5) {
                                            e = e5;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    } catch (zzhj e6) {
                                        e = e6;
                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                    }
                                    nz2.s("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                                    return null;
                                }
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e7) {
                                    e = e7;
                                }
                            } catch (IllegalArgumentException e8) {
                                e = e8;
                            }
                            throw new IllegalArgumentException("ill-formed authenticator data", e);
                        }
                        try {
                            throw new IllegalArgumentException("attestation object missing authData");
                        } catch (zzho e9) {
                            e = e9;
                        }
                    } catch (zzho e10) {
                        e = e10;
                    }
                    throw new IllegalArgumentException("authData value has wrong type", e);
                } catch (zzhj e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (zzho e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return au0.n(this.n, knVar.n) && au0.n(this.o, knVar.o) && au0.n(this.p, knVar.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.n})), Integer.valueOf(Arrays.hashCode(new Object[]{this.o})), Integer.valueOf(Arrays.hashCode(new Object[]{this.p}))});
    }

    public final String toString() {
        ns3 ns3Var = new ns3(getClass().getSimpleName());
        ij5 ij5Var = kj5.d;
        byte[] bArrJ = this.n.j();
        ns3Var.h(ij5Var.c(bArrJ.length, bArrJ), "keyHandle");
        byte[] bArrJ2 = this.o.j();
        ns3Var.h(ij5Var.c(bArrJ2.length, bArrJ2), "clientDataJSON");
        byte[] bArrJ3 = this.p.j();
        ns3Var.h(ij5Var.c(bArrJ3.length, bArrJ3), "attestationObject");
        ns3Var.h(Arrays.toString(this.q), "transports");
        return ns3Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.L0(parcel, 2, this.n.j());
        ud3.L0(parcel, 3, this.o.j());
        ud3.L0(parcel, 4, this.p.j());
        String[] strArr = this.q;
        if (strArr != null) {
            int iR1 = ud3.R0(parcel, 5);
            parcel.writeStringArray(strArr);
            ud3.S0(parcel, iR1);
        }
        ud3.S0(parcel, iR0);
    }
}
