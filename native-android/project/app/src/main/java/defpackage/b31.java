package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b31 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public b31(long l16, byte[] byArray, int n16, int n17) {
        this.a = n16;
        this.b = n17;
        this.c = l16;
        this.d = byArray;
    }

    public b31(byte[] byArray, int n16, int n17) {
        this(-1L, byArray, n16, n17);
    }

    public static b31 a(long l16, ByteOrder byteOrder) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[f31.C[4]]);
        byteBuffer.order(byteOrder);
        byteBuffer.putInt((int)(new long[]{l16})[0]);
        return new b31(byteBuffer.array(), 4, 1);
    }

    public static b31 b(d31 d312, ByteOrder byteOrder) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[f31.C[5]]);
        byteBuffer.order(byteOrder);
        d312 = (new d31[]{d312})[0];
        byteBuffer.putInt((int)d312.a);
        byteBuffer.putInt((int)d312.b);
        return new b31(byteBuffer.array(), 5, 1);
    }

    public static b31 c(int n16, ByteOrder byteOrder) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[f31.C[3]]);
        byteBuffer.order(byteOrder);
        byteBuffer.putShort((short)(new int[]{n16})[0]);
        return new b31(byteBuffer.array(), 3, 1);
    }

    public final double d(ByteOrder object) {
        if ((object = this.g((ByteOrder)object)) != null) {
            if (object instanceof String) {
                return Double.parseDouble((String)object);
            }
            if (object instanceof long[]) {
                if (((Object)(object = (Object)((long[])object))).length == 1) {
                    return (double)object[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (object instanceof int[]) {
                if (((Object)(object = (Object)((int[])object))).length == 1) {
                    return (double)object[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (object instanceof double[]) {
                if (((Object)(object = (Object)((double[])object))).length == 1) {
                    return (double)object[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (object instanceof d31[]) {
                if (((d31[])(object = (d31[])object)).length == 1) {
                    object = object[0];
                    return (double)object.a / (double)object.b;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder object) {
        if ((object = this.g((ByteOrder)object)) != null) {
            if (object instanceof String) {
                return Integer.parseInt((String)object);
            }
            if (object instanceof long[]) {
                if (((Object)(object = (Object)((long[])object))).length == 1) {
                    return (int)object[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (object instanceof int[]) {
                if (((Object)(object = (Object)((int[])object))).length == 1) {
                    return (int)object[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder object) {
        Object object2 = this.g((ByteOrder)object);
        if (object2 != null) {
            if (object2 instanceof String) {
                return (String)object2;
            }
            object = new StringBuilder();
            boolean bl5 = object2 instanceof long[];
            int n16 = 0;
            int n17 = 0;
            int n18 = 0;
            int n19 = 0;
            if (bl5) {
                object2 = (long[])object2;
                n17 = n19;
                while (n17 < ((Object)object2).length) {
                    ((StringBuilder)object).append((long)object2[n17]);
                    n17 = n18 = n17 + 1;
                    if (n18 == ((d31[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n17 = n18;
                }
                return ((StringBuilder)object).toString();
            }
            if (object2 instanceof int[]) {
                object2 = (int[])object2;
                n17 = n16;
                while (n17 < ((Object)object2).length) {
                    ((StringBuilder)object).append((int)object2[n17]);
                    n17 = n18 = n17 + 1;
                    if (n18 == ((d31[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n17 = n18;
                }
                return ((StringBuilder)object).toString();
            }
            if (object2 instanceof double[]) {
                object2 = (double[])object2;
                while (n17 < ((Object)object2).length) {
                    ((StringBuilder)object).append((double)object2[n17]);
                    n17 = n18 = n17 + 1;
                    if (n18 == ((d31[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n17 = n18;
                }
                return ((StringBuilder)object).toString();
            }
            if (object2 instanceof d31[]) {
                object2 = object2;
                n17 = n18;
                while (n17 < ((d31[])object2).length) {
                    ((StringBuilder)object).append(object2[n17].a);
                    ((StringBuilder)object).append('/');
                    ((StringBuilder)object).append(object2[n17].b);
                    n17 = n18 = n17 + 1;
                    if (n18 == ((d31[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n17 = n18;
                }
                return ((StringBuilder)object).toString();
            }
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Serializable g(ByteOrder var1_1) {
        block65: {
            block67: {
                block66: {
                    var15_7 /* !! */  = this.d;
                    var13_8 = null;
                    var13_8 = var14_14 = new a31(var15_7 /* !! */ );
                    var14_14.o = var1_1;
                    var13_8 = var14_14;
                    var12_16 = this.a;
                    var4_17 = 0;
                    var8_18 = 0;
                    var7_19 = 0;
                    var10_20 = 0;
                    var9_21 = 0;
                    var6_22 = 0;
                    var5_23 = 0;
                    var3_24 = 0;
                    var2_25 = 0;
                    var11_26 = this.b;
                    switch (var12_16) {
                        default: {
                            try {
                                var14_14.close();
                                return null;
                            }
                            catch (IOException var1_2) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_2);
                                return null;
                            }
                        }
                        case 12: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new double[var11_26];
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = (byte)var14_14.readDouble();
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 11: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new double[var11_26];
                            var2_25 = var4_17;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = (byte)var14_14.readFloat();
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 10: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new d31[var11_26];
                            var2_25 = var8_18;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = (byte)new d31(var14_14.readInt(), var14_14.readInt());
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 9: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new int[var11_26];
                            var2_25 = var7_19;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = var14_14.readInt();
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 8: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new int[var11_26];
                            var2_25 = var10_20;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = var14_14.readShort();
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 5: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new d31[var11_26];
                            var2_25 = var9_21;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = (byte)new d31((long)var14_14.readInt() & 0xFFFFFFFFL, (long)var14_14.readInt() & 0xFFFFFFFFL);
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 4: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new long[var11_26];
                            var2_25 = var6_22;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 < var11_26) {
                                    var13_8 = var14_14;
                                    var15_7 /* !! */ [var2_25] = (byte)((long)var14_14.readInt() & 0xFFFFFFFFL);
                                    ++var2_25;
                                    continue;
                                }
                                ** GOTO lbl130
                                break;
                            }
                        }
                        case 3: {
                            var13_8 = var14_14;
                            var15_7 /* !! */  = (byte[])new int[var11_26];
                            var2_25 = var5_23;
                            while (true) {
                                var1_1 = var15_7 /* !! */ ;
                                if (var2_25 >= var11_26) break;
                                var13_8 = var14_14;
                                var15_7 /* !! */ [var2_25] = var14_14.readUnsignedShort();
                                ++var2_25;
                            }
lbl130:
                            // 8 sources

                            try {
                                var14_14.close();
                                return var1_1;
                            }
                            catch (IOException var13_10) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var13_10);
                                return var1_1;
                            }
                        }
                        case 2: 
                        case 7: {
                            var13_8 = var14_14;
                            var2_25 = var3_24;
                            if (var11_26 >= f31.D.length) {
                                var2_25 = 0;
                                break block65;
                            }
                            ** GOTO lbl208
                        }
                        case 1: 
                        case 6: 
                    }
                    var13_8 = var14_14;
                    ** try [egrp 17[TRYBLOCK] [60, 59 : 729->736)] { 
lbl148:
                    // 1 sources

                    if (var15_7 /* !! */ .length == 1 && (var2_25 = var15_7 /* !! */ [0]) >= 0 && var2_25 <= 1) {
                        var13_8 = var14_14;
                        var1_1 = new String(new char[]{(char)(var2_25 + 48)});
                        try {
                            var14_14.close();
                            return var1_1;
                        }
                        catch (IOException var13_12) {
                            Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var13_12);
                            return var1_1;
                        }
                    }
                    var13_8 = var14_14;
                    try {
                        var1_1 = new String(var15_7 /* !! */ , f31.L);
                        ** break;
                        catch (Throwable var1_4) {
                            break block66;
                        }
                        catch (IOException var14_15) {
                            var1_1 = null;
                            break block67;
                        }
                    }
lbl169:
                    // 13 sources

                    catch (Throwable var1_3) {}
                }
                if (var13_8 == null) throw var1_6;
                try {
                    var13_8.close();
                    throw var1_6;
                }
                catch (IOException var13_13) {
                    Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var13_13);
                }
                throw var1_6;
lbl179:
                // 13 sources

                catch (IOException var13_9) {
                    var1_1 = var14_14;
                    var14_14 = var13_9;
                }
            }
            var13_8 = var1_1;
            Log.w((String)"ExifInterface", (String)"IOException occurred during reading a value", (Throwable)var14_14);
            if (var1_1 == null) return null;
            try {
                var1_1.close();
                return null;
            }
            catch (IOException var1_5) {
                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_5);
            }
            return null;
        }
        while (true) {
            block68: {
                var13_8 = var14_14;
                var1_1 = f31.D;
                var13_8 = var14_14;
                if (var2_25 >= ((Object)var1_1).length) break;
                if (var15_7 /* !! */ [var2_25] == var1_1[var2_25]) break block68;
                var2_25 = var3_24;
                ** GOTO lbl208
            }
            ++var2_25;
        }
        var13_8 = var14_14;
        {
            var2_25 = ((Object)var1_1).length;
lbl208:
            // 3 sources

            var13_8 = var14_14;
            var13_8 = var14_14;
            var1_1 = new StringBuilder();
        }
        while (var2_25 < var11_26 && (var3_24 = var15_7 /* !! */ [var2_25]) != 0) {
            if (var3_24 < 32) ** GOTO lbl217
            var13_8 = var14_14;
            {
                block69: {
                    var1_1.append((char)var3_24);
                    break block69;
lbl217:
                    // 1 sources

                    var13_8 = var14_14;
                    var1_1.append('?');
                }
                ++var2_25;
            }
        }
        var13_8 = var14_14;
        {
            var1_1 = var1_1.toString();
        }
lbl225:
        // 2 sources

        try {
            var14_14.close();
            return var1_1;
        }
        catch (IOException var13_11) {
            Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var13_11);
            return var1_1;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(f31.B[this.a]);
        stringBuilder.append(", data length:");
        return f34.i(stringBuilder, this.d.length, ")");
    }
}

