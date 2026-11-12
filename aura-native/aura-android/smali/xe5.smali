.class public abstract Lxe5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[B

.field public static final b:Lcb3;

.field public static final c:Ltl1;

.field public static final d:Lwe5;

.field public static final e:Lfv3;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    sput-object v1, Lxe5;->a:[B

    .line 5
    .line 6
    sget-object v1, Lyw;->q:Lyw;

    .line 7
    .line 8
    const-string v1, "efbbbf"

    .line 9
    .line 10
    invoke-static {v1}, Lpa;->s(Ljava/lang/String;)Lyw;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "feff"

    .line 15
    .line 16
    invoke-static {v2}, Lpa;->s(Ljava/lang/String;)Lyw;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "fffe"

    .line 21
    .line 22
    invoke-static {v3}, Lpa;->s(Ljava/lang/String;)Lyw;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "0000ffff"

    .line 27
    .line 28
    invoke-static {v4}, Lpa;->s(Ljava/lang/String;)Lyw;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v5, "ffff0000"

    .line 33
    .line 34
    invoke-static {v5}, Lpa;->s(Ljava/lang/String;)Lyw;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    filled-new-array {v1, v2, v3, v4, v5}, [Lyw;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v6, Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v2, Lhi;

    .line 45
    .line 46
    invoke-direct {v2, v1, v0}, Lhi;-><init>([Ljava/lang/Object;Z)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v6}, Lu40;->l0(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    new-instance v9, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    move v3, v0

    .line 65
    :goto_0
    if-ge v3, v2, :cond_0

    .line 66
    .line 67
    const/4 v4, -0x1

    .line 68
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    move v2, v0

    .line 79
    move v3, v2

    .line 80
    :goto_1
    const/4 v10, 0x5

    .line 81
    if-ge v2, v10, :cond_1

    .line 82
    .line 83
    aget-object v4, v1, v2

    .line 84
    .line 85
    add-int/lit8 v5, v3, 0x1

    .line 86
    .line 87
    invoke-static {v6, v4}, Lgb;->e(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v9, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    move v3, v5

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lyw;

    .line 107
    .line 108
    invoke-virtual {v2}, Lyw;->d()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-lez v2, :cond_7

    .line 113
    .line 114
    move v2, v0

    .line 115
    :goto_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-ge v2, v3, :cond_5

    .line 120
    .line 121
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Lyw;

    .line 126
    .line 127
    add-int/lit8 v4, v2, 0x1

    .line 128
    .line 129
    move v5, v4

    .line 130
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-ge v5, v7, :cond_4

    .line 135
    .line 136
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    check-cast v7, Lyw;

    .line 141
    .line 142
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Lyw;->d()I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    invoke-virtual {v7, v0, v3, v8}, Lyw;->m(ILyw;I)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_4

    .line 157
    .line 158
    invoke-virtual {v7}, Lyw;->d()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-virtual {v3}, Lyw;->d()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    if-eq v8, v11, :cond_3

    .line 167
    .line 168
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    check-cast v7, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    check-cast v8, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-le v7, v8, :cond_2

    .line 189
    .line 190
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_3
    const-string v0, "duplicate option: "

    .line 201
    .line 202
    invoke-static {v7, v0}, Lnz2;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_4
    move v2, v4

    .line 207
    goto :goto_2

    .line 208
    :cond_5
    new-instance v4, Ltv;

    .line 209
    .line 210
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    const-wide/16 v2, 0x0

    .line 219
    .line 220
    const/4 v5, 0x0

    .line 221
    invoke-static/range {v2 .. v9}, Lud3;->b(JLtv;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 222
    .line 223
    .line 224
    iget-wide v2, v4, Ltv;->o:J

    .line 225
    .line 226
    const-wide/16 v5, 0x4

    .line 227
    .line 228
    div-long/2addr v2, v5

    .line 229
    long-to-int v2, v2

    .line 230
    new-array v3, v2, [I

    .line 231
    .line 232
    move v5, v0

    .line 233
    :goto_4
    if-ge v5, v2, :cond_6

    .line 234
    .line 235
    invoke-virtual {v4}, Ltv;->readInt()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    aput v6, v3, v5

    .line 240
    .line 241
    add-int/lit8 v5, v5, 0x1

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_6
    new-instance v2, Lcb3;

    .line 245
    .line 246
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, [Lyw;

    .line 251
    .line 252
    invoke-direct {v2, v1, v3}, Lcb3;-><init>([Lyw;[I)V

    .line 253
    .line 254
    .line 255
    sput-object v2, Lxe5;->b:Lcb3;

    .line 256
    .line 257
    new-array v1, v0, [Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v1}, Lh12;->G([Ljava/lang/String;)Ltl1;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    sput-object v1, Lxe5;->c:Ltl1;

    .line 264
    .line 265
    sget-object v1, Ltz3;->Companion:Lsz3;

    .line 266
    .line 267
    sget-object v2, Lxe5;->a:[B

    .line 268
    .line 269
    const/4 v3, 0x7

    .line 270
    const/4 v4, 0x0

    .line 271
    invoke-static {v1, v2, v4, v0, v3}, Lsz3;->c(Lsz3;[BLhu2;II)Lwe5;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    sput-object v0, Lxe5;->d:Lwe5;

    .line 276
    .line 277
    sget-object v0, Ln14;->Companion:Lm14;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v2, v4}, Lm14;->b([BLhu2;)Lfv3;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    sput-object v0, Lxe5;->e:Lfv3;

    .line 287
    .line 288
    return-void

    .line 289
    :cond_7
    const-string v0, "the empty byte string is not a supported option"

    .line 290
    .line 291
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method public static final a(JJJ)V
    .locals 4

    .line 1
    or-long v0, p2, p4

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    cmp-long v0, p2, p0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    sub-long v0, p0, p2

    .line 14
    .line 15
    cmp-long p4, v0, p4

    .line 16
    .line 17
    if-ltz p4, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p4, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 21
    .line 22
    new-instance p5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v0, "length="

    .line 25
    .line 26
    invoke-direct {p5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p5, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ", offset="

    .line 33
    .line 34
    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p5, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ", count="

    .line 41
    .line 42
    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p5, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {p4, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p4
.end method

.method public static final b(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    :catch_0
    return-void

    .line 8
    :catch_1
    move-exception p0

    .line 9
    throw p0
.end method

.method public static final c(Lb71;Lge3;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lb71;->f(Lge3;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lge3;

    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p0, v1}, Lb71;->g(Lge3;)Lxo0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-boolean v2, v2, Lxo0;->c:Z

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-static {p0, v1}, Lxe5;->c(Lb71;Lge3;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catch_0
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Lb71;->d(Lge3;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_2
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-object v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    if-nez v0, :cond_3

    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    throw v0

    .line 51
    :catch_1
    return-void
.end method

.method public static final d(Lhr0;Lge3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object p0, p0, Lhr0;->c:Lb71;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lb71;->d(Lge3;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    return-void
.end method

.method public static final e(IILjava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p0, p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {p3, v0}, Lqm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return p1
.end method

.method public static final f(Ljava/lang/String;CII)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p2, p3, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    return p2

    .line 13
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    return p3
.end method

.method public static final g([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    if-eqz p1, :cond_5

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_1
    array-length v0, p0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v2, v0, :cond_5

    .line 18
    .line 19
    aget-object v3, p0, v2

    .line 20
    .line 21
    move v4, v1

    .line 22
    :goto_1
    array-length v5, p1

    .line 23
    const/4 v6, 0x1

    .line 24
    if-ge v4, v5, :cond_2

    .line 25
    .line 26
    move v5, v6

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move v5, v1

    .line 29
    :goto_2
    if-eqz v5, :cond_4

    .line 30
    .line 31
    add-int/lit8 v5, v4, 0x1

    .line 32
    .line 33
    :try_start_0
    aget-object v4, p1, v4
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    invoke-interface {p2, v3, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_3

    .line 40
    .line 41
    return v6

    .line 42
    :cond_3
    move v4, v5

    .line 43
    goto :goto_1

    .line 44
    :catch_0
    move-exception p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lkf2;->m(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return v1

    .line 53
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    :goto_3
    return v1
.end method

.method public static final h(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/16 v3, 0x1f

    .line 13
    .line 14
    invoke-static {v2, v3}, Lh12;->j(II)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-lez v3, :cond_1

    .line 19
    .line 20
    const/16 v3, 0x7f

    .line 21
    .line 22
    invoke-static {v2, v3}, Lh12;->j(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ltz v2, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return v1

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static final i(Ljava/lang/String;II)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p1, p2, :cond_5

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/16 v1, 0xa

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/16 v1, 0xc

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/16 v1, 0xd

    .line 26
    .line 27
    if-ne v0, v1, :cond_3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    const/16 v1, 0x20

    .line 31
    .line 32
    if-ne v0, v1, :cond_4

    .line 33
    .line 34
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    return p1

    .line 38
    :cond_5
    return p2
.end method

.method public static final j(Ljava/lang/String;II)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int/lit8 p2, p2, -0x1

    .line 5
    .line 6
    if-gt p1, p2, :cond_5

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/16 v1, 0xa

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/16 v1, 0xc

    .line 23
    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const/16 v1, 0xd

    .line 28
    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/16 v1, 0x20

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    :goto_1
    if-eq p2, p1, :cond_5

    .line 37
    .line 38
    add-int/lit8 p2, p2, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    return p2

    .line 44
    :cond_5
    return p1
.end method

.method public static final k([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    array-length v1, p0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_2

    .line 16
    .line 17
    aget-object v4, p0, v3

    .line 18
    .line 19
    array-length v5, p1

    .line 20
    move v6, v2

    .line 21
    :goto_1
    if-ge v6, v5, :cond_1

    .line 22
    .line 23
    aget-object v7, p1, v6

    .line 24
    .line 25
    invoke-interface {p2, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-nez v7, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-array p0, v2, [Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, [Ljava/lang/String;

    .line 48
    .line 49
    return-object p0
.end method

.method public static final l(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Authorization"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "Cookie"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, "Proxy-Authorization"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "Set-Cookie"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method public static final m(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static final n(Lfw;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lfw;->readByte()B

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    and-int/lit16 v0, v0, 0xff

    .line 9
    .line 10
    shl-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    invoke-interface {p0}, Lfw;->readByte()B

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    shl-int/lit8 v1, v1, 0x8

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    invoke-interface {p0}, Lfw;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    and-int/lit16 p0, p0, 0xff

    .line 26
    .line 27
    or-int/2addr p0, v0

    .line 28
    return p0
.end method

.method public static final o(ILjava/lang/String;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p0, v0

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    const p0, 0x7fffffff

    .line 15
    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    long-to-int p0, p0

    .line 27
    :catch_0
    :cond_2
    return p0
.end method

.method public static final p(Ljava/lang/String;II)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2}, Lxe5;->i(Ljava/lang/String;II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p0, p1, p2}, Lxe5;->j(Ljava/lang/String;II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
