.class public abstract Lbu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[Lvd0;

.field public static final b:Lyr0;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static f:Z

.field public static g:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lvd0;

    .line 3
    .line 4
    sput-object v0, Lbu;->a:[Lvd0;

    .line 5
    .line 6
    new-instance v0, Lyr0;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lbu;->b:Lyr0;

    .line 12
    .line 13
    const-string v0, "Camera:MicroVideo"

    .line 14
    .line 15
    const-string v1, "GCamera:MicroVideo"

    .line 16
    .line 17
    const-string v2, "Camera:MotionPhoto"

    .line 18
    .line 19
    const-string v3, "GCamera:MotionPhoto"

    .line 20
    .line 21
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lbu;->c:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "Camera:MicroVideoPresentationTimestampUs"

    .line 28
    .line 29
    const-string v1, "GCamera:MicroVideoPresentationTimestampUs"

    .line 30
    .line 31
    const-string v2, "Camera:MotionPhotoPresentationTimestampUs"

    .line 32
    .line 33
    const-string v3, "GCamera:MotionPhotoPresentationTimestampUs"

    .line 34
    .line 35
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lbu;->d:[Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "Camera:MicroVideoOffset"

    .line 42
    .line 43
    const-string v1, "GCamera:MicroVideoOffset"

    .line 44
    .line 45
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lbu;->e:[Ljava/lang/String;

    .line 50
    .line 51
    return-void
.end method

.method public static A(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 9

    .line 1
    invoke-static {p0}, Lg12;->U(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int v1, v0, p2

    .line 6
    .line 7
    invoke-static {v1, p3}, Lbu;->B(ILjava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    not-int v4, p2

    .line 16
    and-int/2addr v0, v4

    .line 17
    move v5, v3

    .line 18
    :goto_0
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    aget v6, p4, v2

    .line 21
    .line 22
    and-int v7, v6, v4

    .line 23
    .line 24
    if-ne v7, v0, :cond_3

    .line 25
    .line 26
    aget-object v7, p5, v2

    .line 27
    .line 28
    invoke-static {p0, v7}, Lsi0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_3

    .line 33
    .line 34
    if-eqz p6, :cond_1

    .line 35
    .line 36
    aget-object v7, p6, v2

    .line 37
    .line 38
    invoke-static {p1, v7}, Lsi0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_3

    .line 43
    .line 44
    :cond_1
    and-int p0, v6, p2

    .line 45
    .line 46
    if-ne v5, v3, :cond_2

    .line 47
    .line 48
    invoke-static {v1, p0, p3}, Lbu;->C(IILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_2
    aget p1, p4, v5

    .line 53
    .line 54
    invoke-static {p1, p0, p2}, Lbu;->s(III)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    aput p0, p4, v5

    .line 59
    .line 60
    return v2

    .line 61
    :cond_3
    and-int v5, v6, p2

    .line 62
    .line 63
    if-nez v5, :cond_4

    .line 64
    .line 65
    :goto_1
    return v3

    .line 66
    :cond_4
    move v8, v5

    .line 67
    move v5, v2

    .line 68
    move v2, v8

    .line 69
    goto :goto_0
.end method

.method public static B(ILjava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, [B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, [B

    .line 6
    .line 7
    aget-byte p0, p1, p0

    .line 8
    .line 9
    and-int/lit16 p0, p0, 0xff

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p1, [S

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, [S

    .line 17
    .line 18
    aget-short p0, p1, p0

    .line 19
    .line 20
    const p1, 0xffff

    .line 21
    .line 22
    .line 23
    and-int/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_1
    check-cast p1, [I

    .line 26
    .line 27
    aget p0, p1, p0

    .line 28
    .line 29
    return p0
.end method

.method public static C(IILjava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p2, [B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, [B

    .line 6
    .line 7
    int-to-byte p1, p1

    .line 8
    aput-byte p1, p2, p0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p2, [S

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p2, [S

    .line 16
    .line 17
    int-to-short p1, p1

    .line 18
    aput-short p1, p2, p0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    check-cast p2, [I

    .line 22
    .line 23
    aput p1, p2, p0

    .line 24
    .line 25
    return-void
.end method

.method public static D(Landroid/content/Context;I)I
    .locals 1

    .line 1
    const v0, 0x1030001

    .line 2
    .line 3
    .line 4
    filled-new-array {p1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return p1
.end method

.method public static E(Loh0;)[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Loh0;->a:Ljava/util/HashMap;

    .line 5
    .line 6
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/io/DataOutputStream;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    const/16 v2, -0x5411

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v1, v3, v2}, Lbu;->F(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    const/16 v2, 0x2800

    .line 76
    .line 77
    if-gt p0, v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_1
    :try_start_3
    const-string p0, "Data cannot occupy more than 10240 bytes when serialized"

    .line 91
    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    :goto_1
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :try_start_5
    invoke-static {v1, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 104
    :catch_0
    move-exception p0

    .line 105
    sget-object v0, Lki0;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {}, Lcx;->f()Lcx;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "Error in Data#toByteArray: "

    .line 112
    .line 113
    invoke-virtual {v1, v0, v2, p0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    const/4 p0, 0x0

    .line 117
    new-array p0, p0, [B

    .line 118
    .line 119
    return-object p0
.end method

.method public static final F(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 9
    .line 10
    .line 11
    goto/16 :goto_9

    .line 12
    .line 13
    :cond_0
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :cond_1
    instance-of v3, v1, Ljava/lang/Byte;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 38
    .line 39
    .line 40
    check-cast v1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_9

    .line 50
    .line 51
    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 57
    .line 58
    .line 59
    check-cast v1, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    const/4 v2, 0x4

    .line 75
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 76
    .line 77
    .line 78
    check-cast v1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_4
    instance-of v3, v1, Ljava/lang/Float;

    .line 90
    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    const/4 v2, 0x5

    .line 94
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 95
    .line 96
    .line 97
    check-cast v1, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeFloat(F)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_9

    .line 107
    .line 108
    :cond_5
    instance-of v3, v1, Ljava/lang/Double;

    .line 109
    .line 110
    if-eqz v3, :cond_6

    .line 111
    .line 112
    const/4 v2, 0x6

    .line 113
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 114
    .line 115
    .line 116
    check-cast v1, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeDouble(D)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_6
    instance-of v3, v1, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    const/4 v2, 0x7

    .line 132
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 133
    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_9

    .line 141
    .line 142
    :cond_7
    instance-of v3, v1, [Ljava/lang/Object;

    .line 143
    .line 144
    const-string v4, "Unsupported value type "

    .line 145
    .line 146
    if-eqz v3, :cond_25

    .line 147
    .line 148
    check-cast v1, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-static {v3}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    const-class v5, [Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    const/16 v6, 0xe

    .line 169
    .line 170
    const/16 v7, 0xd

    .line 171
    .line 172
    const/16 v8, 0xc

    .line 173
    .line 174
    const/16 v9, 0xb

    .line 175
    .line 176
    const/16 v10, 0xa

    .line 177
    .line 178
    const/16 v11, 0x9

    .line 179
    .line 180
    const/16 v12, 0x8

    .line 181
    .line 182
    if-eqz v5, :cond_8

    .line 183
    .line 184
    move v3, v12

    .line 185
    goto :goto_0

    .line 186
    :cond_8
    const-class v5, [Ljava/lang/Byte;

    .line 187
    .line 188
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-eqz v5, :cond_9

    .line 197
    .line 198
    move v3, v11

    .line 199
    goto :goto_0

    .line 200
    :cond_9
    const-class v5, [Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    move v3, v10

    .line 213
    goto :goto_0

    .line 214
    :cond_a
    const-class v5, [Ljava/lang/Long;

    .line 215
    .line 216
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_b

    .line 225
    .line 226
    move v3, v9

    .line 227
    goto :goto_0

    .line 228
    :cond_b
    const-class v5, [Ljava/lang/Float;

    .line 229
    .line 230
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_c

    .line 239
    .line 240
    move v3, v8

    .line 241
    goto :goto_0

    .line 242
    :cond_c
    const-class v5, [Ljava/lang/Double;

    .line 243
    .line 244
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-eqz v5, :cond_d

    .line 253
    .line 254
    move v3, v7

    .line 255
    goto :goto_0

    .line 256
    :cond_d
    const-class v5, [Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    invoke-virtual {v3, v5}, Li30;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_24

    .line 267
    .line 268
    move v3, v6

    .line 269
    :goto_0
    invoke-virtual {v0, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 270
    .line 271
    .line 272
    array-length v4, v1

    .line 273
    invoke-virtual {v0, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 274
    .line 275
    .line 276
    array-length v4, v1

    .line 277
    move v5, v2

    .line 278
    :goto_1
    if-ge v5, v4, :cond_23

    .line 279
    .line 280
    aget-object v13, v1, v5

    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    if-ne v3, v12, :cond_10

    .line 284
    .line 285
    instance-of v15, v13, Ljava/lang/Boolean;

    .line 286
    .line 287
    if-eqz v15, :cond_e

    .line 288
    .line 289
    move-object v14, v13

    .line 290
    check-cast v14, Ljava/lang/Boolean;

    .line 291
    .line 292
    :cond_e
    if-eqz v14, :cond_f

    .line 293
    .line 294
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    goto :goto_2

    .line 299
    :cond_f
    move v13, v2

    .line 300
    :goto_2
    invoke-virtual {v0, v13}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_8

    .line 304
    .line 305
    :cond_10
    if-ne v3, v11, :cond_13

    .line 306
    .line 307
    instance-of v15, v13, Ljava/lang/Byte;

    .line 308
    .line 309
    if-eqz v15, :cond_11

    .line 310
    .line 311
    move-object v14, v13

    .line 312
    check-cast v14, Ljava/lang/Byte;

    .line 313
    .line 314
    :cond_11
    if-eqz v14, :cond_12

    .line 315
    .line 316
    invoke-virtual {v14}, Ljava/lang/Byte;->byteValue()B

    .line 317
    .line 318
    .line 319
    move-result v13

    .line 320
    goto :goto_3

    .line 321
    :cond_12
    move v13, v2

    .line 322
    :goto_3
    invoke-virtual {v0, v13}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_8

    .line 326
    .line 327
    :cond_13
    if-ne v3, v10, :cond_16

    .line 328
    .line 329
    instance-of v15, v13, Ljava/lang/Integer;

    .line 330
    .line 331
    if-eqz v15, :cond_14

    .line 332
    .line 333
    move-object v14, v13

    .line 334
    check-cast v14, Ljava/lang/Integer;

    .line 335
    .line 336
    :cond_14
    if-eqz v14, :cond_15

    .line 337
    .line 338
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result v13

    .line 342
    goto :goto_4

    .line 343
    :cond_15
    move v13, v2

    .line 344
    :goto_4
    invoke-virtual {v0, v13}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 345
    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_16
    if-ne v3, v9, :cond_19

    .line 349
    .line 350
    instance-of v15, v13, Ljava/lang/Long;

    .line 351
    .line 352
    if-eqz v15, :cond_17

    .line 353
    .line 354
    move-object v14, v13

    .line 355
    check-cast v14, Ljava/lang/Long;

    .line 356
    .line 357
    :cond_17
    if-eqz v14, :cond_18

    .line 358
    .line 359
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 360
    .line 361
    .line 362
    move-result-wide v13

    .line 363
    goto :goto_5

    .line 364
    :cond_18
    const-wide/16 v13, 0x0

    .line 365
    .line 366
    :goto_5
    invoke-virtual {v0, v13, v14}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 367
    .line 368
    .line 369
    goto :goto_8

    .line 370
    :cond_19
    if-ne v3, v8, :cond_1c

    .line 371
    .line 372
    instance-of v15, v13, Ljava/lang/Float;

    .line 373
    .line 374
    if-eqz v15, :cond_1a

    .line 375
    .line 376
    move-object v14, v13

    .line 377
    check-cast v14, Ljava/lang/Float;

    .line 378
    .line 379
    :cond_1a
    if-eqz v14, :cond_1b

    .line 380
    .line 381
    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    goto :goto_6

    .line 386
    :cond_1b
    const/4 v13, 0x0

    .line 387
    :goto_6
    invoke-virtual {v0, v13}, Ljava/io/DataOutputStream;->writeFloat(F)V

    .line 388
    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_1c
    if-ne v3, v7, :cond_1f

    .line 392
    .line 393
    instance-of v15, v13, Ljava/lang/Double;

    .line 394
    .line 395
    if-eqz v15, :cond_1d

    .line 396
    .line 397
    move-object v14, v13

    .line 398
    check-cast v14, Ljava/lang/Double;

    .line 399
    .line 400
    :cond_1d
    if-eqz v14, :cond_1e

    .line 401
    .line 402
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    .line 403
    .line 404
    .line 405
    move-result-wide v13

    .line 406
    goto :goto_7

    .line 407
    :cond_1e
    const-wide/16 v13, 0x0

    .line 408
    .line 409
    :goto_7
    invoke-virtual {v0, v13, v14}, Ljava/io/DataOutputStream;->writeDouble(D)V

    .line 410
    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_1f
    if-ne v3, v6, :cond_22

    .line 414
    .line 415
    instance-of v15, v13, Ljava/lang/String;

    .line 416
    .line 417
    if-eqz v15, :cond_20

    .line 418
    .line 419
    move-object v14, v13

    .line 420
    check-cast v14, Ljava/lang/String;

    .line 421
    .line 422
    :cond_20
    if-nez v14, :cond_21

    .line 423
    .line 424
    const-string v14, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"

    .line 425
    .line 426
    :cond_21
    invoke-virtual {v0, v14}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    :cond_22
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 430
    .line 431
    goto/16 :goto_1

    .line 432
    .line 433
    :cond_23
    :goto_9
    invoke-virtual/range {p0 .. p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-static {v0}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v0}, Li30;->b()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0, v4}, Lkf2;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :cond_25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v0}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Li30;->c()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-static {v0, v4}, Lkf2;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    return-void
.end method

.method public static G(Landroid/media/MediaRoute2Info;)Lsp2;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_7

    .line 5
    .line 6
    :cond_0
    new-instance v1, Lss0;

    .line 7
    .line 8
    invoke-static {p0}, Lto2;->i(Landroid/media/MediaRoute2Info;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {p0}, Lto2;->h(Landroid/media/MediaRoute2Info;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v1, v2, v3}, Lss0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v1, Lss0;->n:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-static {p0}, Lto2;->a(Landroid/media/MediaRoute2Info;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const-string v4, "connectionState"

    .line 32
    .line 33
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lto2;->x(Landroid/media/MediaRoute2Info;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const-string v4, "volumeHandling"

    .line 41
    .line 42
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Lxq2;->c(Landroid/media/MediaRoute2Info;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const-string v4, "volumeMax"

    .line 50
    .line 51
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Lxq2;->z(Landroid/media/MediaRoute2Info;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    const-string v4, "volume"

    .line 59
    .line 60
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Ll3;->j(Landroid/media/MediaRoute2Info;)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "extras"

    .line 68
    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-instance v5, Landroid/os/Bundle;

    .line 76
    .line 77
    invoke-direct {v5, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    const-string v3, "enabled"

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v3, "canDisconnect"

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-virtual {v2, v3, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 v7, 0x22

    .line 98
    .line 99
    if-lt v3, v7, :cond_a

    .line 100
    .line 101
    invoke-static {p0}, La3;->g(Landroid/media/MediaRoute2Info;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v7, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    .line 109
    .line 110
    const-string v3, "deduplicationIds"

    .line 111
    .line 112
    invoke-virtual {v2, v3, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, La3;->j(Landroid/media/MediaRoute2Info;)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    const/4 v7, 0x2

    .line 120
    if-eq v3, v7, :cond_9

    .line 121
    .line 122
    const/4 v8, 0x3

    .line 123
    if-eq v3, v8, :cond_8

    .line 124
    .line 125
    const/4 v9, 0x4

    .line 126
    if-eq v3, v9, :cond_7

    .line 127
    .line 128
    const/16 v10, 0x16

    .line 129
    .line 130
    if-eq v3, v10, :cond_6

    .line 131
    .line 132
    const/16 v11, 0x17

    .line 133
    .line 134
    if-eq v3, v11, :cond_5

    .line 135
    .line 136
    const/16 v12, 0x1a

    .line 137
    .line 138
    if-eq v3, v12, :cond_4

    .line 139
    .line 140
    const/16 v10, 0x1d

    .line 141
    .line 142
    if-eq v3, v10, :cond_3

    .line 143
    .line 144
    const/16 v10, 0x7d0

    .line 145
    .line 146
    if-eq v3, v10, :cond_2

    .line 147
    .line 148
    packed-switch v3, :pswitch_data_0

    .line 149
    .line 150
    .line 151
    packed-switch v3, :pswitch_data_1

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :pswitch_0
    const/16 v7, 0xb

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :pswitch_1
    const/16 v7, 0xa

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :pswitch_2
    const/16 v7, 0x9

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :pswitch_3
    const/16 v7, 0x8

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :pswitch_4
    const/4 v7, 0x7

    .line 168
    goto :goto_2

    .line 169
    :pswitch_5
    const/4 v7, 0x6

    .line 170
    goto :goto_2

    .line 171
    :pswitch_6
    const/4 v7, 0x5

    .line 172
    goto :goto_2

    .line 173
    :pswitch_7
    move v7, v9

    .line 174
    goto :goto_2

    .line 175
    :pswitch_8
    move v7, v5

    .line 176
    goto :goto_2

    .line 177
    :pswitch_9
    const/16 v7, 0x13

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :pswitch_a
    const/16 v7, 0x12

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :pswitch_b
    const/16 v7, 0x11

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :pswitch_c
    move v7, v11

    .line 187
    goto :goto_2

    .line 188
    :pswitch_d
    const/16 v7, 0x10

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :pswitch_e
    move v7, v8

    .line 192
    goto :goto_2

    .line 193
    :cond_2
    const/16 v7, 0x3e8

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_3
    const/16 v7, 0x18

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    move v7, v10

    .line 200
    goto :goto_2

    .line 201
    :cond_5
    const/16 v7, 0x15

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_6
    const/16 v7, 0x14

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_7
    const/16 v7, 0xe

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_8
    const/16 v7, 0xd

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_9
    const/16 v7, 0xc

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_a
    :goto_1
    move v7, v6

    .line 217
    :goto_2
    :pswitch_f
    invoke-static {p0}, Lxq2;->n(Landroid/media/MediaRoute2Info;)Ljava/lang/CharSequence;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    if-eqz v3, :cond_b

    .line 222
    .line 223
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    const-string v8, "status"

    .line 228
    .line 229
    invoke-virtual {v2, v8, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_b
    invoke-static {p0}, Lxq2;->i(Landroid/media/MediaRoute2Info;)Landroid/net/Uri;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    if-eqz v3, :cond_c

    .line 237
    .line 238
    const-string v8, "iconUri"

    .line 239
    .line 240
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v2, v8, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_c
    invoke-static {p0}, Ll3;->j(Landroid/media/MediaRoute2Info;)Landroid/os/Bundle;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    if-eqz v3, :cond_15

    .line 252
    .line 253
    const-string v8, "androidx.mediarouter.media.KEY_EXTRAS"

    .line 254
    .line 255
    invoke-virtual {v3, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_15

    .line 260
    .line 261
    const-string v9, "androidx.mediarouter.media.KEY_DEVICE_TYPE"

    .line 262
    .line 263
    invoke-virtual {v3, v9}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_15

    .line 268
    .line 269
    const-string v10, "androidx.mediarouter.media.KEY_CONTROL_FILTERS"

    .line 270
    .line 271
    invoke-virtual {v3, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    if-nez v11, :cond_d

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_d
    invoke-virtual {v3, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    if-nez v8, :cond_e

    .line 283
    .line 284
    invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_e
    new-instance v0, Landroid/os/Bundle;

    .line 289
    .line 290
    invoke-direct {v0, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 294
    .line 295
    .line 296
    :goto_3
    if-eqz v7, :cond_f

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_f
    invoke-virtual {v3, v9, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    :goto_4
    const-string v0, "deviceType"

    .line 304
    .line 305
    invoke-virtual {v2, v0, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 306
    .line 307
    .line 308
    const-string v0, "androidx.mediarouter.media.KEY_PLAYBACK_TYPE"

    .line 309
    .line 310
    invoke-virtual {v3, v0, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    const-string v4, "playbackType"

    .line 315
    .line 316
    invoke-virtual {v2, v4, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v0, :cond_10

    .line 324
    .line 325
    invoke-virtual {v1, v0}, Lss0;->n(Ljava/util/ArrayList;)V

    .line 326
    .line 327
    .line 328
    :cond_10
    invoke-static {p0}, Lto2;->k(Landroid/media/MediaRoute2Info;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    const-string v0, "android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE"

    .line 333
    .line 334
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_11

    .line 339
    .line 340
    const-string v0, "isDynamicGroupRoute"

    .line 341
    .line 342
    invoke-virtual {v2, v0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 343
    .line 344
    .line 345
    :cond_11
    const-string v0, "android.media.route.feature.REMOTE_GROUP_PLAYBACK"

    .line 346
    .line 347
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result p0

    .line 351
    if-eqz p0, :cond_14

    .line 352
    .line 353
    const-string p0, "androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS"

    .line 354
    .line 355
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    if-eqz p0, :cond_13

    .line 360
    .line 361
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_12

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_12
    invoke-virtual {v1, p0}, Lss0;->p(Ljava/util/ArrayList;)V

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_13
    :goto_5
    const-string p0, "MediaRouter2Utils"

    .line 373
    .line 374
    const-string v0, "Invalid feature of a group without members"

    .line 375
    .line 376
    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    :cond_14
    :goto_6
    invoke-virtual {v1}, Lss0;->r()Lsp2;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    return-object p0

    .line 384
    :cond_15
    :goto_7
    return-object v0

    .line 385
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    :pswitch_data_1
    .packed-switch 0x3e9
        :pswitch_8
        :pswitch_f
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static H(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, p1, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    return v1

    .line 15
    :cond_1
    return v0
.end method

.method public static final a(Landroid/content/Context;)Lso0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 10
    .line 11
    new-instance v1, Lso0;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 22
    .line 23
    invoke-static {v0}, Lcb1;->a(F)Lbb1;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    new-instance v2, Lua2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lua2;-><init>(F)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-direct {v1, p0, v0, v2}, Lso0;-><init>(FFLbb1;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method

.method public static final b(Ljava/lang/Object;Lif1;Lrg1;)V
    .locals 1

    .line 1
    invoke-virtual {p2, p0}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lj80;->a:Li80;

    .line 12
    .line 13
    if-ne v0, p0, :cond_1

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lwr0;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lwr0;-><init>(Lif1;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    check-cast v0, Lwr0;

    .line 24
    .line 25
    return-void
.end method

.method public static final c(Lwf1;Lrg1;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lrg1;->R:Lne0;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p1}, Lrg1;->H()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p2, Lj80;->a:Li80;

    .line 14
    .line 15
    if-ne v1, p2, :cond_1

    .line 16
    .line 17
    :cond_0
    new-instance v1, Ll62;

    .line 18
    .line 19
    invoke-direct {v1, v0, p0}, Ll62;-><init>(Lne0;Lwf1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    check-cast v1, Ll62;

    .line 26
    .line 27
    return-void
.end method

.method public static final d(JJ)Lwv3;
    .locals 8

    .line 1
    new-instance v0, Lwv3;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    shr-long v2, p0, v1

    .line 6
    .line 7
    long-to-int v2, v2

    .line 8
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const-wide v4, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v4

    .line 18
    long-to-int p0, p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-long v6, p2, v1

    .line 28
    .line 29
    long-to-int v1, v6

    .line 30
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-float/2addr v1, v2

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    and-long/2addr p2, v4

    .line 40
    long-to-int p2, p2

    .line 41
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    add-float/2addr p2, p0

    .line 46
    invoke-direct {v0, v3, p1, v1, p2}, Lwv3;-><init>(FFFF)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static final e(Ljx3;Lvb4;Landroidx/preference/Preference;Ljx3;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ljx3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    move p0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p0, v0

    .line 10
    :goto_0
    sput-boolean p0, Lbu;->f:Z

    .line 11
    .line 12
    const-string v2, "homemusic_check_update"

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-boolean v2, v2, Landroidx/preference/Preference;->K:Z

    .line 21
    .line 22
    if-ne v2, v1, :cond_1

    .line 23
    .line 24
    move v2, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v2, v0

    .line 27
    :goto_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    move v0, v1

    .line 32
    :cond_2
    invoke-virtual {p2, v0}, Landroidx/preference/Preference;->A(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p3, Ljx3;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    const p3, 0x7f130212

    .line 42
    .line 43
    .line 44
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p3, p0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const p0, 0x7f130211

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Lkc1;->s(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    :goto_2
    invoke-virtual {p2, p0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static final f(Lvb4;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public static g(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-lt p0, v0, :cond_2

    .line 3
    .line 4
    const/high16 v0, 0x40000000    # 2.0f

    .line 5
    .line 6
    if-gt p0, v0, :cond_2

    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne v0, p0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0x100

    .line 15
    .line 16
    if-gt p0, v0, :cond_0

    .line 17
    .line 18
    new-array p0, p0, [B

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/high16 v0, 0x10000

    .line 22
    .line 23
    if-gt p0, v0, :cond_1

    .line 24
    .line 25
    new-array p0, p0, [S

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    new-array p0, p0, [I

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    const-string v0, "must be power of 2 between 2^1 and 2^30: "

    .line 32
    .line 33
    invoke-static {p0, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static h(Ljava/lang/Class;)Lx65;
    .locals 4

    .line 1
    const-string v0, "Cannot create an instance of "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2

    .line 8
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v2, Lx65;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :catch_0
    move-exception v2

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception v2

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    invoke-static {v0, p0, v2}, Lnz2;->r(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :goto_1
    invoke-static {v0, p0, v2}, Lnz2;->r(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :catch_2
    move-exception v2

    .line 59
    invoke-static {v0, p0, v2}, Lnz2;->r(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public static final i(Lyn3;Ljava/lang/String;Lwd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lo54;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo54;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1, v0, p2}, Lyn3;->b(Ljava/lang/String;Lif1;Lwd0;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lxe0;->n:Lxe0;

    .line 13
    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final j(Ljava/io/DataInputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, -0x5411

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, 0x1

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string v0, "Unsupported version number: "

    .line 18
    .line 19
    invoke-static {p0, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lnz2;->f(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string p0, "Magic number doesn\'t match: "

    .line 28
    .line 29
    invoke-static {v0, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lnz2;->f(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final k(Ljava/io/DataInputStream;B)Ljava/io/Serializable;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readBoolean()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 v1, 0x2

    .line 18
    if-ne p1, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_2
    const/4 v1, 0x3

    .line 30
    if-ne p1, v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_3
    const/4 v1, 0x4

    .line 42
    if-ne p1, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_4
    const/4 v1, 0x5

    .line 54
    if-ne p1, v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_5
    const/4 v1, 0x6

    .line 66
    if-ne p1, v1, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_6
    const/4 v1, 0x7

    .line 78
    if-ne p1, v1, :cond_7

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_7
    const/16 v1, 0x8

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    if-ne p1, v1, :cond_9

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    new-array v0, p1, [Ljava/lang/Boolean;

    .line 95
    .line 96
    :goto_0
    if-ge v2, p1, :cond_8

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readBoolean()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    aput-object v1, v0, v2

    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_8
    return-object v0

    .line 112
    :cond_9
    const/16 v1, 0x9

    .line 113
    .line 114
    if-ne p1, v1, :cond_b

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    new-array v0, p1, [Ljava/lang/Byte;

    .line 121
    .line 122
    :goto_1
    if-ge v2, p1, :cond_a

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    aput-object v1, v0, v2

    .line 133
    .line 134
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_a
    return-object v0

    .line 138
    :cond_b
    const/16 v1, 0xa

    .line 139
    .line 140
    if-ne p1, v1, :cond_d

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    new-array v0, p1, [Ljava/lang/Integer;

    .line 147
    .line 148
    :goto_2
    if-ge v2, p1, :cond_c

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    aput-object v1, v0, v2

    .line 159
    .line 160
    add-int/lit8 v2, v2, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_c
    return-object v0

    .line 164
    :cond_d
    const/16 v1, 0xb

    .line 165
    .line 166
    if-ne p1, v1, :cond_f

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    new-array v0, p1, [Ljava/lang/Long;

    .line 173
    .line 174
    :goto_3
    if-ge v2, p1, :cond_e

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    aput-object v1, v0, v2

    .line 185
    .line 186
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_e
    return-object v0

    .line 190
    :cond_f
    const/16 v1, 0xc

    .line 191
    .line 192
    if-ne p1, v1, :cond_11

    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    new-array v0, p1, [Ljava/lang/Float;

    .line 199
    .line 200
    :goto_4
    if-ge v2, p1, :cond_10

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    aput-object v1, v0, v2

    .line 211
    .line 212
    add-int/lit8 v2, v2, 0x1

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_10
    return-object v0

    .line 216
    :cond_11
    const/16 v1, 0xd

    .line 217
    .line 218
    if-ne p1, v1, :cond_13

    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    new-array v0, p1, [Ljava/lang/Double;

    .line 225
    .line 226
    :goto_5
    if-ge v2, p1, :cond_12

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    aput-object v1, v0, v2

    .line 237
    .line 238
    add-int/lit8 v2, v2, 0x1

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_12
    return-object v0

    .line 242
    :cond_13
    const/16 v1, 0xe

    .line 243
    .line 244
    if-ne p1, v1, :cond_16

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    new-array v1, p1, [Ljava/lang/String;

    .line 251
    .line 252
    :goto_6
    if-ge v2, p1, :cond_15

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    const-string v4, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"

    .line 259
    .line 260
    invoke-static {v3, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_14

    .line 265
    .line 266
    move-object v3, v0

    .line 267
    :cond_14
    aput-object v3, v1, v2

    .line 268
    .line 269
    add-int/lit8 v2, v2, 0x1

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_15
    return-object v1

    .line 273
    :cond_16
    const-string p0, "Unsupported type "

    .line 274
    .line 275
    invoke-static {p1, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-object v0
.end method

.method public static l(Landroid/view/View;)Lhg3;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lr50;->d(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lhg3;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, v1, p0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static final m(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "BugReportUtil"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v3, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v3

    .line 19
    const-string v4, "We tried to get versionName but Android wouldn\'t let us."

    .line 20
    .line 21
    invoke-static {v0, v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    move-object v3, v2

    .line 25
    :goto_0
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const-string v3, "Unknown"

    .line 35
    .line 36
    :goto_1
    const-string v4, "\nApp version name   : "

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v4, v5, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 51
    .line 52
    .line 53
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    goto :goto_2

    .line 55
    :catch_1
    move-exception v1

    .line 56
    const-string v4, "We tried to get versionCode but Android wouldn\'t let us."

    .line 57
    .line 58
    invoke-static {v0, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    :goto_2
    if-eqz v2, :cond_2

    .line 62
    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v1, 0x1c

    .line 66
    .line 67
    if-lt v0, v1, :cond_1

    .line 68
    .line 69
    invoke-static {v2}, Lsr0;->e(Landroid/content/pm/PackageInfo;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    iget v0, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    const-string v0, "Unkown"

    .line 86
    .line 87
    :goto_3
    const-string v1, "\nApp version code   : "

    .line 88
    .line 89
    invoke-static {v3, v1, v0}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, "\nAndroid OS version : "

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v0, "\nAndroid SDK version: "

    .line 129
    .line 130
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, "\nDevice Brand       : "

    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v2, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v0, "\nDevice Manufacturer: "

    .line 179
    .line 180
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v2, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v0, "\nDevice Name        : "

    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v0, "\nDevice Model       : "

    .line 229
    .line 230
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    new-instance v2, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v0, "\n"

    .line 258
    .line 259
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0
.end method

.method public static n(Ljava/lang/Class;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lu43;->b:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    const-class v1, Ls43;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ls43;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ls43;->value()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v2

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-lez v3, :cond_1

    .line 35
    .line 36
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "No @Navigator.Name annotation found for "

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    return-object v1
.end method

.method public static final o(Le94;Lp94;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Le94;->n:Lw03;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static p(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Ll3;->g(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {v1}, Ll3;->p(Landroid/media/MediaRoute2Info;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-object v0
.end method

.method public static final q(Landroid/text/Spanned;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p0, v0, v1, p1}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eq p1, p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static r(Lne0;Lwf1;)Lry;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Leg0;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    sget-object v2, Lze0;->n:Lze0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v2, p1, v1}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lvr1;->v(Lpy;)Lry;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static s(III)I
    .locals 1

    .line 1
    not-int v0, p2

    .line 2
    and-int/2addr p0, v0

    .line 3
    and-int/2addr p1, p2

    .line 4
    or-int/2addr p0, p1

    .line 5
    return p0
.end method

.method public static t(I)I
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    :goto_0
    add-int/lit8 p0, p0, 0x1

    .line 9
    .line 10
    mul-int/2addr p0, v0

    .line 11
    return p0
.end method

.method public static w(Ldx2;Lhd3;Lhs;Li80;FLdt;)Ldx2;
    .locals 6

    .line 1
    new-instance v0, Lid3;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lid3;-><init>(Lhd3;Lhs;Li80;FLdt;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ldx2;->c(Ldx2;)Ldx2;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final x(ILrg1;)Lhd3;
    .locals 70

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lhb;->b:Lwl4;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Landroid/content/Context;

    .line 12
    .line 13
    sget-object v3, Lhb;->c:Ll90;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroid/content/res/Resources;

    .line 20
    .line 21
    sget-object v4, Lhb;->e:Lwl4;

    .line 22
    .line 23
    invoke-virtual {v1, v4}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lz04;

    .line 28
    .line 29
    monitor-enter v4

    .line 30
    :try_start_0
    iget-object v5, v4, Lz04;->a:Li03;

    .line 31
    .line 32
    invoke-virtual {v5, v0}, Le02;->b(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Landroid/util/TypedValue;

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    new-instance v5, Landroid/util/TypedValue;

    .line 42
    .line 43
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v0, v5, v6}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 47
    .line 48
    .line 49
    iget-object v7, v4, Lz04;->a:Li03;

    .line 50
    .line 51
    invoke-virtual {v7, v0}, Li03;->d(I)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    iget-object v9, v7, Le02;->c:[Ljava/lang/Object;

    .line 56
    .line 57
    aget-object v10, v9, v8

    .line 58
    .line 59
    iget-object v7, v7, Le02;->b:[I

    .line 60
    .line 61
    aput v0, v7, v8

    .line 62
    .line 63
    aput-object v5, v9, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto/16 :goto_2a

    .line 68
    .line 69
    :cond_0
    :goto_0
    monitor-exit v4

    .line 70
    iget-object v4, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    if-eqz v4, :cond_3c

    .line 74
    .line 75
    const-string v12, ".xml"

    .line 76
    .line 77
    invoke-static {v4, v12}, Lqm4;->p0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-ne v12, v6, :cond_3c

    .line 82
    .line 83
    const v4, -0x699b7fa2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v4}, Lrg1;->R(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget v4, v5, Landroid/util/TypedValue;->changingConfigurations:I

    .line 94
    .line 95
    sget-object v5, Lhb;->d:Lwl4;

    .line 96
    .line 97
    invoke-virtual {v1, v5}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Liw1;

    .line 102
    .line 103
    new-instance v12, Lhw1;

    .line 104
    .line 105
    invoke-direct {v12, v2, v0}, Lhw1;-><init>(Landroid/content/res/Resources$Theme;I)V

    .line 106
    .line 107
    .line 108
    iget-object v13, v5, Liw1;->a:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    check-cast v13, Ljava/lang/ref/WeakReference;

    .line 115
    .line 116
    if-eqz v13, :cond_1

    .line 117
    .line 118
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    check-cast v13, Lgw1;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    const/4 v13, 0x0

    .line 126
    :goto_1
    if-nez v13, :cond_35

    .line 127
    .line 128
    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    :goto_2
    const/4 v14, 0x2

    .line 137
    if-eq v13, v14, :cond_2

    .line 138
    .line 139
    if-eq v13, v6, :cond_2

    .line 140
    .line 141
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    goto :goto_2

    .line 146
    :cond_2
    if-ne v13, v14, :cond_34

    .line 147
    .line 148
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    const-string v15, "vector"

    .line 153
    .line 154
    invoke-static {v13, v15}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_33

    .line 159
    .line 160
    invoke-static {v0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    new-instance v15, Lfd;

    .line 165
    .line 166
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v0, v15, Lfd;->c:Ljava/lang/Object;

    .line 170
    .line 171
    iput v11, v15, Lfd;->a:I

    .line 172
    .line 173
    const-wide v16, 0xffffffffL

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    new-instance v7, Lpz1;

    .line 179
    .line 180
    const/16 v8, 0xa

    .line 181
    .line 182
    invoke-direct {v7, v8, v11}, Lpz1;-><init>(IZ)V

    .line 183
    .line 184
    .line 185
    const/16 v18, 0x20

    .line 186
    .line 187
    const/16 v9, 0x40

    .line 188
    .line 189
    new-array v9, v9, [F

    .line 190
    .line 191
    iput-object v9, v7, Lpz1;->o:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v7, v15, Lfd;->e:Ljava/lang/Object;

    .line 194
    .line 195
    sget-object v7, Lgh0;->a:[I

    .line 196
    .line 197
    invoke-static {v3, v2, v13, v7}, Lgi1;->O(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    invoke-virtual {v15, v9}, Lfd;->e(I)V

    .line 206
    .line 207
    .line 208
    const-string v9, "autoMirrored"

    .line 209
    .line 210
    invoke-static {v0, v9}, Lgi1;->u(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    const/16 v19, 0x0

    .line 215
    .line 216
    const/4 v10, 0x5

    .line 217
    if-nez v9, :cond_3

    .line 218
    .line 219
    move/from16 v30, v11

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_3
    invoke-virtual {v7, v10, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    move/from16 v30, v9

    .line 227
    .line 228
    :goto_3
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    invoke-virtual {v15, v9}, Lfd;->e(I)V

    .line 233
    .line 234
    .line 235
    const-string v9, "viewportWidth"

    .line 236
    .line 237
    const/4 v8, 0x7

    .line 238
    const/4 v11, 0x0

    .line 239
    invoke-virtual {v15, v7, v9, v8, v11}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 240
    .line 241
    .line 242
    move-result v24

    .line 243
    const-string v9, "viewportHeight"

    .line 244
    .line 245
    const/16 v8, 0x8

    .line 246
    .line 247
    invoke-virtual {v15, v7, v9, v8, v11}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 248
    .line 249
    .line 250
    move-result v25

    .line 251
    cmpg-float v9, v24, v11

    .line 252
    .line 253
    if-lez v9, :cond_32

    .line 254
    .line 255
    cmpg-float v9, v25, v11

    .line 256
    .line 257
    if-lez v9, :cond_31

    .line 258
    .line 259
    const/4 v9, 0x3

    .line 260
    invoke-virtual {v7, v9, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 261
    .line 262
    .line 263
    move-result v21

    .line 264
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    invoke-virtual {v15, v8}, Lfd;->e(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v14, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    invoke-virtual {v15, v11}, Lfd;->e(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-eqz v11, :cond_6

    .line 287
    .line 288
    new-instance v11, Landroid/util/TypedValue;

    .line 289
    .line 290
    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v6, v11}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 294
    .line 295
    .line 296
    iget v11, v11, Landroid/util/TypedValue;->type:I

    .line 297
    .line 298
    if-ne v11, v14, :cond_4

    .line 299
    .line 300
    sget-wide v26, Lx40;->g:J

    .line 301
    .line 302
    move-wide/from16 v27, v26

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_4
    invoke-static {v7, v0, v2}, Lgi1;->r(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    invoke-virtual {v15, v14}, Lfd;->e(I)V

    .line 314
    .line 315
    .line 316
    if-eqz v11, :cond_5

    .line 317
    .line 318
    invoke-virtual {v11}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    invoke-static {v11}, Le35;->b(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v27

    .line 326
    goto :goto_4

    .line 327
    :cond_5
    sget-wide v27, Lx40;->g:J

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_6
    sget-wide v27, Lx40;->g:J

    .line 331
    .line 332
    :goto_4
    const/4 v11, 0x6

    .line 333
    const/4 v14, -0x1

    .line 334
    invoke-virtual {v7, v11, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    invoke-virtual {v15, v11}, Lfd;->e(I)V

    .line 343
    .line 344
    .line 345
    const/16 v11, 0x9

    .line 346
    .line 347
    if-eq v6, v14, :cond_7

    .line 348
    .line 349
    if-eq v6, v9, :cond_9

    .line 350
    .line 351
    if-eq v6, v10, :cond_7

    .line 352
    .line 353
    if-eq v6, v11, :cond_8

    .line 354
    .line 355
    packed-switch v6, :pswitch_data_0

    .line 356
    .line 357
    .line 358
    :cond_7
    move v6, v10

    .line 359
    goto :goto_5

    .line 360
    :pswitch_0
    const/16 v6, 0xc

    .line 361
    .line 362
    goto :goto_5

    .line 363
    :pswitch_1
    const/16 v6, 0xe

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :pswitch_2
    const/16 v6, 0xd

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_8
    move v6, v11

    .line 370
    goto :goto_5

    .line 371
    :cond_9
    move v6, v9

    .line 372
    :goto_5
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 377
    .line 378
    div-float v21, v21, v11

    .line 379
    .line 380
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 385
    .line 386
    div-float/2addr v8, v11

    .line 387
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 388
    .line 389
    .line 390
    move/from16 v22, v21

    .line 391
    .line 392
    const/16 v7, 0x8

    .line 393
    .line 394
    const-string v21, ""

    .line 395
    .line 396
    new-instance v11, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 399
    .line 400
    .line 401
    new-instance v35, Lew1;

    .line 402
    .line 403
    const/16 v44, 0x0

    .line 404
    .line 405
    const/16 v45, 0x3ff

    .line 406
    .line 407
    const/16 v36, 0x0

    .line 408
    .line 409
    const/16 v37, 0x0

    .line 410
    .line 411
    const/16 v38, 0x0

    .line 412
    .line 413
    const/16 v39, 0x0

    .line 414
    .line 415
    const/16 v40, 0x0

    .line 416
    .line 417
    const/16 v41, 0x0

    .line 418
    .line 419
    const/16 v42, 0x0

    .line 420
    .line 421
    const/16 v43, 0x0

    .line 422
    .line 423
    invoke-direct/range {v35 .. v45}, Lew1;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v7, v35

    .line 427
    .line 428
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    const/16 v35, 0x0

    .line 432
    .line 433
    :goto_6
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 434
    .line 435
    .line 436
    move-result v14

    .line 437
    const/4 v10, 0x1

    .line 438
    if-eq v14, v10, :cond_a

    .line 439
    .line 440
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 441
    .line 442
    .line 443
    move-result v14

    .line 444
    if-ge v14, v10, :cond_b

    .line 445
    .line 446
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 447
    .line 448
    .line 449
    move-result v10

    .line 450
    if-ne v10, v9, :cond_b

    .line 451
    .line 452
    :cond_a
    move/from16 v51, v4

    .line 453
    .line 454
    move/from16 v52, v6

    .line 455
    .line 456
    move/from16 v53, v8

    .line 457
    .line 458
    goto/16 :goto_25

    .line 459
    .line 460
    :cond_b
    const-string v10, "group"

    .line 461
    .line 462
    sget-object v48, Lu01;->n:Lu01;

    .line 463
    .line 464
    const-string v14, ""

    .line 465
    .line 466
    iget-object v9, v15, Lfd;->c:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v9, Lorg/xmlpull/v1/XmlPullParser;

    .line 469
    .line 470
    move-object/from16 v50, v0

    .line 471
    .line 472
    iget-object v0, v15, Lfd;->e:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Lpz1;

    .line 475
    .line 476
    move/from16 v51, v4

    .line 477
    .line 478
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    move/from16 v52, v6

    .line 483
    .line 484
    const/4 v6, 0x2

    .line 485
    if-eq v4, v6, :cond_11

    .line 486
    .line 487
    const/4 v6, 0x3

    .line 488
    if-eq v4, v6, :cond_c

    .line 489
    .line 490
    goto/16 :goto_8

    .line 491
    .line 492
    :cond_c
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_f

    .line 501
    .line 502
    add-int/lit8 v0, v35, 0x1

    .line 503
    .line 504
    const/4 v4, 0x0

    .line 505
    :goto_7
    if-ge v4, v0, :cond_d

    .line 506
    .line 507
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    const/16 v31, 0x1

    .line 512
    .line 513
    add-int/lit8 v6, v6, -0x1

    .line 514
    .line 515
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    check-cast v6, Lew1;

    .line 520
    .line 521
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    add-int/lit8 v9, v9, -0x1

    .line 526
    .line 527
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v9

    .line 531
    check-cast v9, Lew1;

    .line 532
    .line 533
    iget-object v9, v9, Lew1;->j:Ljava/util/ArrayList;

    .line 534
    .line 535
    new-instance v39, Lb45;

    .line 536
    .line 537
    iget-object v10, v6, Lew1;->a:Ljava/lang/String;

    .line 538
    .line 539
    iget v14, v6, Lew1;->b:F

    .line 540
    .line 541
    move/from16 v35, v0

    .line 542
    .line 543
    iget v0, v6, Lew1;->c:F

    .line 544
    .line 545
    move/from16 v42, v0

    .line 546
    .line 547
    iget v0, v6, Lew1;->d:F

    .line 548
    .line 549
    move/from16 v43, v0

    .line 550
    .line 551
    iget v0, v6, Lew1;->e:F

    .line 552
    .line 553
    move/from16 v44, v0

    .line 554
    .line 555
    iget v0, v6, Lew1;->f:F

    .line 556
    .line 557
    move/from16 v45, v0

    .line 558
    .line 559
    iget v0, v6, Lew1;->g:F

    .line 560
    .line 561
    move/from16 v46, v0

    .line 562
    .line 563
    iget v0, v6, Lew1;->h:F

    .line 564
    .line 565
    move/from16 v47, v0

    .line 566
    .line 567
    iget-object v0, v6, Lew1;->i:Ljava/util/List;

    .line 568
    .line 569
    iget-object v6, v6, Lew1;->j:Ljava/util/ArrayList;

    .line 570
    .line 571
    move-object/from16 v48, v0

    .line 572
    .line 573
    move-object/from16 v49, v6

    .line 574
    .line 575
    move-object/from16 v40, v10

    .line 576
    .line 577
    move/from16 v41, v14

    .line 578
    .line 579
    invoke-direct/range {v39 .. v49}, Lb45;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/ArrayList;)V

    .line 580
    .line 581
    .line 582
    move-object/from16 v0, v39

    .line 583
    .line 584
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    add-int/lit8 v4, v4, 0x1

    .line 588
    .line 589
    move/from16 v0, v35

    .line 590
    .line 591
    goto :goto_7

    .line 592
    :cond_d
    iget-object v0, v15, Lfd;->d:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v0, [I

    .line 595
    .line 596
    if-eqz v0, :cond_10

    .line 597
    .line 598
    iget v4, v15, Lfd;->b:I

    .line 599
    .line 600
    if-nez v4, :cond_e

    .line 601
    .line 602
    goto :goto_a

    .line 603
    :cond_e
    add-int/lit8 v4, v4, -0x1

    .line 604
    .line 605
    iput v4, v15, Lfd;->b:I

    .line 606
    .line 607
    aget v0, v0, v4

    .line 608
    .line 609
    move/from16 v35, v0

    .line 610
    .line 611
    :cond_f
    :goto_8
    move/from16 v53, v8

    .line 612
    .line 613
    :goto_9
    const/4 v14, 0x7

    .line 614
    goto/16 :goto_24

    .line 615
    .line 616
    :cond_10
    :goto_a
    move/from16 v53, v8

    .line 617
    .line 618
    :goto_b
    const/4 v14, 0x7

    .line 619
    const/16 v35, 0x0

    .line 620
    .line 621
    goto/16 :goto_24

    .line 622
    .line 623
    :cond_11
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    if-eqz v4, :cond_f

    .line 628
    .line 629
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 630
    .line 631
    .line 632
    move-result v6

    .line 633
    move/from16 v53, v8

    .line 634
    .line 635
    const v8, -0x624e8b7e

    .line 636
    .line 637
    .line 638
    if-eq v6, v8, :cond_2c

    .line 639
    .line 640
    const v8, 0x346425

    .line 641
    .line 642
    .line 643
    move-object/from16 v39, v14

    .line 644
    .line 645
    const/high16 v14, 0x3f800000    # 1.0f

    .line 646
    .line 647
    if-eq v6, v8, :cond_17

    .line 648
    .line 649
    const v0, 0x5e0f67f

    .line 650
    .line 651
    .line 652
    if-eq v6, v0, :cond_12

    .line 653
    .line 654
    :goto_c
    goto :goto_9

    .line 655
    :cond_12
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-nez v0, :cond_13

    .line 660
    .line 661
    :goto_d
    goto :goto_c

    .line 662
    :cond_13
    sget-object v0, Lgh0;->b:[I

    .line 663
    .line 664
    invoke-static {v3, v2, v13, v0}, Lgi1;->O(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    invoke-virtual {v15, v4}, Lfd;->e(I)V

    .line 673
    .line 674
    .line 675
    const-string v4, "rotation"

    .line 676
    .line 677
    const/4 v6, 0x5

    .line 678
    const/4 v8, 0x0

    .line 679
    invoke-virtual {v15, v0, v4, v6, v8}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 680
    .line 681
    .line 682
    move-result v41

    .line 683
    const/4 v10, 0x1

    .line 684
    invoke-virtual {v0, v10, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 685
    .line 686
    .line 687
    move-result v42

    .line 688
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    invoke-virtual {v15, v4}, Lfd;->e(I)V

    .line 693
    .line 694
    .line 695
    const/4 v6, 0x2

    .line 696
    invoke-virtual {v0, v6, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 697
    .line 698
    .line 699
    move-result v43

    .line 700
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    invoke-virtual {v15, v4}, Lfd;->e(I)V

    .line 705
    .line 706
    .line 707
    const-string v4, "scaleX"

    .line 708
    .line 709
    const/4 v6, 0x3

    .line 710
    invoke-virtual {v15, v0, v4, v6, v14}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 711
    .line 712
    .line 713
    move-result v44

    .line 714
    const-string v4, "scaleY"

    .line 715
    .line 716
    const/4 v6, 0x4

    .line 717
    invoke-virtual {v15, v0, v4, v6, v14}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 718
    .line 719
    .line 720
    move-result v45

    .line 721
    const-string v4, "translateX"

    .line 722
    .line 723
    const/4 v6, 0x6

    .line 724
    invoke-virtual {v15, v0, v4, v6, v8}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 725
    .line 726
    .line 727
    move-result v46

    .line 728
    const-string v4, "translateY"

    .line 729
    .line 730
    const/4 v6, 0x7

    .line 731
    invoke-virtual {v15, v0, v4, v6, v8}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 732
    .line 733
    .line 734
    move-result v47

    .line 735
    const/4 v4, 0x0

    .line 736
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 741
    .line 742
    .line 743
    move-result v4

    .line 744
    invoke-virtual {v15, v4}, Lfd;->e(I)V

    .line 745
    .line 746
    .line 747
    if-nez v6, :cond_14

    .line 748
    .line 749
    move-object/from16 v40, v39

    .line 750
    .line 751
    goto :goto_e

    .line 752
    :cond_14
    move-object/from16 v40, v6

    .line 753
    .line 754
    :goto_e
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 755
    .line 756
    .line 757
    sget v0, Lc45;->a:I

    .line 758
    .line 759
    new-instance v39, Lew1;

    .line 760
    .line 761
    const/16 v49, 0x200

    .line 762
    .line 763
    invoke-direct/range {v39 .. v49}, Lew1;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 764
    .line 765
    .line 766
    move-object/from16 v0, v39

    .line 767
    .line 768
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    iget-object v0, v15, Lfd;->d:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v0, [I

    .line 774
    .line 775
    if-nez v0, :cond_15

    .line 776
    .line 777
    const/4 v6, 0x4

    .line 778
    new-array v0, v6, [I

    .line 779
    .line 780
    iput-object v0, v15, Lfd;->d:Ljava/lang/Object;

    .line 781
    .line 782
    goto :goto_f

    .line 783
    :cond_15
    iget v4, v15, Lfd;->b:I

    .line 784
    .line 785
    array-length v6, v0

    .line 786
    if-lt v4, v6, :cond_16

    .line 787
    .line 788
    array-length v4, v0

    .line 789
    const/16 v26, 0x2

    .line 790
    .line 791
    mul-int/lit8 v4, v4, 0x2

    .line 792
    .line 793
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    iput-object v0, v15, Lfd;->d:Ljava/lang/Object;

    .line 798
    .line 799
    :cond_16
    :goto_f
    iget v4, v15, Lfd;->b:I

    .line 800
    .line 801
    add-int/lit8 v6, v4, 0x1

    .line 802
    .line 803
    iput v6, v15, Lfd;->b:I

    .line 804
    .line 805
    aput v35, v0, v4

    .line 806
    .line 807
    goto/16 :goto_b

    .line 808
    .line 809
    :cond_17
    const-string v6, "path"

    .line 810
    .line 811
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v4

    .line 815
    if-nez v4, :cond_18

    .line 816
    .line 817
    goto/16 :goto_d

    .line 818
    .line 819
    :cond_18
    sget-object v4, Lgh0;->c:[I

    .line 820
    .line 821
    invoke-static {v3, v2, v13, v4}, Lgi1;->O(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 826
    .line 827
    .line 828
    move-result v6

    .line 829
    invoke-virtual {v15, v6}, Lfd;->e(I)V

    .line 830
    .line 831
    .line 832
    const-string v6, "pathData"

    .line 833
    .line 834
    const-string v8, "http://schemas.android.com/apk/res/android"

    .line 835
    .line 836
    invoke-interface {v9, v8, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v6

    .line 840
    if-eqz v6, :cond_2b

    .line 841
    .line 842
    const/4 v6, 0x0

    .line 843
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v8

    .line 847
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 848
    .line 849
    .line 850
    move-result v6

    .line 851
    invoke-virtual {v15, v6}, Lfd;->e(I)V

    .line 852
    .line 853
    .line 854
    if-nez v8, :cond_19

    .line 855
    .line 856
    move-object/from16 v56, v39

    .line 857
    .line 858
    :goto_10
    const/4 v6, 0x2

    .line 859
    goto :goto_11

    .line 860
    :cond_19
    move-object/from16 v56, v8

    .line 861
    .line 862
    goto :goto_10

    .line 863
    :goto_11
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v8

    .line 867
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 868
    .line 869
    .line 870
    move-result v6

    .line 871
    invoke-virtual {v15, v6}, Lfd;->e(I)V

    .line 872
    .line 873
    .line 874
    if-nez v8, :cond_1a

    .line 875
    .line 876
    sget v0, Lc45;->a:I

    .line 877
    .line 878
    :goto_12
    move-object/from16 v57, v48

    .line 879
    .line 880
    goto :goto_13

    .line 881
    :cond_1a
    invoke-static {v0, v8}, Lpz1;->A(Lpz1;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 882
    .line 883
    .line 884
    move-result-object v48

    .line 885
    goto :goto_12

    .line 886
    :goto_13
    const-string v0, "fillColor"

    .line 887
    .line 888
    iget-object v6, v15, Lfd;->c:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v6, Lorg/xmlpull/v1/XmlPullParser;

    .line 891
    .line 892
    const/4 v10, 0x1

    .line 893
    invoke-static {v4, v6, v2, v0, v10}, Lgi1;->s(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lue1;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 898
    .line 899
    .line 900
    move-result v6

    .line 901
    invoke-virtual {v15, v6}, Lfd;->e(I)V

    .line 902
    .line 903
    .line 904
    const-string v6, "fillAlpha"

    .line 905
    .line 906
    const/16 v8, 0xc

    .line 907
    .line 908
    invoke-virtual {v15, v4, v6, v8, v14}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 909
    .line 910
    .line 911
    move-result v60

    .line 912
    const-string v6, "strokeLineCap"

    .line 913
    .line 914
    iget-object v9, v15, Lfd;->c:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v9, Lorg/xmlpull/v1/XmlPullParser;

    .line 917
    .line 918
    invoke-static {v9, v6}, Lgi1;->u(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 919
    .line 920
    .line 921
    move-result v6

    .line 922
    if-nez v6, :cond_1b

    .line 923
    .line 924
    const/4 v6, -0x1

    .line 925
    const/16 v9, 0x8

    .line 926
    .line 927
    goto :goto_14

    .line 928
    :cond_1b
    const/4 v6, -0x1

    .line 929
    const/16 v9, 0x8

    .line 930
    .line 931
    invoke-virtual {v4, v9, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 932
    .line 933
    .line 934
    move-result v10

    .line 935
    move v6, v10

    .line 936
    :goto_14
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 937
    .line 938
    .line 939
    move-result v10

    .line 940
    invoke-virtual {v15, v10}, Lfd;->e(I)V

    .line 941
    .line 942
    .line 943
    if-eqz v6, :cond_1c

    .line 944
    .line 945
    const/4 v10, 0x1

    .line 946
    if-eq v6, v10, :cond_1e

    .line 947
    .line 948
    const/4 v10, 0x2

    .line 949
    if-eq v6, v10, :cond_1d

    .line 950
    .line 951
    :cond_1c
    const/16 v64, 0x0

    .line 952
    .line 953
    goto :goto_15

    .line 954
    :cond_1d
    const/16 v64, 0x2

    .line 955
    .line 956
    goto :goto_15

    .line 957
    :cond_1e
    const/16 v64, 0x1

    .line 958
    .line 959
    :goto_15
    const-string v6, "strokeLineJoin"

    .line 960
    .line 961
    iget-object v10, v15, Lfd;->c:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v10, Lorg/xmlpull/v1/XmlPullParser;

    .line 964
    .line 965
    invoke-static {v10, v6}, Lgi1;->u(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 966
    .line 967
    .line 968
    move-result v6

    .line 969
    if-nez v6, :cond_1f

    .line 970
    .line 971
    const/4 v6, -0x1

    .line 972
    const/4 v10, -0x1

    .line 973
    goto :goto_16

    .line 974
    :cond_1f
    const/16 v6, 0x9

    .line 975
    .line 976
    const/4 v10, -0x1

    .line 977
    invoke-virtual {v4, v6, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 978
    .line 979
    .line 980
    move-result v33

    .line 981
    move/from16 v6, v33

    .line 982
    .line 983
    :goto_16
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 984
    .line 985
    .line 986
    move-result v8

    .line 987
    invoke-virtual {v15, v8}, Lfd;->e(I)V

    .line 988
    .line 989
    .line 990
    if-eqz v6, :cond_22

    .line 991
    .line 992
    const/4 v8, 0x1

    .line 993
    if-eq v6, v8, :cond_21

    .line 994
    .line 995
    const/4 v8, 0x2

    .line 996
    if-eq v6, v8, :cond_20

    .line 997
    .line 998
    :goto_17
    const/16 v65, 0x0

    .line 999
    .line 1000
    goto :goto_18

    .line 1001
    :cond_20
    move/from16 v65, v8

    .line 1002
    .line 1003
    goto :goto_18

    .line 1004
    :cond_21
    const/4 v8, 0x2

    .line 1005
    const/16 v65, 0x1

    .line 1006
    .line 1007
    goto :goto_18

    .line 1008
    :cond_22
    const/4 v8, 0x2

    .line 1009
    goto :goto_17

    .line 1010
    :goto_18
    const-string v6, "strokeMiterLimit"

    .line 1011
    .line 1012
    const/high16 v8, 0x40800000    # 4.0f

    .line 1013
    .line 1014
    const/16 v9, 0xa

    .line 1015
    .line 1016
    invoke-virtual {v15, v4, v6, v9, v8}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1017
    .line 1018
    .line 1019
    move-result v66

    .line 1020
    const-string v6, "strokeColor"

    .line 1021
    .line 1022
    iget-object v8, v15, Lfd;->c:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v8, Lorg/xmlpull/v1/XmlPullParser;

    .line 1025
    .line 1026
    const/4 v9, 0x3

    .line 1027
    invoke-static {v4, v8, v2, v6, v9}, Lgi1;->s(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lue1;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v6

    .line 1031
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1032
    .line 1033
    .line 1034
    move-result v8

    .line 1035
    invoke-virtual {v15, v8}, Lfd;->e(I)V

    .line 1036
    .line 1037
    .line 1038
    const-string v8, "strokeAlpha"

    .line 1039
    .line 1040
    const/16 v9, 0xb

    .line 1041
    .line 1042
    invoke-virtual {v15, v4, v8, v9, v14}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1043
    .line 1044
    .line 1045
    move-result v62

    .line 1046
    const-string v8, "strokeWidth"

    .line 1047
    .line 1048
    const/4 v9, 0x4

    .line 1049
    invoke-virtual {v15, v4, v8, v9, v14}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1050
    .line 1051
    .line 1052
    move-result v63

    .line 1053
    const-string v8, "trimPathEnd"

    .line 1054
    .line 1055
    const/4 v9, 0x6

    .line 1056
    invoke-virtual {v15, v4, v8, v9, v14}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1057
    .line 1058
    .line 1059
    move-result v68

    .line 1060
    const-string v8, "trimPathOffset"

    .line 1061
    .line 1062
    const/4 v9, 0x0

    .line 1063
    const/4 v14, 0x7

    .line 1064
    invoke-virtual {v15, v4, v8, v14, v9}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1065
    .line 1066
    .line 1067
    move-result v69

    .line 1068
    const-string v8, "trimPathStart"

    .line 1069
    .line 1070
    const/4 v10, 0x5

    .line 1071
    invoke-virtual {v15, v4, v8, v10, v9}, Lfd;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1072
    .line 1073
    .line 1074
    move-result v67

    .line 1075
    const-string v8, "fillType"

    .line 1076
    .line 1077
    iget-object v9, v15, Lfd;->c:Ljava/lang/Object;

    .line 1078
    .line 1079
    check-cast v9, Lorg/xmlpull/v1/XmlPullParser;

    .line 1080
    .line 1081
    invoke-static {v9, v8}, Lgi1;->u(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v8

    .line 1085
    if-nez v8, :cond_23

    .line 1086
    .line 1087
    const/16 v9, 0xd

    .line 1088
    .line 1089
    const/16 v20, 0x0

    .line 1090
    .line 1091
    goto :goto_19

    .line 1092
    :cond_23
    const/4 v8, 0x0

    .line 1093
    const/16 v9, 0xd

    .line 1094
    .line 1095
    invoke-virtual {v4, v9, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1096
    .line 1097
    .line 1098
    move-result v20

    .line 1099
    :goto_19
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1100
    .line 1101
    .line 1102
    move-result v8

    .line 1103
    invoke-virtual {v15, v8}, Lfd;->e(I)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 1107
    .line 1108
    .line 1109
    iget-object v4, v0, Lue1;->p:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v4, Landroid/graphics/Shader;

    .line 1112
    .line 1113
    if-eqz v4, :cond_24

    .line 1114
    .line 1115
    goto :goto_1a

    .line 1116
    :cond_24
    iget v8, v0, Lue1;->o:I

    .line 1117
    .line 1118
    if-eqz v8, :cond_26

    .line 1119
    .line 1120
    :goto_1a
    if-eqz v4, :cond_25

    .line 1121
    .line 1122
    new-instance v0, Lpv;

    .line 1123
    .line 1124
    invoke-direct {v0, v4}, Lpv;-><init>(Landroid/graphics/Shader;)V

    .line 1125
    .line 1126
    .line 1127
    move-object/from16 v59, v0

    .line 1128
    .line 1129
    goto :goto_1b

    .line 1130
    :cond_25
    new-instance v4, Lzh4;

    .line 1131
    .line 1132
    iget v0, v0, Lue1;->o:I

    .line 1133
    .line 1134
    invoke-static {v0}, Le35;->b(I)J

    .line 1135
    .line 1136
    .line 1137
    move-result-wide v9

    .line 1138
    invoke-direct {v4, v9, v10}, Lzh4;-><init>(J)V

    .line 1139
    .line 1140
    .line 1141
    move-object/from16 v59, v4

    .line 1142
    .line 1143
    goto :goto_1b

    .line 1144
    :cond_26
    move-object/from16 v59, v19

    .line 1145
    .line 1146
    :goto_1b
    iget-object v0, v6, Lue1;->p:Ljava/lang/Object;

    .line 1147
    .line 1148
    check-cast v0, Landroid/graphics/Shader;

    .line 1149
    .line 1150
    if-eqz v0, :cond_27

    .line 1151
    .line 1152
    goto :goto_1c

    .line 1153
    :cond_27
    iget v4, v6, Lue1;->o:I

    .line 1154
    .line 1155
    if-eqz v4, :cond_29

    .line 1156
    .line 1157
    :goto_1c
    if-eqz v0, :cond_28

    .line 1158
    .line 1159
    new-instance v4, Lpv;

    .line 1160
    .line 1161
    invoke-direct {v4, v0}, Lpv;-><init>(Landroid/graphics/Shader;)V

    .line 1162
    .line 1163
    .line 1164
    :goto_1d
    move-object/from16 v61, v4

    .line 1165
    .line 1166
    goto :goto_1e

    .line 1167
    :cond_28
    new-instance v4, Lzh4;

    .line 1168
    .line 1169
    iget v0, v6, Lue1;->o:I

    .line 1170
    .line 1171
    invoke-static {v0}, Le35;->b(I)J

    .line 1172
    .line 1173
    .line 1174
    move-result-wide v8

    .line 1175
    invoke-direct {v4, v8, v9}, Lzh4;-><init>(J)V

    .line 1176
    .line 1177
    .line 1178
    goto :goto_1d

    .line 1179
    :cond_29
    move-object/from16 v61, v19

    .line 1180
    .line 1181
    :goto_1e
    if-nez v20, :cond_2a

    .line 1182
    .line 1183
    const/16 v58, 0x0

    .line 1184
    .line 1185
    goto :goto_1f

    .line 1186
    :cond_2a
    const/16 v58, 0x1

    .line 1187
    .line 1188
    :goto_1f
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1189
    .line 1190
    .line 1191
    move-result v0

    .line 1192
    const/16 v31, 0x1

    .line 1193
    .line 1194
    add-int/lit8 v0, v0, -0x1

    .line 1195
    .line 1196
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    check-cast v0, Lew1;

    .line 1201
    .line 1202
    iget-object v0, v0, Lew1;->j:Ljava/util/ArrayList;

    .line 1203
    .line 1204
    new-instance v55, Lf45;

    .line 1205
    .line 1206
    invoke-direct/range {v55 .. v69}, Lf45;-><init>(Ljava/lang/String;Ljava/util/List;ILuo;FLuo;FFIIFFFF)V

    .line 1207
    .line 1208
    .line 1209
    move-object/from16 v4, v55

    .line 1210
    .line 1211
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    goto :goto_24

    .line 1215
    :cond_2b
    const-string v0, "No path data available"

    .line 1216
    .line 1217
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    return-object v19

    .line 1221
    :cond_2c
    move-object/from16 v39, v14

    .line 1222
    .line 1223
    const/4 v14, 0x7

    .line 1224
    const-string v6, "clip-path"

    .line 1225
    .line 1226
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v4

    .line 1230
    if-nez v4, :cond_2d

    .line 1231
    .line 1232
    goto :goto_24

    .line 1233
    :cond_2d
    sget-object v4, Lgh0;->d:[I

    .line 1234
    .line 1235
    invoke-static {v3, v2, v13, v4}, Lgi1;->O(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v4

    .line 1239
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1240
    .line 1241
    .line 1242
    move-result v6

    .line 1243
    invoke-virtual {v15, v6}, Lfd;->e(I)V

    .line 1244
    .line 1245
    .line 1246
    const/4 v6, 0x0

    .line 1247
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v8

    .line 1251
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1252
    .line 1253
    .line 1254
    move-result v6

    .line 1255
    invoke-virtual {v15, v6}, Lfd;->e(I)V

    .line 1256
    .line 1257
    .line 1258
    if-nez v8, :cond_2e

    .line 1259
    .line 1260
    move-object/from16 v55, v39

    .line 1261
    .line 1262
    :goto_20
    const/4 v10, 0x1

    .line 1263
    goto :goto_21

    .line 1264
    :cond_2e
    move-object/from16 v55, v8

    .line 1265
    .line 1266
    goto :goto_20

    .line 1267
    :goto_21
    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v6

    .line 1271
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1272
    .line 1273
    .line 1274
    move-result v8

    .line 1275
    invoke-virtual {v15, v8}, Lfd;->e(I)V

    .line 1276
    .line 1277
    .line 1278
    if-nez v6, :cond_2f

    .line 1279
    .line 1280
    sget v0, Lc45;->a:I

    .line 1281
    .line 1282
    :goto_22
    move-object/from16 v63, v48

    .line 1283
    .line 1284
    goto :goto_23

    .line 1285
    :cond_2f
    invoke-static {v0, v6}, Lpz1;->A(Lpz1;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v48

    .line 1289
    goto :goto_22

    .line 1290
    :goto_23
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 1291
    .line 1292
    .line 1293
    new-instance v54, Lew1;

    .line 1294
    .line 1295
    const/16 v64, 0x200

    .line 1296
    .line 1297
    const/16 v56, 0x0

    .line 1298
    .line 1299
    const/16 v57, 0x0

    .line 1300
    .line 1301
    const/16 v58, 0x0

    .line 1302
    .line 1303
    const/high16 v59, 0x3f800000    # 1.0f

    .line 1304
    .line 1305
    const/high16 v60, 0x3f800000    # 1.0f

    .line 1306
    .line 1307
    const/16 v61, 0x0

    .line 1308
    .line 1309
    const/16 v62, 0x0

    .line 1310
    .line 1311
    invoke-direct/range {v54 .. v64}, Lew1;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 1312
    .line 1313
    .line 1314
    move-object/from16 v0, v54

    .line 1315
    .line 1316
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    add-int/lit8 v35, v35, 0x1

    .line 1320
    .line 1321
    :goto_24
    invoke-interface/range {v50 .. v50}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1322
    .line 1323
    .line 1324
    move-object/from16 v0, v50

    .line 1325
    .line 1326
    move/from16 v4, v51

    .line 1327
    .line 1328
    move/from16 v6, v52

    .line 1329
    .line 1330
    move/from16 v8, v53

    .line 1331
    .line 1332
    const/4 v9, 0x3

    .line 1333
    const/4 v10, 0x5

    .line 1334
    goto/16 :goto_6

    .line 1335
    .line 1336
    :goto_25
    iget v0, v15, Lfd;->a:I

    .line 1337
    .line 1338
    or-int v0, v51, v0

    .line 1339
    .line 1340
    new-instance v13, Lgw1;

    .line 1341
    .line 1342
    :goto_26
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1343
    .line 1344
    .line 1345
    move-result v2

    .line 1346
    const/4 v10, 0x1

    .line 1347
    if-le v2, v10, :cond_30

    .line 1348
    .line 1349
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1350
    .line 1351
    .line 1352
    move-result v2

    .line 1353
    sub-int/2addr v2, v10

    .line 1354
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v2

    .line 1358
    check-cast v2, Lew1;

    .line 1359
    .line 1360
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1361
    .line 1362
    .line 1363
    move-result v3

    .line 1364
    sub-int/2addr v3, v10

    .line 1365
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    check-cast v3, Lew1;

    .line 1370
    .line 1371
    iget-object v3, v3, Lew1;->j:Ljava/util/ArrayList;

    .line 1372
    .line 1373
    new-instance v31, Lb45;

    .line 1374
    .line 1375
    iget-object v4, v2, Lew1;->a:Ljava/lang/String;

    .line 1376
    .line 1377
    iget v6, v2, Lew1;->b:F

    .line 1378
    .line 1379
    iget v8, v2, Lew1;->c:F

    .line 1380
    .line 1381
    iget v9, v2, Lew1;->d:F

    .line 1382
    .line 1383
    iget v14, v2, Lew1;->e:F

    .line 1384
    .line 1385
    iget v15, v2, Lew1;->f:F

    .line 1386
    .line 1387
    iget v10, v2, Lew1;->g:F

    .line 1388
    .line 1389
    move-object/from16 v32, v4

    .line 1390
    .line 1391
    iget v4, v2, Lew1;->h:F

    .line 1392
    .line 1393
    move/from16 v39, v4

    .line 1394
    .line 1395
    iget-object v4, v2, Lew1;->i:Ljava/util/List;

    .line 1396
    .line 1397
    iget-object v2, v2, Lew1;->j:Ljava/util/ArrayList;

    .line 1398
    .line 1399
    move-object/from16 v41, v2

    .line 1400
    .line 1401
    move-object/from16 v40, v4

    .line 1402
    .line 1403
    move/from16 v33, v6

    .line 1404
    .line 1405
    move/from16 v34, v8

    .line 1406
    .line 1407
    move/from16 v35, v9

    .line 1408
    .line 1409
    move/from16 v38, v10

    .line 1410
    .line 1411
    move/from16 v36, v14

    .line 1412
    .line 1413
    move/from16 v37, v15

    .line 1414
    .line 1415
    invoke-direct/range {v31 .. v41}, Lb45;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/ArrayList;)V

    .line 1416
    .line 1417
    .line 1418
    move-object/from16 v2, v31

    .line 1419
    .line 1420
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1421
    .line 1422
    .line 1423
    goto :goto_26

    .line 1424
    :cond_30
    new-instance v20, Lfw1;

    .line 1425
    .line 1426
    new-instance v31, Lb45;

    .line 1427
    .line 1428
    iget-object v2, v7, Lew1;->a:Ljava/lang/String;

    .line 1429
    .line 1430
    iget v3, v7, Lew1;->b:F

    .line 1431
    .line 1432
    iget v4, v7, Lew1;->c:F

    .line 1433
    .line 1434
    iget v6, v7, Lew1;->d:F

    .line 1435
    .line 1436
    iget v8, v7, Lew1;->e:F

    .line 1437
    .line 1438
    iget v9, v7, Lew1;->f:F

    .line 1439
    .line 1440
    iget v10, v7, Lew1;->g:F

    .line 1441
    .line 1442
    iget v11, v7, Lew1;->h:F

    .line 1443
    .line 1444
    iget-object v14, v7, Lew1;->i:Ljava/util/List;

    .line 1445
    .line 1446
    iget-object v7, v7, Lew1;->j:Ljava/util/ArrayList;

    .line 1447
    .line 1448
    move-object/from16 v32, v2

    .line 1449
    .line 1450
    move/from16 v33, v3

    .line 1451
    .line 1452
    move/from16 v34, v4

    .line 1453
    .line 1454
    move/from16 v35, v6

    .line 1455
    .line 1456
    move-object/from16 v41, v7

    .line 1457
    .line 1458
    move/from16 v36, v8

    .line 1459
    .line 1460
    move/from16 v37, v9

    .line 1461
    .line 1462
    move/from16 v38, v10

    .line 1463
    .line 1464
    move/from16 v39, v11

    .line 1465
    .line 1466
    move-object/from16 v40, v14

    .line 1467
    .line 1468
    invoke-direct/range {v31 .. v41}, Lb45;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/ArrayList;)V

    .line 1469
    .line 1470
    .line 1471
    move-object/from16 v26, v31

    .line 1472
    .line 1473
    move/from16 v29, v52

    .line 1474
    .line 1475
    move/from16 v23, v53

    .line 1476
    .line 1477
    invoke-direct/range {v20 .. v30}, Lfw1;-><init>(Ljava/lang/String;FFFFLb45;JIZ)V

    .line 1478
    .line 1479
    .line 1480
    move-object/from16 v2, v20

    .line 1481
    .line 1482
    invoke-direct {v13, v2, v0}, Lgw1;-><init>(Lfw1;I)V

    .line 1483
    .line 1484
    .line 1485
    iget-object v0, v5, Liw1;->a:Ljava/util/HashMap;

    .line 1486
    .line 1487
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 1488
    .line 1489
    invoke-direct {v2, v13}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v0, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    goto :goto_27

    .line 1496
    :cond_31
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1497
    .line 1498
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1503
    .line 1504
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1505
    .line 1506
    .line 1507
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1508
    .line 1509
    .line 1510
    const-string v1, "<VectorGraphic> tag requires viewportHeight > 0"

    .line 1511
    .line 1512
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v1

    .line 1519
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1520
    .line 1521
    .line 1522
    throw v0

    .line 1523
    :cond_32
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1524
    .line 1525
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1

    .line 1529
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1530
    .line 1531
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1535
    .line 1536
    .line 1537
    const-string v1, "<VectorGraphic> tag requires viewportWidth > 0"

    .line 1538
    .line 1539
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v1

    .line 1546
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1547
    .line 1548
    .line 1549
    throw v0

    .line 1550
    :cond_33
    const/16 v19, 0x0

    .line 1551
    .line 1552
    const-string v0, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"

    .line 1553
    .line 1554
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 1555
    .line 1556
    .line 1557
    return-object v19

    .line 1558
    :cond_34
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1559
    .line 1560
    const-string v1, "No start tag found"

    .line 1561
    .line 1562
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1563
    .line 1564
    .line 1565
    throw v0

    .line 1566
    :cond_35
    const-wide v16, 0xffffffffL

    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    const/16 v18, 0x20

    .line 1572
    .line 1573
    const/16 v19, 0x0

    .line 1574
    .line 1575
    :goto_27
    iget-object v0, v13, Lgw1;->a:Lfw1;

    .line 1576
    .line 1577
    sget-object v2, Lg90;->h:Lwl4;

    .line 1578
    .line 1579
    invoke-virtual {v1, v2}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v2

    .line 1583
    check-cast v2, Loo0;

    .line 1584
    .line 1585
    iget v3, v0, Lfw1;->j:I

    .line 1586
    .line 1587
    int-to-float v3, v3

    .line 1588
    invoke-interface {v2}, Loo0;->g()F

    .line 1589
    .line 1590
    .line 1591
    move-result v4

    .line 1592
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1593
    .line 1594
    .line 1595
    move-result v3

    .line 1596
    int-to-long v5, v3

    .line 1597
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1598
    .line 1599
    .line 1600
    move-result v3

    .line 1601
    int-to-long v3, v3

    .line 1602
    shl-long v5, v5, v18

    .line 1603
    .line 1604
    and-long v3, v3, v16

    .line 1605
    .line 1606
    or-long/2addr v3, v5

    .line 1607
    invoke-virtual {v1}, Lrg1;->z()Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    instance-of v6, v5, Ljava/lang/Long;

    .line 1612
    .line 1613
    if-eqz v6, :cond_36

    .line 1614
    .line 1615
    check-cast v5, Ljava/lang/Number;

    .line 1616
    .line 1617
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 1618
    .line 1619
    .line 1620
    move-result-wide v5

    .line 1621
    cmp-long v5, v3, v5

    .line 1622
    .line 1623
    if-nez v5, :cond_36

    .line 1624
    .line 1625
    const/4 v6, 0x0

    .line 1626
    goto :goto_28

    .line 1627
    :cond_36
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v3

    .line 1631
    invoke-virtual {v1, v3}, Lrg1;->c0(Ljava/lang/Object;)V

    .line 1632
    .line 1633
    .line 1634
    const/4 v6, 0x1

    .line 1635
    :goto_28
    invoke-virtual {v1}, Lrg1;->H()Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v3

    .line 1639
    if-nez v6, :cond_37

    .line 1640
    .line 1641
    sget-object v4, Lj80;->a:Li80;

    .line 1642
    .line 1643
    if-ne v3, v4, :cond_3b

    .line 1644
    .line 1645
    :cond_37
    new-instance v3, Lgk1;

    .line 1646
    .line 1647
    invoke-direct {v3}, Lgk1;-><init>()V

    .line 1648
    .line 1649
    .line 1650
    iget-object v4, v0, Lfw1;->f:Lb45;

    .line 1651
    .line 1652
    invoke-static {v3, v4}, Lgb;->q(Lgk1;Lb45;)V

    .line 1653
    .line 1654
    .line 1655
    iget v4, v0, Lfw1;->b:F

    .line 1656
    .line 1657
    iget v5, v0, Lfw1;->c:F

    .line 1658
    .line 1659
    invoke-interface {v2, v4}, Loo0;->M(F)F

    .line 1660
    .line 1661
    .line 1662
    move-result v4

    .line 1663
    invoke-interface {v2, v5}, Loo0;->M(F)F

    .line 1664
    .line 1665
    .line 1666
    move-result v2

    .line 1667
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1668
    .line 1669
    .line 1670
    move-result v4

    .line 1671
    int-to-long v4, v4

    .line 1672
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1673
    .line 1674
    .line 1675
    move-result v2

    .line 1676
    int-to-long v6, v2

    .line 1677
    shl-long v4, v4, v18

    .line 1678
    .line 1679
    and-long v6, v6, v16

    .line 1680
    .line 1681
    or-long/2addr v4, v6

    .line 1682
    iget v2, v0, Lfw1;->d:F

    .line 1683
    .line 1684
    iget v6, v0, Lfw1;->e:F

    .line 1685
    .line 1686
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 1687
    .line 1688
    .line 1689
    move-result v7

    .line 1690
    if-eqz v7, :cond_38

    .line 1691
    .line 1692
    shr-long v7, v4, v18

    .line 1693
    .line 1694
    long-to-int v2, v7

    .line 1695
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1696
    .line 1697
    .line 1698
    move-result v2

    .line 1699
    :cond_38
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 1700
    .line 1701
    .line 1702
    move-result v7

    .line 1703
    if-eqz v7, :cond_39

    .line 1704
    .line 1705
    and-long v6, v4, v16

    .line 1706
    .line 1707
    long-to-int v6, v6

    .line 1708
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1709
    .line 1710
    .line 1711
    move-result v6

    .line 1712
    :cond_39
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1713
    .line 1714
    .line 1715
    move-result v2

    .line 1716
    int-to-long v7, v2

    .line 1717
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1718
    .line 1719
    .line 1720
    move-result v2

    .line 1721
    int-to-long v9, v2

    .line 1722
    shl-long v6, v7, v18

    .line 1723
    .line 1724
    and-long v8, v9, v16

    .line 1725
    .line 1726
    or-long/2addr v6, v8

    .line 1727
    new-instance v2, Le45;

    .line 1728
    .line 1729
    invoke-direct {v2, v3}, Le45;-><init>(Lgk1;)V

    .line 1730
    .line 1731
    .line 1732
    iget-object v3, v0, Lfw1;->a:Ljava/lang/String;

    .line 1733
    .line 1734
    iget-wide v8, v0, Lfw1;->g:J

    .line 1735
    .line 1736
    iget v10, v0, Lfw1;->h:I

    .line 1737
    .line 1738
    const-wide/16 v11, 0x10

    .line 1739
    .line 1740
    cmp-long v11, v8, v11

    .line 1741
    .line 1742
    if-eqz v11, :cond_3a

    .line 1743
    .line 1744
    new-instance v11, Ldt;

    .line 1745
    .line 1746
    invoke-direct {v11, v10, v8, v9}, Ldt;-><init>(IJ)V

    .line 1747
    .line 1748
    .line 1749
    move-object v10, v11

    .line 1750
    goto :goto_29

    .line 1751
    :cond_3a
    move-object/from16 v10, v19

    .line 1752
    .line 1753
    :goto_29
    iget-boolean v0, v0, Lfw1;->i:Z

    .line 1754
    .line 1755
    iget-object v8, v2, Le45;->e:Lzd3;

    .line 1756
    .line 1757
    new-instance v9, Lqf4;

    .line 1758
    .line 1759
    invoke-direct {v9, v4, v5}, Lqf4;-><init>(J)V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v8, v9}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 1763
    .line 1764
    .line 1765
    iget-object v4, v2, Le45;->f:Lzd3;

    .line 1766
    .line 1767
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    invoke-virtual {v4, v0}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 1772
    .line 1773
    .line 1774
    iget-object v0, v2, Le45;->g:Ln35;

    .line 1775
    .line 1776
    iget-object v4, v0, Ln35;->g:Lzd3;

    .line 1777
    .line 1778
    invoke-virtual {v4, v10}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 1779
    .line 1780
    .line 1781
    iget-object v4, v0, Ln35;->i:Lzd3;

    .line 1782
    .line 1783
    new-instance v5, Lqf4;

    .line 1784
    .line 1785
    invoke-direct {v5, v6, v7}, Lqf4;-><init>(J)V

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v4, v5}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    iput-object v3, v0, Ln35;->c:Ljava/lang/String;

    .line 1792
    .line 1793
    invoke-virtual {v1, v2}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 1794
    .line 1795
    .line 1796
    move-object v3, v2

    .line 1797
    :cond_3b
    check-cast v3, Le45;

    .line 1798
    .line 1799
    const/4 v6, 0x0

    .line 1800
    invoke-virtual {v1, v6}, Lrg1;->o(Z)V

    .line 1801
    .line 1802
    .line 1803
    return-object v3

    .line 1804
    :cond_3c
    const-wide v16, 0xffffffffL

    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    const/16 v18, 0x20

    .line 1810
    .line 1811
    const/16 v19, 0x0

    .line 1812
    .line 1813
    const v5, -0x69992078

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v1, v5}, Lrg1;->R(I)V

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v2

    .line 1823
    invoke-virtual {v1, v4}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v5

    .line 1827
    invoke-virtual {v1, v0}, Lrg1;->d(I)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v6

    .line 1831
    or-int/2addr v5, v6

    .line 1832
    invoke-virtual {v1, v2}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 1833
    .line 1834
    .line 1835
    move-result v2

    .line 1836
    or-int/2addr v2, v5

    .line 1837
    invoke-virtual {v1}, Lrg1;->H()Ljava/lang/Object;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v5

    .line 1841
    if-nez v2, :cond_3d

    .line 1842
    .line 1843
    sget-object v2, Lj80;->a:Li80;

    .line 1844
    .line 1845
    if-ne v5, v2, :cond_3e

    .line 1846
    .line 1847
    :cond_3d
    move-object/from16 v2, v19

    .line 1848
    .line 1849
    :try_start_1
    invoke-virtual {v3, v0, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1854
    .line 1855
    .line 1856
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 1857
    .line 1858
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v0

    .line 1862
    new-instance v5, Lcc;

    .line 1863
    .line 1864
    invoke-direct {v5, v0}, Lcc;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v1, v5}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 1868
    .line 1869
    .line 1870
    :cond_3e
    check-cast v5, Lcc;

    .line 1871
    .line 1872
    new-instance v0, Lys;

    .line 1873
    .line 1874
    iget-object v2, v5, Lcc;->a:Landroid/graphics/Bitmap;

    .line 1875
    .line 1876
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1877
    .line 1878
    .line 1879
    move-result v2

    .line 1880
    iget-object v3, v5, Lcc;->a:Landroid/graphics/Bitmap;

    .line 1881
    .line 1882
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1883
    .line 1884
    .line 1885
    move-result v3

    .line 1886
    int-to-long v6, v2

    .line 1887
    shl-long v6, v6, v18

    .line 1888
    .line 1889
    int-to-long v2, v3

    .line 1890
    and-long v2, v2, v16

    .line 1891
    .line 1892
    or-long/2addr v2, v6

    .line 1893
    invoke-direct {v0, v5, v2, v3}, Lys;-><init>(Lcc;J)V

    .line 1894
    .line 1895
    .line 1896
    const/4 v6, 0x0

    .line 1897
    invoke-virtual {v1, v6}, Lrg1;->o(Z)V

    .line 1898
    .line 1899
    .line 1900
    return-object v0

    .line 1901
    :catch_0
    move-exception v0

    .line 1902
    new-instance v1, Landroidx/compose/ui/res/ResourceResolutionException;

    .line 1903
    .line 1904
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1905
    .line 1906
    const-string v3, "Error attempting to load resource: "

    .line 1907
    .line 1908
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1912
    .line 1913
    .line 1914
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v2

    .line 1918
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1919
    .line 1920
    .line 1921
    throw v1

    .line 1922
    :goto_2a
    monitor-exit v4

    .line 1923
    throw v0

    .line 1924
    nop

    .line 1925
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static y(Ljava/lang/String;)Le20;
    .locals 18

    .line 1
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/io/StringReader;

    .line 10
    .line 11
    move-object/from16 v2, p0

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 20
    .line 21
    .line 22
    const-string v1, "x:xmpmeta"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lte5;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz v2, :cond_c

    .line 30
    .line 31
    sget-object v2, Lyw1;->o:Lvw1;

    .line 32
    .line 33
    sget-object v2, Lgy3;->r:Lgy3;

    .line 34
    .line 35
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    move-wide v6, v4

    .line 41
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 42
    .line 43
    .line 44
    const-string v8, "rdf:Description"

    .line 45
    .line 46
    invoke-static {v0, v8}, Lte5;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_7

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    move v6, v2

    .line 54
    :goto_0
    const/4 v7, 0x4

    .line 55
    if-ge v6, v7, :cond_a

    .line 56
    .line 57
    sget-object v8, Lbu;->c:[Ljava/lang/String;

    .line 58
    .line 59
    aget-object v8, v8, v6

    .line 60
    .line 61
    invoke-static {v0, v8}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    if-eqz v8, :cond_6

    .line 66
    .line 67
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v8, 0x1

    .line 72
    if-ne v6, v8, :cond_a

    .line 73
    .line 74
    move v6, v2

    .line 75
    :goto_1
    if-ge v6, v7, :cond_1

    .line 76
    .line 77
    sget-object v8, Lbu;->d:[Ljava/lang/String;

    .line 78
    .line 79
    aget-object v8, v8, v6

    .line 80
    .line 81
    invoke-static {v0, v8}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    if-eqz v8, :cond_2

    .line 86
    .line 87
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    const-wide/16 v8, -0x1

    .line 92
    .line 93
    cmp-long v8, v6, v8

    .line 94
    .line 95
    if-nez v8, :cond_3

    .line 96
    .line 97
    :cond_1
    move-wide v6, v4

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    :goto_2
    const/4 v8, 0x2

    .line 103
    if-ge v2, v8, :cond_5

    .line 104
    .line 105
    sget-object v8, Lbu;->e:[Ljava/lang/String;

    .line 106
    .line 107
    aget-object v8, v8, v2

    .line 108
    .line 109
    invoke-static {v0, v8}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    new-instance v12, Lwx2;

    .line 120
    .line 121
    const-wide/16 v13, 0x0

    .line 122
    .line 123
    const-wide/16 v15, 0x0

    .line 124
    .line 125
    const-string v17, "image/jpeg"

    .line 126
    .line 127
    invoke-direct/range {v12 .. v17}, Lwx2;-><init>(JJLjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    move-object v2, v12

    .line 131
    new-instance v9, Lwx2;

    .line 132
    .line 133
    const-string v14, "video/mp4"

    .line 134
    .line 135
    const-wide/16 v12, 0x0

    .line 136
    .line 137
    invoke-direct/range {v9 .. v14}, Lwx2;-><init>(JJLjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v9}, Lyw1;->p(Ljava/lang/Object;Ljava/lang/Object;)Lgy3;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    sget-object v2, Lyw1;->o:Lvw1;

    .line 149
    .line 150
    sget-object v2, Lgy3;->r:Lgy3;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_7
    const-string v8, "Container:Directory"

    .line 157
    .line 158
    invoke-static {v0, v8}, Lte5;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_8

    .line 163
    .line 164
    const-string v2, "Container"

    .line 165
    .line 166
    const-string v8, "Item"

    .line 167
    .line 168
    invoke-static {v0, v2, v8}, Lbu;->z(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lgy3;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    goto :goto_3

    .line 173
    :cond_8
    const-string v8, "GContainer:Directory"

    .line 174
    .line 175
    invoke-static {v0, v8}, Lte5;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    if-eqz v8, :cond_9

    .line 180
    .line 181
    const-string v2, "GContainer"

    .line 182
    .line 183
    const-string v8, "GContainerItem"

    .line 184
    .line 185
    invoke-static {v0, v2, v8}, Lbu;->z(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lgy3;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    :cond_9
    :goto_3
    invoke-static {v0, v1}, Lte5;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-eqz v8, :cond_0

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    :cond_a
    return-object v3

    .line 202
    :cond_b
    new-instance v0, Le20;

    .line 203
    .line 204
    const/4 v1, 0x3

    .line 205
    invoke-direct {v0, v6, v7, v2, v1}, Le20;-><init>(JLjava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_c
    const-string v0, "Couldn\'t find xmp metadata"

    .line 210
    .line 211
    invoke-static {v3, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    throw v0
.end method

.method public static z(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lgy3;
    .locals 12

    .line 1
    invoke-static {}, Lyw1;->j()Luw1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ":Item"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, ":Directory"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Lte5;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    const-string v2, ":Mime"

    .line 27
    .line 28
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, ":Semantic"

    .line 33
    .line 34
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, ":Length"

    .line 39
    .line 40
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, ":Padding"

    .line 45
    .line 46
    invoke-virtual {p2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {p0, v2}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-static {p0, v3}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {p0, v4}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {p0, v5}, Lte5;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v11, :cond_4

    .line 67
    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance v6, Lwx2;

    .line 72
    .line 73
    const-wide/16 v7, 0x0

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-wide v2, v7

    .line 83
    :goto_0
    if-eqz v4, :cond_3

    .line 84
    .line 85
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    :cond_3
    move-wide v9, v7

    .line 90
    move-wide v7, v2

    .line 91
    invoke-direct/range {v6 .. v11}, Lwx2;-><init>(JJLjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v6}, Lpw1;->c(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    :goto_1
    sget-object p0, Lgy3;->r:Lgy3;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_5
    :goto_2
    invoke-static {p0, p1}, Lte5;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_0

    .line 106
    .line 107
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method


# virtual methods
.method public abstract u(Ljava/lang/Throwable;)V
.end method

.method public abstract v(Lna4;)V
.end method
