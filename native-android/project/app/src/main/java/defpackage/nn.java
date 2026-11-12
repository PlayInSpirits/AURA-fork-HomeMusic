package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nn extends h2 {
    public static final Parcelable.Creator<nn> CREATOR = new rh5(12);
    public final gl n;
    public final Boolean o;
    public final z25 p;
    public final l04 q;

    public nn(String str, Boolean bool, String str2, String str3) {
        gl glVarA;
        l04 l04VarA = null;
        if (str == null) {
            glVarA = null;
        } else {
            try {
                glVarA = gl.a(str);
            } catch (Attachment$UnsupportedAttachmentException | ResidentKeyRequirement$UnsupportedResidentKeyRequirementException | zzbc e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.n = glVarA;
        this.o = bool;
        this.p = str2 == null ? null : z25.a(str2);
        if (str3 != null) {
            l04VarA = l04.a(str3);
        }
        this.q = l04VarA;
    }

    public final l04 b() {
        l04 l04Var = this.q;
        if (l04Var == null) {
            l04Var = null;
            Boolean bool = this.o;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return l04.o;
                }
                return null;
            }
        }
        return l04Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        return au0.n(this.n, nnVar.n) && au0.n(this.o, nnVar.o) && au0.n(this.p, nnVar.p) && au0.n(b(), nnVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, b()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.n);
        String strValueOf2 = String.valueOf(this.p);
        String strValueOf3 = String.valueOf(this.q);
        StringBuilder sbJ = xa3.j("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbJ.append(this.o);
        sbJ.append(", \n requireUserVerification=");
        sbJ.append(strValueOf2);
        sbJ.append(", \n residentKeyRequirement=");
        return b11.q(sbJ, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        gl glVar = this.n;
        ud3.O0(parcel, 2, glVar == null ? null : glVar.n);
        Boolean bool = this.o;
        if (bool != null) {
            ud3.T0(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        z25 z25Var = this.p;
        ud3.O0(parcel, 4, z25Var == null ? null : z25Var.n);
        l04 l04VarB = b();
        ud3.O0(parcel, 5, l04VarB != null ? l04VarB.n : null);
        ud3.S0(parcel, iR0);
    }
}
