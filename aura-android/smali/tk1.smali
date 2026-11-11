.class public final Ltk1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lej4;


# instance fields
.field public n:B

.field public final o:Lxu3;

.field public final p:Ljava/util/zip/Inflater;

.field public final q:Lwy1;

.field public final r:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lej4;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lxu3;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lxu3;-><init>(Lej4;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ltk1;->o:Lxu3;

    .line 13
    .line 14
    new-instance p1, Ljava/util/zip/Inflater;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ltk1;->p:Ljava/util/zip/Inflater;

    .line 21
    .line 22
    new-instance v1, Lwy1;

    .line 23
    .line 24
    invoke-direct {v1, v0, p1}, Lwy1;-><init>(Lxu3;Ljava/util/zip/Inflater;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Ltk1;->q:Lwy1;

    .line 28
    .line 29
    new-instance p1, Ljava/util/zip/CRC32;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ltk1;->r:Ljava/util/zip/CRC32;

    .line 35
    .line 36
    return-void
.end method

.method public static b(Ljava/lang/String;II)V
    .locals 2

    .line 1
    if-ne p2, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    const-string v1, ": actual 0x"

    .line 7
    .line 8
    invoke-static {p0, v1}, Lb11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p2}, Lzz1;->L(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-static {v1, p2}, Lqm4;->x0(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, " != expected 0x"

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lzz1;->L(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {v1, p1}, Lqm4;->x0(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ltk1;->q:Lwy1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwy1;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ltv;JJ)V
    .locals 4

    .line 1
    iget-object p1, p1, Ltv;->n:Lt84;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    iget v0, p1, Lt84;->c:I

    .line 7
    .line 8
    iget v1, p1, Lt84;->b:I

    .line 9
    .line 10
    sub-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    cmp-long v2, p2, v2

    .line 14
    .line 15
    if-ltz v2, :cond_0

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    int-to-long v0, v0

    .line 19
    sub-long/2addr p2, v0

    .line 20
    iget-object p1, p1, Lt84;->f:Lt84;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    cmp-long v2, p4, v0

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    iget v2, p1, Lt84;->b:I

    .line 33
    .line 34
    int-to-long v2, v2

    .line 35
    add-long/2addr v2, p2

    .line 36
    long-to-int p2, v2

    .line 37
    iget p3, p1, Lt84;->c:I

    .line 38
    .line 39
    sub-int/2addr p3, p2

    .line 40
    int-to-long v2, p3

    .line 41
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    long-to-int p3, v2

    .line 46
    iget-object v2, p0, Ltk1;->r:Ljava/util/zip/CRC32;

    .line 47
    .line 48
    iget-object v3, p1, Lt84;->a:[B

    .line 49
    .line 50
    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 51
    .line 52
    .line 53
    int-to-long p2, p3

    .line 54
    sub-long/2addr p4, p2

    .line 55
    iget-object p1, p1, Lt84;->f:Lt84;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-wide p2, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-void
.end method

.method public final read(Ltv;J)J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-wide/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-wide/16 v9, 0x0

    .line 11
    .line 12
    cmp-long v1, v7, v9

    .line 13
    .line 14
    if-ltz v1, :cond_12

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-wide v9

    .line 19
    :cond_0
    iget-byte v1, v0, Ltk1;->n:B

    .line 20
    .line 21
    iget-object v11, v0, Ltk1;->r:Ljava/util/zip/CRC32;

    .line 22
    .line 23
    const/4 v12, 0x1

    .line 24
    iget-object v13, v0, Ltk1;->o:Lxu3;

    .line 25
    .line 26
    const-wide/16 v19, -0x1

    .line 27
    .line 28
    if-nez v1, :cond_d

    .line 29
    .line 30
    const-wide/16 v1, 0xa

    .line 31
    .line 32
    invoke-virtual {v13, v1, v2}, Lxu3;->P(J)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v13, Lxu3;->o:Ltv;

    .line 36
    .line 37
    const-wide/16 v2, 0x3

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Ltv;->q(J)B

    .line 40
    .line 41
    .line 42
    move-result v21

    .line 43
    shr-int/lit8 v2, v21, 0x1

    .line 44
    .line 45
    and-int/2addr v2, v12

    .line 46
    const/4 v14, 0x0

    .line 47
    if-ne v2, v12, :cond_1

    .line 48
    .line 49
    move/from16 v22, v12

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move/from16 v22, v14

    .line 53
    .line 54
    :goto_0
    if-eqz v22, :cond_2

    .line 55
    .line 56
    const-wide/16 v2, 0x0

    .line 57
    .line 58
    const-wide/16 v4, 0xa

    .line 59
    .line 60
    invoke-virtual/range {v0 .. v5}, Ltk1;->f(Ltv;JJ)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {v13}, Lxu3;->readShort()S

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const-string v2, "ID1ID2"

    .line 68
    .line 69
    const/16 v3, 0x1f8b

    .line 70
    .line 71
    invoke-static {v2, v3, v0}, Ltk1;->b(Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    const-wide/16 v2, 0x8

    .line 75
    .line 76
    invoke-virtual {v13, v2, v3}, Lxu3;->skip(J)V

    .line 77
    .line 78
    .line 79
    shr-int/lit8 v0, v21, 0x2

    .line 80
    .line 81
    and-int/2addr v0, v12

    .line 82
    if-ne v0, v12, :cond_5

    .line 83
    .line 84
    const-wide/16 v2, 0x2

    .line 85
    .line 86
    invoke-virtual {v13, v2, v3}, Lxu3;->P(J)V

    .line 87
    .line 88
    .line 89
    if-eqz v22, :cond_3

    .line 90
    .line 91
    const-wide/16 v2, 0x0

    .line 92
    .line 93
    const-wide/16 v4, 0x2

    .line 94
    .line 95
    move-object/from16 v0, p0

    .line 96
    .line 97
    invoke-virtual/range {v0 .. v5}, Ltk1;->f(Ltv;JJ)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v1}, Ltv;->J()S

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const v2, 0xffff

    .line 105
    .line 106
    .line 107
    and-int/2addr v0, v2

    .line 108
    int-to-long v4, v0

    .line 109
    invoke-virtual {v13, v4, v5}, Lxu3;->P(J)V

    .line 110
    .line 111
    .line 112
    if-eqz v22, :cond_4

    .line 113
    .line 114
    const-wide/16 v2, 0x0

    .line 115
    .line 116
    move-object/from16 v0, p0

    .line 117
    .line 118
    invoke-virtual/range {v0 .. v5}, Ltk1;->f(Ltv;JJ)V

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-virtual {v13, v4, v5}, Lxu3;->skip(J)V

    .line 122
    .line 123
    .line 124
    :cond_5
    shr-int/lit8 v0, v21, 0x3

    .line 125
    .line 126
    and-int/2addr v0, v12

    .line 127
    const-wide/16 v23, 0x1

    .line 128
    .line 129
    if-ne v0, v12, :cond_8

    .line 130
    .line 131
    const-wide/16 v15, 0x0

    .line 132
    .line 133
    const-wide v17, 0x7fffffffffffffffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v13 .. v18}, Lxu3;->b(BJJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v15

    .line 142
    cmp-long v0, v15, v19

    .line 143
    .line 144
    if-eqz v0, :cond_7

    .line 145
    .line 146
    if-eqz v22, :cond_6

    .line 147
    .line 148
    const-wide/16 v2, 0x0

    .line 149
    .line 150
    add-long v4, v15, v23

    .line 151
    .line 152
    move-object/from16 v0, p0

    .line 153
    .line 154
    invoke-virtual/range {v0 .. v5}, Ltk1;->f(Ltv;JJ)V

    .line 155
    .line 156
    .line 157
    :cond_6
    add-long v2, v15, v23

    .line 158
    .line 159
    invoke-virtual {v13, v2, v3}, Lxu3;->skip(J)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_7
    new-instance v0, Ljava/io/EOFException;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_8
    :goto_1
    shr-int/lit8 v0, v21, 0x4

    .line 170
    .line 171
    and-int/2addr v0, v12

    .line 172
    if-ne v0, v12, :cond_b

    .line 173
    .line 174
    const-wide/16 v15, 0x0

    .line 175
    .line 176
    const-wide v17, 0x7fffffffffffffffL

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v13 .. v18}, Lxu3;->b(BJJ)J

    .line 182
    .line 183
    .line 184
    move-result-wide v14

    .line 185
    cmp-long v0, v14, v19

    .line 186
    .line 187
    if-eqz v0, :cond_a

    .line 188
    .line 189
    if-eqz v22, :cond_9

    .line 190
    .line 191
    const-wide/16 v2, 0x0

    .line 192
    .line 193
    add-long v4, v14, v23

    .line 194
    .line 195
    move-object/from16 v0, p0

    .line 196
    .line 197
    invoke-virtual/range {v0 .. v5}, Ltk1;->f(Ltv;JJ)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_9
    move-object/from16 v0, p0

    .line 202
    .line 203
    :goto_2
    add-long v14, v14, v23

    .line 204
    .line 205
    invoke-virtual {v13, v14, v15}, Lxu3;->skip(J)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_a
    new-instance v0, Ljava/io/EOFException;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :cond_b
    move-object/from16 v0, p0

    .line 216
    .line 217
    :goto_3
    if-eqz v22, :cond_c

    .line 218
    .line 219
    invoke-virtual {v13}, Lxu3;->n()S

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-virtual {v11}, Ljava/util/zip/CRC32;->getValue()J

    .line 224
    .line 225
    .line 226
    move-result-wide v2

    .line 227
    long-to-int v2, v2

    .line 228
    int-to-short v2, v2

    .line 229
    const-string v3, "FHCRC"

    .line 230
    .line 231
    invoke-static {v3, v1, v2}, Ltk1;->b(Ljava/lang/String;II)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v11}, Ljava/util/zip/CRC32;->reset()V

    .line 235
    .line 236
    .line 237
    :cond_c
    iput-byte v12, v0, Ltk1;->n:B

    .line 238
    .line 239
    :cond_d
    iget-byte v1, v0, Ltk1;->n:B

    .line 240
    .line 241
    const/4 v14, 0x2

    .line 242
    if-ne v1, v12, :cond_f

    .line 243
    .line 244
    iget-wide v2, v6, Ltv;->o:J

    .line 245
    .line 246
    iget-object v1, v0, Ltk1;->q:Lwy1;

    .line 247
    .line 248
    invoke-virtual {v1, v6, v7, v8}, Lwy1;->read(Ltv;J)J

    .line 249
    .line 250
    .line 251
    move-result-wide v4

    .line 252
    cmp-long v1, v4, v19

    .line 253
    .line 254
    if-eqz v1, :cond_e

    .line 255
    .line 256
    move-object v1, v6

    .line 257
    invoke-virtual/range {v0 .. v5}, Ltk1;->f(Ltv;JJ)V

    .line 258
    .line 259
    .line 260
    return-wide v4

    .line 261
    :cond_e
    iput-byte v14, v0, Ltk1;->n:B

    .line 262
    .line 263
    :cond_f
    iget-byte v1, v0, Ltk1;->n:B

    .line 264
    .line 265
    if-ne v1, v14, :cond_11

    .line 266
    .line 267
    invoke-virtual {v13}, Lxu3;->f()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-virtual {v11}, Ljava/util/zip/CRC32;->getValue()J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    long-to-int v2, v2

    .line 276
    const-string v3, "CRC"

    .line 277
    .line 278
    invoke-static {v3, v1, v2}, Ltk1;->b(Ljava/lang/String;II)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v13}, Lxu3;->f()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    iget-object v2, v0, Ltk1;->p:Ljava/util/zip/Inflater;

    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 288
    .line 289
    .line 290
    move-result-wide v2

    .line 291
    long-to-int v2, v2

    .line 292
    const-string v3, "ISIZE"

    .line 293
    .line 294
    invoke-static {v3, v1, v2}, Ltk1;->b(Ljava/lang/String;II)V

    .line 295
    .line 296
    .line 297
    const/4 v1, 0x3

    .line 298
    iput-byte v1, v0, Ltk1;->n:B

    .line 299
    .line 300
    invoke-virtual {v13}, Lxu3;->l()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_10

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_10
    const-string v0, "gzip finished without exhausting source"

    .line 308
    .line 309
    invoke-static {v0}, Lmj0;->i(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-wide v9

    .line 313
    :cond_11
    :goto_4
    return-wide v19

    .line 314
    :cond_12
    const-string v0, "byteCount < 0: "

    .line 315
    .line 316
    invoke-static {v0, v7, v8}, Lb11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    return-wide v9
.end method

.method public final timeout()Lfu4;
    .locals 0

    .line 1
    iget-object p0, p0, Ltk1;->o:Lxu3;

    .line 2
    .line 3
    iget-object p0, p0, Lxu3;->n:Lej4;

    .line 4
    .line 5
    invoke-interface {p0}, Lej4;->timeout()Lfu4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
