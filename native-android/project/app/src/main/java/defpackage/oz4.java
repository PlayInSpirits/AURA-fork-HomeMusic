package defpackage;

import android.os.Parcel;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class oz4 implements de, za3, zy3 {
    public final Object n;

    public oz4(int i) {
        switch (i) {
            case 2:
                this.n = ByteBuffer.allocate(4);
                break;
            default:
                this.n = ly3.t;
                break;
        }
    }

    public Type a(TypeVariable typeVariable, nz4 nz4Var) {
        Type type = (Type) ((ly3) this.n).get(new pz4(typeVariable));
        if (type != null) {
            return new sz4(nz4Var).b(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            Type[] typeArrC = new sz4(nz4Var).c(bounds);
            if (!y05.a || !Arrays.equals(bounds, typeArrC)) {
                return b15.e(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrC);
            }
        }
        return typeVariable;
    }

    @Override // defpackage.zy3
    public void accept(Object obj, Object obj2) {
        jg5 jg5Var = new jg5((cr4) obj2, 1);
        eh5 eh5Var = (eh5) ((lg5) obj).e();
        cs csVar = (cs) this.n;
        Parcel parcelM = eh5Var.m();
        int i = pg5.a;
        parcelM.writeStrongBinder(jg5Var);
        pg5.c(parcelM, csVar);
        eh5Var.U(parcelM, 1);
    }

    @Override // defpackage.za3
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.n)) {
            ((ByteBuffer) this.n).position(0);
            messageDigest.update(((ByteBuffer) this.n).putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.de
    public c81 get(int i) {
        return (c81) this.n;
    }

    public /* synthetic */ oz4(kg5 kg5Var, cs csVar) {
        this.n = csVar;
    }

    public /* synthetic */ oz4(Object obj) {
        this.n = obj;
    }
}
