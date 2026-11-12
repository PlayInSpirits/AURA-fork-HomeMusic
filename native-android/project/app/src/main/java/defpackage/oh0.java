package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 {
    public static final oh0 b;
    public final HashMap a;

    static {
        oh0 oh0Var = new oh0(new LinkedHashMap());
        bu.E(oh0Var);
        b = oh0Var;
    }

    public oh0(oh0 oh0Var) {
        oh0Var.getClass();
        this.a = new HashMap(oh0Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    public static final oh0 a(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length > 10240) {
            kf2.o("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            if (bArr2[0] == -84) {
                z = true;
                if (bArr2[1] != -19) {
                    z = false;
                }
            } else {
                z = false;
            }
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        String utf = objectInputStream.readUTF();
                        utf.getClass();
                        linkedHashMap.put(utf, objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    bu.j(dataInputStream);
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        Serializable serializableK = bu.k(dataInputStream, dataInputStream.readByte());
                        String utf2 = dataInputStream.readUTF();
                        utf2.getClass();
                        linkedHashMap.put(utf2, serializableK);
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        q05.h(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            cx.f().e(ki0.a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            cx.f().e(ki0.a, "Error in Data#fromByteArray: ", e2);
        }
        return new oh0(linkedHashMap);
    }

    public final boolean b(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && oh0.class.equals(obj.getClass())) {
                HashMap map = ((oh0) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (h12.c(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = ti.W(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return b11.q(new StringBuilder("Data {"), q40.B0(this.a.entrySet(), null, null, null, k5.p, 31), "}");
    }

    public oh0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
