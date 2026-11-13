.class public final Ldefpackage/oi2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/pv2;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[B

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[BII)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, -0x1

    .line 15
    sparse-switch v0, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_0
    const-string v0, "auxiliary.tracks.map"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v1

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v0, "auxiliary.tracks.offset"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v4, 0x3

    .line 40
    goto :goto_0

    .line 41
    :sswitch_2
    const-string v0, "auxiliary.tracks.length"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v4, 0x2

    .line 51
    goto :goto_0

    .line 52
    :sswitch_3
    const-string v0, "auxiliary.tracks.interleaved"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move v4, v3

    .line 62
    goto :goto_0

    .line 63
    :sswitch_4
    const-string v0, "com.android.capture.fps"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    move v4, v2

    .line 73
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_0
    if-nez p4, :cond_5

    .line 78
    .line 79
    move v2, v3

    .line 80
    :cond_5
    invoke-static {v2}, Ldefpackage/rr2;->l(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_1
    const/16 v0, 0x4e

    .line 85
    .line 86
    if-ne p4, v0, :cond_6

    .line 87
    .line 88
    array-length v0, p2

    .line 89
    const/16 v1, 0x8

    .line 90
    .line 91
    if-ne v0, v1, :cond_6

    .line 92
    .line 93
    move v2, v3

    .line 94
    :cond_6
    invoke-static {v2}, Ldefpackage/rr2;->l(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_2
    const/16 v0, 0x4b

    .line 99
    .line 100
    if-ne p4, v0, :cond_8

    .line 101
    .line 102
    array-length v0, p2

    .line 103
    if-ne v0, v3, :cond_8

    .line 104
    .line 105
    aget-byte v0, p2, v2

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    if-ne v0, v3, :cond_8

    .line 110
    .line 111
    :cond_7
    move v2, v3

    .line 112
    :cond_8
    invoke-static {v2}, Ldefpackage/rr2;->l(Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_3
    const/16 v0, 0x17

    .line 117
    .line 118
    if-ne p4, v0, :cond_9

    .line 119
    .line 120
    array-length v0, p2

    .line 121
    if-ne v0, v1, :cond_9

    .line 122
    .line 123
    move v2, v3

    .line 124
    :cond_9
    invoke-static {v2}, Ldefpackage/rr2;->l(Z)V

    .line 125
    .line 126
    .line 127
    :goto_1
    iput-object p1, p0, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 128
    .line 129
    iput-object p2, p0, Ldefpackage/oi2;->b:[B

    .line 130
    .line 131
    iput p3, p0, Ldefpackage/oi2;->c:I

    .line 132
    .line 133
    iput p4, p0, Ldefpackage/oi2;->d:I

    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :sswitch_data_0
    .sparse-switch
        -0x7438daab -> :sswitch_4
        -0x100eb5d5 -> :sswitch_3
        0x3c4d37e4 -> :sswitch_2
        0x41766191 -> :sswitch_1
        0x7755f91e -> :sswitch_0
    .end sparse-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final d()Ljava/util/ArrayList;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "auxiliary.tracks.map"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "Metadata is not an auxiliary tracks map"

    .line 10
    .line 11
    invoke-static {v1, v0}, Ldefpackage/rr2;->v(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iget-object p0, p0, Ldefpackage/oi2;->b:[B

    .line 16
    .line 17
    aget-byte v0, p0, v0

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v0, :cond_0

    .line 26
    .line 27
    add-int/lit8 v3, v2, 0x2

    .line 28
    .line 29
    aget-byte v3, p0, v3

    .line 30
    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Ldefpackage/oi2;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Ldefpackage/oi2;

    .line 18
    .line 19
    iget-object v2, p0, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p1, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Ldefpackage/oi2;->b:[B

    .line 30
    .line 31
    iget-object v3, p1, Ldefpackage/oi2;->b:[B

    .line 32
    .line 33
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget v2, p0, Ldefpackage/oi2;->c:I

    .line 40
    .line 41
    iget v3, p1, Ldefpackage/oi2;->c:I

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget p0, p0, Ldefpackage/oi2;->d:I

    .line 46
    .line 47
    iget p1, p1, Ldefpackage/oi2;->d:I

    .line 48
    .line 49
    if-ne p0, p1, :cond_2

    .line 50
    .line 51
    return v0

    .line 52
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x20f

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ldefpackage/f34;->e(Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Ldefpackage/oi2;->b:[B

    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/2addr v1, v2

    .line 19
    iget v0, p0, Ldefpackage/oi2;->c:I

    .line 20
    .line 21
    add-int/2addr v1, v0

    .line 22
    mul-int/2addr v1, v2

    .line 23
    iget p0, p0, Ldefpackage/oi2;->d:I

    .line 24
    .line 25
    add-int/2addr v1, p0

    .line 26
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget v0, p0, Ldefpackage/oi2;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    if-eq v0, v2, :cond_6

    .line 8
    .line 9
    const/16 v3, 0x17

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    const-string v6, "array too small: %s < %s"

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    if-eq v0, v3, :cond_4

    .line 17
    .line 18
    const/16 v3, 0x43

    .line 19
    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    const/16 v3, 0x4b

    .line 23
    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    const/16 v3, 0x4e

    .line 27
    .line 28
    if-eq v0, v3, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    new-instance v0, Ldefpackage/be3;

    .line 33
    .line 34
    iget-object v1, p0, Ldefpackage/oi2;->b:[B

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ldefpackage/be3;-><init>([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ldefpackage/be3;->G()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto/16 :goto_d

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Ldefpackage/oi2;->b:[B

    .line 50
    .line 51
    aget-byte v0, v0, v1

    .line 52
    .line 53
    and-int/lit16 v0, v0, 0xff

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto/16 :goto_d

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Ldefpackage/oi2;->b:[B

    .line 62
    .line 63
    array-length v3, v0

    .line 64
    if-lt v3, v7, :cond_3

    .line 65
    .line 66
    move v3, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    move v3, v1

    .line 69
    :goto_0
    array-length v8, v0

    .line 70
    invoke-static {v8, v7, v6, v3}, Ldefpackage/rr2;->i(IILjava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    aget-byte v1, v0, v1

    .line 74
    .line 75
    aget-byte v2, v0, v2

    .line 76
    .line 77
    aget-byte v3, v0, v5

    .line 78
    .line 79
    aget-byte v0, v0, v4

    .line 80
    .line 81
    invoke-static {v1, v2, v3, v0}, Ldefpackage/jz4;->u(BBBB)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto/16 :goto_d

    .line 90
    .line 91
    :cond_4
    iget-object v0, p0, Ldefpackage/oi2;->b:[B

    .line 92
    .line 93
    array-length v3, v0

    .line 94
    if-lt v3, v7, :cond_5

    .line 95
    .line 96
    move v3, v2

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move v3, v1

    .line 99
    :goto_1
    array-length v8, v0

    .line 100
    invoke-static {v8, v7, v6, v3}, Ldefpackage/rr2;->i(IILjava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    aget-byte v1, v0, v1

    .line 104
    .line 105
    aget-byte v2, v0, v2

    .line 106
    .line 107
    aget-byte v3, v0, v5

    .line 108
    .line 109
    aget-byte v0, v0, v4

    .line 110
    .line 111
    invoke-static {v1, v2, v3, v0}, Ldefpackage/jz4;->u(BBBB)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto/16 :goto_d

    .line 124
    .line 125
    :cond_6
    iget-object v0, p0, Ldefpackage/oi2;->b:[B

    .line 126
    .line 127
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 128
    .line 129
    new-instance v1, Ljava/lang/String;

    .line 130
    .line 131
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 132
    .line 133
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 134
    .line 135
    .line 136
    move-object v0, v1

    .line 137
    goto/16 :goto_d

    .line 138
    .line 139
    :cond_7
    iget-object v0, p0, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 140
    .line 141
    const-string v3, "auxiliary.tracks.map"

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    invoke-virtual {p0}, Ldefpackage/oi2;->d()Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "track types = "

    .line 154
    .line 155
    invoke-static {v1}, Ldefpackage/xa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    new-instance v2, Ldefpackage/uc0;

    .line 160
    .line 161
    const/16 v3, 0x2c

    .line 162
    .line 163
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-direct {v2, v3}, Ldefpackage/uc0;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v2, v1, v0}, Ldefpackage/uc0;->a(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto/16 :goto_d

    .line 182
    .line 183
    :cond_8
    :goto_2
    iget-object v0, p0, Ldefpackage/oi2;->b:[B

    .line 184
    .line 185
    sget-object v3, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 186
    .line 187
    sget-object v3, Ldefpackage/op;->d:Ldefpackage/mp;

    .line 188
    .line 189
    iget-object v4, v3, Ldefpackage/op;->c:Ldefpackage/op;

    .line 190
    .line 191
    if-nez v4, :cond_16

    .line 192
    .line 193
    iget-object v4, v3, Ldefpackage/op;->a:Ldefpackage/lp;

    .line 194
    .line 195
    iget-object v5, v4, Ldefpackage/lp;->b:[C

    .line 196
    .line 197
    array-length v6, v5

    .line 198
    move v7, v1

    .line 199
    :goto_3
    if-ge v7, v6, :cond_14

    .line 200
    .line 201
    aget-char v8, v5, v7

    .line 202
    .line 203
    invoke-static {v8}, Ldefpackage/rr2;->J(C)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_13

    .line 208
    .line 209
    array-length v6, v5

    .line 210
    move v7, v1

    .line 211
    :goto_4
    if-ge v7, v6, :cond_a

    .line 212
    .line 213
    aget-char v8, v5, v7

    .line 214
    .line 215
    const/16 v9, 0x61

    .line 216
    .line 217
    if-lt v8, v9, :cond_9

    .line 218
    .line 219
    const/16 v9, 0x7a

    .line 220
    .line 221
    if-gt v8, v9, :cond_9

    .line 222
    .line 223
    move v6, v2

    .line 224
    goto :goto_5

    .line 225
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    move v6, v1

    .line 229
    :goto_5
    xor-int/2addr v6, v2

    .line 230
    const-string v7, "Cannot call lowerCase() on a mixed-case alphabet"

    .line 231
    .line 232
    invoke-static {v7, v6}, Ldefpackage/rr2;->v(Ljava/lang/String;Z)V

    .line 233
    .line 234
    .line 235
    array-length v6, v5

    .line 236
    new-array v6, v6, [C

    .line 237
    .line 238
    move v7, v1

    .line 239
    :goto_6
    array-length v8, v5

    .line 240
    if-ge v7, v8, :cond_c

    .line 241
    .line 242
    aget-char v8, v5, v7

    .line 243
    .line 244
    invoke-static {v8}, Ldefpackage/rr2;->J(C)Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_b

    .line 249
    .line 250
    xor-int/lit8 v8, v8, 0x20

    .line 251
    .line 252
    int-to-char v8, v8

    .line 253
    :cond_b
    aput-char v8, v6, v7

    .line 254
    .line 255
    add-int/lit8 v7, v7, 0x1

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_c
    new-instance v5, Ldefpackage/lp;

    .line 259
    .line 260
    new-instance v7, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    iget-object v8, v4, Ldefpackage/lp;->a:Ljava/lang/String;

    .line 266
    .line 267
    const-string v9, ".lowerCase()"

    .line 268
    .line 269
    invoke-static {v7, v8, v9}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-direct {v5, v7, v6}, Ldefpackage/lp;-><init>(Ljava/lang/String;[C)V

    .line 274
    .line 275
    .line 276
    iget-boolean v4, v4, Ldefpackage/lp;->h:Z

    .line 277
    .line 278
    if-eqz v4, :cond_12

    .line 279
    .line 280
    iget-object v4, v5, Ldefpackage/lp;->g:[B

    .line 281
    .line 282
    iget-boolean v6, v5, Ldefpackage/lp;->h:Z

    .line 283
    .line 284
    if-eqz v6, :cond_d

    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_d
    array-length v6, v4

    .line 288
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    const/16 v7, 0x41

    .line 293
    .line 294
    :goto_7
    const/16 v8, 0x5a

    .line 295
    .line 296
    if-gt v7, v8, :cond_11

    .line 297
    .line 298
    or-int/lit8 v8, v7, 0x20

    .line 299
    .line 300
    aget-byte v9, v4, v7

    .line 301
    .line 302
    aget-byte v10, v4, v8

    .line 303
    .line 304
    const/4 v11, -0x1

    .line 305
    if-ne v9, v11, :cond_e

    .line 306
    .line 307
    aput-byte v10, v6, v7

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_e
    if-ne v10, v11, :cond_f

    .line 311
    .line 312
    move v10, v2

    .line 313
    goto :goto_8

    .line 314
    :cond_f
    move v10, v1

    .line 315
    :goto_8
    int-to-char v11, v7

    .line 316
    int-to-char v12, v8

    .line 317
    if-eqz v10, :cond_10

    .line 318
    .line 319
    aput-byte v9, v6, v8

    .line 320
    .line 321
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_10
    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    const-string v0, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values"

    .line 337
    .line 338
    invoke-static {v0, p0}, Ldefpackage/gh0;->s(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    const/4 p0, 0x0

    .line 346
    return-object p0

    .line 347
    :cond_11
    new-instance v4, Ldefpackage/lp;

    .line 348
    .line 349
    new-instance v7, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    iget-object v8, v5, Ldefpackage/lp;->a:Ljava/lang/String;

    .line 355
    .line 356
    const-string v9, ".ignoreCase()"

    .line 357
    .line 358
    invoke-static {v7, v8, v9}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    iget-object v5, v5, Ldefpackage/lp;->b:[C

    .line 363
    .line 364
    invoke-direct {v4, v7, v5, v6, v2}, Ldefpackage/lp;-><init>(Ljava/lang/String;[C[BZ)V

    .line 365
    .line 366
    .line 367
    goto :goto_b

    .line 368
    :cond_12
    :goto_a
    move-object v4, v5

    .line 369
    goto :goto_b

    .line 370
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 371
    .line 372
    goto/16 :goto_3

    .line 373
    .line 374
    :cond_14
    :goto_b
    iget-object v2, v3, Ldefpackage/op;->a:Ldefpackage/lp;

    .line 375
    .line 376
    if-ne v4, v2, :cond_15

    .line 377
    .line 378
    move-object v4, v3

    .line 379
    goto :goto_c

    .line 380
    :cond_15
    new-instance v2, Ldefpackage/mp;

    .line 381
    .line 382
    invoke-direct {v2, v4}, Ldefpackage/mp;-><init>(Ldefpackage/lp;)V

    .line 383
    .line 384
    .line 385
    move-object v4, v2

    .line 386
    :goto_c
    iput-object v4, v3, Ldefpackage/op;->c:Ldefpackage/op;

    .line 387
    .line 388
    :cond_16
    array-length v2, v0

    .line 389
    array-length v3, v0

    .line 390
    invoke-static {v1, v2, v3}, Ldefpackage/rr2;->u(III)V

    .line 391
    .line 392
    .line 393
    new-instance v1, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    iget-object v3, v4, Ldefpackage/op;->a:Ldefpackage/lp;

    .line 396
    .line 397
    iget v5, v3, Ldefpackage/lp;->e:I

    .line 398
    .line 399
    iget v3, v3, Ldefpackage/lp;->f:I

    .line 400
    .line 401
    sget-object v6, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 402
    .line 403
    invoke-static {v2, v3}, Ldefpackage/h12;->m(II)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    mul-int/2addr v3, v5

    .line 408
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 409
    .line 410
    .line 411
    :try_start_0
    invoke-virtual {v4, v1, v0, v2}, Ldefpackage/op;->b(Ljava/lang/StringBuilder;[BI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    :goto_d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v2, "mdta: key="

    .line 421
    .line 422
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    iget-object p0, p0, Ldefpackage/oi2;->a:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    const-string p0, ", value="

    .line 431
    .line 432
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    return-object p0

    .line 443
    :catch_0
    move-exception p0

    .line 444
    new-instance v0, Ljava/lang/AssertionError;

    .line 445
    .line 446
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    throw v0
.end method
